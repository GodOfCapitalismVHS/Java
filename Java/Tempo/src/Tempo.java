import java.util.Scanner;

public class Tempo {
	//dichiarazione degli attributi
	private int ore;
	private int minuti;
	private int secondi;
	
	//costruttori della classe
	
	//inizializzazione delle variabili a zero
	public Tempo() {
		ore = minuti = secondi = 0;
	}
	
	//inizializzazione delle variabili
	public Tempo(int o, int m, int s) {
		ore = o;
		minuti = m;
		secondi = s;
	}
	
	//input
	public void input() {
		Scanner sc = new Scanner(System.in);
		boolean ok = false;
		System.out.println("inserici i valori per ore, minuti, secondi");
		//inserimento ore
		System.out.println("\n\t inserici le ore");
		do
		{
			ore = sc.nextInt();
			if(ore >=0 && ore <= 24)
				ok = true;
			else
				System.out.println("\t valore non corretto, inserisci un nuovo valore");
				
		}while(!ok);
		ok = false;
		//inserimento minuti
		System.out.println("\t inserici i minuti");
		do
		{
			minuti = sc.nextInt();
			if(minuti >=0 && minuti <= 60)
				ok = true;
			else
				System.out.println("\t valore non corretto, inserisci un nuovo valore");
				
		}while(!ok);
		ok = false;
		//inserimento secondi
		System.out.println("\t inserici i secondi");
		do
		{
			secondi = sc.nextInt();
			if(secondi >=0 && secondi <= 60)
				ok = true;
			else
				System.out.println("\t valore non corretto, inserisci un nuovo valore");
				
		}while(!ok);
	}
	
	//stampa
	public void stampa() {
		System.out.println("stampa dell'ora \n");
		System.out.println(ore + "h " + minuti + "' " + secondi + "'' ");
	}
	
	//trasforma
	private int trasforma() {
		int s = 0;
		s = ore * 3600 + minuti * 60 + secondi;
		return s;
	}
	
	//anti-trasforma
	private Tempo antiTrasforma(int s) {
		Tempo t = new Tempo();
		t.ore = s / 3600;
		int k = s % 3600;
		t.minuti = k / 60;
		t.secondi = k % 60;
		return t;
	}
	
	//somma
	public Tempo somma(Tempo t) {
		int z = this.trasforma() + t.trasforma();
		return antiTrasforma(z);
	}
	//sottrazione
	public Tempo diff(Tempo t) {
		int z = this.trasforma() - t.trasforma();
		if(z < 0)
			z = -1 * z;
		return antiTrasforma(z);
	}
}



