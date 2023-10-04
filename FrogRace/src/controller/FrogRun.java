package controller;
import java.util.Random;

public class FrogRun extends Thread {

	private int maxJump = 5;
	public static int place = 0;
	public static int places[] = new int[6];
	private int finishLine, currentDist, currentJump;

	public FrogRun(int finishLine) {

		this.finishLine = finishLine;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		frogRun();
		frogPlaces(places);
	}

	private void frogRun() {
		do {

			Random generator = new Random();
			currentJump = generator.nextInt(maxJump);

			if (currentJump>=finishLine) {
				currentJump = finishLine;
				place++;
				places[place] = (int) getId();
				try {
					System.out.println("FROG TID#" + getId() + " Finished the race in " + place + "# place.");
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

	public void frogPlaces(int places[]) {
		if(place==5) {
			System.out.println("");
		for (int i=1; i<6; i++) {
			System.out.println("Frog #" + places[i] + " got " + i + "# place.");
		}
		}
	}

}
