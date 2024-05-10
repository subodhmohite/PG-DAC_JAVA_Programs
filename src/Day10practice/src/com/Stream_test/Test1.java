package com.Stream_test;

import java.util.stream.IntStream;

public class Test1 {

	public static void main(String[] args) {
		//Create stream of ints in range 1-50 n display all nos
		System.out.println("All the NOs 1-50");
		IntStream.range(1,51)
		.forEach(i -> System.out.print(i+" "));//terminal operation
		
		System.out.println();
		//Display odd nos in the range 1-50
		System.out.println("All odd nos");
		IntStream.range(1,51)
		.filter(i -> i%2!=0)
		.forEach(i ->System.out.print(i+" "));

	}

}
