/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bimserver.models.log.util;

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
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.bimserver.models.log.LogPackage
 * @generated
 */
public class LogAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LogPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LogPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogSwitch<Adapter> modelSwitch =
		new LogSwitch<Adapter>() {
			@Override
			public Adapter caseLogAction(LogAction object) {
				return createLogActionAdapter();
			}
			@Override
			public Adapter caseServerLog(ServerLog object) {
				return createServerLogAdapter();
			}
			@Override
			public Adapter caseNewUserAdded(NewUserAdded object) {
				return createNewUserAddedAdapter();
			}
			@Override
			public Adapter caseNewProjectAdded(NewProjectAdded object) {
				return createNewProjectAddedAdapter();
			}
			@Override
			public Adapter caseNewRevisionAdded(NewRevisionAdded object) {
				return createNewRevisionAddedAdapter();
			}
			@Override
			public Adapter caseNewCheckoutAdded(NewCheckoutAdded object) {
				return createNewCheckoutAddedAdapter();
			}
			@Override
			public Adapter caseSettingsSaved(SettingsSaved object) {
				return createSettingsSavedAdapter();
			}
			@Override
			public Adapter caseUserAddedToProject(UserAddedToProject object) {
				return createUserAddedToProjectAdapter();
			}
			@Override
			public Adapter caseNewGuidanceProviderUploaded(NewGuidanceProviderUploaded object) {
				return createNewGuidanceProviderUploadedAdapter();
			}
			@Override
			public Adapter caseDownload(Download object) {
				return createDownloadAdapter();
			}
			@Override
			public Adapter caseUserRemovedFromProject(UserRemovedFromProject object) {
				return createUserRemovedFromProjectAdapter();
			}
			@Override
			public Adapter caseProjectDeleted(ProjectDeleted object) {
				return createProjectDeletedAdapter();
			}
			@Override
			public Adapter caseUserDeleted(UserDeleted object) {
				return createUserDeletedAdapter();
			}
			@Override
			public Adapter casePasswordReset(PasswordReset object) {
				return createPasswordResetAdapter();
			}
			@Override
			public Adapter caseDatabaseCreated(DatabaseCreated object) {
				return createDatabaseCreatedAdapter();
			}
			@Override
			public Adapter caseServerStarted(ServerStarted object) {
				return createServerStartedAdapter();
			}
			@Override
			public Adapter caseProjectUpdated(ProjectUpdated object) {
				return createProjectUpdatedAdapter();
			}
			@Override
			public Adapter caseUserUndeleted(UserUndeleted object) {
				return createUserUndeletedAdapter();
			}
			@Override
			public Adapter caseProjectUndeleted(ProjectUndeleted object) {
				return createProjectUndeletedAdapter();
			}
			@Override
			public Adapter caseRevisionUpdated(RevisionUpdated object) {
				return createRevisionUpdatedAdapter();
			}
			@Override
			public Adapter caseGeoTagUpdated(GeoTagUpdated object) {
				return createGeoTagUpdatedAdapter();
			}
			@Override
			public Adapter caseClashDetectionSettingsUpdated(ClashDetectionSettingsUpdated object) {
				return createClashDetectionSettingsUpdatedAdapter();
			}
			@Override
			public Adapter casePasswordChanged(PasswordChanged object) {
				return createPasswordChangedAdapter();
			}
			@Override
			public Adapter caseUserChanged(UserChanged object) {
				return createUserChangedAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.log.LogAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.log.LogAction
	 * @generated
	 */
	public Adapter createLogActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.log.ServerLog <em>Server Log</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.log.ServerLog
	 * @generated
	 */
	public Adapter createServerLogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.log.NewUserAdded <em>New User Added</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.log.NewUserAdded
	 * @generated
	 */
	public Adapter createNewUserAddedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.log.NewProjectAdded <em>New Project Added</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.log.NewProjectAdded
	 * @generated
	 */
	public Adapter createNewProjectAddedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.log.NewRevisionAdded <em>New Revision Added</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.log.NewRevisionAdded
	 * @generated
	 */
	public Adapter createNewRevisionAddedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.log.NewCheckoutAdded <em>New Checkout Added</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.log.NewCheckoutAdded
	 * @generated
	 */
	public Adapter createNewCheckoutAddedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.log.SettingsSaved <em>Settings Saved</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.log.SettingsSaved
	 * @generated
	 */
	public Adapter createSettingsSavedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.log.UserAddedToProject <em>User Added To Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.log.UserAddedToProject
	 * @generated
	 */
	public Adapter createUserAddedToProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.log.NewGuidanceProviderUploaded <em>New Guidance Provider Uploaded</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.log.NewGuidanceProviderUploaded
	 * @generated
	 */
	public Adapter createNewGuidanceProviderUploadedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.log.Download <em>Download</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.log.Download
	 * @generated
	 */
	public Adapter createDownloadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.log.UserRemovedFromProject <em>User Removed From Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.log.UserRemovedFromProject
	 * @generated
	 */
	public Adapter createUserRemovedFromProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.log.ProjectDeleted <em>Project Deleted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.log.ProjectDeleted
	 * @generated
	 */
	public Adapter createProjectDeletedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.log.UserDeleted <em>User Deleted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.log.UserDeleted
	 * @generated
	 */
	public Adapter createUserDeletedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.log.PasswordReset <em>Password Reset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.log.PasswordReset
	 * @generated
	 */
	public Adapter createPasswordResetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.log.DatabaseCreated <em>Database Created</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.log.DatabaseCreated
	 * @generated
	 */
	public Adapter createDatabaseCreatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.log.ServerStarted <em>Server Started</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.log.ServerStarted
	 * @generated
	 */
	public Adapter createServerStartedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.log.ProjectUpdated <em>Project Updated</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.log.ProjectUpdated
	 * @generated
	 */
	public Adapter createProjectUpdatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.log.UserUndeleted <em>User Undeleted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.log.UserUndeleted
	 * @generated
	 */
	public Adapter createUserUndeletedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.log.ProjectUndeleted <em>Project Undeleted</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.log.ProjectUndeleted
	 * @generated
	 */
	public Adapter createProjectUndeletedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.log.RevisionUpdated <em>Revision Updated</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.log.RevisionUpdated
	 * @generated
	 */
	public Adapter createRevisionUpdatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.log.GeoTagUpdated <em>Geo Tag Updated</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.log.GeoTagUpdated
	 * @generated
	 */
	public Adapter createGeoTagUpdatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.log.ClashDetectionSettingsUpdated <em>Clash Detection Settings Updated</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.log.ClashDetectionSettingsUpdated
	 * @generated
	 */
	public Adapter createClashDetectionSettingsUpdatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.log.PasswordChanged <em>Password Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.log.PasswordChanged
	 * @generated
	 */
	public Adapter createPasswordChangedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.bimserver.models.log.UserChanged <em>User Changed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.bimserver.models.log.UserChanged
	 * @generated
	 */
	public Adapter createUserChangedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LogAdapterFactory
