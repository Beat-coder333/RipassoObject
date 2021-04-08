package it.objectmethod.ripasso.tipi;

import java.util.Scanner;

public class ScannerUno {

	public static void main(String[] args) {

		int n1,n2;

		Scanner tastiera = new Scanner(System.in);

		char scelta;
		do {
			System.out.println("Inserisci il primo numero: ");
			n1 = tastiera.nextInt();
			System.out.println("Inserisci il secondo numero: ");
			n2 = tastiera.nextInt();

			System.out.println("La somma è: " + n1+n2);



			System.out.println("Vuoi continuare?");
			scelta=tastiera.next().charAt(0);

		} while (scelta != 'n');
		tastiera.close();
	}


}


