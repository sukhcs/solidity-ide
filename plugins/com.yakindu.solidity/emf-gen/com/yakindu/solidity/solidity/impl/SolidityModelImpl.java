/**
 * generated by Xtext 2.18.0
 */
package com.yakindu.solidity.solidity.impl;

import com.yakindu.solidity.solidity.SolidityModel;
import com.yakindu.solidity.solidity.SolidityPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.yakindu.solidity.solidity.impl.SolidityModelImpl#getSourceunit <em>Sourceunit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolidityModelImpl extends MinimalEObjectImpl.Container implements SolidityModel {
	/**
	 * The cached value of the '{@link #getSourceunit() <em>Sourceunit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceunit()
	 * @generated
	 * @ordered
	 */
	protected EList<org.yakindu.base.types.Package> sourceunit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolidityModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SolidityPackage.Literals.SOLIDITY_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.yakindu.base.types.Package> getSourceunit() {
		if (sourceunit == null) {
			sourceunit = new EObjectContainmentEList<org.yakindu.base.types.Package>(org.yakindu.base.types.Package.class, this, SolidityPackage.SOLIDITY_MODEL__SOURCEUNIT);
		}
		return sourceunit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SolidityPackage.SOLIDITY_MODEL__SOURCEUNIT:
				return ((InternalEList<?>)getSourceunit()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SolidityPackage.SOLIDITY_MODEL__SOURCEUNIT:
				return getSourceunit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SolidityPackage.SOLIDITY_MODEL__SOURCEUNIT:
				getSourceunit().clear();
				getSourceunit().addAll((Collection<? extends org.yakindu.base.types.Package>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SolidityPackage.SOLIDITY_MODEL__SOURCEUNIT:
				getSourceunit().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SolidityPackage.SOLIDITY_MODEL__SOURCEUNIT:
				return sourceunit != null && !sourceunit.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SolidityModelImpl
