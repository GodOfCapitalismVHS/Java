import java.util.Scanner;

public class MainStudenti {

	public static void main(String[] args) {
		
		Studente a,b,c;
		Scanner sc;
		sc = new Scanner(System.in);
		
		a = new Studente("Filippo", "Di Toppa");
		b = a; //proviamo che questa non è una nuova istanza
		
		a.stampa();
		System.out.println();
		a.setOrale(4);
		System.out.println(a.media());
		
		b.stampa();
		System.out.println();
		System.out.println(a.media());
		System.out.println();
		
		//inizializzazione variabili
		String n,cogn;
		System.out.print("inserisci il nome: ");
		n = sc.nextLine();
		System.out.print("inserisci il cognome: ");
		cogn = sc.nextLine();
		c = new Studente(n,cogn);
		
		//programma
		c.setOrale(6);
		c.setPratico(5);
		c.setScritto(6);
		c.stampa();
		System.out.println(c.media());
	}

}
