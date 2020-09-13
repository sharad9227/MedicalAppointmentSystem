/**
 */
package gendev.hw1.impl;

import gendev.hw1.HospitalAppointment;
import gendev.hw1.Hw1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hospital Appointment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.HospitalAppointmentImpl#isBedAllotment <em>Bed Allotment</em>}</li>
 *   <li>{@link gendev.hw1.impl.HospitalAppointmentImpl#getHospitalName <em>Hospital Name</em>}</li>
 *   <li>{@link gendev.hw1.impl.HospitalAppointmentImpl#getHospitalId <em>Hospital Id</em>}</li>
 *   <li>{@link gendev.hw1.impl.HospitalAppointmentImpl#isEmergency <em>Emergency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HospitalAppointmentImpl extends AppointmentImpl implements HospitalAppointment {
	/**
	 * The default value of the '{@link #isBedAllotment() <em>Bed Allotment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBedAllotment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BED_ALLOTMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBedAllotment() <em>Bed Allotment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBedAllotment()
	 * @generated
	 * @ordered
	 */
	protected boolean bedAllotment = BED_ALLOTMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHospitalName() <em>Hospital Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalName()
	 * @generated
	 * @ordered
	 */
	protected static final String HOSPITAL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHospitalName() <em>Hospital Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalName()
	 * @generated
	 * @ordered
	 */
	protected String hospitalName = HOSPITAL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHospitalId() <em>Hospital Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalId()
	 * @generated
	 * @ordered
	 */
	protected static final int HOSPITAL_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHospitalId() <em>Hospital Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalId()
	 * @generated
	 * @ordered
	 */
	protected int hospitalId = HOSPITAL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isEmergency() <em>Emergency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmergency()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EMERGENCY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEmergency() <em>Emergency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmergency()
	 * @generated
	 * @ordered
	 */
	protected boolean emergency = EMERGENCY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HospitalAppointmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.HOSPITAL_APPOINTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isBedAllotment() {
		return bedAllotment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBedAllotment(boolean newBedAllotment) {
		boolean oldBedAllotment = bedAllotment;
		bedAllotment = newBedAllotment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.HOSPITAL_APPOINTMENT__BED_ALLOTMENT,
					oldBedAllotment, bedAllotment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHospitalName() {
		return hospitalName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHospitalName(String newHospitalName) {
		String oldHospitalName = hospitalName;
		hospitalName = newHospitalName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.HOSPITAL_APPOINTMENT__HOSPITAL_NAME,
					oldHospitalName, hospitalName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHospitalId() {
		return hospitalId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHospitalId(int newHospitalId) {
		int oldHospitalId = hospitalId;
		hospitalId = newHospitalId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.HOSPITAL_APPOINTMENT__HOSPITAL_ID,
					oldHospitalId, hospitalId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEmergency() {
		return emergency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmergency(boolean newEmergency) {
		boolean oldEmergency = emergency;
		emergency = newEmergency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.HOSPITAL_APPOINTMENT__EMERGENCY,
					oldEmergency, emergency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Hw1Package.HOSPITAL_APPOINTMENT__BED_ALLOTMENT:
			return isBedAllotment();
		case Hw1Package.HOSPITAL_APPOINTMENT__HOSPITAL_NAME:
			return getHospitalName();
		case Hw1Package.HOSPITAL_APPOINTMENT__HOSPITAL_ID:
			return getHospitalId();
		case Hw1Package.HOSPITAL_APPOINTMENT__EMERGENCY:
			return isEmergency();
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
		case Hw1Package.HOSPITAL_APPOINTMENT__BED_ALLOTMENT:
			setBedAllotment((Boolean) newValue);
			return;
		case Hw1Package.HOSPITAL_APPOINTMENT__HOSPITAL_NAME:
			setHospitalName((String) newValue);
			return;
		case Hw1Package.HOSPITAL_APPOINTMENT__HOSPITAL_ID:
			setHospitalId((Integer) newValue);
			return;
		case Hw1Package.HOSPITAL_APPOINTMENT__EMERGENCY:
			setEmergency((Boolean) newValue);
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
		case Hw1Package.HOSPITAL_APPOINTMENT__BED_ALLOTMENT:
			setBedAllotment(BED_ALLOTMENT_EDEFAULT);
			return;
		case Hw1Package.HOSPITAL_APPOINTMENT__HOSPITAL_NAME:
			setHospitalName(HOSPITAL_NAME_EDEFAULT);
			return;
		case Hw1Package.HOSPITAL_APPOINTMENT__HOSPITAL_ID:
			setHospitalId(HOSPITAL_ID_EDEFAULT);
			return;
		case Hw1Package.HOSPITAL_APPOINTMENT__EMERGENCY:
			setEmergency(EMERGENCY_EDEFAULT);
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
		case Hw1Package.HOSPITAL_APPOINTMENT__BED_ALLOTMENT:
			return bedAllotment != BED_ALLOTMENT_EDEFAULT;
		case Hw1Package.HOSPITAL_APPOINTMENT__HOSPITAL_NAME:
			return HOSPITAL_NAME_EDEFAULT == null ? hospitalName != null : !HOSPITAL_NAME_EDEFAULT.equals(hospitalName);
		case Hw1Package.HOSPITAL_APPOINTMENT__HOSPITAL_ID:
			return hospitalId != HOSPITAL_ID_EDEFAULT;
		case Hw1Package.HOSPITAL_APPOINTMENT__EMERGENCY:
			return emergency != EMERGENCY_EDEFAULT;
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
		result.append(" (bedAllotment: ");
		result.append(bedAllotment);
		result.append(", hospitalName: ");
		result.append(hospitalName);
		result.append(", hospitalId: ");
		result.append(hospitalId);
		result.append(", emergency: ");
		result.append(emergency);
		result.append(')');
		return result.toString();
	}

} //HospitalAppointmentImpl
