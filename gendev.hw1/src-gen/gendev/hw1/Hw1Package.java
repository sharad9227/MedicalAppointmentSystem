/**
 */
package gendev.hw1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gendev.hw1.Hw1Factory
 * @model kind="package"
 * @generated
 */
public interface Hw1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hw1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/hw1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hw1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Hw1Package eINSTANCE = gendev.hw1.impl.Hw1PackageImpl.init();

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.StaffImpl <em>Staff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.StaffImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getStaff()
	 * @generated
	 */
	int STAFF = 0;

	/**
	 * The feature id for the '<em><b>Staff Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__STAFF_ID = 0;

	/**
	 * The feature id for the '<em><b>Staff Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__STAFF_NAME = 1;

	/**
	 * The feature id for the '<em><b>Book Appointment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__BOOK_APPOINTMENT = 2;

	/**
	 * The feature id for the '<em><b>Appointment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__APPOINTMENT = 3;

	/**
	 * The feature id for the '<em><b>Patient</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__PATIENT = 4;

	/**
	 * The number of structural features of the '<em>Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.PatientImpl <em>Patient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.PatientImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getPatient()
	 * @generated
	 */
	int PATIENT = 1;

	/**
	 * The feature id for the '<em><b>Patient Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__PATIENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Patient Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__PATIENT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Registered Patient Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__REGISTERED_PATIENT_FLAG = 2;

	/**
	 * The feature id for the '<em><b>Request Appointment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__REQUEST_APPOINTMENT = 3;

	/**
	 * The feature id for the '<em><b>Appointment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__APPOINTMENT = 4;

	/**
	 * The feature id for the '<em><b>Staff</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__STAFF = 5;

	/**
	 * The feature id for the '<em><b>Doctor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__DOCTOR = 6;

	/**
	 * The feature id for the '<em><b>Health Insurance Cover</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__HEALTH_INSURANCE_COVER = 7;

	/**
	 * The feature id for the '<em><b>Emergency Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__EMERGENCY_CASE = 8;

	/**
	 * The number of structural features of the '<em>Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.AppointmentImpl <em>Appointment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.AppointmentImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getAppointment()
	 * @generated
	 */
	int APPOINTMENT = 2;

	/**
	 * The feature id for the '<em><b>Appointment Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__APPOINTMENT_DATE = 0;

	/**
	 * The feature id for the '<em><b>Appointment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__APPOINTMENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Staff</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__STAFF = 2;

	/**
	 * The feature id for the '<em><b>Patient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__PATIENT = 3;

	/**
	 * The feature id for the '<em><b>Amountfor Appointment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__AMOUNTFOR_APPOINTMENT = 4;

	/**
	 * The feature id for the '<em><b>Payment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT__PAYMENT = 5;

	/**
	 * The number of structural features of the '<em>Appointment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Appointment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPOINTMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.DoctorAppointmentImpl <em>Doctor Appointment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.DoctorAppointmentImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getDoctorAppointment()
	 * @generated
	 */
	int DOCTOR_APPOINTMENT = 3;

	/**
	 * The feature id for the '<em><b>Appointment Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_APPOINTMENT__APPOINTMENT_DATE = APPOINTMENT__APPOINTMENT_DATE;

	/**
	 * The feature id for the '<em><b>Appointment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_APPOINTMENT__APPOINTMENT_TYPE = APPOINTMENT__APPOINTMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Staff</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_APPOINTMENT__STAFF = APPOINTMENT__STAFF;

	/**
	 * The feature id for the '<em><b>Patient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_APPOINTMENT__PATIENT = APPOINTMENT__PATIENT;

	/**
	 * The feature id for the '<em><b>Amountfor Appointment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_APPOINTMENT__AMOUNTFOR_APPOINTMENT = APPOINTMENT__AMOUNTFOR_APPOINTMENT;

	/**
	 * The feature id for the '<em><b>Payment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_APPOINTMENT__PAYMENT = APPOINTMENT__PAYMENT;

	/**
	 * The feature id for the '<em><b>Doctor Availabilty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_APPOINTMENT__DOCTOR_AVAILABILTY = APPOINTMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Appointment Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_APPOINTMENT__APPOINTMENT_TIME = APPOINTMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Doctor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_APPOINTMENT__DOCTOR = APPOINTMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Doctor Appointment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_APPOINTMENT_FEATURE_COUNT = APPOINTMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Doctor Appointment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_APPOINTMENT_OPERATION_COUNT = APPOINTMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.HospitalAppointmentImpl <em>Hospital Appointment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.HospitalAppointmentImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getHospitalAppointment()
	 * @generated
	 */
	int HOSPITAL_APPOINTMENT = 4;

	/**
	 * The feature id for the '<em><b>Appointment Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_APPOINTMENT__APPOINTMENT_DATE = APPOINTMENT__APPOINTMENT_DATE;

	/**
	 * The feature id for the '<em><b>Appointment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_APPOINTMENT__APPOINTMENT_TYPE = APPOINTMENT__APPOINTMENT_TYPE;

	/**
	 * The feature id for the '<em><b>Staff</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_APPOINTMENT__STAFF = APPOINTMENT__STAFF;

	/**
	 * The feature id for the '<em><b>Patient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_APPOINTMENT__PATIENT = APPOINTMENT__PATIENT;

	/**
	 * The feature id for the '<em><b>Amountfor Appointment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_APPOINTMENT__AMOUNTFOR_APPOINTMENT = APPOINTMENT__AMOUNTFOR_APPOINTMENT;

	/**
	 * The feature id for the '<em><b>Payment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_APPOINTMENT__PAYMENT = APPOINTMENT__PAYMENT;

	/**
	 * The feature id for the '<em><b>Bed Allotment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_APPOINTMENT__BED_ALLOTMENT = APPOINTMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Hospital Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_APPOINTMENT__HOSPITAL_NAME = APPOINTMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Hospital Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_APPOINTMENT__HOSPITAL_ID = APPOINTMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Emergency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_APPOINTMENT__EMERGENCY = APPOINTMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Hospital Appointment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_APPOINTMENT_FEATURE_COUNT = APPOINTMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Hospital Appointment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSPITAL_APPOINTMENT_OPERATION_COUNT = APPOINTMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.DoctorImpl <em>Doctor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.DoctorImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getDoctor()
	 * @generated
	 */
	int DOCTOR = 5;

	/**
	 * The feature id for the '<em><b>Doctor Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__DOCTOR_NAME = 0;

	/**
	 * The feature id for the '<em><b>Doctor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__DOCTOR_ID = 1;

	/**
	 * The feature id for the '<em><b>Doctorappointment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__DOCTORAPPOINTMENT = 2;

	/**
	 * The feature id for the '<em><b>Patient</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__PATIENT = 3;

	/**
	 * The number of structural features of the '<em>Doctor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Doctor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.PaymentGatewayImpl <em>Payment Gateway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.PaymentGatewayImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getPaymentGateway()
	 * @generated
	 */
	int PAYMENT_GATEWAY = 6;

	/**
	 * The feature id for the '<em><b>Appointment</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY__APPOINTMENT = 0;

	/**
	 * The feature id for the '<em><b>Paid Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY__PAID_AMOUNT = 1;

	/**
	 * The feature id for the '<em><b>Payment Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY__PAYMENT_STATUS = 2;

	/**
	 * The number of structural features of the '<em>Payment Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Payment Gateway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAYMENT_GATEWAY_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Staff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff</em>'.
	 * @see gendev.hw1.Staff
	 * @generated
	 */
	EClass getStaff();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Staff#getStaffId <em>Staff Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Staff Id</em>'.
	 * @see gendev.hw1.Staff#getStaffId()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_StaffId();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Staff#getStaffName <em>Staff Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Staff Name</em>'.
	 * @see gendev.hw1.Staff#getStaffName()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_StaffName();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Staff#isBookAppointment <em>Book Appointment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Book Appointment</em>'.
	 * @see gendev.hw1.Staff#isBookAppointment()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_BookAppointment();

	/**
	 * Returns the meta object for the reference list '{@link gendev.hw1.Staff#getAppointment <em>Appointment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Appointment</em>'.
	 * @see gendev.hw1.Staff#getAppointment()
	 * @see #getStaff()
	 * @generated
	 */
	EReference getStaff_Appointment();

	/**
	 * Returns the meta object for the reference list '{@link gendev.hw1.Staff#getPatient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Patient</em>'.
	 * @see gendev.hw1.Staff#getPatient()
	 * @see #getStaff()
	 * @generated
	 */
	EReference getStaff_Patient();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Patient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient</em>'.
	 * @see gendev.hw1.Patient
	 * @generated
	 */
	EClass getPatient();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Patient#getPatientId <em>Patient Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patient Id</em>'.
	 * @see gendev.hw1.Patient#getPatientId()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_PatientId();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Patient#getPatientName <em>Patient Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patient Name</em>'.
	 * @see gendev.hw1.Patient#getPatientName()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_PatientName();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Patient#isRegisteredPatientFlag <em>Registered Patient Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registered Patient Flag</em>'.
	 * @see gendev.hw1.Patient#isRegisteredPatientFlag()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_RegisteredPatientFlag();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Patient#isRequestAppointment <em>Request Appointment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Request Appointment</em>'.
	 * @see gendev.hw1.Patient#isRequestAppointment()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_RequestAppointment();

	/**
	 * Returns the meta object for the reference list '{@link gendev.hw1.Patient#getAppointment <em>Appointment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Appointment</em>'.
	 * @see gendev.hw1.Patient#getAppointment()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Appointment();

	/**
	 * Returns the meta object for the reference '{@link gendev.hw1.Patient#getStaff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Staff</em>'.
	 * @see gendev.hw1.Patient#getStaff()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Staff();

	/**
	 * Returns the meta object for the reference list '{@link gendev.hw1.Patient#getDoctor <em>Doctor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Doctor</em>'.
	 * @see gendev.hw1.Patient#getDoctor()
	 * @see #getPatient()
	 * @generated
	 */
	EReference getPatient_Doctor();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Patient#isHealthInsuranceCover <em>Health Insurance Cover</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Health Insurance Cover</em>'.
	 * @see gendev.hw1.Patient#isHealthInsuranceCover()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_HealthInsuranceCover();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Patient#isEmergencyCase <em>Emergency Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emergency Case</em>'.
	 * @see gendev.hw1.Patient#isEmergencyCase()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_EmergencyCase();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Appointment <em>Appointment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appointment</em>'.
	 * @see gendev.hw1.Appointment
	 * @generated
	 */
	EClass getAppointment();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Appointment#getAppointmentDate <em>Appointment Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Appointment Date</em>'.
	 * @see gendev.hw1.Appointment#getAppointmentDate()
	 * @see #getAppointment()
	 * @generated
	 */
	EAttribute getAppointment_AppointmentDate();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Appointment#getAppointmentType <em>Appointment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Appointment Type</em>'.
	 * @see gendev.hw1.Appointment#getAppointmentType()
	 * @see #getAppointment()
	 * @generated
	 */
	EAttribute getAppointment_AppointmentType();

	/**
	 * Returns the meta object for the reference '{@link gendev.hw1.Appointment#getStaff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Staff</em>'.
	 * @see gendev.hw1.Appointment#getStaff()
	 * @see #getAppointment()
	 * @generated
	 */
	EReference getAppointment_Staff();

	/**
	 * Returns the meta object for the reference '{@link gendev.hw1.Appointment#getPatient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Patient</em>'.
	 * @see gendev.hw1.Appointment#getPatient()
	 * @see #getAppointment()
	 * @generated
	 */
	EReference getAppointment_Patient();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Appointment#getAmountforAppointment <em>Amountfor Appointment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amountfor Appointment</em>'.
	 * @see gendev.hw1.Appointment#getAmountforAppointment()
	 * @see #getAppointment()
	 * @generated
	 */
	EAttribute getAppointment_AmountforAppointment();

	/**
	 * Returns the meta object for the reference '{@link gendev.hw1.Appointment#getPayment <em>Payment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Payment</em>'.
	 * @see gendev.hw1.Appointment#getPayment()
	 * @see #getAppointment()
	 * @generated
	 */
	EReference getAppointment_Payment();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.DoctorAppointment <em>Doctor Appointment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doctor Appointment</em>'.
	 * @see gendev.hw1.DoctorAppointment
	 * @generated
	 */
	EClass getDoctorAppointment();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.DoctorAppointment#isDoctorAvailabilty <em>Doctor Availabilty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doctor Availabilty</em>'.
	 * @see gendev.hw1.DoctorAppointment#isDoctorAvailabilty()
	 * @see #getDoctorAppointment()
	 * @generated
	 */
	EAttribute getDoctorAppointment_DoctorAvailabilty();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.DoctorAppointment#getAppointmentTime <em>Appointment Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Appointment Time</em>'.
	 * @see gendev.hw1.DoctorAppointment#getAppointmentTime()
	 * @see #getDoctorAppointment()
	 * @generated
	 */
	EAttribute getDoctorAppointment_AppointmentTime();

	/**
	 * Returns the meta object for the reference '{@link gendev.hw1.DoctorAppointment#getDoctor <em>Doctor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Doctor</em>'.
	 * @see gendev.hw1.DoctorAppointment#getDoctor()
	 * @see #getDoctorAppointment()
	 * @generated
	 */
	EReference getDoctorAppointment_Doctor();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.HospitalAppointment <em>Hospital Appointment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hospital Appointment</em>'.
	 * @see gendev.hw1.HospitalAppointment
	 * @generated
	 */
	EClass getHospitalAppointment();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.HospitalAppointment#isBedAllotment <em>Bed Allotment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bed Allotment</em>'.
	 * @see gendev.hw1.HospitalAppointment#isBedAllotment()
	 * @see #getHospitalAppointment()
	 * @generated
	 */
	EAttribute getHospitalAppointment_BedAllotment();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.HospitalAppointment#getHospitalName <em>Hospital Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hospital Name</em>'.
	 * @see gendev.hw1.HospitalAppointment#getHospitalName()
	 * @see #getHospitalAppointment()
	 * @generated
	 */
	EAttribute getHospitalAppointment_HospitalName();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.HospitalAppointment#getHospitalId <em>Hospital Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hospital Id</em>'.
	 * @see gendev.hw1.HospitalAppointment#getHospitalId()
	 * @see #getHospitalAppointment()
	 * @generated
	 */
	EAttribute getHospitalAppointment_HospitalId();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.HospitalAppointment#isEmergency <em>Emergency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Emergency</em>'.
	 * @see gendev.hw1.HospitalAppointment#isEmergency()
	 * @see #getHospitalAppointment()
	 * @generated
	 */
	EAttribute getHospitalAppointment_Emergency();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Doctor <em>Doctor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doctor</em>'.
	 * @see gendev.hw1.Doctor
	 * @generated
	 */
	EClass getDoctor();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Doctor#getDoctorName <em>Doctor Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doctor Name</em>'.
	 * @see gendev.hw1.Doctor#getDoctorName()
	 * @see #getDoctor()
	 * @generated
	 */
	EAttribute getDoctor_DoctorName();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Doctor#getDoctorId <em>Doctor Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doctor Id</em>'.
	 * @see gendev.hw1.Doctor#getDoctorId()
	 * @see #getDoctor()
	 * @generated
	 */
	EAttribute getDoctor_DoctorId();

	/**
	 * Returns the meta object for the reference list '{@link gendev.hw1.Doctor#getDoctorappointment <em>Doctorappointment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Doctorappointment</em>'.
	 * @see gendev.hw1.Doctor#getDoctorappointment()
	 * @see #getDoctor()
	 * @generated
	 */
	EReference getDoctor_Doctorappointment();

	/**
	 * Returns the meta object for the reference list '{@link gendev.hw1.Doctor#getPatient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Patient</em>'.
	 * @see gendev.hw1.Doctor#getPatient()
	 * @see #getDoctor()
	 * @generated
	 */
	EReference getDoctor_Patient();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.PaymentGateway <em>Payment Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payment Gateway</em>'.
	 * @see gendev.hw1.PaymentGateway
	 * @generated
	 */
	EClass getPaymentGateway();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.PaymentGateway#isPaymentStatus <em>Payment Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Status</em>'.
	 * @see gendev.hw1.PaymentGateway#isPaymentStatus()
	 * @see #getPaymentGateway()
	 * @generated
	 */
	EAttribute getPaymentGateway_PaymentStatus();

	/**
	 * Returns the meta object for the reference list '{@link gendev.hw1.PaymentGateway#getAppointment <em>Appointment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Appointment</em>'.
	 * @see gendev.hw1.PaymentGateway#getAppointment()
	 * @see #getPaymentGateway()
	 * @generated
	 */
	EReference getPaymentGateway_Appointment();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.PaymentGateway#getPaidAmount <em>Paid Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paid Amount</em>'.
	 * @see gendev.hw1.PaymentGateway#getPaidAmount()
	 * @see #getPaymentGateway()
	 * @generated
	 */
	EAttribute getPaymentGateway_PaidAmount();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Hw1Factory getHw1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.StaffImpl <em>Staff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.StaffImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getStaff()
		 * @generated
		 */
		EClass STAFF = eINSTANCE.getStaff();

		/**
		 * The meta object literal for the '<em><b>Staff Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__STAFF_ID = eINSTANCE.getStaff_StaffId();

		/**
		 * The meta object literal for the '<em><b>Staff Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__STAFF_NAME = eINSTANCE.getStaff_StaffName();

		/**
		 * The meta object literal for the '<em><b>Book Appointment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__BOOK_APPOINTMENT = eINSTANCE.getStaff_BookAppointment();

		/**
		 * The meta object literal for the '<em><b>Appointment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF__APPOINTMENT = eINSTANCE.getStaff_Appointment();

		/**
		 * The meta object literal for the '<em><b>Patient</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF__PATIENT = eINSTANCE.getStaff_Patient();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.PatientImpl <em>Patient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.PatientImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getPatient()
		 * @generated
		 */
		EClass PATIENT = eINSTANCE.getPatient();

		/**
		 * The meta object literal for the '<em><b>Patient Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__PATIENT_ID = eINSTANCE.getPatient_PatientId();

		/**
		 * The meta object literal for the '<em><b>Patient Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__PATIENT_NAME = eINSTANCE.getPatient_PatientName();

		/**
		 * The meta object literal for the '<em><b>Registered Patient Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__REGISTERED_PATIENT_FLAG = eINSTANCE.getPatient_RegisteredPatientFlag();

		/**
		 * The meta object literal for the '<em><b>Request Appointment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__REQUEST_APPOINTMENT = eINSTANCE.getPatient_RequestAppointment();

		/**
		 * The meta object literal for the '<em><b>Appointment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__APPOINTMENT = eINSTANCE.getPatient_Appointment();

		/**
		 * The meta object literal for the '<em><b>Staff</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__STAFF = eINSTANCE.getPatient_Staff();

		/**
		 * The meta object literal for the '<em><b>Doctor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT__DOCTOR = eINSTANCE.getPatient_Doctor();

		/**
		 * The meta object literal for the '<em><b>Health Insurance Cover</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__HEALTH_INSURANCE_COVER = eINSTANCE.getPatient_HealthInsuranceCover();

		/**
		 * The meta object literal for the '<em><b>Emergency Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__EMERGENCY_CASE = eINSTANCE.getPatient_EmergencyCase();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.AppointmentImpl <em>Appointment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.AppointmentImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getAppointment()
		 * @generated
		 */
		EClass APPOINTMENT = eINSTANCE.getAppointment();

		/**
		 * The meta object literal for the '<em><b>Appointment Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPOINTMENT__APPOINTMENT_DATE = eINSTANCE.getAppointment_AppointmentDate();

		/**
		 * The meta object literal for the '<em><b>Appointment Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPOINTMENT__APPOINTMENT_TYPE = eINSTANCE.getAppointment_AppointmentType();

		/**
		 * The meta object literal for the '<em><b>Staff</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPOINTMENT__STAFF = eINSTANCE.getAppointment_Staff();

		/**
		 * The meta object literal for the '<em><b>Patient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPOINTMENT__PATIENT = eINSTANCE.getAppointment_Patient();

		/**
		 * The meta object literal for the '<em><b>Amountfor Appointment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPOINTMENT__AMOUNTFOR_APPOINTMENT = eINSTANCE.getAppointment_AmountforAppointment();

		/**
		 * The meta object literal for the '<em><b>Payment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPOINTMENT__PAYMENT = eINSTANCE.getAppointment_Payment();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.DoctorAppointmentImpl <em>Doctor Appointment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.DoctorAppointmentImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getDoctorAppointment()
		 * @generated
		 */
		EClass DOCTOR_APPOINTMENT = eINSTANCE.getDoctorAppointment();

		/**
		 * The meta object literal for the '<em><b>Doctor Availabilty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCTOR_APPOINTMENT__DOCTOR_AVAILABILTY = eINSTANCE.getDoctorAppointment_DoctorAvailabilty();

		/**
		 * The meta object literal for the '<em><b>Appointment Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCTOR_APPOINTMENT__APPOINTMENT_TIME = eINSTANCE.getDoctorAppointment_AppointmentTime();

		/**
		 * The meta object literal for the '<em><b>Doctor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR_APPOINTMENT__DOCTOR = eINSTANCE.getDoctorAppointment_Doctor();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.HospitalAppointmentImpl <em>Hospital Appointment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.HospitalAppointmentImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getHospitalAppointment()
		 * @generated
		 */
		EClass HOSPITAL_APPOINTMENT = eINSTANCE.getHospitalAppointment();

		/**
		 * The meta object literal for the '<em><b>Bed Allotment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOSPITAL_APPOINTMENT__BED_ALLOTMENT = eINSTANCE.getHospitalAppointment_BedAllotment();

		/**
		 * The meta object literal for the '<em><b>Hospital Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOSPITAL_APPOINTMENT__HOSPITAL_NAME = eINSTANCE.getHospitalAppointment_HospitalName();

		/**
		 * The meta object literal for the '<em><b>Hospital Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOSPITAL_APPOINTMENT__HOSPITAL_ID = eINSTANCE.getHospitalAppointment_HospitalId();

		/**
		 * The meta object literal for the '<em><b>Emergency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOSPITAL_APPOINTMENT__EMERGENCY = eINSTANCE.getHospitalAppointment_Emergency();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.DoctorImpl <em>Doctor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.DoctorImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getDoctor()
		 * @generated
		 */
		EClass DOCTOR = eINSTANCE.getDoctor();

		/**
		 * The meta object literal for the '<em><b>Doctor Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCTOR__DOCTOR_NAME = eINSTANCE.getDoctor_DoctorName();

		/**
		 * The meta object literal for the '<em><b>Doctor Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCTOR__DOCTOR_ID = eINSTANCE.getDoctor_DoctorId();

		/**
		 * The meta object literal for the '<em><b>Doctorappointment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR__DOCTORAPPOINTMENT = eINSTANCE.getDoctor_Doctorappointment();

		/**
		 * The meta object literal for the '<em><b>Patient</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCTOR__PATIENT = eINSTANCE.getDoctor_Patient();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.PaymentGatewayImpl <em>Payment Gateway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.PaymentGatewayImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getPaymentGateway()
		 * @generated
		 */
		EClass PAYMENT_GATEWAY = eINSTANCE.getPaymentGateway();

		/**
		 * The meta object literal for the '<em><b>Payment Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY__PAYMENT_STATUS = eINSTANCE.getPaymentGateway_PaymentStatus();

		/**
		 * The meta object literal for the '<em><b>Appointment</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAYMENT_GATEWAY__APPOINTMENT = eINSTANCE.getPaymentGateway_Appointment();

		/**
		 * The meta object literal for the '<em><b>Paid Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAYMENT_GATEWAY__PAID_AMOUNT = eINSTANCE.getPaymentGateway_PaidAmount();

	}

} //Hw1Package
