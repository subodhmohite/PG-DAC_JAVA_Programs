package tester;
import static utils.StudentCollectionUtils.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import com.app.core.Student;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student>list=populateList();
		//1.1 Display all student details from a student list
		list.forEach(s-> System.out.println(s));
		System.out.println();
		
		//1.2  Display all student details from a student map
		//get student map
		System.out.println("Student Details from Map");
		Map<String,Student>map=populateMap(list);
		// for (Map.Entry<K, V> entry : map.entrySet())
	     //action.accept(entry.getKey(), entry.getValue());
		map.forEach((k,v)-> System.out.println("RollNo."+v.getRollNo()+" Gpa"+v.getGpa()));
		
		//1.3 Display all student details(from the list) sorted as per GPA (desc order)
		//Use custom ordering
		//Collections.sort(list,() -> {});
		//Collections.sort(list,(s1,s2) -> Double.compare(s2.getGpa(),s1.getGpa()));
		
		//list.forEach(st -> System.out.println(st));
		
		//Rewrite below statement using function literal
		Comparator<Student> studentComp= (s1,s2)->
		((Double)s1.getGpa()).compareTo(s2.getGpa());
		Collections.sort(list,studentComp);
		
		Collections.sort(list,(s1,s2)->{
		if(s1.getGpa() < s2.getGpa())
			return 1;
		if (s1.getGpa() > s2.getGpa())
			return -1;
		return 0;
	});
	//Display sorted list
	System.out.println("Sorted list");
	list.forEach(s->System.out.println(s));
	

	//	1.4 Remove all failed students from the map n display the map again
	//	(gpa < 6 => failure)
	//System.out.println("");
	//map.values()//Collection<Student>
	
	

		

	}

}
