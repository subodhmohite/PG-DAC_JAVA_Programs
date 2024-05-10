package functionalstreams;

import java.util.Map;
import java.util.Scanner;

import com.app.core.Student;
import com.app.core.Subject;

import static utils.StudentCollectionUtils.*;

public class Test1 {

	public static void main(String[] args) {
		//get populated map of students display all
		//accept subject name from client
		
		try(Scanner sc=new Scanner(System.in)){
			Map<String,Student> studentMap= populateMap(populateList());
			//forEach
			studentMap.forEach((k,v) -> System.out.println(v));
			System.out.println("Enter Subject Name");
			Subject chosenSubject=Subject.valueOf(sc.next().toUpperCase());
			//Display student details from a specified subject
			studentMap.values() //Collection<Student>
			.stream()//Stream <Student>:all
			.filter(s -> s.getSubject()==chosenSubject)//Stream<Student>
            .forEach(s -> System.out.println(s));   
		}
	

	}

}
