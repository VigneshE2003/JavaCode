package indexpro;

public class ThreadSynchronized {

	private final String name;
	public ThreadSynchronized(String name) {
		this.name=name;
		
	}
	public String getName() {
		return this.name;
	}
		
		public synchronized void call(ThreadSynchronized caller) {
			System.out.println(this.getName()+"has asked to call me"+caller.getName());
			try {
				Thread.sleep(500);
			}catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			caller.call(this);
			
		}
		public synchronized void callMe(ThreadSynchronized caller) {
			System.out.println(this.getName()+"has asked to call me"+caller.getName());
		}
		public static void main(String args[]) {
			
			//to do auto generated method stub
			
			ThreadSynchronized caller1=new ThreadSynchronized("caller-1");
			ThreadSynchronized caller2=new ThreadSynchronized("caller-2");
			
			new Thread(new Runnable() {
				public void run() {
					caller1.call(caller2);
				}
			}).start();
		}
	}

