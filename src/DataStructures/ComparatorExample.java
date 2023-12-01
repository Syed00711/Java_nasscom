package DataStructures;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import Inheritance.MicrocareStudents;

public class ComparatorExample {

	public static void main(String[] args) {
		SortedSet<MicrocareStudents> ss =
				new TreeSet<>();
		
		MicrocareStudents ms =new MicrocareStudents();
		ms.setFirstName("rohit");
		ms.setLastName("kumar");
		ms.setEducation("BCOM");
		ms.setDob(LocalDate.of(1995, 10, 05));
		ms.setDoj(LocalDate.of(2023, 11, 10));
		ms.setFullStack(true);
		ms.setId((int)(Math.random()*100000));
		List<String> skills2 =List.of("java","html");
		ms.setSkills(skills2);
         
         
         MicrocareStudents ms1 =new MicrocareStudents();
 		ms1.setFirstName("anil");
 		ms1.setLastName("rathi");
 		ms1.setEducation("BTECH");
 		ms1.setDob(LocalDate.of(2000, 10, 05));
 		ms1.setDoj(LocalDate.of(2023, 11, 15));
 		ms1.setFullStack(true);
 		ms1.setId((int)(Math.random()*100000));
 		List<String> skills1 =List.of("java","html");
		ms1.setSkills(skills1);
 		
		ss.add(ms1);
		ss.add(ms);
		
		System.out.println(ss.toString());
 		


	}
	
	


}

class checkcomp implements Comparator<MicrocareStudents>{

	@Override
	public int compare(MicrocareStudents o1, MicrocareStudents o2) {
		// TODO Auto-generated method stub
		return o2.getDoj().compareTo(o1.getDoj());
	}
	
}
