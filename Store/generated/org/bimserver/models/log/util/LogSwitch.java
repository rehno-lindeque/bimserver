/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bimserver.models.log.util;

import org.bimserver.models.log.*;
import org.bimserver.models.log.ClashDetectionSettingsUpdated;
import org.bimserver.models.log.DatabaseCreated;
import org.bimserver.models.log.Download;
import org.bimserver.models.log.GeoTagUpdated;
import org.bimserver.models.log.LogAction;
import org.bimserver.models.log.LogPackage;
import org.bimserver.models.log.NewCheckoutAdded;
import org.bimserver.models.log.NewGuidanceProviderUploaded;
import org.bimserver.models.log.NewProjectAdded;
import org.bimserver.models.log.NewRevisionAdded;
import org.bimserver.models.log.NewUserAdded;
import org.bimserver.models.log.PasswordChanged;
import org.bimserver.models.log.PasswordReset;
import org.bimserver.models.log.ProjectDeleted;
import org.bimserver.models.log.ProjectUndeleted;
import org.bimserver.models.log.ProjectUpdated;
import org.bimserver.models.log.RevisionUpdated;
import org.bimserver.models.log.ServerLog;
import org.bimserver.models.log.ServerStarted;
import org.bimserver.models.log.SettingsSaved;
import org.bimserver.models.log.UserAddedToProject;
import org.bimserver.models.log.UserChanged;
import org.bimserver.models.log.UserDeleted;
import org.bimserver.models.log.UserRemovedFromProject;
import org.bimserver.models.log.UserUndeleted;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.log.LogPackage
 * @generated
 */
