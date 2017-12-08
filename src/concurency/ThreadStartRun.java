package concurency;

public class ThreadStartRun implements Runnable{

	@Override
	public void run() {
		System.out.println("Run method of ThreadStartRun");
		
	}
	
	public static void main(String[] args) {
		new Thread(new ThreadStartRun()).start();
	}
	
}
