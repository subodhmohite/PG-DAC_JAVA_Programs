package com.threads2;

public class MyClass implements Runnable{
	
	


	//mandatory to override
	/*
	 * Rule- Method overriding n exception handling
	 * Overriding from of the method(sub class version)can not throw 
	 * any New or BROADER CHECKED exception
	 */
	@Override
		public void run() /*throws InterruptedException*/ {
		System.out.println(Thread.currentThread().getName()+"Started");
		try {
		//B.L--for loop(10)
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+"exec count"+i);
			Thread.sleep(500);
		}
		}catch (Exception e) {
			System.out.println(Thread.currentThread().getName()+"got exc");
			
		}
		System.out.println(Thread.currentThread().getName()+"Over");
		
	}

}
