/**
 */
package gendev.hw1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doctor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Doctor#getDoctorName <em>Doctor Name</em>}</li>
 *   <li>{@link gendev.hw1.Doctor#getDoctorId <em>Doctor Id</em>}</li>
 *   <li>{@link gendev.hw1.Doctor#getDoctorappointment <em>Doctorappointment</em>}</li>
 *   <li>{@link gendev.hw1.Doctor#getPatient <em>Patient</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getDoctor()
 * @model
 * @generated
 */
public interface Doctor extends EObject {
	/**
	 * Returns the value of the '<em><b>Doctor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doctor Name</em>' attribute.
	 * @see #setDoctorName(String)
	 * @see gendev.hw1.Hw1Package#getDoctor_DoctorName()
	 * @model
	 * @generated
	 */
	String getDoctorName();

	/**
	 * Sets the value of the '{@link gendev.hw1.Doctor#getDoctorName <em>Doctor Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doctor Name</em>' attribute.
	 * @see #getDoctorName()
	 * @generated
	 */
	void setDoctorName(String value);

	/**
	 * Returns the value of the '<em><b>Doctor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doctor Id</em>' attribute.
	 * @see #setDoctorId(int)
	 * @see gendev.hw1.Hw1Package#getDoctor_DoctorId()
	 * @model
	 * @generated
	 */
	int getDoctorId();

	/**
	 * Sets the value of the '{@link gendev.hw1.Doctor#getDoctorId <em>Doctor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doctor Id</em>' attribute.
	 * @see #getDoctorId()
	 * @generated
	 */
	void setDoctorId(int value);

	/**
	 * Returns the value of the '<em><b>Doctorappointment</b></em>' reference list.
	 * The list contents are of type {@link gendev.hw1.DoctorAppointment}.
	 * It is bidirectional and its opposite is '{@link gendev.hw1.DoctorAppointment#getDoctor <em>Doctor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doctorappointment</em>' reference list.
	 * @see gendev.hw1.Hw1Package#getDoctor_Doctorappointment()
	 * @see gendev.hw1.DoctorAppointment#getDoctor
	 * @model opposite="doctor" required="true"
	 * @generated
	 */
	EList<DoctorAppointment> getDoctorappointment();

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' reference list.
	 * The list contents are of type {@link gendev.hw1.Patient}.
	 * It is bidirectional and its opposite is '{@link gendev.hw1.Patient#getDoctor <em>Doctor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' reference list.
	 * @see gendev.hw1.Hw1Package#getDoctor_Patient()
	 * @see gendev.hw1.Patient#getDoctor
	 * @model opposite="doctor"
	 * @generated
	 */
	EList<Patient> getPatient();

} // Doctor
