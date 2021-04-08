package it.objectmethod.ripasso.tipi;

import java.util.Scanner;

public class ScannerDue {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		
		System.out.print("Scrivi qualcosa: ");
		String input = tastiera.nextLine();

		System.out.print(input.substring(0,input.indexOf(" ")));
		
		tastiera.close();
	}

}
