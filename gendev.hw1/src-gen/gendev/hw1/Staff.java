/**
 */
package gendev.hw1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Staff</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Staff#getStaffId <em>Staff Id</em>}</li>
 *   <li>{@link gendev.hw1.Staff#getStaffName <em>Staff Name</em>}</li>
 *   <li>{@link gendev.hw1.Staff#isBookAppointment <em>Book Appointment</em>}</li>
 *   <li>{@link gendev.hw1.Staff#getAppointment <em>Appointment</em>}</li>
 *   <li>{@link gendev.hw1.Staff#getPatient <em>Patient</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getStaff()
 * @model
 * @generated
 */
public interface Staff extends EObject {
	/**
	 * Returns the value of the '<em><b>Staff Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff Id</em>' attribute.
	 * @see #setStaffId(int)
	 * @see gendev.hw1.Hw1Package#getStaff_StaffId()
	 * @model
	 * @generated
	 */
	int getStaffId();

	/**
	 * Sets the value of the '{@link gendev.hw1.Staff#getStaffId <em>Staff Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staff Id</em>' attribute.
	 * @see #getStaffId()
	 * @generated
	 */
	void setStaffId(int value);

	/**
	 * Returns the value of the '<em><b>Staff Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Staff Name</em>' attribute.
	 * @see #setStaffName(String)
	 * @see gendev.hw1.Hw1Package#getStaff_StaffName()
	 * @model
	 * @generated
	 */
	String getStaffName();

	/**
	 * Sets the value of the '{@link gendev.hw1.Staff#getStaffName <em>Staff Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Staff Name</em>' attribute.
	 * @see #getStaffName()
	 * @generated
	 */
	void setStaffName(String value);

	/**
	 * Returns the value of the '<em><b>Book Appointment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Book Appointment</em>' attribute.
	 * @see #setBookAppointment(boolean)
	 * @see gendev.hw1.Hw1Package#getStaff_BookAppointment()
	 * @model
	 * @generated
	 */
	boolean isBookAppointment();

	/**
	 * Sets the value of the '{@link gendev.hw1.Staff#isBookAppointment <em>Book Appointment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Book Appointment</em>' attribute.
	 * @see #isBookAppointment()
	 * @generated
	 */
	void setBookAppointment(boolean value);

	/**
	 * Returns the value of the '<em><b>Appointment</b></em>' reference list.
	 * The list contents are of type {@link gendev.hw1.Appointment}.
	 * It is bidirectional and its opposite is '{@link gendev.hw1.Appointment#getStaff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Appointment</em>' reference list.
	 * @see gendev.hw1.Hw1Package#getStaff_Appointment()
	 * @see gendev.hw1.Appointment#getStaff
	 * @model opposite="staff"
	 * @generated
	 */
	EList<Appointment> getAppointment();

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' reference list.
	 * The list contents are of type {@link gendev.hw1.Patient}.
	 * It is bidirectional and its opposite is '{@link gendev.hw1.Patient#getStaff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' reference list.
	 * @see gendev.hw1.Hw1Package#getStaff_Patient()
	 * @see gendev.hw1.Patient#getStaff
	 * @model opposite="staff"
	 * @generated
	 */
	EList<Patient> getPatient();

} // Staff
