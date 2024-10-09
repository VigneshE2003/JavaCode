package indexpro;

class UserThread1 extends Thread
{
	@Override
	public void run() {
		System.out.println("This is a user thread....");
	}
}

class DaemonThread extends Thread
{
	public DaemonThread() {
		setDaemon(true); //this thread bcom daemon ,java will not run daemon thread
	}
	
	@Override
	public void run() {
		
		for(int i=0;i<10;i++) {
			System.out.println("this is daemon thread...."+i);
		}
	}
}
public class ThreadJava {

	public static void main(String args[]) {
		DaemonThread daemon=new DaemonThread();  //creating the daemonthread
		daemon.start();  //starting the daemon thread
		
		UserThread1 userthread=new UserThread1();  //creating the userthread
		userthread.start();
	}
}

