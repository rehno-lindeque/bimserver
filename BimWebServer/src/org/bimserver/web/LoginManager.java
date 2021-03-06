package org.bimserver.web;

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

import org.bimserver.interfaces.objects.SUserType;
import org.bimserver.shared.ServiceException;
import org.bimserver.shared.ServiceInterface;

public class LoginManager {
	private static ServiceInterface systemService;
	private ServiceInterface service;

	public LoginManager() {
	}

	public static void setSystemService(ServiceInterface systemService) {
		LoginManager.systemService = systemService;
	}

	public long getUoid() throws ServiceException {
		return service.getCurrentUser().getOid();
	}

	public void setService(ServiceInterface service) {
		this.service = service;
	}	
	
	public ServiceInterface getService() {
		return service;
	}

	public SUserType getUserType() throws ServiceException {
		return service.getCurrentUser().getUserType();
	}

	public ServiceInterface getSystemService() {
		return systemService;
	}
}