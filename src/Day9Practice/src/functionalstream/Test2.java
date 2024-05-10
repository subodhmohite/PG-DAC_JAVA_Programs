package functionalstream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data= {1,2,3,45,6,7,};
		//attach Instream to the array n display elements
		//source (int[]) ---> terminal(forEach)
		Arrays.stream(data)//src:IntStream -- all ints 
		.filter(i -> i% 2 ==0) //InStream --even nos
		.forEach((i)->System.out.println(i+" "));//terminal op
		
		

	}

}
