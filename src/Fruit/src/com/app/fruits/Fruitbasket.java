package com.app.fruits;

import java.util.Scanner;


public class Fruitbasket {

	public static void Fruitbasket(Fruit[] arr) {
		// TODO Auto-generated method stub
		/*Apple a=new Apple("Kashmiri Apple","Red",50.75,true);
		Mango m=new Mango("Hapus Mango","Yellow",50,true);
		
		Orange o=new Orange("Nagpur's Orange","Orange",50,true);
		//Displaying all fruits of Fruitbasket
		System.out.println(a.toString());
		System.out.println(m.toString());
		System.out.println(o.toString());
		
		//Calling special methods of fruits 
		a.jam();
		//String a1=a.taste();
		//System.out.println(a1);
		System.out.println(a.taste());
		
		m.pulp();
		System.out.println(m.taste());
		
		o.juice();
		System.out.println(o.taste());
		*/
		//Fruit arr[]=new Fruit[3];
		//arr[0]=new Apple("Kashmiri Apple","Red",50.75,true);
		//arr[1]=new Mango("Hapus Mango","Yellow",50,true);
		//arr[2]=new Orange("Nagpur's Orange","Orange",50,true);
		
		Scanner in=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter Your Choice to add Fruit to the Basket:1.Apple 2.Mango 3.Orange");
			int choice=in.nextInt();
			System.out.println("Enter the name of fruit");
			String nm=in.next();
			System.out.println("Enter the color of Fruit");
			String cr=in.next();
			System.out.println("Enter the weight of Fruit");
			double wt=in.nextDouble();
			System.out.println("Enter the whether the Fruit is Fresh(true) or not(false)");
			boolean fre=in.nextBoolean();
			
		switch (choice) {
		case 1: 
			arr[i]=new Apple(nm,cr,wt,fre);
			break;
		case 2:
			arr[i]=new Mango(nm,cr,wt,fre);
			break;
		case 3:
			arr[i]=new Orange(nm,cr,wt,fre);
			break;
		default:
			System.out.println("Enter the Valid choice");
		
		}
		
		}
		
}
	public static void Displayfruit (Fruit arr[])
	{
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
	}
	
	public static void 
	
}
