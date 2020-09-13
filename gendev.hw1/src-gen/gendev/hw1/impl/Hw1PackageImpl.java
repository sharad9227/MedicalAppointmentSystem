/**
 */
package gendev.hw1.impl;

import gendev.hw1.Appointment;
import gendev.hw1.Doctor;
import gendev.hw1.DoctorAppointment;
import gendev.hw1.HospitalAppointment;
import gendev.hw1.Hw1Factory;
import gendev.hw1.Hw1Package;
import gendev.hw1.Patient;
import gendev.hw1.PaymentGateway;
import gendev.hw1.Staff;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Hw1PackageImpl extends EPackageImpl implements Hw1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appointmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doctorAppointmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hospitalAppointmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doctorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paymentGatewayEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see gendev.hw1.Hw1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Hw1PackageImpl() {
		super(eNS_URI, Hw1Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Hw1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Hw1Package init() {
		if (isInited)
			return (Hw1Package) EPackage.Registry.INSTANCE.getEPackage(Hw1Package.eNS_URI);

		// Obtain or create and register package
		Object registeredHw1Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Hw1PackageImpl theHw1Package = registeredHw1Package instanceof Hw1PackageImpl
				? (Hw1PackageImpl) registeredHw1Package
				: new Hw1PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theHw1Package.createPackageContents();

		// Initialize created meta-data
		theHw1Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHw1Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Hw1Package.eNS_URI, theHw1Package);
		return theHw1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStaff() {
		return staffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStaff_StaffId() {
		return (EAttribute) staffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStaff_StaffName() {
		return (EAttribute) staffEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStaff_BookAppointment() {
		return (EAttribute) staffEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStaff_Appointment() {
		return (EReference) staffEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStaff_Patient() {
		return (EReference) staffEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPatient() {
		return patientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_PatientId() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_PatientName() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_RegisteredPatientFlag() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_RequestAppointment() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_Appointment() {
		return (EReference) patientEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_Staff() {
		return (EReference) patientEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPatient_Doctor() {
		return (EReference) patientEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_HealthInsuranceCover() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPatient_EmergencyCase() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAppointment() {
		return appointmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppointment_AppointmentDate() {
		return (EAttribute) appointmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppointment_AppointmentType() {
		return (EAttribute) appointmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAppointment_Staff() {
		return (EReference) appointmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAppointment_Patient() {
		return (EReference) appointmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAppointment_AmountforAppointment() {
		return (EAttribute) appointmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAppointment_Payment() {
		return (EReference) appointmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoctorAppointment() {
		return doctorAppointmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoctorAppointment_DoctorAvailabilty() {
		return (EAttribute) doctorAppointmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoctorAppointment_AppointmentTime() {
		return (EAttribute) doctorAppointmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoctorAppointment_Doctor() {
		return (EReference) doctorAppointmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHospitalAppointment() {
		return hospitalAppointmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHospitalAppointment_BedAllotment() {
		return (EAttribute) hospitalAppointmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHospitalAppointment_HospitalName() {
		return (EAttribute) hospitalAppointmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHospitalAppointment_HospitalId() {
		return (EAttribute) hospitalAppointmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHospitalAppointment_Emergency() {
		return (EAttribute) hospitalAppointmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoctor() {
		return doctorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoctor_DoctorName() {
		return (EAttribute) doctorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoctor_DoctorId() {
		return (EAttribute) doctorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoctor_Doctorappointment() {
		return (EReference) doctorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDoctor_Patient() {
		return (EReference) doctorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPaymentGateway() {
		return paymentGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGateway_PaymentStatus() {
		return (EAttribute) paymentGatewayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPaymentGateway_Appointment() {
		return (EReference) paymentGatewayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPaymentGateway_PaidAmount() {
		return (EAttribute) paymentGatewayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hw1Factory getHw1Factory() {
		return (Hw1Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		staffEClass = createEClass(STAFF);
		createEAttribute(staffEClass, STAFF__STAFF_ID);
		createEAttribute(staffEClass, STAFF__STAFF_NAME);
		createEAttribute(staffEClass, STAFF__BOOK_APPOINTMENT);
		createEReference(staffEClass, STAFF__APPOINTMENT);
		createEReference(staffEClass, STAFF__PATIENT);

		patientEClass = createEClass(PATIENT);
		createEAttribute(patientEClass, PATIENT__PATIENT_ID);
		createEAttribute(patientEClass, PATIENT__PATIENT_NAME);
		createEAttribute(patientEClass, PATIENT__REGISTERED_PATIENT_FLAG);
		createEAttribute(patientEClass, PATIENT__REQUEST_APPOINTMENT);
		createEReference(patientEClass, PATIENT__APPOINTMENT);
		createEReference(patientEClass, PATIENT__STAFF);
		createEReference(patientEClass, PATIENT__DOCTOR);
		createEAttribute(patientEClass, PATIENT__HEALTH_INSURANCE_COVER);
		createEAttribute(patientEClass, PATIENT__EMERGENCY_CASE);

		appointmentEClass = createEClass(APPOINTMENT);
		createEAttribute(appointmentEClass, APPOINTMENT__APPOINTMENT_DATE);
		createEAttribute(appointmentEClass, APPOINTMENT__APPOINTMENT_TYPE);
		createEReference(appointmentEClass, APPOINTMENT__STAFF);
		createEReference(appointmentEClass, APPOINTMENT__PATIENT);
		createEAttribute(appointmentEClass, APPOINTMENT__AMOUNTFOR_APPOINTMENT);
		createEReference(appointmentEClass, APPOINTMENT__PAYMENT);

		doctorAppointmentEClass = createEClass(DOCTOR_APPOINTMENT);
		createEAttribute(doctorAppointmentEClass, DOCTOR_APPOINTMENT__DOCTOR_AVAILABILTY);
		createEAttribute(doctorAppointmentEClass, DOCTOR_APPOINTMENT__APPOINTMENT_TIME);
		createEReference(doctorAppointmentEClass, DOCTOR_APPOINTMENT__DOCTOR);

		hospitalAppointmentEClass = createEClass(HOSPITAL_APPOINTMENT);
		createEAttribute(hospitalAppointmentEClass, HOSPITAL_APPOINTMENT__BED_ALLOTMENT);
		createEAttribute(hospitalAppointmentEClass, HOSPITAL_APPOINTMENT__HOSPITAL_NAME);
		createEAttribute(hospitalAppointmentEClass, HOSPITAL_APPOINTMENT__HOSPITAL_ID);
		createEAttribute(hospitalAppointmentEClass, HOSPITAL_APPOINTMENT__EMERGENCY);

		doctorEClass = createEClass(DOCTOR);
		createEAttribute(doctorEClass, DOCTOR__DOCTOR_NAME);
		createEAttribute(doctorEClass, DOCTOR__DOCTOR_ID);
		createEReference(doctorEClass, DOCTOR__DOCTORAPPOINTMENT);
		createEReference(doctorEClass, DOCTOR__PATIENT);

		paymentGatewayEClass = createEClass(PAYMENT_GATEWAY);
		createEReference(paymentGatewayEClass, PAYMENT_GATEWAY__APPOINTMENT);
		createEAttribute(paymentGatewayEClass, PAYMENT_GATEWAY__PAID_AMOUNT);
		createEAttribute(paymentGatewayEClass, PAYMENT_GATEWAY__PAYMENT_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		doctorAppointmentEClass.getESuperTypes().add(this.getAppointment());
		hospitalAppointmentEClass.getESuperTypes().add(this.getAppointment());

		// Initialize classes, features, and operations; add parameters
		initEClass(staffEClass, Staff.class, "Staff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaff_StaffId(), ecorePackage.getEInt(), "staffId", null, 0, 1, Staff.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaff_StaffName(), ecorePackage.getEString(), "staffName", null, 0, 1, Staff.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaff_BookAppointment(), ecorePackage.getEBoolean(), "bookAppointment", null, 0, 1,
				Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getStaff_Appointment(), this.getAppointment(), this.getAppointment_Staff(), "appointment", null,
				0, -1, Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStaff_Patient(), this.getPatient(), this.getPatient_Staff(), "patient", null, 0, -1,
				Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patientEClass, Patient.class, "Patient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatient_PatientId(), ecorePackage.getEInt(), "patientId", null, 0, 1, Patient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_PatientName(), ecorePackage.getEString(), "patientName", null, 0, 1, Patient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_RegisteredPatientFlag(), ecorePackage.getEBoolean(), "RegisteredPatientFlag", null, 0,
				1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_RequestAppointment(), ecorePackage.getEBoolean(), "requestAppointment", null, 0, 1,
				Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_Appointment(), this.getAppointment(), this.getAppointment_Patient(), "appointment",
				null, 1, -1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_Staff(), this.getStaff(), this.getStaff_Patient(), "staff", null, 0, 1, Patient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPatient_Doctor(), this.getDoctor(), this.getDoctor_Patient(), "doctor", null, 1, -1,
				Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_HealthInsuranceCover(), ecorePackage.getEBoolean(), "healthInsuranceCover", null, 0,
				1, Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_EmergencyCase(), ecorePackage.getEBoolean(), "emergencyCase", null, 0, 1,
				Patient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(appointmentEClass, Appointment.class, "Appointment", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppointment_AppointmentDate(), ecorePackage.getEDate(), "appointmentDate", null, 0, 1,
				Appointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppointment_AppointmentType(), ecorePackage.getEString(), "appointmentType", null, 0, 1,
				Appointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAppointment_Staff(), this.getStaff(), this.getStaff_Appointment(), "staff", null, 0, 1,
				Appointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppointment_Patient(), this.getPatient(), this.getPatient_Appointment(), "patient", null, 1,
				1, Appointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppointment_AmountforAppointment(), ecorePackage.getEFloat(), "amountforAppointment", null, 0,
				1, Appointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAppointment_Payment(), this.getPaymentGateway(), this.getPaymentGateway_Appointment(),
				"payment", null, 0, 1, Appointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doctorAppointmentEClass, DoctorAppointment.class, "DoctorAppointment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoctorAppointment_DoctorAvailabilty(), ecorePackage.getEBoolean(), "doctorAvailabilty", null,
				0, 1, DoctorAppointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoctorAppointment_AppointmentTime(), ecorePackage.getEString(), "appointmentTime", null, 0, 1,
				DoctorAppointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDoctorAppointment_Doctor(), this.getDoctor(), this.getDoctor_Doctorappointment(), "doctor",
				null, 1, 1, DoctorAppointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hospitalAppointmentEClass, HospitalAppointment.class, "HospitalAppointment", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHospitalAppointment_BedAllotment(), ecorePackage.getEBoolean(), "bedAllotment", null, 0, 1,
				HospitalAppointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHospitalAppointment_HospitalName(), ecorePackage.getEString(), "hospitalName", null, 0, 1,
				HospitalAppointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHospitalAppointment_HospitalId(), ecorePackage.getEInt(), "hospitalId", null, 0, 1,
				HospitalAppointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHospitalAppointment_Emergency(), ecorePackage.getEBoolean(), "emergency", null, 0, 1,
				HospitalAppointment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doctorEClass, Doctor.class, "Doctor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoctor_DoctorName(), ecorePackage.getEString(), "doctorName", null, 0, 1, Doctor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoctor_DoctorId(), ecorePackage.getEInt(), "doctorId", null, 0, 1, Doctor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctor_Doctorappointment(), this.getDoctorAppointment(), this.getDoctorAppointment_Doctor(),
				"doctorappointment", null, 1, -1, Doctor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoctor_Patient(), this.getPatient(), this.getPatient_Doctor(), "patient", null, 0, -1,
				Doctor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paymentGatewayEClass, PaymentGateway.class, "PaymentGateway", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPaymentGateway_Appointment(), this.getAppointment(), this.getAppointment_Payment(),
				"appointment", null, 1, -1, PaymentGateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGateway_PaidAmount(), ecorePackage.getEFloat(), "paidAmount", null, 0, 1,
				PaymentGateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPaymentGateway_PaymentStatus(), ecorePackage.getEBoolean(), "paymentStatus", null, 0, 1,
				PaymentGateway.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Hw1PackageImpl
