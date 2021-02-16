import java.util.*;
public class Contatto {
	private String cognome;
	private String numero;
	private String mail;
	
	public Contatto() {
		cognome = numero = mail = "";
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Contatto [cognome=" + cognome + ", numero=" + numero + ", mail=" + mail + "]";
	}
	
	public void inserisci() {
		Scanner sc = new Scanner(System.in);
		System.out.println("inserisci il cognome");
		cognome = sc.nextLine();
		System.out.println("inserisci il numero");
		numero = sc.nextLine();
		System.out.println("inserisci la mail");
		mail = sc.nextLine();
	}
}
	

