package functionalstream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test1 {

	public static void main(String[] args) {
		int[] data= {1,2,3,45,6,7,};
		//attach Instream to the array n display elements
		//source (int[]) ---> terminal(forEach)
		IntStream i=Arrays.stream(data);//src:IntStream
		i.forEach((i1)->System.out.println(i1));//terminal op
		

	}

}
