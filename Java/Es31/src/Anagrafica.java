import java.util.Scanner;
public class Anagrafica {
	//Variabili (informazioni lavoratore)
	public String nome;
	public String cognome;
	private String email;
	private boolean reg;
	
	//inizializzazioni variabili
	public void registraStudente(String nom, String cogn, String mail) {
		nom = nome;
		cogn = cognome;
		mail = email;
		reg = false;
	}
	
	//Inserisci Dati
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserire il nome: ");
        nome = sc.nextLine();
        System.out.print("Inserire il cognome: ");
        cognome = sc.nextLine();
        System.out.print("Inserire l'email: ");
        email = sc.nextLine();
        reg = true;
	}
	
	//Stampa dati
	public void stampaDati() { 
		System.out.println("Nome: " + nome);
		System.out.println("Cognome: " + cognome);
		if(reg == true)
		{
			System.out.println("Email: " + email);
		}
		else
		{
			System.out.println("Email non registrata");
		}
	}
}