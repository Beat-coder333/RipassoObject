package it.objectmethod.ripasso.flussi;

import java.util.Scanner;

public class Carrello {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);


		Articolo list[] = new Articolo[3]; 


		for(int i = 0; i<list.length;i++) {

			list[i] = new Articolo(); 

			System.out.println("Inserisci dati articolo:\nCodice");
			String cod = tastiera.nextLine();


			System.out.println("Descrizione");
			String des = tastiera.nextLine();

			System.out.println("Quantità");
			int q = tastiera.nextInt();
			tastiera.nextLine(); //problema di scanner o lo faccio diventare una stringa o metto questo


			list[i].setId(i+1);
			list[i].setCodice(cod);
			list[i].setDescrizione(des);
			list[i].setQuantita(q);

		};
		tastiera.close();
		//Stampare elementi

		/*for(int i = 0; i<list.length;i++) {        //stampo tutti gli elementi dell'array 1
			System.out.println(list[i].toString());
		}*/
		//System.out.println(Arrays.toString(list));//stampa 2

		//System.out.println(Arrays.asList(list));//stampa 3


		int maxValue = list[0].getQuantita();
		int indexOfMaxValue= -1;

		for(int i = 0; i < list.length; i++) {
			if(list[i].getQuantita() > maxValue) {
				maxValue = list[i].getQuantita();
				indexOfMaxValue = i;//problema di posizione deve stare nello stesso blocco
			}
			
		}

		System.out.println(list[indexOfMaxValue].toString());

	}
}
