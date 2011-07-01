package org.bimserver.shared;

import java.util.Comparator;

import org.bimserver.interfaces.objects.SRevision;

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

public class SRevisionDateComparator implements Comparator<SRevision> {
	private final boolean ascending;

	public SRevisionDateComparator(boolean ascending) {
		this.ascending = ascending;
	}

	@Override
	public int compare(SRevision r1, SRevision r2) {
		return r1.getDate().compareTo(r2.getDate()) * (ascending ? 1 : -1);
	}
}