/**
 */
package gendev.hw1.impl;

import gendev.hw1.Doctor;
import gendev.hw1.DoctorAppointment;
import gendev.hw1.Hw1Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Doctor Appointment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.DoctorAppointmentImpl#isDoctorAvailabilty <em>Doctor Availabilty</em>}</li>
 *   <li>{@link gendev.hw1.impl.DoctorAppointmentImpl#getAppointmentTime <em>Appointment Time</em>}</li>
 *   <li>{@link gendev.hw1.impl.DoctorAppointmentImpl#getDoctor <em>Doctor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoctorAppointmentImpl extends AppointmentImpl implements DoctorAppointment {
	/**
	 * The default value of the '{@link #isDoctorAvailabilty() <em>Doctor Availabilty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDoctorAvailabilty()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DOCTOR_AVAILABILTY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDoctorAvailabilty() <em>Doctor Availabilty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDoctorAvailabilty()
	 * @generated
	 * @ordered
	 */
	protected boolean doctorAvailabilty = DOCTOR_AVAILABILTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAppointmentTime() <em>Appointment Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointmentTime()
	 * @generated
	 * @ordered
	 */
	protected static final String APPOINTMENT_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppointmentTime() <em>Appointment Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointmentTime()
	 * @generated
	 * @ordered
	 */
	protected String appointmentTime = APPOINTMENT_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDoctor() <em>Doctor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoctor()
	 * @generated
	 * @ordered
	 */
	protected Doctor doctor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoctorAppointmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.DOCTOR_APPOINTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDoctorAvailabilty() {
		return doctorAvailabilty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDoctorAvailabilty(boolean newDoctorAvailabilty) {
		boolean oldDoctorAvailabilty = doctorAvailabilty;
		doctorAvailabilty = newDoctorAvailabilty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.DOCTOR_APPOINTMENT__DOCTOR_AVAILABILTY,
					oldDoctorAvailabilty, doctorAvailabilty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAppointmentTime() {
		return appointmentTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAppointmentTime(String newAppointmentTime) {
		String oldAppointmentTime = appointmentTime;
		appointmentTime = newAppointmentTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.DOCTOR_APPOINTMENT__APPOINTMENT_TIME,
					oldAppointmentTime, appointmentTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Doctor getDoctor() {
		if (doctor != null && doctor.eIsProxy()) {
			InternalEObject oldDoctor = (InternalEObject) doctor;
			doctor = (Doctor) eResolveProxy(oldDoctor);
			if (doctor != oldDoctor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hw1Package.DOCTOR_APPOINTMENT__DOCTOR,
							oldDoctor, doctor));
			}
		}
		return doctor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Doctor basicGetDoctor() {
		return doctor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoctor(Doctor newDoctor, NotificationChain msgs) {
		Doctor oldDoctor = doctor;
		doctor = newDoctor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Hw1Package.DOCTOR_APPOINTMENT__DOCTOR, oldDoctor, newDoctor);
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
	public void setDoctor(Doctor newDoctor) {
		if (newDoctor != doctor) {
			NotificationChain msgs = null;
			if (doctor != null)
				msgs = ((InternalEObject) doctor).eInverseRemove(this, Hw1Package.DOCTOR__DOCTORAPPOINTMENT,
						Doctor.class, msgs);
			if (newDoctor != null)
				msgs = ((InternalEObject) newDoctor).eInverseAdd(this, Hw1Package.DOCTOR__DOCTORAPPOINTMENT,
						Doctor.class, msgs);
			msgs = basicSetDoctor(newDoctor, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.DOCTOR_APPOINTMENT__DOCTOR, newDoctor,
					newDoctor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.DOCTOR_APPOINTMENT__DOCTOR:
			if (doctor != null)
				msgs = ((InternalEObject) doctor).eInverseRemove(this, Hw1Package.DOCTOR__DOCTORAPPOINTMENT,
						Doctor.class, msgs);
			return basicSetDoctor((Doctor) otherEnd, msgs);
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
		case Hw1Package.DOCTOR_APPOINTMENT__DOCTOR:
			return basicSetDoctor(null, msgs);
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
		case Hw1Package.DOCTOR_APPOINTMENT__DOCTOR_AVAILABILTY:
			return isDoctorAvailabilty();
		case Hw1Package.DOCTOR_APPOINTMENT__APPOINTMENT_TIME:
			return getAppointmentTime();
		case Hw1Package.DOCTOR_APPOINTMENT__DOCTOR:
			if (resolve)
				return getDoctor();
			return basicGetDoctor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Hw1Package.DOCTOR_APPOINTMENT__DOCTOR_AVAILABILTY:
			setDoctorAvailabilty((Boolean) newValue);
			return;
		case Hw1Package.DOCTOR_APPOINTMENT__APPOINTMENT_TIME:
			setAppointmentTime((String) newValue);
			return;
		case Hw1Package.DOCTOR_APPOINTMENT__DOCTOR:
			setDoctor((Doctor) newValue);
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
		case Hw1Package.DOCTOR_APPOINTMENT__DOCTOR_AVAILABILTY:
			setDoctorAvailabilty(DOCTOR_AVAILABILTY_EDEFAULT);
			return;
		case Hw1Package.DOCTOR_APPOINTMENT__APPOINTMENT_TIME:
			setAppointmentTime(APPOINTMENT_TIME_EDEFAULT);
			return;
		case Hw1Package.DOCTOR_APPOINTMENT__DOCTOR:
			setDoctor((Doctor) null);
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
		case Hw1Package.DOCTOR_APPOINTMENT__DOCTOR_AVAILABILTY:
			return doctorAvailabilty != DOCTOR_AVAILABILTY_EDEFAULT;
		case Hw1Package.DOCTOR_APPOINTMENT__APPOINTMENT_TIME:
			return APPOINTMENT_TIME_EDEFAULT == null ? appointmentTime != null
					: !APPOINTMENT_TIME_EDEFAULT.equals(appointmentTime);
		case Hw1Package.DOCTOR_APPOINTMENT__DOCTOR:
			return doctor != null;
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
		result.append(" (doctorAvailabilty: ");
		result.append(doctorAvailabilty);
		result.append(", appointmentTime: ");
		result.append(appointmentTime);
		result.append(')');
		return result.toString();
	}

} //DoctorAppointmentImpl
