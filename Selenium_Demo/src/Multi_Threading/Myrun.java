package Multi_Threading;

class myrun1 implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");
		}
		System.out.println("current thread Names : " + Thread.currentThread().getName());

	}

}

public class Myrun {

	public static void main(String[] args) {

		myrun1 t = new myrun1(); // runnable interface child class object (Runnable State)
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		t1.start();
		t2.start();

		// constructor for Thread
		// Thread()
		// Thread(runnable State)
		// Thread (Thread name)
		// Thread (Runnable state, Thread Name)

	}

}
