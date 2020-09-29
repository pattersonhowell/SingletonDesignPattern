import java.util.ArrayList;
/**
 * @author pattersonhowell
 * Base class for the hospital
 */
public class HospitalSystem {
	private int i = 0;
	
	private ArrayList<Patient> patients;
	private static HospitalSystem hospitalSystem;
	
	/**
	 * Creating arraylist of patients
	 */
	private HospitalSystem() {
		patients = new ArrayList<Patient>();
	}
	
	/**
	 * Creating new instance of class
	 * @return Instance of class
	 */
	public static HospitalSystem getInstance() {
		if(hospitalSystem == null) hospitalSystem = new HospitalSystem();
		return hospitalSystem;
	}
	
	/**
	 * Creating patient and adding them to arraylist
	 * @param firstName Patient's first name
	 * @param LastName Patient's last name
	 * @return Patient's "id"
	 */
	public int addPatient(String firstName, String LastName) {
		
		Patient patient = new Patient(i+1, firstName, LastName);
		patients.add(patient);
		i++;
		return i-1;
	}
	
	/**
	 * Getting patient by id
	 * @param id Patient's "id"
	 * @return Patient with corresponding id
	 */
	public Patient getRecord(int id) {
		return patients.get(id);
	}
	
	/**
	 * Adding allergy to patient by their "id"
	 * @param id Patient's "id"
	 * @param allergy What patient is allergic to
	 */
	public void addAllergy(int id, String allergy) {
		
		if(getRecord(id) == null) {
			System.out.println("patient is null");
		}
		patients.get(id).addAllergy(allergy);;
	}
	
	/**
	 * Gathering all patients data
	 * @return String full of all patients data
	 */
	public String getAllPatientsData() {
		String data = "";
		for(int i = 0; i < patients.size(); i++) {
			data += patients.get(i).toString();
		}
		return data;
	}
	
	
}
