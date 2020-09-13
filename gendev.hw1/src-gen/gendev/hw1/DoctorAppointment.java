/**
 */
package gendev.hw1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doctor Appointment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.DoctorAppointment#isDoctorAvailabilty <em>Doctor Availabilty</em>}</li>
 *   <li>{@link gendev.hw1.DoctorAppointment#getAppointmentTime <em>Appointment Time</em>}</li>
 *   <li>{@link gendev.hw1.DoctorAppointment#getDoctor <em>Doctor</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getDoctorAppointment()
 * @model
 * @generated
 */
public interface DoctorAppointment extends Appointment {
	/**
	 * Returns the value of the '<em><b>Doctor Availabilty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doctor Availabilty</em>' attribute.
	 * @see #setDoctorAvailabilty(boolean)
	 * @see gendev.hw1.Hw1Package#getDoctorAppointment_DoctorAvailabilty()
	 * @model
	 * @generated
	 */
	boolean isDoctorAvailabilty();

	/**
	 * Sets the value of the '{@link gendev.hw1.DoctorAppointment#isDoctorAvailabilty <em>Doctor Availabilty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doctor Availabilty</em>' attribute.
	 * @see #isDoctorAvailabilty()
	 * @generated
	 */
	void setDoctorAvailabilty(boolean value);

	/**
	 * Returns the value of the '<em><b>Appointment Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appointment Time</em>' attribute.
	 * @see #setAppointmentTime(String)
	 * @see gendev.hw1.Hw1Package#getDoctorAppointment_AppointmentTime()
	 * @model
	 * @generated
	 */
	String getAppointmentTime();

	/**
	 * Sets the value of the '{@link gendev.hw1.DoctorAppointment#getAppointmentTime <em>Appointment Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appointment Time</em>' attribute.
	 * @see #getAppointmentTime()
	 * @generated
	 */
	void setAppointmentTime(String value);

	/**
	 * Returns the value of the '<em><b>Doctor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gendev.hw1.Doctor#getDoctorappointment <em>Doctorappointment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doctor</em>' reference.
	 * @see #setDoctor(Doctor)
	 * @see gendev.hw1.Hw1Package#getDoctorAppointment_Doctor()
	 * @see gendev.hw1.Doctor#getDoctorappointment
	 * @model opposite="doctorappointment" required="true"
	 * @generated
	 */
	Doctor getDoctor();

	/**
	 * Sets the value of the '{@link gendev.hw1.DoctorAppointment#getDoctor <em>Doctor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doctor</em>' reference.
	 * @see #getDoctor()
	 * @generated
	 */
	void setDoctor(Doctor value);

} // DoctorAppointment
