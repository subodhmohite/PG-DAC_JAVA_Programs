package com.threads2;

public class Tester {

	public static void main(String[] args) throws InterruptedException{
		// Display details of the main thread(name,prio,thrd grp
		System.out.println(Thread.currentThread());//toString--Thread 
		//create multiple child Threads(extends Thread child Scenario)
		
		//create unnable task instance(implementation class of runnable)
		MyClass runnableTask= new MyClass();
		//Thread(Runnable instance,String name)
		Thread t1=new Thread(runnableTask,"One ");
		Thread t2=new Thread(runnableTask,"two ");
		Thread t3=new Thread(runnableTask,"three ");
		Thread t4=new Thread(runnableTask,"four ");
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
