/**
 */
package gendev.hw1.impl;

import gendev.hw1.Appointment;
import gendev.hw1.Doctor;
import gendev.hw1.Hw1Package;
import gendev.hw1.Patient;
import gendev.hw1.Staff;
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
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.PatientImpl#getPatientId <em>Patient Id</em>}</li>
 *   <li>{@link gendev.hw1.impl.PatientImpl#getPatientName <em>Patient Name</em>}</li>
 *   <li>{@link gendev.hw1.impl.PatientImpl#isRegisteredPatientFlag <em>Registered Patient Flag</em>}</li>
 *   <li>{@link gendev.hw1.impl.PatientImpl#isRequestAppointment <em>Request Appointment</em>}</li>
 *   <li>{@link gendev.hw1.impl.PatientImpl#getAppointment <em>Appointment</em>}</li>
 *   <li>{@link gendev.hw1.impl.PatientImpl#getStaff <em>Staff</em>}</li>
 *   <li>{@link gendev.hw1.impl.PatientImpl#getDoctor <em>Doctor</em>}</li>
 *   <li>{@link gendev.hw1.impl.PatientImpl#isHealthInsuranceCover <em>Health Insurance Cover</em>}</li>
 *   <li>{@link gendev.hw1.impl.PatientImpl#isEmergencyCase <em>Emergency Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatientImpl extends MinimalEObjectImpl.Container implements Patient {
	/**
	 * The default value of the '{@link #getPatientId() <em>Patient Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientId()
	 * @generated
	 * @ordered
	 */
	protected static final int PATIENT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPatientId() <em>Patient Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientId()
	 * @generated
	 * @ordered
	 */
	protected int patientId = PATIENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPatientName() <em>Patient Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientName()
	 * @generated
	 * @ordered
	 */
	protected static final String PATIENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPatientName() <em>Patient Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientName()
	 * @generated
	 * @ordered
	 */
	protected String patientName = PATIENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isRegisteredPatientFlag() <em>Registered Patient Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegisteredPatientFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REGISTERED_PATIENT_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRegisteredPatientFlag() <em>Registered Patient Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegisteredPatientFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean registeredPatientFlag = REGISTERED_PATIENT_FLAG_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequestAppointment() <em>Request Appointment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequestAppointment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUEST_APPOINTMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequestAppointment() <em>Request Appointment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequestAppointment()
	 * @generated
	 * @ordered
	 */
	protected boolean requestAppointment = REQUEST_APPOINTMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAppointment() <em>Appointment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointment()
	 * @generated
	 * @ordered
	 */
	protected EList<Appointment> appointment;

	/**
	 * The cached value of the '{@link #getStaff() <em>Staff</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaff()
	 * @generated
	 * @ordered
	 */
	protected Staff staff;

	/**
	 * The cached value of the '{@link #getDoctor() <em>Doctor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoctor()
	 * @generated
	 * @ordered
	 */
	protected EList<Doctor> doctor;

	/**
	 * The default value of the '{@link #isHealthInsuranceCover() <em>Health Insurance Cover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHealthInsuranceCover()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HEALTH_INSURANCE_COVER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHealthInsuranceCover() <em>Health Insurance Cover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHealthInsuranceCover()
	 * @generated
	 * @ordered
	 */
	protected boolean healthInsuranceCover = HEALTH_INSURANCE_COVER_EDEFAULT;

	/**
	 * The default value of the '{@link #isEmergencyCase() <em>Emergency Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmergencyCase()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EMERGENCY_CASE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEmergencyCase() <em>Emergency Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmergencyCase()
	 * @generated
	 * @ordered
	 */
	protected boolean emergencyCase = EMERGENCY_CASE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.PATIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPatientId() {
		return patientId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatientId(int newPatientId) {
		int oldPatientId = patientId;
		patientId = newPatientId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.PATIENT__PATIENT_ID, oldPatientId,
					patientId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPatientName() {
		return patientName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatientName(String newPatientName) {
		String oldPatientName = patientName;
		patientName = newPatientName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.PATIENT__PATIENT_NAME, oldPatientName,
					patientName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRegisteredPatientFlag() {
		return registeredPatientFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRegisteredPatientFlag(boolean newRegisteredPatientFlag) {
		boolean oldRegisteredPatientFlag = registeredPatientFlag;
		registeredPatientFlag = newRegisteredPatientFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.PATIENT__REGISTERED_PATIENT_FLAG,
					oldRegisteredPatientFlag, registeredPatientFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequestAppointment() {
		return requestAppointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequestAppointment(boolean newRequestAppointment) {
		boolean oldRequestAppointment = requestAppointment;
		requestAppointment = newRequestAppointment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.PATIENT__REQUEST_APPOINTMENT,
					oldRequestAppointment, requestAppointment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Appointment> getAppointment() {
		if (appointment == null) {
			appointment = new EObjectWithInverseResolvingEList<Appointment>(Appointment.class, this,
					Hw1Package.PATIENT__APPOINTMENT, Hw1Package.APPOINTMENT__PATIENT);
		}
		return appointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Staff getStaff() {
		if (staff != null && staff.eIsProxy()) {
			InternalEObject oldStaff = (InternalEObject) staff;
			staff = (Staff) eResolveProxy(oldStaff);
			if (staff != oldStaff) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hw1Package.PATIENT__STAFF, oldStaff,
							staff));
			}
		}
		return staff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Staff basicGetStaff() {
		return staff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaff(Staff newStaff, NotificationChain msgs) {
		Staff oldStaff = staff;
		staff = newStaff;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hw1Package.PATIENT__STAFF,
					oldStaff, newStaff);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStaff(Staff newStaff) {
		if (newStaff != staff) {
			NotificationChain msgs = null;
			if (staff != null)
				msgs = ((InternalEObject) staff).eInverseRemove(this, Hw1Package.STAFF__PATIENT, Staff.class, msgs);
			if (newStaff != null)
				msgs = ((InternalEObject) newStaff).eInverseAdd(this, Hw1Package.STAFF__PATIENT, Staff.class, msgs);
			msgs = basicSetStaff(newStaff, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.PATIENT__STAFF, newStaff, newStaff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Doctor> getDoctor() {
		if (doctor == null) {
			doctor = new EObjectWithInverseResolvingEList.ManyInverse<Doctor>(Doctor.class, this,
					Hw1Package.PATIENT__DOCTOR, Hw1Package.DOCTOR__PATIENT);
		}
		return doctor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isHealthInsuranceCover() {
		return healthInsuranceCover;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHealthInsuranceCover(boolean newHealthInsuranceCover) {
		boolean oldHealthInsuranceCover = healthInsuranceCover;
		healthInsuranceCover = newHealthInsuranceCover;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.PATIENT__HEALTH_INSURANCE_COVER,
					oldHealthInsuranceCover, healthInsuranceCover));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEmergencyCase() {
		return emergencyCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmergencyCase(boolean newEmergencyCase) {
		boolean oldEmergencyCase = emergencyCase;
		emergencyCase = newEmergencyCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.PATIENT__EMERGENCY_CASE, oldEmergencyCase,
					emergencyCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.PATIENT__APPOINTMENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAppointment()).basicAdd(otherEnd, msgs);
		case Hw1Package.PATIENT__STAFF:
			if (staff != null)
				msgs = ((InternalEObject) staff).eInverseRemove(this, Hw1Package.STAFF__PATIENT, Staff.class, msgs);
			return basicSetStaff((Staff) otherEnd, msgs);
		case Hw1Package.PATIENT__DOCTOR:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDoctor()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.PATIENT__APPOINTMENT:
			return ((InternalEList<?>) getAppointment()).basicRemove(otherEnd, msgs);
		case Hw1Package.PATIENT__STAFF:
			return basicSetStaff(null, msgs);
		case Hw1Package.PATIENT__DOCTOR:
			return ((InternalEList<?>) getDoctor()).basicRemove(otherEnd, msgs);
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
		case Hw1Package.PATIENT__PATIENT_ID:
			return getPatientId();
		case Hw1Package.PATIENT__PATIENT_NAME:
			return getPatientName();
		case Hw1Package.PATIENT__REGISTERED_PATIENT_FLAG:
			return isRegisteredPatientFlag();
		case Hw1Package.PATIENT__REQUEST_APPOINTMENT:
			return isRequestAppointment();
		case Hw1Package.PATIENT__APPOINTMENT:
			return getAppointment();
		case Hw1Package.PATIENT__STAFF:
			if (resolve)
				return getStaff();
			return basicGetStaff();
		case Hw1Package.PATIENT__DOCTOR:
			return getDoctor();
		case Hw1Package.PATIENT__HEALTH_INSURANCE_COVER:
			return isHealthInsuranceCover();
		case Hw1Package.PATIENT__EMERGENCY_CASE:
			return isEmergencyCase();
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
		case Hw1Package.PATIENT__PATIENT_ID:
			setPatientId((Integer) newValue);
			return;
		case Hw1Package.PATIENT__PATIENT_NAME:
			setPatientName((String) newValue);
			return;
		case Hw1Package.PATIENT__REGISTERED_PATIENT_FLAG:
			setRegisteredPatientFlag((Boolean) newValue);
			return;
		case Hw1Package.PATIENT__REQUEST_APPOINTMENT:
			setRequestAppointment((Boolean) newValue);
			return;
		case Hw1Package.PATIENT__APPOINTMENT:
			getAppointment().clear();
			getAppointment().addAll((Collection<? extends Appointment>) newValue);
			return;
		case Hw1Package.PATIENT__STAFF:
			setStaff((Staff) newValue);
			return;
		case Hw1Package.PATIENT__DOCTOR:
			getDoctor().clear();
			getDoctor().addAll((Collection<? extends Doctor>) newValue);
			return;
		case Hw1Package.PATIENT__HEALTH_INSURANCE_COVER:
			setHealthInsuranceCover((Boolean) newValue);
			return;
		case Hw1Package.PATIENT__EMERGENCY_CASE:
			setEmergencyCase((Boolean) newValue);
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
		case Hw1Package.PATIENT__PATIENT_ID:
			setPatientId(PATIENT_ID_EDEFAULT);
			return;
		case Hw1Package.PATIENT__PATIENT_NAME:
			setPatientName(PATIENT_NAME_EDEFAULT);
			return;
		case Hw1Package.PATIENT__REGISTERED_PATIENT_FLAG:
			setRegisteredPatientFlag(REGISTERED_PATIENT_FLAG_EDEFAULT);
			return;
		case Hw1Package.PATIENT__REQUEST_APPOINTMENT:
			setRequestAppointment(REQUEST_APPOINTMENT_EDEFAULT);
			return;
		case Hw1Package.PATIENT__APPOINTMENT:
			getAppointment().clear();
			return;
		case Hw1Package.PATIENT__STAFF:
			setStaff((Staff) null);
			return;
		case Hw1Package.PATIENT__DOCTOR:
			getDoctor().clear();
			return;
		case Hw1Package.PATIENT__HEALTH_INSURANCE_COVER:
			setHealthInsuranceCover(HEALTH_INSURANCE_COVER_EDEFAULT);
			return;
		case Hw1Package.PATIENT__EMERGENCY_CASE:
			setEmergencyCase(EMERGENCY_CASE_EDEFAULT);
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
		case Hw1Package.PATIENT__PATIENT_ID:
			return patientId != PATIENT_ID_EDEFAULT;
		case Hw1Package.PATIENT__PATIENT_NAME:
			return PATIENT_NAME_EDEFAULT == null ? patientName != null : !PATIENT_NAME_EDEFAULT.equals(patientName);
		case Hw1Package.PATIENT__REGISTERED_PATIENT_FLAG:
			return registeredPatientFlag != REGISTERED_PATIENT_FLAG_EDEFAULT;
		case Hw1Package.PATIENT__REQUEST_APPOINTMENT:
			return requestAppointment != REQUEST_APPOINTMENT_EDEFAULT;
		case Hw1Package.PATIENT__APPOINTMENT:
			return appointment != null && !appointment.isEmpty();
		case Hw1Package.PATIENT__STAFF:
			return staff != null;
		case Hw1Package.PATIENT__DOCTOR:
			return doctor != null && !doctor.isEmpty();
		case Hw1Package.PATIENT__HEALTH_INSURANCE_COVER:
			return healthInsuranceCover != HEALTH_INSURANCE_COVER_EDEFAULT;
		case Hw1Package.PATIENT__EMERGENCY_CASE:
			return emergencyCase != EMERGENCY_CASE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (patientId: ");
		result.append(patientId);
		result.append(", patientName: ");
		result.append(patientName);
		result.append(", RegisteredPatientFlag: ");
		result.append(registeredPatientFlag);
		result.append(", requestAppointment: ");
		result.append(requestAppointment);
		result.append(", healthInsuranceCover: ");
		result.append(healthInsuranceCover);
		result.append(", emergencyCase: ");
		result.append(emergencyCase);
		result.append(')');
		return result.toString();
	}

} //PatientImpl
