package org.bimserver.interfaces.objects;

import java.util.*;
import javax.xml.bind.annotation.XmlRootElement;
public enum SAccessMethod {
	SOAP(0),
	WEB_INTERFACE(1),
	INTERNAL(2),
	REST(3),
	SYNDICATION(4);
	int ordinal;

	SAccessMethod(int ordinal) {
		this.ordinal = ordinal;
	}
	
	public int getOrdinal() {
		return ordinal;
	}
}