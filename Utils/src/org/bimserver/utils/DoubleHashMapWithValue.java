package org.bimserver.utils;

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

import java.util.HashMap;
import java.util.Map;

public class DoubleHashMapWithValue<A, B, C> {
	private Map<A, B> ab;
	private Map<B, A> ba;
	private Map<A, C> ac;
	
	public DoubleHashMapWithValue(int capacity) {
		ab = new HashMap<A, B>(capacity);
		ba = new HashMap<B, A>(capacity);
		ac = new HashMap<A, C>(capacity);
	}
	
	public void put(A a, B b, C c) {
		ab.put(a, b);
		ba.put(b, a);
		ac.put(a, c);
	}
	
	public boolean containsA(A a) {
		return ab.containsKey(a);
	}
	
	public boolean containsB(B b) {
		return ba.containsKey(b);
	}
	
	public C getC(A a) {
		return ac.get(a);
	}

	public B getB(A a) {
		return ab.get(a);
	}
}