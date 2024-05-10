package com.threads1;

public class Tester {

	public static void main(String[] args) throws InterruptedException{
		// Display details of the main thread(name,prio,thrd grp
		System.out.println(Thread.currentThread());//toString
		//create multiple child Threads(extends Thread child Scenario)
		MyClass t1= new MyClass("One ");
		MyClass t2= new MyClass("two ");
		MyClass t3= new MyClass("three ");
		MyClass t4= new MyClass("Four ");
		//how many runnable threads? 1(main)
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		//how many runnable threads? 1(main) + 4(child)
		System.out.println(t1.isAlive()+ " "+t4.isAlive());//true t
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" exec count "+i);
			Thread.sleep(1000);
		}
		System.out.println(t1.isAlive()+ " "+t4.isAlive());//false f
		System.out.println("Main Over...");


	}

}
