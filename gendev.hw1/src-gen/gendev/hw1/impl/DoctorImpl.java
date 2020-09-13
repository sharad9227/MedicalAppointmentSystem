/**
 */
package gendev.hw1.impl;

import gendev.hw1.Doctor;
import gendev.hw1.DoctorAppointment;
import gendev.hw1.Hw1Package;

import gendev.hw1.Patient;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Doctor</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.DoctorImpl#getDoctorName <em>Doctor Name</em>}</li>
 *   <li>{@link gendev.hw1.impl.DoctorImpl#getDoctorId <em>Doctor Id</em>}</li>
 *   <li>{@link gendev.hw1.impl.DoctorImpl#getDoctorappointment <em>Doctorappointment</em>}</li>
 *   <li>{@link gendev.hw1.impl.DoctorImpl#getPatient <em>Patient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoctorImpl extends MinimalEObjectImpl.Container implements Doctor {
	/**
	 * The default value of the '{@link #getDoctorName() <em>Doctor Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDoctorName()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCTOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDoctorName() <em>Doctor Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDoctorName()
	 * @generated
	 * @ordered
	 */
	protected String doctorName = DOCTOR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDoctorId() <em>Doctor Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDoctorId()
	 * @generated
	 * @ordered
	 */
	protected static final int DOCTOR_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDoctorId() <em>Doctor Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDoctorId()
	 * @generated
	 * @ordered
	 */
	protected int doctorId = DOCTOR_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDoctorappointment() <em>Doctorappointment</em>}' reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDoctorappointment()
	 * @generated
	 * @ordered
	 */
	protected EList<DoctorAppointment> doctorappointment;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected EList<Patient> patient;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected DoctorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.DOCTOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDoctorName() {
		return doctorName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoctorName(String newDoctorName) {
		String oldDoctorName = doctorName;
		doctorName = newDoctorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.DOCTOR__DOCTOR_NAME, oldDoctorName,
					doctorName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDoctorId() {
		return doctorId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoctorId(int newDoctorId) {
		int oldDoctorId = doctorId;
		doctorId = newDoctorId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.DOCTOR__DOCTOR_ID, oldDoctorId, doctorId));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DoctorAppointment> getDoctorappointment() {
		if (doctorappointment == null) {
			doctorappointment = new EObjectWithInverseResolvingEList<DoctorAppointment>(DoctorAppointment.class, this,
					Hw1Package.DOCTOR__DOCTORAPPOINTMENT, Hw1Package.DOCTOR_APPOINTMENT__DOCTOR);
		}
		return doctorappointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Patient> getPatient() {
		if (patient == null) {
			patient = new EObjectWithInverseResolvingEList.ManyInverse<Patient>(Patient.class, this,
					Hw1Package.DOCTOR__PATIENT, Hw1Package.PATIENT__DOCTOR);
		}
		return patient;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.DOCTOR__DOCTORAPPOINTMENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDoctorappointment()).basicAdd(otherEnd,
					msgs);
		case Hw1Package.DOCTOR__PATIENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPatient()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.DOCTOR__DOCTORAPPOINTMENT:
			return ((InternalEList<?>) getDoctorappointment()).basicRemove(otherEnd, msgs);
		case Hw1Package.DOCTOR__PATIENT:
			return ((InternalEList<?>) getPatient()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Hw1Package.DOCTOR__DOCTOR_NAME:
			return getDoctorName();
		case Hw1Package.DOCTOR__DOCTOR_ID:
			return getDoctorId();
		case Hw1Package.DOCTOR__DOCTORAPPOINTMENT:
			return getDoctorappointment();
		case Hw1Package.DOCTOR__PATIENT:
			return getPatient();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Hw1Package.DOCTOR__DOCTOR_NAME:
			setDoctorName((String) newValue);
			return;
		case Hw1Package.DOCTOR__DOCTOR_ID:
			setDoctorId((Integer) newValue);
			return;
		case Hw1Package.DOCTOR__DOCTORAPPOINTMENT:
			getDoctorappointment().clear();
			getDoctorappointment().addAll((Collection<? extends DoctorAppointment>) newValue);
			return;
		case Hw1Package.DOCTOR__PATIENT:
			getPatient().clear();
			getPatient().addAll((Collection<? extends Patient>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Hw1Package.DOCTOR__DOCTOR_NAME:
			setDoctorName(DOCTOR_NAME_EDEFAULT);
			return;
		case Hw1Package.DOCTOR__DOCTOR_ID:
			setDoctorId(DOCTOR_ID_EDEFAULT);
			return;
		case Hw1Package.DOCTOR__DOCTORAPPOINTMENT:
			getDoctorappointment().clear();
			return;
		case Hw1Package.DOCTOR__PATIENT:
			getPatient().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Hw1Package.DOCTOR__DOCTOR_NAME:
			return DOCTOR_NAME_EDEFAULT == null ? doctorName != null : !DOCTOR_NAME_EDEFAULT.equals(doctorName);
		case Hw1Package.DOCTOR__DOCTOR_ID:
			return doctorId != DOCTOR_ID_EDEFAULT;
		case Hw1Package.DOCTOR__DOCTORAPPOINTMENT:
			return doctorappointment != null && !doctorappointment.isEmpty();
		case Hw1Package.DOCTOR__PATIENT:
			return patient != null && !patient.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (doctorName: ");
		result.append(doctorName);
		result.append(", doctorId: ");
		result.append(doctorId);
		result.append(')');
		return result.toString();
	}

} // DoctorImpl
