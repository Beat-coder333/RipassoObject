package it.objectmethod.ripasso.flussi;

public class Articolo {

	private int id;
	private String codice;
	private String descrizione;
	private int quantita;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}


	public String toString() {

		String output = "Dati Articolo: \n" 
				+"ID: " + id +"\n"
				+"Codice: " + codice +"\n" 
				+"Descrizione: " + descrizione +"\n" 
				+"Quantità: "+ quantita +"\n" ;


		return output;
	}

}
