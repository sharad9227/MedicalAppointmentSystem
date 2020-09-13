/**
 */
package gendev.hw1.impl;

import gendev.hw1.Appointment;
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
 * An implementation of the model object '<em><b>Staff</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.StaffImpl#getStaffId <em>Staff Id</em>}</li>
 *   <li>{@link gendev.hw1.impl.StaffImpl#getStaffName <em>Staff Name</em>}</li>
 *   <li>{@link gendev.hw1.impl.StaffImpl#isBookAppointment <em>Book Appointment</em>}</li>
 *   <li>{@link gendev.hw1.impl.StaffImpl#getAppointment <em>Appointment</em>}</li>
 *   <li>{@link gendev.hw1.impl.StaffImpl#getPatient <em>Patient</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaffImpl extends MinimalEObjectImpl.Container implements Staff {
	/**
	 * The default value of the '{@link #getStaffId() <em>Staff Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffId()
	 * @generated
	 * @ordered
	 */
	protected static final int STAFF_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStaffId() <em>Staff Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffId()
	 * @generated
	 * @ordered
	 */
	protected int staffId = STAFF_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStaffName() <em>Staff Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffName()
	 * @generated
	 * @ordered
	 */
	protected static final String STAFF_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStaffName() <em>Staff Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaffName()
	 * @generated
	 * @ordered
	 */
	protected String staffName = STAFF_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isBookAppointment() <em>Book Appointment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBookAppointment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOOK_APPOINTMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBookAppointment() <em>Book Appointment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBookAppointment()
	 * @generated
	 * @ordered
	 */
	protected boolean bookAppointment = BOOK_APPOINTMENT_EDEFAULT;

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
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected EList<Patient> patient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaffImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.STAFF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStaffId() {
		return staffId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStaffId(int newStaffId) {
		int oldStaffId = staffId;
		staffId = newStaffId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.STAFF__STAFF_ID, oldStaffId, staffId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStaffName() {
		return staffName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStaffName(String newStaffName) {
		String oldStaffName = staffName;
		staffName = newStaffName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.STAFF__STAFF_NAME, oldStaffName,
					staffName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBookAppointment() {
		return bookAppointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBookAppointment(boolean newBookAppointment) {
		boolean oldBookAppointment = bookAppointment;
		bookAppointment = newBookAppointment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.STAFF__BOOK_APPOINTMENT,
					oldBookAppointment, bookAppointment));
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
					Hw1Package.STAFF__APPOINTMENT, Hw1Package.APPOINTMENT__STAFF);
		}
		return appointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Patient> getPatient() {
		if (patient == null) {
			patient = new EObjectWithInverseResolvingEList<Patient>(Patient.class, this, Hw1Package.STAFF__PATIENT,
					Hw1Package.PATIENT__STAFF);
		}
		return patient;
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
		case Hw1Package.STAFF__APPOINTMENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAppointment()).basicAdd(otherEnd, msgs);
		case Hw1Package.STAFF__PATIENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPatient()).basicAdd(otherEnd, msgs);
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
		case Hw1Package.STAFF__APPOINTMENT:
			return ((InternalEList<?>) getAppointment()).basicRemove(otherEnd, msgs);
		case Hw1Package.STAFF__PATIENT:
			return ((InternalEList<?>) getPatient()).basicRemove(otherEnd, msgs);
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
		case Hw1Package.STAFF__STAFF_ID:
			return getStaffId();
		case Hw1Package.STAFF__STAFF_NAME:
			return getStaffName();
		case Hw1Package.STAFF__BOOK_APPOINTMENT:
			return isBookAppointment();
		case Hw1Package.STAFF__APPOINTMENT:
			return getAppointment();
		case Hw1Package.STAFF__PATIENT:
			return getPatient();
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
		case Hw1Package.STAFF__STAFF_ID:
			setStaffId((Integer) newValue);
			return;
		case Hw1Package.STAFF__STAFF_NAME:
			setStaffName((String) newValue);
			return;
		case Hw1Package.STAFF__BOOK_APPOINTMENT:
			setBookAppointment((Boolean) newValue);
			return;
		case Hw1Package.STAFF__APPOINTMENT:
			getAppointment().clear();
			getAppointment().addAll((Collection<? extends Appointment>) newValue);
			return;
		case Hw1Package.STAFF__PATIENT:
			getPatient().clear();
			getPatient().addAll((Collection<? extends Patient>) newValue);
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
		case Hw1Package.STAFF__STAFF_ID:
			setStaffId(STAFF_ID_EDEFAULT);
			return;
		case Hw1Package.STAFF__STAFF_NAME:
			setStaffName(STAFF_NAME_EDEFAULT);
			return;
		case Hw1Package.STAFF__BOOK_APPOINTMENT:
			setBookAppointment(BOOK_APPOINTMENT_EDEFAULT);
			return;
		case Hw1Package.STAFF__APPOINTMENT:
			getAppointment().clear();
			return;
		case Hw1Package.STAFF__PATIENT:
			getPatient().clear();
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
		case Hw1Package.STAFF__STAFF_ID:
			return staffId != STAFF_ID_EDEFAULT;
		case Hw1Package.STAFF__STAFF_NAME:
			return STAFF_NAME_EDEFAULT == null ? staffName != null : !STAFF_NAME_EDEFAULT.equals(staffName);
		case Hw1Package.STAFF__BOOK_APPOINTMENT:
			return bookAppointment != BOOK_APPOINTMENT_EDEFAULT;
		case Hw1Package.STAFF__APPOINTMENT:
			return appointment != null && !appointment.isEmpty();
		case Hw1Package.STAFF__PATIENT:
			return patient != null && !patient.isEmpty();
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
		result.append(" (staffId: ");
		result.append(staffId);
		result.append(", staffName: ");
		result.append(staffName);
		result.append(", bookAppointment: ");
		result.append(bookAppointment);
		result.append(')');
		return result.toString();
	}

} //StaffImpl
