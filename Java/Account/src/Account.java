import java.util.Scanner;

public class Account {
	//Variabili usate
	private String email;
	private String passw;
	private Boolean spt,sr,cnma; //spt: sport , sr: serie , cnma: cinema;
	
	//Inizalizzazione variabili
	public Account() {
		email = new String();
		passw = new String();
		spt = false;
		sr = false;
		cnma = false;
	}
	
	//Input
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		//Messaggio di Benvenuto
		System.out.println("\n\n\n\n\t+++Benvenuto su NowTV+++\n");
		System.out.println("(Verrà applicato uno sconto di 5 euro se verranno acquistati due o più abbonamenti)\n");
		
		//Inserimento dei dati 
		System.out.println("Inserire un email valida");
		email = sc.nextLine();
		System.out.println("Inserire un password sicura");
		passw = sc.nextLine();
		System.out.print("Vuoi un abbonamento ai film? true(si)/false(no) (costo: 10 euro): ");
			cnma = sc.nextBoolean();
		System.out.print("Vuoi un abbonamento alle serie tv? true(si)/false(no) (costo: 10 euro): ");
			sr = sc.nextBoolean();
		System.out.print("Vuoi un abbonamento allo sport tv? true(si)/false(no) (costo: 30 euro): ");
			spt = sc.nextBoolean();
	}
	
	//Stampa dei Dati inseriti
	public void StampaDatiInser() {
		//Stampa dei dati insertit
		System.out.println("\nDATI ACCOUNT: ");
		System.out.println("Email: " + email);
		System.out.print("Password criptata: ");
		System.out.println(passwCript(passw));
		System.out.println("Abbonamnto cinema: " + cnma);
		System.out.println("Abbonamnto serie TV: " + sr);
		System.out.println("Abbonamnto Sport: " + spt);
		
	//Messaggio d'arrivederci
	System.out.println("\nGrazie per esserti abbonato a NowTV");
	}
	
	//Calcolo del costo
	public int costoTot() {
		
		//Inizalizzazione variabili
		int numAbb = 0;
		int costo = 0;
		
		//Controlli
		if(spt==true) 
		{
			costo = costo+30;
			numAbb++;
		}
			
		if(sr==true) 
		{
			costo = costo+10;
			numAbb++;
		}
			
		if(cnma==true) 
		{
			costo = costo+10;
			numAbb++;
		}
		
		//Controllo dello sconto
		if(numAbb>=2) 
		{
			costo = costo-5;	
		}
			
		//Return del totale
		return costo;
	}
	
	//Cifratura della password usando il codice di cesare
	private String passwCript(String a) {
		for(int i = 0; i<a.length(); i++) 
		{
			System.out.print((char)(a.charAt(i)+3));
		}
		System.out.print("\t\tpassword originale: ");
		return a;
	}
}


