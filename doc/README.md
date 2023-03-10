# java-term-project-sergioam26
java-term-project-sergioam26 created by GitHub Classroom

Folders Structure:

	src: Directory with the source code.

		fp.types: Package that contains the types of the project.
		fp.types.test: Package that contains the test classes of the project.
		fp.utils: Package containing the utility classes.
		
	data: Contains the project dataset.
	
		dataset.csv: csv file containing data from different patient of a clinic.


Dataset Structure:

	The csv file contains 11 columns, that have got the following information:
	
		- hadm_id: Integer. It is the ID number of the patient.
		- gender: Enum. It can be F(Female) or M(Male).
		- firstRevision: LocalDate. It is the date in which the patient went to the clinic for the first time.
		- admitLocation: String. Specialist treating the patient for the first time.
		- admitDiagnosis: List<String>. The different diseases of the person.
		- insurance: String. Type of insurance of the patient.
		- numDiagnosis: Integer. Number of times that the person has gone to the consultation.
		- admitProcedure: String. Teatment prescribed to the patient.
		- numLabs: Integer. Number of analysis performed on the patient.
		- numRx: Integer. Number of X-rays performed on the patient.
		- price: Double. Price of the diagnosis.

Implemented Types:
	
	Base type - Patient:
		
		Properties:
		
			- hadm_id: Integer. It is the ID number of the patient. Consultable and modifiable.
			- gender: Enum. It can be F(Female) or M(Male). Consultable and modifiable.
			- firstRevision: LocalDate. It is the date in which the patient went to the clinic for the first time. Consultable and modifiable.
			- admitLocation: String. Specialist treating the patient for the first time. Consultable and modifiable.
			- admitDiagnosis: List<String>. The different diseases of the person. Consultable and modifiable.
			- insurance: String. Type of insurance of the patient. Consultable and modifiable.
			- numDiagnosis: Integer. Number of times that the person has gone to the consultation. Consultable and modifiable.
			- admitProcedure: String. Teatment prescribed to the patient. Consultable and modifiable.
			- numLabs: Integer. Number of analysis performed on the patient. Consultable and modifiable.
			- numRx: Integer. Number of X-rays performed on the patient. Consultable and modifiable.
			- price: Double. Price of the diagnosis. Consultable and modifiable.
			- privateInsurance. Boolean. Derived property. Consultable.
		
		Contructors:
		
			-C1: It has a parameter for each basic property of the type.
			-C2: Create an object of type patient from the following parameters: Integer hadm_id, Gender gender, List<String> admitDiagnosis, String admitProcedure, Integer numRx,
				Integer numLabs.
		
		Constraints:
			
			-R1: The parameter hadm_id cannot be empty.
			-R2: The number of diagnosis must be greater than 0.
		
		Sort criteria: 
			
			By hadm_id and first revision.
		
		Auxiliary types:
			
			Gender: Enum. It can be M or F.
	
