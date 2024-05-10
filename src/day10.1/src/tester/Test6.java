package tester;
import static utils.StudentCollectionUtils.*;

import java.io.IOException;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

import static utils.IOUtils.*;

import com.app.core.Student;

public class Test6 {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			//get the populated map from utils
			Map<String,Student> map = populateMap(populateList());
			//functional literal for the comparator
			Comparator<Student> comp=(s1,s2) -> s1.getName().compareTo(s2.getName());
			//sort the student details as per name
			Stream<Student> sortedStream=map.values()
			.stream()//Stream 
			.sorted(comp);//intermediate op
			System.out.println("Enter file name,too store students detaails");
			//invoke IOUtils methid to write the details in a text file
			try {
				writeDetails(sortedStream,sc.nextLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Data strored... ");
		}//sc.close()
		System.out.println("Main Over");
	
			
		}

	}

