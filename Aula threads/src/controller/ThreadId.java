package controller;

// extends Thread
// Params by constructor 
// Run method

public class ThreadId extends Thread {

	private int idThread;
	
	public ThreadId(int idThread) {
		this.idThread = idThread;
	}

	@Override
	public void run() {
		// executable
		System.out.println(idThread);
		
	}
	
}

