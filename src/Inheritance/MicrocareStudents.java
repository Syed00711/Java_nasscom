package Inheritance;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class MicrocareStudents implements Comparable<MicrocareStudents>{
	String firstName;
	String lastName;
	String Education;
	LocalDate dob;
	int id;
	LocalDate doj;
	boolean fullStack;
	List<String> skills;
	public MicrocareStudents() {
		
	}
	public MicrocareStudents(String firstName, String lastName, String education, LocalDate dob, int id, LocalDate doj,
			boolean fullStack, List<String> skills) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		Education = education;
		this.dob = dob;
		this.id = id;
		this.doj = doj;
		this.fullStack = fullStack;
		this.skills = skills;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEducation() {
		return Education;
	}
	public void setEducation(String education) {
		Education = education;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public boolean isFullStack() {
		return fullStack;
	}
	public void setFullStack(boolean fullStack) {
		this.fullStack = fullStack;
	}
	@Override
	public String toString() {
		return "MicrocareStudents [firstName=" + firstName + ", lastName=" + lastName + ", Education=" + Education
				+ ", dob=" + dob + ", id=" + id + ", doj=" + doj + ", fullStack=" + fullStack + ", skills=" + skills
				+ "]";
	}
	@Override
	public int compareTo(MicrocareStudents o) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
