package view;

import controller.ThreadCalc;
import controller.ThreadMatriz;
import java.util.Random;


public class Principal {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 2;
		
		for (int op = 0 ; op < 5 ; op++) {
			Thread tCalc = new ThreadCalc(a,b,op);
			tCalc.start();
		}
		

		Random generator = new Random();
		
		int matriz[][] = new int[3][5];
		
		int vet0[] = new int[5];
		int vet1[] = new int[5];
		int vet2[] = new int[5];
		
		int x1 = 0;
		int y1 = 0;
		
		for (x1 = 0 ; x1 < 3 ; x1++) {
			for (y1 = 0; y1 < 5 ; y1++) {
				matriz[x1][y1] = generator.nextInt(10);
				System.out.println(" [" + x1 + " " + y1 + "] " + matriz[x1][y1]);
				System.out.println(" ");
			}
			
		}
		for (y1 = 0; y1 < 5 ; y1++) {
			vet0[y1] = matriz[0][y1];
			vet1[y1] = matriz[1][y1];
			vet2[y1] = matriz[2][y1];

		}
		
		Thread tMat0 = new ThreadMatriz(vet0);
		tMat0.start();
		Thread tMat1 = new ThreadMatriz(vet1);
		tMat1.start();
		Thread tMat2 = new ThreadMatriz(vet2);
		tMat2.start();
		
		
	}
		
	}	 

