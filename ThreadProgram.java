package indexpro;

class ThreadProgram extends Thread {

	public static void main(String args[]) {
		
		ThreadProgram tp=new ThreadProgram();
		tp.start();//thread start
		
		System.out.println("the code is outside the thread:");
	}
	public void run() {
		System.out.println("the code is running the thread:");
	}
}
