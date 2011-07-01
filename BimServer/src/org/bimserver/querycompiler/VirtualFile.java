package org.bimserver.querycompiler;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;

import javax.lang.model.element.Modifier;
import javax.lang.model.element.NestingKind;
import javax.tools.JavaFileObject;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Charsets;

public class VirtualFile implements JavaFileObject {

	private static final Logger LOGGER = LoggerFactory.getLogger(VirtualFile.class);
	private final Map<String, VirtualFile> files = new HashMap<String, VirtualFile>();
	private final String name;
	private byte[] data = new byte[0];
	private VirtualFile parent;
	private URI uri;
	private Set<VirtualFile> sourceFiles = new HashSet<VirtualFile>();

	public VirtualFile(VirtualFile parent, String name) {
		this.parent = parent;
		this.name = name;
		if (name != null & parent != null) {
			try {
				if (parent.toUri() != null) {
					this.uri = new URI(parent.toUri() + "/" + name);
				} else {
					this.uri = new URI(name);
				}
			} catch (URISyntaxException e) {
				LOGGER.error("", e);
			}
		} else {
			uri = null;
		}
	}

	public VirtualFile createFile(String path) {
		if (path.contains(File.separator)) {
			String newName = path.substring(0, path.indexOf(File.separator));
			if (files.containsKey(newName)) {
				VirtualFile virtualFile = files.get(newName);
				return virtualFile.createFile(path.substring(path.indexOf(File.separator) + 1));
			} else {
				VirtualFile virtualFile = new VirtualFile(this, newName);
				files.put(newName, virtualFile);
				return virtualFile.createFile(path.substring(path.indexOf(File.separator) + 1));
			}
		} else {
			VirtualFile virtualFile = new VirtualFile(this, path);
			if (path.endsWith(".java")) {
				sourceFiles.add(virtualFile);
			}
			files.put(path, virtualFile);
			return virtualFile;
		}
	}

	public void setStringContent(String content) {
		data = content.getBytes(Charsets.UTF_8);
	}

	public OutputStream openOutputStream() {
		return new ByteArrayOutputStream() {
			@Override
			public void close() throws IOException {
				super.close();
				data = this.toByteArray();
			}
		};
	}

	public void createJar(OutputStream outputStream) {
		try {
			JarOutputStream jarOutputStream = new JarOutputStream(outputStream);
			createJar(jarOutputStream);
			jarOutputStream.finish();
		} catch (IOException e) {
			LOGGER.error("", e);
		}
	}

	public void dumpToDir(File dir) {
		if (isDirectory()) {
			dir.mkdir();
			for (VirtualFile virtualFile : files.values()) {
				virtualFile.dumpToDir(new File(dir, virtualFile.name));
			}
		} else {
			try {
				FileOutputStream fos = new FileOutputStream(dir);
				ByteArrayInputStream bais = new ByteArrayInputStream(data);
				IOUtils.copy(bais, fos);
				fos.close();
			} catch (FileNotFoundException e) {
				LOGGER.error("", e);
			} catch (IOException e) {
				LOGGER.error("", e);
			}
		}
	}

	private void createJar(JarOutputStream jarOutputStream) throws IOException {
		for (VirtualFile virtualFile : files.values()) {
			if (virtualFile.isDirectory()) {
				virtualFile.createJar(jarOutputStream);
			} else {
				JarEntry jarEntry = new JarEntry(virtualFile.getName().replace(File.separator, "/"));
				jarOutputStream.putNextEntry(jarEntry);
				InputStream inputStream = virtualFile.openInputStream();
				IOUtils.copy(inputStream, jarOutputStream);
				inputStream.close();
			}
		}
	}

	public InputStream openInputStream() {
		return new ByteArrayInputStream(data);
	}

	public Collection<VirtualFile> listFiles() {
		return files.values();
	}

	public boolean isDirectory() {
		return !files.isEmpty();
	}

	public String getName() {
		if (parent != null && parent.getName() != null) {
			return parent.getName() + File.separator + name;
		} else {
			return name;
		}
	}

	public List<VirtualFile> getAllJavaFileObjects() {
		List<VirtualFile> list = new ArrayList<VirtualFile>(sourceFiles);
		for (VirtualFile virtualFile : files.values()) {
			if (virtualFile.isDirectory()) {
				list.addAll(virtualFile.getAllJavaFileObjects());
			}
		}
		return list;
	}

