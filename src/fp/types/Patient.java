package fp.types;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

import fp.utils.Gender;

public class Patient {
	
	private int hadm_id;
	private Gender gender;
	private LocalDate firstRevision;
	private String admitLocation;
	private List<String> admitDiagnosis;
	private String insurance;
	private int numDiagnosis;
	private String admitProcedure;
	private int numRx;
	private int numLabs;
	private double price;
	

}
