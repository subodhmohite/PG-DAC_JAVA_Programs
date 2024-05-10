package functionalstream;

import java.util.List;

import com.app.core.Student;
import com.app.core.Subject;

import utils.StudentCollectionUtils;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list=StudentCollectionUtils.populateList();
		//Display complete list
		System.out.println("All students");
		Subject subject=Subject.JAVA;
		list.stream().filter((s)->s.getSubject()==subject)
		.forEach(s->System.out.println(s));
		

	}

}
