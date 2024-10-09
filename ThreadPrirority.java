package indexpro;

public class ThreadPrirority {

	
	public static void main(String args[]) {
		Thread ex1=new Thread("Demo");
		Thread ex2=new Thread("Demo2");
		
		ex1.start();
		ex2.start();
		
		System.out.println("thread name is follows:");
		System.out.println(ex1.getName());
		System.out.println(ex2.getName());
		
	}
	public void run() {
		
	}
	
}
