package org.bimserver.client;

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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

import javax.swing.tree.TreeNode;

public class RootTreeNode implements TreeNode {

	private List<ServerTreeNode> allServers = new ArrayList<ServerTreeNode>();

	@Override
	public Enumeration<ServerTreeNode> children() {
		return Collections.enumeration(allServers);
	}

	@Override
	public boolean getAllowsChildren() {
		return true;
	}

	@Override
	public TreeNode getChildAt(int childIndex) {
		return allServers.get(childIndex);
	}

	@Override
	public int getChildCount() {
		return allServers.size();
	}

	@Override
	public int getIndex(TreeNode node) {
		return allServers.indexOf(node);
	}

	@Override
	public TreeNode getParent() {
		return null;
	}

	@Override
	public boolean isLeaf() {
		return allServers.size() == 0;
	}

	public void add(ServerTreeNode serverTreeNode) {
		allServers.add(serverTreeNode);
	}
	
	@Override
	public String toString() {
		return "Servers";
	}
}