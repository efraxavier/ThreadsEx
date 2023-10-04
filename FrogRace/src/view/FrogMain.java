package view;
import controller.FrogRun;

public class FrogMain {

	static boolean flagFinish;
	
	public static void main(String[] args) {

		for(int i = 0; i < 5; i++) {
			Thread myFrogs = new FrogRun(50);
			myFrogs.start();
		}
	}

}
