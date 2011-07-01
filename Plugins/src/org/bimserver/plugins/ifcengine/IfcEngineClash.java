package org.bimserver.plugins.ifcengine;

public class IfcEngineClash {
	private String name1;
	private String name2;
	private String type1;
	private String type2;
	private long eid1;
	private long eid2;
	private String guid1;
	private String guid2;
	private long revision1;
	private long revision2;

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getType1() {
		return type1;
	}

	public void setType1(String type1) {
		this.type1 = type1;
	}

	public String getType2() {
		return type2;
	}

	public void setType2(String type2) {
		this.type2 = type2;
	}

	public void setEid1(long eid1) {
		this.eid1 = eid1;
	}

	public long getEid1() {
		return eid1;
	}

	public void setEid2(long eid2) {
		this.eid2 = eid2;
	}

	public long getEid2() {
		return eid2;
	}

	public void setGuid1(String guid1) {
		this.guid1 = guid1;
	}

	public String getGuid1() {
		return guid1;
	}

	public void setGuid2(String guid2) {
		this.guid2 = guid2;
	}

	public String getGuid2() {
		return guid2;
	}

	public void setRevision1(long revision1) {
		this.revision1 = revision1;
	}

	public long getRevision1() {
		return revision1;
	}

	public void setRevision2(long revision2) {
		this.revision2 = revision2;
	}

	public long getRevision2() {
		return revision2;
	}
}