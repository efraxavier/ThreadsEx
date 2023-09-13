package controller;

public class ThreadCalc extends Thread {

	
	private int a, b, op;
	
	public ThreadCalc(int a, int b, int op) {
	
		this.a = a;
		this.b = b;
		this.op = op;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		calc();
	}
	
	private void calc() {
		int t = 1000;
		try {
			sleep(op * t);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		double res = 0;
		String operation = "";
		
		switch (op) {
		case 0:
			res = a + b;
			operation = "+";
			break;
		case 1:
			res = a - b;
			operation = "-";
			break;
		case 2:
			res = a * b;
			operation = "*";
			break;
		case 3:
			res = a / b;
			operation = "/";
			break;
		case 4:
			res = Math.pow(a,b);
			operation = "^";
			break;
		}
		System.out.println("TID #" + getId() + ": " + a + " " + operation + " " + b + " = " + res + " op: " + op);
	}
}