	@Override
	public Modifier getAccessLevel() {
		return Modifier.PUBLIC;
	}

	@Override
	public Kind getKind() {
		if (name.endsWith(".java")) {
			return Kind.SOURCE;
		} else if (name.endsWith(".class")) {
			return Kind.CLASS;
		} else if (name.endsWith(".html")) {
			return Kind.HTML;
		} else {
			return Kind.OTHER;
		}
	}

	@Override
	public NestingKind getNestingKind() {
		return NestingKind.TOP_LEVEL;
	}

	@Override
	public boolean isNameCompatible(String simpleName, Kind kind) {
		return true;
	}

	@Override
	public boolean delete() {
		return parent.remove(this);
	}

	private boolean remove(VirtualFile virtualFile) {
		return files.remove(virtualFile) != null;
	}

	@Override
	public CharSequence getCharContent(boolean ignoreEncodingErrors) {
		return new String(data, Charsets.UTF_8);
	}

	@Override
	public long getLastModified() {
		return 0;
	}

	@Override
	public Reader openReader(boolean ignoreEncodingErrors) {
		return new StringReader(new String(data, Charsets.UTF_8));
	}

	@Override
	public Writer openWriter() throws IOException {
		return new StringWriter() {
			@Override
			public void close() throws IOException {
				super.close();
				data = this.toString().getBytes();
			}
		};
	}

	@Override
	public URI toUri() {
		return uri;
	}

	public String getPackageName() {
		String name = getName();
		return name.replace(File.separator, ".");
	}

	public Collection<VirtualFile> getFiles() {
		return files.values();
	}

	public Collection<VirtualFile> getFiles(Set<Kind> kinds) {
		ArrayList<VirtualFile> list = new ArrayList<VirtualFile>();
		for (VirtualFile f : files.values()) {
			for (Kind kind : kinds) {
				if (f.name.endsWith(kind.extension.toLowerCase())) {
					if (f.name.endsWith(".class")) {
						list.add(f);
					}
				}
			}
		}
		return list;
	}

	public void integrate(VirtualFile baseDir) {
		if (baseDir.isDirectory()) {
			for (VirtualFile file : baseDir.getFiles()) {
				if (files.containsKey(file.name)) {
					if (file.isDirectory()) {
						files.get(file.name).integrate(file);
					} else {
						files.get(file.name).add(file);
					}
				} else {
					files.put(file.name, file);
					file.parent = this;
				}
			}
		}
	}

	private void add(VirtualFile file) {
		files.put(file.name, file);
	}

	@Override
	public String toString() {
		return uri.toString();
	}

	public Collection<VirtualFile> getFiles(Set<Kind> kinds, String path) {
		if (path.contains(File.separator)) {
			String substring = path.substring(0, path.indexOf(File.separator));
			if (files.containsKey(substring)) {
				return files.get(substring).getFiles(kinds, path.substring(path.indexOf(File.separator) + 1));
			}
		} else {
			if (files.containsKey(path)) {
				return files.get(path).getFiles(kinds);
			}
		}
		return new ArrayList<VirtualFile>();
	}

	public String getSimpleName() {
		return name;
	}

	public String getCleanName() {
		String name = getName();
		if (name.contains(".")) {
			name = name.substring(0, name.indexOf("."));
		}
		return name.replace(File.separator, ".");
	}

	public boolean containsType(String path) {
		if (path.contains(File.separator)) {
			String newName = path.substring(0, path.indexOf(File.separator));
			if (files.containsKey(newName)) {
				return files.get(newName).containsType(path.substring(path.indexOf(File.separator) + 1));
			} else {
				return false;
			}
		} else {
			return files.containsKey(path);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uri == null) ? 0 : uri.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VirtualFile other = (VirtualFile) obj;
		if (uri == null) {
			if (other.uri != null)
				return false;
		} else if (!uri.equals(other.uri))
			return false;
		return true;
	}

	public VirtualFile get(String name) {
		if (name.contains(".")) {
			return files.get(name.substring(0, name.indexOf("."))).get(name.substring(name.indexOf(".") + 1));
		}
		return files.get(name + ".class");
	}

	public byte[] getData() {
		return data;
	}
}