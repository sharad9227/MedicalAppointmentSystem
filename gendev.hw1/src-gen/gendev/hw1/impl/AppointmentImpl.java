/**
 */
package gendev.hw1.impl;

import gendev.hw1.Appointment;
import gendev.hw1.Hw1Package;
import gendev.hw1.Patient;
import gendev.hw1.PaymentGateway;
import gendev.hw1.Staff;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Appointment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.AppointmentImpl#getAppointmentDate <em>Appointment Date</em>}</li>
 *   <li>{@link gendev.hw1.impl.AppointmentImpl#getAppointmentType <em>Appointment Type</em>}</li>
 *   <li>{@link gendev.hw1.impl.AppointmentImpl#getStaff <em>Staff</em>}</li>
 *   <li>{@link gendev.hw1.impl.AppointmentImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link gendev.hw1.impl.AppointmentImpl#getAmountforAppointment <em>Amountfor Appointment</em>}</li>
 *   <li>{@link gendev.hw1.impl.AppointmentImpl#getPayment <em>Payment</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AppointmentImpl extends MinimalEObjectImpl.Container implements Appointment {
	/**
	 * The default value of the '{@link #getAppointmentDate() <em>Appointment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointmentDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date APPOINTMENT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppointmentDate() <em>Appointment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointmentDate()
	 * @generated
	 * @ordered
	 */
	protected Date appointmentDate = APPOINTMENT_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAppointmentType() <em>Appointment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointmentType()
	 * @generated
	 * @ordered
	 */
	protected static final String APPOINTMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAppointmentType() <em>Appointment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointmentType()
	 * @generated
	 * @ordered
	 */
	protected String appointmentType = APPOINTMENT_TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Patient patient;

	/**
	 * The default value of the '{@link #getAmountforAppointment() <em>Amountfor Appointment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountforAppointment()
	 * @generated
	 * @ordered
	 */
	protected static final float AMOUNTFOR_APPOINTMENT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAmountforAppointment() <em>Amountfor Appointment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountforAppointment()
	 * @generated
	 * @ordered
	 */
	protected float amountforAppointment = AMOUNTFOR_APPOINTMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPayment() <em>Payment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayment()
	 * @generated
	 * @ordered
	 */
	protected PaymentGateway payment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppointmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.APPOINTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getAppointmentDate() {
		return appointmentDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAppointmentDate(Date newAppointmentDate) {
		Date oldAppointmentDate = appointmentDate;
		appointmentDate = newAppointmentDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.APPOINTMENT__APPOINTMENT_DATE,
					oldAppointmentDate, appointmentDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAppointmentType() {
		return appointmentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAppointmentType(String newAppointmentType) {
		String oldAppointmentType = appointmentType;
		appointmentType = newAppointmentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.APPOINTMENT__APPOINTMENT_TYPE,
					oldAppointmentType, appointmentType));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hw1Package.APPOINTMENT__STAFF, oldStaff,
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Hw1Package.APPOINTMENT__STAFF, oldStaff, newStaff);
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
				msgs = ((InternalEObject) staff).eInverseRemove(this, Hw1Package.STAFF__APPOINTMENT, Staff.class, msgs);
			if (newStaff != null)
				msgs = ((InternalEObject) newStaff).eInverseAdd(this, Hw1Package.STAFF__APPOINTMENT, Staff.class, msgs);
			msgs = basicSetStaff(newStaff, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.APPOINTMENT__STAFF, newStaff, newStaff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Patient getPatient() {
		if (patient != null && patient.eIsProxy()) {
			InternalEObject oldPatient = (InternalEObject) patient;
			patient = (Patient) eResolveProxy(oldPatient);
			if (patient != oldPatient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hw1Package.APPOINTMENT__PATIENT,
							oldPatient, patient));
			}
		}
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient basicGetPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Patient newPatient, NotificationChain msgs) {
		Patient oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Hw1Package.APPOINTMENT__PATIENT, oldPatient, newPatient);
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
	public void setPatient(Patient newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject) patient).eInverseRemove(this, Hw1Package.PATIENT__APPOINTMENT, Patient.class,
						msgs);
			if (newPatient != null)
				msgs = ((InternalEObject) newPatient).eInverseAdd(this, Hw1Package.PATIENT__APPOINTMENT, Patient.class,
						msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.APPOINTMENT__PATIENT, newPatient,
					newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getAmountforAppointment() {
		return amountforAppointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmountforAppointment(float newAmountforAppointment) {
		float oldAmountforAppointment = amountforAppointment;
		amountforAppointment = newAmountforAppointment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.APPOINTMENT__AMOUNTFOR_APPOINTMENT,
					oldAmountforAppointment, amountforAppointment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentGateway getPayment() {
		if (payment != null && payment.eIsProxy()) {
			InternalEObject oldPayment = (InternalEObject) payment;
			payment = (PaymentGateway) eResolveProxy(oldPayment);
			if (payment != oldPayment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hw1Package.APPOINTMENT__PAYMENT,
							oldPayment, payment));
			}
		}
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentGateway basicGetPayment() {
		return payment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayment(PaymentGateway newPayment, NotificationChain msgs) {
		PaymentGateway oldPayment = payment;
		payment = newPayment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Hw1Package.APPOINTMENT__PAYMENT, oldPayment, newPayment);
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
	public void setPayment(PaymentGateway newPayment) {
		if (newPayment != payment) {
			NotificationChain msgs = null;
			if (payment != null)
				msgs = ((InternalEObject) payment).eInverseRemove(this, Hw1Package.PAYMENT_GATEWAY__APPOINTMENT,
						PaymentGateway.class, msgs);
			if (newPayment != null)
				msgs = ((InternalEObject) newPayment).eInverseAdd(this, Hw1Package.PAYMENT_GATEWAY__APPOINTMENT,
						PaymentGateway.class, msgs);
			msgs = basicSetPayment(newPayment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.APPOINTMENT__PAYMENT, newPayment,
					newPayment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.APPOINTMENT__STAFF:
			if (staff != null)
				msgs = ((InternalEObject) staff).eInverseRemove(this, Hw1Package.STAFF__APPOINTMENT, Staff.class, msgs);
			return basicSetStaff((Staff) otherEnd, msgs);
		case Hw1Package.APPOINTMENT__PATIENT:
			if (patient != null)
				msgs = ((InternalEObject) patient).eInverseRemove(this, Hw1Package.PATIENT__APPOINTMENT, Patient.class,
						msgs);
			return basicSetPatient((Patient) otherEnd, msgs);
		case Hw1Package.APPOINTMENT__PAYMENT:
			if (payment != null)
				msgs = ((InternalEObject) payment).eInverseRemove(this, Hw1Package.PAYMENT_GATEWAY__APPOINTMENT,
						PaymentGateway.class, msgs);
			return basicSetPayment((PaymentGateway) otherEnd, msgs);
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
		case Hw1Package.APPOINTMENT__STAFF:
			return basicSetStaff(null, msgs);
		case Hw1Package.APPOINTMENT__PATIENT:
			return basicSetPatient(null, msgs);
		case Hw1Package.APPOINTMENT__PAYMENT:
			return basicSetPayment(null, msgs);
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
		case Hw1Package.APPOINTMENT__APPOINTMENT_DATE:
			return getAppointmentDate();
		case Hw1Package.APPOINTMENT__APPOINTMENT_TYPE:
			return getAppointmentType();
		case Hw1Package.APPOINTMENT__STAFF:
			if (resolve)
				return getStaff();
			return basicGetStaff();
		case Hw1Package.APPOINTMENT__PATIENT:
			if (resolve)
				return getPatient();
			return basicGetPatient();
		case Hw1Package.APPOINTMENT__AMOUNTFOR_APPOINTMENT:
			return getAmountforAppointment();
		case Hw1Package.APPOINTMENT__PAYMENT:
			if (resolve)
				return getPayment();
			return basicGetPayment();
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
		case Hw1Package.APPOINTMENT__APPOINTMENT_DATE:
			setAppointmentDate((Date) newValue);
			return;
		case Hw1Package.APPOINTMENT__APPOINTMENT_TYPE:
			setAppointmentType((String) newValue);
			return;
		case Hw1Package.APPOINTMENT__STAFF:
			setStaff((Staff) newValue);
			return;
		case Hw1Package.APPOINTMENT__PATIENT:
			setPatient((Patient) newValue);
			return;
		case Hw1Package.APPOINTMENT__AMOUNTFOR_APPOINTMENT:
			setAmountforAppointment((Float) newValue);
			return;
		case Hw1Package.APPOINTMENT__PAYMENT:
			setPayment((PaymentGateway) newValue);
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
		case Hw1Package.APPOINTMENT__APPOINTMENT_DATE:
			setAppointmentDate(APPOINTMENT_DATE_EDEFAULT);
			return;
		case Hw1Package.APPOINTMENT__APPOINTMENT_TYPE:
			setAppointmentType(APPOINTMENT_TYPE_EDEFAULT);
			return;
		case Hw1Package.APPOINTMENT__STAFF:
			setStaff((Staff) null);
			return;
		case Hw1Package.APPOINTMENT__PATIENT:
			setPatient((Patient) null);
			return;
		case Hw1Package.APPOINTMENT__AMOUNTFOR_APPOINTMENT:
			setAmountforAppointment(AMOUNTFOR_APPOINTMENT_EDEFAULT);
			return;
		case Hw1Package.APPOINTMENT__PAYMENT:
			setPayment((PaymentGateway) null);
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
		case Hw1Package.APPOINTMENT__APPOINTMENT_DATE:
			return APPOINTMENT_DATE_EDEFAULT == null ? appointmentDate != null
					: !APPOINTMENT_DATE_EDEFAULT.equals(appointmentDate);
		case Hw1Package.APPOINTMENT__APPOINTMENT_TYPE:
			return APPOINTMENT_TYPE_EDEFAULT == null ? appointmentType != null
					: !APPOINTMENT_TYPE_EDEFAULT.equals(appointmentType);
		case Hw1Package.APPOINTMENT__STAFF:
			return staff != null;
		case Hw1Package.APPOINTMENT__PATIENT:
			return patient != null;
		case Hw1Package.APPOINTMENT__AMOUNTFOR_APPOINTMENT:
			return amountforAppointment != AMOUNTFOR_APPOINTMENT_EDEFAULT;
		case Hw1Package.APPOINTMENT__PAYMENT:
			return payment != null;
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
		result.append(" (appointmentDate: ");
		result.append(appointmentDate);
		result.append(", appointmentType: ");
		result.append(appointmentType);
		result.append(", amountforAppointment: ");
		result.append(amountforAppointment);
		result.append(')');
		return result.toString();
	}

} //AppointmentImpl
