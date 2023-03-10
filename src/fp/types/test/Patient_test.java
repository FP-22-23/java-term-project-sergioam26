package fp.types.test;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

import fp.types.Patient;
import fp.utils.Checkers;
import fp.utils.Gender;

public class Patient_test {
	public static void viewPatient(Patient p) {
		System.out.println(p);	
			
		
	}
	
	public static void testConstructor1(Integer hadm_id, Gender gender, LocalDate firstRevision, String admitLocation,
			List<String> admitDiagnosis, String insurance, Integer numDiagnosis, String admitProcedure, Integer numRx,
			Integer numLabs, Double price) {
		
		try {
			Patient p = new Patient(hadm_id,gender,firstRevision,admitLocation,
					admitDiagnosis,insurance,numDiagnosis ,admitProcedure,numRx,
					numLabs, price);	
			viewPatient(p);
		} 
		catch(IllegalArgumentException e) {
			System.out.println("Excepcion capturada:\n   " + e);	
		} 
		
		catch (Exception e) {
			System.out.println("Excepcion inesperada:\n   " + e);
		}
	}
	
	public static void testConstructor2(Integer hadm_id, Gender gender,
			List<String> admitDiagnosis, String admitProcedure, Integer numRx,
			Integer numLabs) {
		
		try {
			Patient p = new Patient(hadm_id, gender,
					admitDiagnosis, admitProcedure, numRx,
					numLabs);	
			viewPatient(p);
		} 
		catch(IllegalArgumentException e) {
			System.out.println("Excepcion capturada:\n   " + e);	
		} 
		
		catch (Exception e) {
			System.out.println("Excepcion inesperada:\n   " + e);
		}
	}
	
	public static void main(String [] args) {
		List<String> admitDiagnosis = List.of("DEMENTIA", "CONGESTIVE HEART FAILURE", 
				"CHRONIC ATRIAL FIBRILLATION", "C2 FRACTURE", "HIP FRACTURE");
		LocalDate date=LocalDate.of(2014,4, 26);
	
		System.out.println("====================================");
		System.out.println("Constructor " + 1);
		testConstructor1(100001 , Gender.F, date, "EMERGENCY", admitDiagnosis, "Medicare", 
				6, "Endosc control gast hem\r\n", 1, 4, 155.97);
		
		
		System.out.println("====================================");
		System.out.println("Constructor " + 2);
		testConstructor2(100001 , Gender.F, admitDiagnosis, "Endosc control gast hem\r\n"
				,1, 4);
	}

	
}
