import java.util.Scanner;
public class Matricola extends Anagrafica {
	//Variabili
	public String Matricola;
	
	public void stampaM(Anagrafica d) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci la matricola dello studente: ");
		Matricola = sc.nextLine();
		if(Matricola.length()>5) 
		{
			String app = Matricola.substring(0,4);
			System.out.print("Matricola studente bonificata: " + app);
			System.out.println();
			d.stampaDati();
		}
		else
		{
			System.out.println("Matricola studente: " + Matricola);
			System.out.println();
			d.stampaDati();
		}
		
	}

}