public class LogSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LogPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogSwitch() {
		if (modelPackage == null) {
			modelPackage = LogPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LogPackage.LOG_ACTION: {
				LogAction logAction = (LogAction)theEObject;
				T result = caseLogAction(logAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogPackage.SERVER_LOG: {
				ServerLog serverLog = (ServerLog)theEObject;
				T result = caseServerLog(serverLog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogPackage.NEW_USER_ADDED: {
				NewUserAdded newUserAdded = (NewUserAdded)theEObject;
				T result = caseNewUserAdded(newUserAdded);
				if (result == null) result = caseLogAction(newUserAdded);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogPackage.NEW_PROJECT_ADDED: {
				NewProjectAdded newProjectAdded = (NewProjectAdded)theEObject;
				T result = caseNewProjectAdded(newProjectAdded);
				if (result == null) result = caseLogAction(newProjectAdded);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogPackage.NEW_REVISION_ADDED: {
				NewRevisionAdded newRevisionAdded = (NewRevisionAdded)theEObject;
				T result = caseNewRevisionAdded(newRevisionAdded);
				if (result == null) result = caseLogAction(newRevisionAdded);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogPackage.NEW_CHECKOUT_ADDED: {
				NewCheckoutAdded newCheckoutAdded = (NewCheckoutAdded)theEObject;
				T result = caseNewCheckoutAdded(newCheckoutAdded);
				if (result == null) result = caseLogAction(newCheckoutAdded);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogPackage.SETTINGS_SAVED: {
				SettingsSaved settingsSaved = (SettingsSaved)theEObject;
				T result = caseSettingsSaved(settingsSaved);
				if (result == null) result = caseLogAction(settingsSaved);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogPackage.USER_ADDED_TO_PROJECT: {
				UserAddedToProject userAddedToProject = (UserAddedToProject)theEObject;
				T result = caseUserAddedToProject(userAddedToProject);
				if (result == null) result = caseLogAction(userAddedToProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogPackage.NEW_GUIDANCE_PROVIDER_UPLOADED: {
				NewGuidanceProviderUploaded newGuidanceProviderUploaded = (NewGuidanceProviderUploaded)theEObject;
				T result = caseNewGuidanceProviderUploaded(newGuidanceProviderUploaded);
				if (result == null) result = caseLogAction(newGuidanceProviderUploaded);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogPackage.DOWNLOAD: {
				Download download = (Download)theEObject;
				T result = caseDownload(download);
				if (result == null) result = caseLogAction(download);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogPackage.USER_REMOVED_FROM_PROJECT: {
				UserRemovedFromProject userRemovedFromProject = (UserRemovedFromProject)theEObject;
				T result = caseUserRemovedFromProject(userRemovedFromProject);
				if (result == null) result = caseLogAction(userRemovedFromProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogPackage.PROJECT_DELETED: {
				ProjectDeleted projectDeleted = (ProjectDeleted)theEObject;
				T result = caseProjectDeleted(projectDeleted);
				if (result == null) result = caseLogAction(projectDeleted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogPackage.USER_DELETED: {
				UserDeleted userDeleted = (UserDeleted)theEObject;
				T result = caseUserDeleted(userDeleted);
				if (result == null) result = caseLogAction(userDeleted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogPackage.PASSWORD_RESET: {
				PasswordReset passwordReset = (PasswordReset)theEObject;
				T result = casePasswordReset(passwordReset);
				if (result == null) result = caseLogAction(passwordReset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogPackage.DATABASE_CREATED: {
				DatabaseCreated databaseCreated = (DatabaseCreated)theEObject;
				T result = caseDatabaseCreated(databaseCreated);
				if (result == null) result = caseLogAction(databaseCreated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogPackage.SERVER_STARTED: {
				ServerStarted serverStarted = (ServerStarted)theEObject;
				T result = caseServerStarted(serverStarted);
				if (result == null) result = caseLogAction(serverStarted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogPackage.PROJECT_UPDATED: {
				ProjectUpdated projectUpdated = (ProjectUpdated)theEObject;
				T result = caseProjectUpdated(projectUpdated);
				if (result == null) result = caseLogAction(projectUpdated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogPackage.USER_UNDELETED: {
				UserUndeleted userUndeleted = (UserUndeleted)theEObject;
				T result = caseUserUndeleted(userUndeleted);
				if (result == null) result = caseLogAction(userUndeleted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogPackage.PROJECT_UNDELETED: {
				ProjectUndeleted projectUndeleted = (ProjectUndeleted)theEObject;
				T result = caseProjectUndeleted(projectUndeleted);
				if (result == null) result = caseLogAction(projectUndeleted);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogPackage.REVISION_UPDATED: {
				RevisionUpdated revisionUpdated = (RevisionUpdated)theEObject;
				T result = caseRevisionUpdated(revisionUpdated);
				if (result == null) result = caseLogAction(revisionUpdated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogPackage.GEO_TAG_UPDATED: {
				GeoTagUpdated geoTagUpdated = (GeoTagUpdated)theEObject;
				T result = caseGeoTagUpdated(geoTagUpdated);
				if (result == null) result = caseLogAction(geoTagUpdated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogPackage.CLASH_DETECTION_SETTINGS_UPDATED: {
				ClashDetectionSettingsUpdated clashDetectionSettingsUpdated = (ClashDetectionSettingsUpdated)theEObject;
				T result = caseClashDetectionSettingsUpdated(clashDetectionSettingsUpdated);
				if (result == null) result = caseLogAction(clashDetectionSettingsUpdated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogPackage.PASSWORD_CHANGED: {
				PasswordChanged passwordChanged = (PasswordChanged)theEObject;
				T result = casePasswordChanged(passwordChanged);
				if (result == null) result = caseLogAction(passwordChanged);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogPackage.USER_CHANGED: {
				UserChanged userChanged = (UserChanged)theEObject;
				T result = caseUserChanged(userChanged);
				if (result == null) result = caseLogAction(userChanged);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogAction(LogAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Log</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Log</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerLog(ServerLog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New User Added</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New User Added</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewUserAdded(NewUserAdded object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Project Added</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Project Added</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewProjectAdded(NewProjectAdded object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Revision Added</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Revision Added</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewRevisionAdded(NewRevisionAdded object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Checkout Added</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Checkout Added</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewCheckoutAdded(NewCheckoutAdded object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Settings Saved</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Settings Saved</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSettingsSaved(SettingsSaved object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Added To Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Added To Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserAddedToProject(UserAddedToProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Guidance Provider Uploaded</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Guidance Provider Uploaded</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewGuidanceProviderUploaded(NewGuidanceProviderUploaded object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Download</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Download</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDownload(Download object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Removed From Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Removed From Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserRemovedFromProject(UserRemovedFromProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Deleted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Deleted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectDeleted(ProjectDeleted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Deleted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Deleted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserDeleted(UserDeleted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Password Reset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Password Reset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePasswordReset(PasswordReset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database Created</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database Created</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabaseCreated(DatabaseCreated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server Started</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server Started</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServerStarted(ServerStarted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Updated</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Updated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectUpdated(ProjectUpdated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Undeleted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Undeleted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserUndeleted(UserUndeleted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Undeleted</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Undeleted</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectUndeleted(ProjectUndeleted object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Revision Updated</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Revision Updated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRevisionUpdated(RevisionUpdated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geo Tag Updated</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geo Tag Updated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeoTagUpdated(GeoTagUpdated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clash Detection Settings Updated</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clash Detection Settings Updated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClashDetectionSettingsUpdated(ClashDetectionSettingsUpdated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Password Changed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Password Changed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePasswordChanged(PasswordChanged object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Changed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Changed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserChanged(UserChanged object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LogSwitch
