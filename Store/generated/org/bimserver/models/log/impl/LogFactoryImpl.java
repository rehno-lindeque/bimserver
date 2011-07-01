/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bimserver.models.log.impl;

import org.bimserver.models.log.AccessMethod;
import org.bimserver.models.log.ClashDetectionSettingsUpdated;
import org.bimserver.models.log.DatabaseCreated;
import org.bimserver.models.log.Download;
import org.bimserver.models.log.GeoTagUpdated;
import org.bimserver.models.log.LogAction;
import org.bimserver.models.log.LogFactory;
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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogFactoryImpl extends EFactoryImpl implements LogFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LogFactory init() {
		try {
			LogFactory theLogFactory = (LogFactory)EPackage.Registry.INSTANCE.getEFactory("log"); 
			if (theLogFactory != null) {
				return theLogFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LogFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LogPackage.LOG_ACTION: return (EObject)createLogAction();
			case LogPackage.SERVER_LOG: return (EObject)createServerLog();
			case LogPackage.NEW_USER_ADDED: return (EObject)createNewUserAdded();
			case LogPackage.NEW_PROJECT_ADDED: return (EObject)createNewProjectAdded();
			case LogPackage.NEW_REVISION_ADDED: return (EObject)createNewRevisionAdded();
			case LogPackage.NEW_CHECKOUT_ADDED: return (EObject)createNewCheckoutAdded();
			case LogPackage.SETTINGS_SAVED: return (EObject)createSettingsSaved();
			case LogPackage.USER_ADDED_TO_PROJECT: return (EObject)createUserAddedToProject();
			case LogPackage.NEW_GUIDANCE_PROVIDER_UPLOADED: return (EObject)createNewGuidanceProviderUploaded();
			case LogPackage.DOWNLOAD: return (EObject)createDownload();
			case LogPackage.USER_REMOVED_FROM_PROJECT: return (EObject)createUserRemovedFromProject();
			case LogPackage.PROJECT_DELETED: return (EObject)createProjectDeleted();
			case LogPackage.USER_DELETED: return (EObject)createUserDeleted();
			case LogPackage.PASSWORD_RESET: return (EObject)createPasswordReset();
			case LogPackage.DATABASE_CREATED: return (EObject)createDatabaseCreated();
			case LogPackage.SERVER_STARTED: return (EObject)createServerStarted();
			case LogPackage.PROJECT_UPDATED: return (EObject)createProjectUpdated();
			case LogPackage.USER_UNDELETED: return (EObject)createUserUndeleted();
			case LogPackage.PROJECT_UNDELETED: return (EObject)createProjectUndeleted();
			case LogPackage.REVISION_UPDATED: return (EObject)createRevisionUpdated();
			case LogPackage.GEO_TAG_UPDATED: return (EObject)createGeoTagUpdated();
			case LogPackage.CLASH_DETECTION_SETTINGS_UPDATED: return (EObject)createClashDetectionSettingsUpdated();
			case LogPackage.PASSWORD_CHANGED: return (EObject)createPasswordChanged();
			case LogPackage.USER_CHANGED: return (EObject)createUserChanged();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case LogPackage.ACCESS_METHOD:
				return createAccessMethodFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case LogPackage.ACCESS_METHOD:
				return convertAccessMethodToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogAction createLogAction() {
		LogActionImpl logAction = new LogActionImpl();
		return logAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerLog createServerLog() {
		ServerLogImpl serverLog = new ServerLogImpl();
		return serverLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewUserAdded createNewUserAdded() {
		NewUserAddedImpl newUserAdded = new NewUserAddedImpl();
		return newUserAdded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewProjectAdded createNewProjectAdded() {
		NewProjectAddedImpl newProjectAdded = new NewProjectAddedImpl();
		return newProjectAdded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewRevisionAdded createNewRevisionAdded() {
		NewRevisionAddedImpl newRevisionAdded = new NewRevisionAddedImpl();
		return newRevisionAdded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewCheckoutAdded createNewCheckoutAdded() {
		NewCheckoutAddedImpl newCheckoutAdded = new NewCheckoutAddedImpl();
		return newCheckoutAdded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SettingsSaved createSettingsSaved() {
		SettingsSavedImpl settingsSaved = new SettingsSavedImpl();
		return settingsSaved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserAddedToProject createUserAddedToProject() {
		UserAddedToProjectImpl userAddedToProject = new UserAddedToProjectImpl();
		return userAddedToProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewGuidanceProviderUploaded createNewGuidanceProviderUploaded() {
		NewGuidanceProviderUploadedImpl newGuidanceProviderUploaded = new NewGuidanceProviderUploadedImpl();
		return newGuidanceProviderUploaded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Download createDownload() {
		DownloadImpl download = new DownloadImpl();
		return download;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserRemovedFromProject createUserRemovedFromProject() {
		UserRemovedFromProjectImpl userRemovedFromProject = new UserRemovedFromProjectImpl();
		return userRemovedFromProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectDeleted createProjectDeleted() {
		ProjectDeletedImpl projectDeleted = new ProjectDeletedImpl();
		return projectDeleted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserDeleted createUserDeleted() {
		UserDeletedImpl userDeleted = new UserDeletedImpl();
		return userDeleted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PasswordReset createPasswordReset() {
		PasswordResetImpl passwordReset = new PasswordResetImpl();
		return passwordReset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseCreated createDatabaseCreated() {
		DatabaseCreatedImpl databaseCreated = new DatabaseCreatedImpl();
		return databaseCreated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerStarted createServerStarted() {
		ServerStartedImpl serverStarted = new ServerStartedImpl();
		return serverStarted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectUpdated createProjectUpdated() {
		ProjectUpdatedImpl projectUpdated = new ProjectUpdatedImpl();
		return projectUpdated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserUndeleted createUserUndeleted() {
		UserUndeletedImpl userUndeleted = new UserUndeletedImpl();
		return userUndeleted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectUndeleted createProjectUndeleted() {
		ProjectUndeletedImpl projectUndeleted = new ProjectUndeletedImpl();
		return projectUndeleted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RevisionUpdated createRevisionUpdated() {
		RevisionUpdatedImpl revisionUpdated = new RevisionUpdatedImpl();
		return revisionUpdated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoTagUpdated createGeoTagUpdated() {
		GeoTagUpdatedImpl geoTagUpdated = new GeoTagUpdatedImpl();
		return geoTagUpdated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClashDetectionSettingsUpdated createClashDetectionSettingsUpdated() {
		ClashDetectionSettingsUpdatedImpl clashDetectionSettingsUpdated = new ClashDetectionSettingsUpdatedImpl();
		return clashDetectionSettingsUpdated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PasswordChanged createPasswordChanged() {
		PasswordChangedImpl passwordChanged = new PasswordChangedImpl();
		return passwordChanged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserChanged createUserChanged() {
		UserChangedImpl userChanged = new UserChangedImpl();
		return userChanged;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessMethod createAccessMethodFromString(EDataType eDataType, String initialValue) {
		AccessMethod result = AccessMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogPackage getLogPackage() {
		return (LogPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LogPackage getPackage() {
		return LogPackage.eINSTANCE;
	}

} //LogFactoryImpl
