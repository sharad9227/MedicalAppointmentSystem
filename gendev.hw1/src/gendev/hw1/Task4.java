package gendev.hw1;

import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
public class Task4 {
	public static void main(String[] args) {
		// implement task 4 here
		
		// create instance of CD in file task4_instance/instance.xmi
		Hw1Package.eINSTANCE.eClass();
		 // Retrieve the default factory singleton
		 Hw1Factory factory = Hw1Factory.eINSTANCE;
		 // create the content of the model via this program
	
		 
		 
		 // Patient object
		 
		 
		 Patient patient = factory.createPatient();
		 patient.setPatientId(201);
		 patient.setPatientName("Raina");
		 patient.setRegisteredPatientFlag(true);
		 patient.setHealthInsuranceCover(true);
		 patient.setRequestAppointment(true);
	     patient.setEmergencyCase(true);
		 //Doctor object
		 Doctor doc = factory.createDoctor();
		 
//		 doc.setDoctorId(101);
//		 doc.setDoctorName("ram");
		
		 DoctorAppointment docAppointment=factory.createDoctorAppointment();
		 HospitalAppointment hospital = factory.createHospitalAppointment();
		//doctor appointment
		if(!patient.isEmergencyCase())
		{
			doc.setDoctorId(101);
			 doc.setDoctorName("ram");	
			 doc.getPatient().add(patient);
		 docAppointment.setAppointmentDate(new Date());
		 
		 docAppointment.setAmountforAppointment(1000);
		 docAppointment.setDoctor(doc);
		 docAppointment.getDoctor().getPatient().add(patient);
		}
		// doc.getPatient().add(patient)
		 
		
		 
		 
		else
		{
		 
		 hospital.setAppointmentDate(new Date());
		 hospital.setAppointmentType("Hospital");
		// hospital.setHospitalId(110);
		 hospital.setHospitalName("Atos");
		 hospital.setHospitalId(101);
		 hospital.setAmountforAppointment(10005);
		 hospital.setEmergency(true);
		 hospital.setBedAllotment(true);
		 hospital.setPatient(patient);
		 
		 
		}
		 
		 Staff s =factory.createStaff();
		 s.setStaffId(001);
		 s.setStaffName("rosie");
		 s.getPatient().add(patient);
		 hospital.setStaff(s);
		 PaymentGateway payment=factory.createPaymentGateway();
		
		 if(docAppointment.getAmountforAppointment()>0)
		 {
			payment.setPaidAmount(docAppointment.getAmountforAppointment());
			payment.setPaymentStatus(true);
		 }
		 else
		 {
			 payment.setPaidAmount(hospital.getAmountforAppointment());
				payment.setPaymentStatus(true);
				hospital.setPayment(payment);
		 }
		 
		
		 
		
	
	Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	 Map<String, Object> m = reg.getExtensionToFactoryMap();
	 m.put("xmi", new XMIResourceFactoryImpl());
	 // Obtain a new resource set
	 ResourceSet resSet = new ResourceSetImpl();
	 // create a resource
	 Resource resource = resSet.createResource(URI.createURI("task4_instance/instance.xmi"));
	 // Get the first model element and cast it to the right type, in my
	 // example everything is hierarchical included in this first node
	 resource.getContents().add(payment);
	 resource.getContents().add(docAppointment);
	 resource.getContents().add(doc);
	 resource.getContents().add(patient);
	 resource.getContents().add(s);
	 resource.getContents().add(hospital);
	 
	 // now save the content.
	 try {
	 resource.save(Collections.EMPTY_MAP);
	 } catch (IOException e) {
	 // TODO Auto-generated catch block
	 e.printStackTrace();
	 }
	
	
	
	}
}
