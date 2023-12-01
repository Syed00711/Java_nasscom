package DataStructures;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Inheritance.MicrocareStudents;

public class DataExample {

	public static void main(String[] args) {
		MicrocareStudents ms =new MicrocareStudents();
		ms.setFirstName("rohit");
		ms.setLastName("kumar");
		ms.setEducation("BCOM");
		ms.setDob(LocalDate.of(1995, 10, 05));
		ms.setDoj(LocalDate.of(2023, 11, 10));
		ms.setFullStack(true);
		ms.setId((int)(Math.random()*100000));
		List<String> skills =List.of("java","html","css","oracle","spingboot");
		ms.setSkills(skills);
		ArrayList<MicrocareStudents> ar=new ArrayList<>();
         ar.add(ms);
         
         
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
 		ar.add(ms1);
 		
 		
 		//ar.forEach(System.out::println);
 		
 System.out.println(ar.stream().filter(dd -> 
 dd.getEducation().equalsIgnoreCase("bcom")).collect(Collectors.toList()));
	}

}
