/**
 */
package gendev.hw1.impl;

import gendev.hw1.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Hw1FactoryImpl extends EFactoryImpl implements Hw1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Hw1Factory init() {
		try {
			Hw1Factory theHw1Factory = (Hw1Factory) EPackage.Registry.INSTANCE.getEFactory(Hw1Package.eNS_URI);
			if (theHw1Factory != null) {
				return theHw1Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Hw1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hw1FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Hw1Package.STAFF:
			return createStaff();
		case Hw1Package.PATIENT:
			return createPatient();
		case Hw1Package.DOCTOR_APPOINTMENT:
			return createDoctorAppointment();
		case Hw1Package.HOSPITAL_APPOINTMENT:
			return createHospitalAppointment();
		case Hw1Package.DOCTOR:
			return createDoctor();
		case Hw1Package.PAYMENT_GATEWAY:
			return createPaymentGateway();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Staff createStaff() {
		StaffImpl staff = new StaffImpl();
		return staff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Patient createPatient() {
		PatientImpl patient = new PatientImpl();
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DoctorAppointment createDoctorAppointment() {
		DoctorAppointmentImpl doctorAppointment = new DoctorAppointmentImpl();
		return doctorAppointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HospitalAppointment createHospitalAppointment() {
		HospitalAppointmentImpl hospitalAppointment = new HospitalAppointmentImpl();
		return hospitalAppointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Doctor createDoctor() {
		DoctorImpl doctor = new DoctorImpl();
		return doctor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PaymentGateway createPaymentGateway() {
		PaymentGatewayImpl paymentGateway = new PaymentGatewayImpl();
		return paymentGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hw1Package getHw1Package() {
		return (Hw1Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Hw1Package getPackage() {
		return Hw1Package.eINSTANCE;
	}

} //Hw1FactoryImpl
