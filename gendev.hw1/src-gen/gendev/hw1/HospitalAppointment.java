/**
 */
package gendev.hw1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hospital Appointment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.HospitalAppointment#isBedAllotment <em>Bed Allotment</em>}</li>
 *   <li>{@link gendev.hw1.HospitalAppointment#getHospitalName <em>Hospital Name</em>}</li>
 *   <li>{@link gendev.hw1.HospitalAppointment#getHospitalId <em>Hospital Id</em>}</li>
 *   <li>{@link gendev.hw1.HospitalAppointment#isEmergency <em>Emergency</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getHospitalAppointment()
 * @model
 * @generated
 */
public interface HospitalAppointment extends Appointment {
	/**
	 * Returns the value of the '<em><b>Bed Allotment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bed Allotment</em>' attribute.
	 * @see #setBedAllotment(boolean)
	 * @see gendev.hw1.Hw1Package#getHospitalAppointment_BedAllotment()
	 * @model
	 * @generated
	 */
	boolean isBedAllotment();

	/**
	 * Sets the value of the '{@link gendev.hw1.HospitalAppointment#isBedAllotment <em>Bed Allotment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bed Allotment</em>' attribute.
	 * @see #isBedAllotment()
	 * @generated
	 */
	void setBedAllotment(boolean value);

	/**
	 * Returns the value of the '<em><b>Hospital Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hospital Name</em>' attribute.
	 * @see #setHospitalName(String)
	 * @see gendev.hw1.Hw1Package#getHospitalAppointment_HospitalName()
	 * @model
	 * @generated
	 */
	String getHospitalName();

	/**
	 * Sets the value of the '{@link gendev.hw1.HospitalAppointment#getHospitalName <em>Hospital Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hospital Name</em>' attribute.
	 * @see #getHospitalName()
	 * @generated
	 */
	void setHospitalName(String value);

	/**
	 * Returns the value of the '<em><b>Hospital Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hospital Id</em>' attribute.
	 * @see #setHospitalId(int)
	 * @see gendev.hw1.Hw1Package#getHospitalAppointment_HospitalId()
	 * @model
	 * @generated
	 */
	int getHospitalId();

	/**
	 * Sets the value of the '{@link gendev.hw1.HospitalAppointment#getHospitalId <em>Hospital Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hospital Id</em>' attribute.
	 * @see #getHospitalId()
	 * @generated
	 */
	void setHospitalId(int value);

	/**
	 * Returns the value of the '<em><b>Emergency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emergency</em>' attribute.
	 * @see #setEmergency(boolean)
	 * @see gendev.hw1.Hw1Package#getHospitalAppointment_Emergency()
	 * @model
	 * @generated
	 */
	boolean isEmergency();

	/**
	 * Sets the value of the '{@link gendev.hw1.HospitalAppointment#isEmergency <em>Emergency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emergency</em>' attribute.
	 * @see #isEmergency()
	 * @generated
	 */
	void setEmergency(boolean value);

} // HospitalAppointment
