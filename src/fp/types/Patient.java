package fp.types;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import fp.utils.Checkers;
import fp.utils.Gender;

public class Patient implements Comparable<Patient> {
	
	private Integer hadm_id;
	private Gender gender;
	private LocalDate firstRevision;
	private String admitLocation;
	private List<String> admitDiagnosis;
	private String insurance;
	private Integer numDiagnosis;
	private String admitProcedure;
	private Integer numRx;
	private Integer numLabs;
	private Double price;
	
	public Patient(Integer hadm_id, Gender gender, LocalDate firstRevision, String admitLocation,
			List<String> admitDiagnosis, String insurance, Integer numDiagnosis, String admitProcedure, Integer numRx,
			Integer numLabs, Double price) {
		super();
		
		Checkers.checkNoNull(hadm_id);
		this.hadm_id = hadm_id;
		this.gender = gender;
		this.firstRevision = firstRevision;
		this.admitLocation = admitLocation;
		this.admitDiagnosis = admitDiagnosis;
		this.insurance = insurance;
		
		Checkers.check("The patient must be at least one diagnosis", this.numDiagnosis > 0);
		this.numDiagnosis = numDiagnosis;
	
		this.admitProcedure = admitProcedure;
		this.numRx = numRx;
		this.numLabs = numLabs;
		this.price = price;
	}
	public Patient(Integer hadm_id, Gender gender, List<String> admitDiagnosis, String admitProcedure, Integer numRx,
			Integer numLabs) {
		super();
		this.hadm_id = hadm_id;
		this.gender = gender;
		this.admitDiagnosis = admitDiagnosis;
		this.admitProcedure = admitProcedure;
		this.numRx = numRx;
		this.numLabs = numLabs;
	}
	public Integer getHadm_id() {
		return hadm_id;
	}
	public void setHadm_id(Integer hadm_id) {
		Checkers.checkNoNull(hadm_id);
		this.hadm_id = hadm_id;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public LocalDate getFirstRevision() {
		return firstRevision;
	}
	public void setFirstRevision(LocalDate firstRevision) {
		this.firstRevision = firstRevision;
	}
	public String getAdmitLocation() {
		return admitLocation;
	}
	public void setAdmitLocation(String admitLocation) {
		this.admitLocation = admitLocation;
	}
	public List<String> getAdmitDiagnosis() {
		return admitDiagnosis;
	}
	public void setAdmitDiagnosis(List<String> admitDiagnosis) {
		this.admitDiagnosis = admitDiagnosis;
	}
	public String getInsurance() {
		return insurance;
	}
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	public Integer getNumDiagnosis() {
		
		return numDiagnosis;
	}
	public void setNumDiagnosis(Integer numDiagnosis) {
		Checkers.check("The patient must be at least one diagnosis", this.numDiagnosis > 0);
		this.numDiagnosis = numDiagnosis;
	}
	public String getAdmitProcedure() {
		return admitProcedure;
	}
	public void setAdmitProcedure(String admitProcedure) {
		this.admitProcedure = admitProcedure;
	}
	public Integer getNumRx() {
		return numRx;
	}
	public void setNumRx(Integer numRx) {
		this.numRx = numRx;
	}
	public Integer getNumLabs() {
		return numLabs;
	}
	public void setNumLabs(Integer numLabs) {
		this.numLabs = numLabs;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public boolean getPrivateInsurance() {
		boolean r;
		if (this.getInsurance()== "Private") {
			r= true;
		} else {
			r= false;
		} return r;
	}
	
	public int hashCode() {
		return Objects.hash(firstRevision, gender, hadm_id);
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		return Objects.equals(firstRevision, other.firstRevision)
				&& Objects.equals(hadm_id, other.hadm_id);
	}
	@Override
	public String toString() {
		return "Patient [hadm_id=" + hadm_id + ", gender=" + gender + ", firstRevision=" + firstRevision
				+ ", admitLocation=" + admitLocation + ", admitDiagnosis=" + admitDiagnosis + ", insurance=" + insurance
				+ ", numDiagnosis=" + numDiagnosis + ", admitProcedure=" + admitProcedure + ", numRx=" + numRx
				+ ", numLabs=" + numLabs + ", price=" + price + "]";
	}
	
	public int compareTo(Patient p) {
		int r;
		if (p == null) {
			throw new NullPointerException();
		}
		r = getHadm_id().compareTo(p.getHadm_id());	
		if (r == 0) {
			
				r = getFirstRevision().compareTo(p.getFirstRevision());
		}
		return r;
	}
	
	
	
	
	
	
	
	}
	
	
	
	


