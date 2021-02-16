import java.util.Scanner;
public class Anagrafica {
	//Variabili (informazioni studente)
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
	
	//Stampa dati
	public void stampaDati() {
		//Inserimento dati
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserire il nome dello studente: ");
        nome = sc.nextLine();
        System.out.print("Inserire il cognome dello studente: ");
        cognome = sc.nextLine();
        System.out.print("Inserire l'email dello studente: ");
        email = sc.nextLine();
        reg = true;
        //Stampa dei dati
		System.out.println("Nome studente: " + nome);
		System.out.println("Cognome studente: " + cognome);
		if(reg == true)
		{
			System.out.println("Email studente: " + email);
		}
		else
		{
			System.out.println("Email non registrata");
		}
	}
}


