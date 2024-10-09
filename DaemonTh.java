package indexpro;

class UserThread extends Thread
{
	@Override
	public void run() {
		
		for(int i=0;i<100;i++) {
			System.out.println("this is an user thread....");
		}
	}
}
public class DaemonTh {
//main thread
	public static void main(String args[]) {
		UserThread userthread=new UserThread();   //creating the userthread object
		userthread.setDaemon(true);  //changing the thread as daemon
		userthread.start();  //starting the thread
	}
}
