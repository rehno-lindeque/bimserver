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

import java.util.Enumeration;

import javax.swing.tree.TreeNode;

import org.bimserver.interfaces.objects.SProject;

public class ProjectTreeNode implements TreeNode {

	private final SProject project;

	public ProjectTreeNode(SProject project) {
		this.project = project;
	}

	@Override
	public Enumeration<TreeNode> children() {
		return null;
	}

	@Override
	public boolean getAllowsChildren() {
		return false;
	}

	@Override
	public TreeNode getChildAt(int arg0) {
		return null;
	}

	@Override
	public int getChildCount() {
		return 0;
	}

	@Override
	public int getIndex(TreeNode arg0) {
		return 0;
	}

	@Override
	public TreeNode getParent() {
		return null;
	}

	@Override
	public boolean isLeaf() {
		return true;
	}
	
	@Override
	public String toString() {
		return project.getName();
	}

	public SProject getProject() {
		return project;
	}
}
