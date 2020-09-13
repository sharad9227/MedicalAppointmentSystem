/**
 */
package gendev.hw1;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appointment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Appointment#getAppointmentDate <em>Appointment Date</em>}</li>
 *   <li>{@link gendev.hw1.Appointment#getAppointmentType <em>Appointment Type</em>}</li>
 *   <li>{@link gendev.hw1.Appointment#getStaff <em>Staff</em>}</li>
 *   <li>{@link gendev.hw1.Appointment#getPatient <em>Patient</em>}</li>
 *   <li>{@link gendev.hw1.Appointment#getAmountforAppointment <em>Amountfor Appointment</em>}</li>
 *   <li>{@link gendev.hw1.Appointment#getPayment <em>Payment</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getAppointment()
 * @model abstract="true"
 * @generated
 */
public interface Appointment extends EObject {
	/**
	 * Returns the value of the '<em><b>Appointment Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appointment Date</em>' attribute.
	 * @see #setAppointmentDate(Date)
	 * @see gendev.hw1.Hw1Package#getAppointment_AppointmentDate()
	 * @model
	 * @generated
	 */
	Date getAppointmentDate();

	/**
	 * Sets the value of the '{@link gendev.hw1.Appointment#getAppointmentDate <em>Appointment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appointment Date</em>' attribute.
	 * @see #getAppointmentDate()
	 * @generated
	 */
	void setAppointmentDate(Date value);

	/**
	 * Returns the value of the '<em><b>Appointment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appointment Type</em>' attribute.
	 * @see #setAppointmentType(String)
	 * @see gendev.hw1.Hw1Package#getAppointment_AppointmentType()
	 * @model
	 * @generated
	 */
	String getAppointmentType();

	/**
	 * Sets the value of the '{@link gendev.hw1.Appointment#getAppointmentType <em>Appointment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appointment Type</em>' attribute.
	 * @see #getAppointmentType()
	 * @generated
	 */
	void setAppointmentType(String value);

	/**
	 * Returns the value of the '<em><b>Staff</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gendev.hw1.Staff#getAppointment <em>Appointment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff</em>' reference.
	 * @see #setStaff(Staff)
	 * @see gendev.hw1.Hw1Package#getAppointment_Staff()
	 * @see gendev.hw1.Staff#getAppointment
	 * @model opposite="appointment"
	 * @generated
	 */
	Staff getStaff();

	/**
	 * Sets the value of the '{@link gendev.hw1.Appointment#getStaff <em>Staff</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staff</em>' reference.
	 * @see #getStaff()
	 * @generated
	 */
	void setStaff(Staff value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gendev.hw1.Patient#getAppointment <em>Appointment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' reference.
	 * @see #setPatient(Patient)
	 * @see gendev.hw1.Hw1Package#getAppointment_Patient()
	 * @see gendev.hw1.Patient#getAppointment
	 * @model opposite="appointment" required="true"
	 * @generated
	 */
	Patient getPatient();

	/**
	 * Sets the value of the '{@link gendev.hw1.Appointment#getPatient <em>Patient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Patient value);

	/**
	 * Returns the value of the '<em><b>Amountfor Appointment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amountfor Appointment</em>' attribute.
	 * @see #setAmountforAppointment(float)
	 * @see gendev.hw1.Hw1Package#getAppointment_AmountforAppointment()
	 * @model
	 * @generated
	 */
	float getAmountforAppointment();

	/**
	 * Sets the value of the '{@link gendev.hw1.Appointment#getAmountforAppointment <em>Amountfor Appointment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amountfor Appointment</em>' attribute.
	 * @see #getAmountforAppointment()
	 * @generated
	 */
	void setAmountforAppointment(float value);

	/**
	 * Returns the value of the '<em><b>Payment</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gendev.hw1.PaymentGateway#getAppointment <em>Appointment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment</em>' reference.
	 * @see #setPayment(PaymentGateway)
	 * @see gendev.hw1.Hw1Package#getAppointment_Payment()
	 * @see gendev.hw1.PaymentGateway#getAppointment
	 * @model opposite="appointment"
	 * @generated
	 */
	PaymentGateway getPayment();

	/**
	 * Sets the value of the '{@link gendev.hw1.Appointment#getPayment <em>Payment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment</em>' reference.
	 * @see #getPayment()
	 * @generated
	 */
	void setPayment(PaymentGateway value);

} // Appointment
