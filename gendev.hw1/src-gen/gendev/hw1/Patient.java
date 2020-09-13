/**
 */
package gendev.hw1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Patient#getPatientId <em>Patient Id</em>}</li>
 *   <li>{@link gendev.hw1.Patient#getPatientName <em>Patient Name</em>}</li>
 *   <li>{@link gendev.hw1.Patient#isRegisteredPatientFlag <em>Registered Patient Flag</em>}</li>
 *   <li>{@link gendev.hw1.Patient#isRequestAppointment <em>Request Appointment</em>}</li>
 *   <li>{@link gendev.hw1.Patient#getAppointment <em>Appointment</em>}</li>
 *   <li>{@link gendev.hw1.Patient#getStaff <em>Staff</em>}</li>
 *   <li>{@link gendev.hw1.Patient#getDoctor <em>Doctor</em>}</li>
 *   <li>{@link gendev.hw1.Patient#isHealthInsuranceCover <em>Health Insurance Cover</em>}</li>
 *   <li>{@link gendev.hw1.Patient#isEmergencyCase <em>Emergency Case</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getPatient()
 * @model
 * @generated
 */
public interface Patient extends EObject {
	/**
	 * Returns the value of the '<em><b>Patient Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient Id</em>' attribute.
	 * @see #setPatientId(int)
	 * @see gendev.hw1.Hw1Package#getPatient_PatientId()
	 * @model
	 * @generated
	 */
	int getPatientId();

	/**
	 * Sets the value of the '{@link gendev.hw1.Patient#getPatientId <em>Patient Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient Id</em>' attribute.
	 * @see #getPatientId()
	 * @generated
	 */
	void setPatientId(int value);

	/**
	 * Returns the value of the '<em><b>Patient Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient Name</em>' attribute.
	 * @see #setPatientName(String)
	 * @see gendev.hw1.Hw1Package#getPatient_PatientName()
	 * @model
	 * @generated
	 */
	String getPatientName();

	/**
	 * Sets the value of the '{@link gendev.hw1.Patient#getPatientName <em>Patient Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient Name</em>' attribute.
	 * @see #getPatientName()
	 * @generated
	 */
	void setPatientName(String value);

	/**
	 * Returns the value of the '<em><b>Registered Patient Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registered Patient Flag</em>' attribute.
	 * @see #setRegisteredPatientFlag(boolean)
	 * @see gendev.hw1.Hw1Package#getPatient_RegisteredPatientFlag()
	 * @model
	 * @generated
	 */
	boolean isRegisteredPatientFlag();

	/**
	 * Sets the value of the '{@link gendev.hw1.Patient#isRegisteredPatientFlag <em>Registered Patient Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registered Patient Flag</em>' attribute.
	 * @see #isRegisteredPatientFlag()
	 * @generated
	 */
	void setRegisteredPatientFlag(boolean value);

	/**
	 * Returns the value of the '<em><b>Request Appointment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Appointment</em>' attribute.
	 * @see #setRequestAppointment(boolean)
	 * @see gendev.hw1.Hw1Package#getPatient_RequestAppointment()
	 * @model
	 * @generated
	 */
	boolean isRequestAppointment();

	/**
	 * Sets the value of the '{@link gendev.hw1.Patient#isRequestAppointment <em>Request Appointment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Appointment</em>' attribute.
	 * @see #isRequestAppointment()
	 * @generated
	 */
	void setRequestAppointment(boolean value);

	/**
	 * Returns the value of the '<em><b>Appointment</b></em>' reference list.
	 * The list contents are of type {@link gendev.hw1.Appointment}.
	 * It is bidirectional and its opposite is '{@link gendev.hw1.Appointment#getPatient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appointment</em>' reference list.
	 * @see gendev.hw1.Hw1Package#getPatient_Appointment()
	 * @see gendev.hw1.Appointment#getPatient
	 * @model opposite="patient" required="true"
	 * @generated
	 */
	EList<Appointment> getAppointment();

	/**
	 * Returns the value of the '<em><b>Staff</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link gendev.hw1.Staff#getPatient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff</em>' reference.
	 * @see #setStaff(Staff)
	 * @see gendev.hw1.Hw1Package#getPatient_Staff()
	 * @see gendev.hw1.Staff#getPatient
	 * @model opposite="patient"
	 * @generated
	 */
	Staff getStaff();

	/**
	 * Sets the value of the '{@link gendev.hw1.Patient#getStaff <em>Staff</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staff</em>' reference.
	 * @see #getStaff()
	 * @generated
	 */
	void setStaff(Staff value);

	/**
	 * Returns the value of the '<em><b>Doctor</b></em>' reference list.
	 * The list contents are of type {@link gendev.hw1.Doctor}.
	 * It is bidirectional and its opposite is '{@link gendev.hw1.Doctor#getPatient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doctor</em>' reference list.
	 * @see gendev.hw1.Hw1Package#getPatient_Doctor()
	 * @see gendev.hw1.Doctor#getPatient
	 * @model opposite="patient" required="true"
	 * @generated
	 */
	EList<Doctor> getDoctor();

	/**
	 * Returns the value of the '<em><b>Health Insurance Cover</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Health Insurance Cover</em>' attribute.
	 * @see #setHealthInsuranceCover(boolean)
	 * @see gendev.hw1.Hw1Package#getPatient_HealthInsuranceCover()
	 * @model
	 * @generated
	 */
	boolean isHealthInsuranceCover();

	/**
	 * Sets the value of the '{@link gendev.hw1.Patient#isHealthInsuranceCover <em>Health Insurance Cover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Health Insurance Cover</em>' attribute.
	 * @see #isHealthInsuranceCover()
	 * @generated
	 */
	void setHealthInsuranceCover(boolean value);

	/**
	 * Returns the value of the '<em><b>Emergency Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emergency Case</em>' attribute.
	 * @see #setEmergencyCase(boolean)
	 * @see gendev.hw1.Hw1Package#getPatient_EmergencyCase()
	 * @model
	 * @generated
	 */
	boolean isEmergencyCase();

	/**
	 * Sets the value of the '{@link gendev.hw1.Patient#isEmergencyCase <em>Emergency Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emergency Case</em>' attribute.
	 * @see #isEmergencyCase()
	 * @generated
	 */
	void setEmergencyCase(boolean value);

} // Patient
