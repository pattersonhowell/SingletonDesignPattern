import java.util.ArrayList;
/**
 * @author pattersonhowell
 * Base class of a patient
 */
public class Patient {
	
	private int id;
	private String firstName;
	private String lastName;
	private ArrayList<String> allergies;
	
	/**
	 * Setting patient information
	 * @param id "Index" of patient in list
	 * @param firstName Patient's first name
	 * @param lastName Patient's last name
	 */
	public Patient(int id, String firstName, String lastName) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.allergies = new ArrayList<String>();
	}
	
	/**
	 * Adding allergy to list of allergies
	 * @param allergy What patient is allergic to
	 */
	public void addAllergy(String allergy) {
		allergies.add(allergy);
	}
	
	/**
	 * Displaying patients and their allergies
	 */
	public String toString() {
		String display = "";
		String allergyList = "";
		
		for(int i = 0; i < allergies.size(); i++) {
			if(i < allergies.size() - 1) allergyList += allergies.get(i) + ", ";
			else allergyList += allergies.get(i);
		}
		
		display += "Patient " + id + ": ";
		display += firstName + " " + lastName;
		if(allergies.size() > 0) {
			display += "\n  Allergies: " + allergyList + "\n";
		}
		display += "\n";
		
		return display;
		
	}
	
}
