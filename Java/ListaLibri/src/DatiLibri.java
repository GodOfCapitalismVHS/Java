import java.util.*;

public class DatiLibri {
	Scanner sc = new Scanner(System.in);
	private String Codice = new String();
	private String Genere = new String();
	private String Titolo = new String();
	private String Autore = new String();
	private float Prezzo;
	private float nuovoPrezzo;
	
	public float getNuovoPrezzo() {
		return nuovoPrezzo;
	}
	public void setNuovoPrezzo(float nuovoPrezzo) {
		this.nuovoPrezzo = nuovoPrezzo;
	}
	public String getCodice() {
		return Codice;
	}
	public void setCodice(String codice) {
		Codice = codice;
	}
	public String getGenere() {
		return Genere;
	}
	public void setGenere(String genere) {
		Genere = genere;
	}
	public String getTitolo() {
		return Titolo;
	}
	public void setTitolo(String titolo) {
		Titolo = titolo;
	}
	public String getAutore() {
		return Autore;
	}
	public void setAutore(String autore) {
		Autore = autore;
	}
	public float getPrezzo() {
		return Prezzo;
	}
	public void setPrezzo(float prezzo) {
		Prezzo = prezzo;
	}
	
	public void Input() {
		System.out.println("\n---INSERISCI I DATI DEL LIBRO---\n");
		
		//Titolo
		System.out.print("TITOLO: ");
		Titolo = sc.nextLine();
		
		//Genere
		System.out.print("GENERE: ");
		Genere = sc.nextLine();
		
		//Autore
		System.out.print("AUTORE: ");
		Autore = sc.nextLine();
		
		//Prezzo
		System.out.print("PREZZO: ");
		Prezzo = sc.nextFloat();
		
		sc.nextLine();
		
		//Codice
		System.out.print("CODICE: ");
		Codice = sc.nextLine();
		
	}
	
	public void stampa() {
		System.out.println("\n\n--------------------------------\n");
		System.out.println("\n---LIBRO SALVATO---\n");
		System.out.print("TITOLO: " + Titolo + "\n");
		System.out.print("GENERE: " + Genere + "\n");
		System.out.print("AUTORE: " + Autore + "\n");
		System.out.print("PREZZO: " + Prezzo + "\n");
		System.out.print("CODICE: " + Codice + "\n");
		System.out.println("\n--------------------------------\n\n");
	}
	
	
}
