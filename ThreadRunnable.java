package indexpro;

class Book implements Runnable{
	@override
	public void run() {
		System.out.println("Do a Task:");
	}
}
public class ThreadRunnable {

	public static void main(String args[]) {
		// ToDo Auto generated method stud
		Thread t1=new Thread(new Book(),"Book thread");
		t1.start();
		System.out.println("Thread with name"+t1.getName());
	}
}
