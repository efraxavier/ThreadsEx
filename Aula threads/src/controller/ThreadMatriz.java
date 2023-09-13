package controller;

public class ThreadMatriz extends Thread {

	private int[] vet;

	//private int vet[] = new int[5];
	
	public ThreadMatriz(int[] vet) {
		
	this.vet = vet;
		
	}
	
	
	@Override
	public void run() {
		// executable
		vetor();
	}
	
	private void vetor() {
		int x = 0;
		

		for (int z = 0; z < 5 ; z++) {
			x = x + vet[z];	

	}
		System.out.println("TID #" + getId() + " Soma valores do vetor: " + x);

		
		}
	
	
}
