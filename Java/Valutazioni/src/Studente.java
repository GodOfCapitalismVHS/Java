
public class Studente {

//attributi
	private String Nome;
	private String Cognome;
	private int scritto;
	private int orale;
	private int pratico;
	
//metodi
	public int getScritto() {
		return scritto;
	}

	public void setScritto(int scritto) {
		this.scritto = scritto;
	}

	public int getOrale() {
		return orale;
	}

	public void setOrale(int orale) {
		this.orale = orale;
	}

	public int getPratico() {
		return pratico;
	}

	public void setPratico(int pratico) {
		this.pratico = pratico;
	}
	
	
	public Studente(String nome, String cognome) {
		Nome = nome;
		Cognome = cognome;
		scritto = 0;
		orale = 0;
		pratico = 0;
	}
	
	public Studente(String nome, String cognome, int scritto, int orale, int pratico) {
		//uno studente prevalutato
		Nome = nome;
		Cognome = cognome;
		this.scritto = scritto;
		this.orale = orale;
		this.pratico = pratico;
	}
	public void stampa() {
		System.out.println("Studente: " + Cognome + " " + Nome);
	}
	
	public double media() {
		double m;
		m = (double)(orale + pratico + scritto)/3;
		System.out.print("Media fra i voti orali, scritti e pratici: ");
		return m;
	}
}



