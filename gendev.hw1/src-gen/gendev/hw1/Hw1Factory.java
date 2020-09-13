/**
 */
package gendev.hw1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see gendev.hw1.Hw1Package
 * @generated
 */
public interface Hw1Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Hw1Factory eINSTANCE = gendev.hw1.impl.Hw1FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Staff</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Staff</em>'.
	 * @generated
	 */
	Staff createStaff();

	/**
	 * Returns a new object of class '<em>Patient</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient</em>'.
	 * @generated
	 */
	Patient createPatient();

	/**
	 * Returns a new object of class '<em>Doctor Appointment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Doctor Appointment</em>'.
	 * @generated
	 */
	DoctorAppointment createDoctorAppointment();

	/**
	 * Returns a new object of class '<em>Hospital Appointment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hospital Appointment</em>'.
	 * @generated
	 */
	HospitalAppointment createHospitalAppointment();

	/**
	 * Returns a new object of class '<em>Doctor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Doctor</em>'.
	 * @generated
	 */
	Doctor createDoctor();

	/**
	 * Returns a new object of class '<em>Payment Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Payment Gateway</em>'.
	 * @generated
	 */
	PaymentGateway createPaymentGateway();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Hw1Package getHw1Package();

} //Hw1Factory
