package controller;
import java.util.Random;

public class FrogRun extends Thread {
	
	private int maxJump = 5;
	private int finishLine, currentDist, currentJump;
	
	public FrogRun(int finishLine) {
		
		this.finishLine = finishLine;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		frogRun();
	}
	
	private void frogRun() {
		do {
			
			Random generator = new Random();
			currentJump = generator.nextInt(maxJump);
		
			if (currentJump>=finishLine) {
				currentJump = finishLine;
				
				try {
					System.out.println("FROG TID#" + getId() + " Finished the race.");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			finishLine = finishLine - currentJump;
			currentDist = currentDist + currentJump;
		
			try {
				System.out.println("FROG TID#" + getId() + " Jumped " + currentJump + " meters. Finish Line is " + finishLine + " meters away. " + currentDist + " meters were jumped already.");	
				sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		} while(finishLine>0);
		
	}
		
	}
	