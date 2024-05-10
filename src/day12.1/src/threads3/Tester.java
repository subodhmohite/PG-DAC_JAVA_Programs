package threads3;

public class Tester {

	public static void main(String[] args) {
		try {
			// display details of the main thread(name ,prio , thrd grp).
			System.out.println(Thread.currentThread());// toString -- Thread[main,5,main]
			// create multiple child threads (implements Runnable)
			// create runnable task instance(i.e implementation class of Runnable)
			MyClass runnableTask = new MyClass();
			// Thread(Runnable instance,String name)
			Thread t1 = new Thread(runnableTask, "one");
			Thread t2 = new Thread(runnableTask, "two");
			Thread t3 = new Thread(runnableTask, "three");
			Thread t4 = new Thread(runnableTask, "four");
			// how many runnable thrds ? 1(main)
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			// how many runnable thrds ? 1(main) + 4(child)
			System.out.println(t1.isAlive() + " " + t4.isAlive());// t t
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + " exec count " + i);
				Thread.sleep(200);
			}
			System.out.println(t1.isAlive() + " " + t4.isAlive());// t t
			// ensure no orphans
			System.out.println("main waiting for child thrds to complete exec");
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			System.out.println(t1.isAlive() + " " + t4.isAlive());// f f
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over.....");

	}

}
