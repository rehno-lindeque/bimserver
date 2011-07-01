/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bimserver.models.store.impl;

import java.util.Date;

import org.bimserver.emf.IdEObjectImpl;
import org.bimserver.models.store.Checkout;
import org.bimserver.models.store.ClashDetectionSettings;
import org.bimserver.models.store.ConcreteRevision;
import org.bimserver.models.store.GeoTag;
import org.bimserver.models.store.ObjectState;
import org.bimserver.models.store.Project;
import org.bimserver.models.store.Revision;
import org.bimserver.models.store.SIPrefix;
import org.bimserver.models.store.StorePackage;
import org.bimserver.models.store.User;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.store.impl.ProjectImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ProjectImpl#getHasAuthorizedUsers <em>Has Authorized Users</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ProjectImpl#getConcreteRevisions <em>Concrete Revisions</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ProjectImpl#getRevisions <em>Revisions</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ProjectImpl#getLastConcreteRevision <em>Last Concrete Revision</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ProjectImpl#getLastRevision <em>Last Revision</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ProjectImpl#getCheckouts <em>Checkouts</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ProjectImpl#getState <em>State</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ProjectImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ProjectImpl#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ProjectImpl#getGeoTag <em>Geo Tag</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ProjectImpl#getSubProjects <em>Sub Projects</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ProjectImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ProjectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ProjectImpl#getClashDetectionSettings <em>Clash Detection Settings</em>}</li>
 *   <li>{@link org.bimserver.models.store.impl.ProjectImpl#getExportLengthMeasurePrefix <em>Export Length Measure Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectImpl extends IdEObjectImpl implements Project {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return (Integer)eGet(StorePackage.Literals.PROJECT__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		eSet(StorePackage.Literals.PROJECT__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(StorePackage.Literals.PROJECT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(StorePackage.Literals.PROJECT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<User> getHasAuthorizedUsers() {
		return (EList<User>)eGet(StorePackage.Literals.PROJECT__HAS_AUTHORIZED_USERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConcreteRevision> getConcreteRevisions() {
		return (EList<ConcreteRevision>)eGet(StorePackage.Literals.PROJECT__CONCRETE_REVISIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Revision> getRevisions() {
		return (EList<Revision>)eGet(StorePackage.Literals.PROJECT__REVISIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConcreteRevision getLastConcreteRevision() {
		return (ConcreteRevision)eGet(StorePackage.Literals.PROJECT__LAST_CONCRETE_REVISION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastConcreteRevision(ConcreteRevision newLastConcreteRevision) {
		eSet(StorePackage.Literals.PROJECT__LAST_CONCRETE_REVISION, newLastConcreteRevision);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Revision getLastRevision() {
		return (Revision)eGet(StorePackage.Literals.PROJECT__LAST_REVISION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastRevision(Revision newLastRevision) {
		eSet(StorePackage.Literals.PROJECT__LAST_REVISION, newLastRevision);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Checkout> getCheckouts() {
		return (EList<Checkout>)eGet(StorePackage.Literals.PROJECT__CHECKOUTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectState getState() {
		return (ObjectState)eGet(StorePackage.Literals.PROJECT__STATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(ObjectState newState) {
		eSet(StorePackage.Literals.PROJECT__STATE, newState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreatedDate() {
		return (Date)eGet(StorePackage.Literals.PROJECT__CREATED_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedDate(Date newCreatedDate) {
		eSet(StorePackage.Literals.PROJECT__CREATED_DATE, newCreatedDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getCreatedBy() {
		return (User)eGet(StorePackage.Literals.PROJECT__CREATED_BY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedBy(User newCreatedBy) {
		eSet(StorePackage.Literals.PROJECT__CREATED_BY, newCreatedBy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeoTag getGeoTag() {
		return (GeoTag)eGet(StorePackage.Literals.PROJECT__GEO_TAG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeoTag(GeoTag newGeoTag) {
		eSet(StorePackage.Literals.PROJECT__GEO_TAG, newGeoTag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Project> getSubProjects() {
		return (EList<Project>)eGet(StorePackage.Literals.PROJECT__SUB_PROJECTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getParent() {
		return (Project)eGet(StorePackage.Literals.PROJECT__PARENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Project newParent) {
		eSet(StorePackage.Literals.PROJECT__PARENT, newParent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(StorePackage.Literals.PROJECT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(StorePackage.Literals.PROJECT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClashDetectionSettings getClashDetectionSettings() {
		return (ClashDetectionSettings)eGet(StorePackage.Literals.PROJECT__CLASH_DETECTION_SETTINGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClashDetectionSettings(ClashDetectionSettings newClashDetectionSettings) {
		eSet(StorePackage.Literals.PROJECT__CLASH_DETECTION_SETTINGS, newClashDetectionSettings);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SIPrefix getExportLengthMeasurePrefix() {
		return (SIPrefix)eGet(StorePackage.Literals.PROJECT__EXPORT_LENGTH_MEASURE_PREFIX, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExportLengthMeasurePrefix(SIPrefix newExportLengthMeasurePrefix) {
		eSet(StorePackage.Literals.PROJECT__EXPORT_LENGTH_MEASURE_PREFIX, newExportLengthMeasurePrefix);
	}

} //ProjectImpl
