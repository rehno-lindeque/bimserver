package org.bimserver.tests;

/******************************************************************************
 * (c) Copyright bimserver.org 2009
 * Licensed under GNU GPLv3
 * http://www.gnu.org/licenses/gpl-3.0.txt
 * For more information mail to license@bimserver.org
 *
 * Bimserver.org is free software: you can redistribute it and/or modify 
 * it under the terms of the GNU General Public License as published by 
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Bimserver.org is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License a 
 * long with Bimserver.org . If not, see <http://www.gnu.org/licenses/>.
 *****************************************************************************/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;
import java.util.TreeSet;

public class Bla {
	public static void main(String[] args) {
		new Bla().start();
	}

	private void start() {
		sortFile(TestFile.MERGE_TEST_SOURCE_FILE.getFile(), new File("1.ifc"));
		sortFile(new File("in.ifc"), new File("2.ifc"));
	}

	public static void sortFile(File sourceFile, File destFile) {
		try {
			System.out.println(sourceFile);
			BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
			String line = reader.readLine();
			Set<String> lines = new TreeSet<String>();
			while (line != null) {
				line = line.replace(" ", "");
				if (line.indexOf("=") != -1) {
					line = line.substring(line.indexOf("="));
				}
				lines.add(line);
				line = reader.readLine();
			}
			reader.close();
			PrintWriter out = new PrintWriter(destFile);
			for (String r : lines) {
				out.write(r + "\n");
			}
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}