import java.util.Scanner;
public class CodFisc {
	//VARIABILI
	public String cognome;
	public String nome;
	public int giorno;
	public int mese;
	public int anno;
	public char sex;
	public String citta;
	public String cf;
	
	//COSTRUTTORE DELLA CLASSE
	public CodFisc() {
		cognome = nome = citta = cf = "";
		giorno = mese = anno = 0;
		sex = ' ';
	}
	
	//INPUT DEI DATI SUL COGNOME
	public void gestCognome() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci il cognome: ");
		cognome = sc.nextLine();
		String e = "+-;.:*' ";
		String z = "";
		for (int i = 0; i<cognome.length(); i++) {
			if(e.indexOf(cognome.charAt(i))==-1)
				z = z + cognome.charAt(i);	
			}
		z = z.toUpperCase();
		
		//VOCALI E CONSONANTI
		String v = "";
		String c = "";
		String voc = "AEIOU";
		for(int i = 0; i<z.length(); i++) {
			if(voc.indexOf(z.charAt(i))!=-1)
				v = v + z.charAt(i);
			else
				c = c + z.charAt(i);				
		}

		if(c.length()>=3)
			cf = cf + c.substring(0,3);
		if(c.length()==2)
			cf = cf + c.substring(0,2) + v.charAt(0);
		if(c.length()==1)
			cf = cf + c.charAt(0) + v.substring(0,2);
		 
	}
	
	//INPUT DEI DATI DEL NOME
	public void gestNome() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci il nome: ");
		nome = sc.nextLine();
		String e = "+-;.:*' ";
		String z = "";
		for (int i = 0; i<nome.length(); i++) {
			if(e.indexOf(nome.charAt(i))==-1)
				z = z + nome.charAt(i);	
			}
		z = z.toUpperCase();
		
		//VOCALI E CONSONANTI
		String v = "";
		String c = "";
		String voc = "AEIOU";
		for(int i = 0; i<z.length(); i++) {
			if(voc.indexOf(z.charAt(i))!=-1)
				v = v + z.charAt(i);
			else
				c = c + z.charAt(i);				
		}

		if(c.length()>3)
			cf = cf + c.charAt(0) + c.substring(2,4);
		if(c.length()==3)
			cf = cf + c.substring(0,3);
		if(c.length()==2)
			cf = cf + c.substring(0,2) + v.charAt(0);
		if(c.length()==1)
			cf = cf + c.charAt(0) + v.substring(0,2);
	
	}
	
	//INPUT DEI DATI DELLA DATA DI NASCITA
	public void gestData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nINSERIRE LA DATA DI NASCITA\n");
		System.out.print("Inserire il giorno: ");
		giorno = sc.nextInt();
		System.out.print("Inserire il mese: ");
		mese = sc.nextInt();
		System.out.print("Inserire l'anno: ");
		anno = sc.nextInt();
		sc.nextLine(); //svuota il buffer
		System.out.print("Inserire il sesso: ");
		sex = sc.nextLine().charAt(0);
		String g = "";
		if(sex=='f') //qua da errore perché non è svuotato il buffer
			g = "" + (giorno + 40);
		if(sex=='m' && giorno<10)
			g = "0" + giorno;
		else
			g = "" + giorno;
		String m = "ABCDEHLMPRST";
		String a = "" + anno; //Trasfroma un intero in una stringa
		cf = cf + a.substring(2,4) + m.charAt(mese-1) + g;
	}
	
	public void gestCitta() {
		String [][]tab = {
			{"latina","E472"},
			{"roma","H501"},
			{"sezze","I712"},
			{"napoli","F839"},
			{"frosinone","D810"},
		};
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci la città di nascita: ");
		citta = sc.nextLine();
		int j = 0; //indice delle colonne
		for(int i=0; i<tab.length; i++) {
			if(tab[i][j].compareTo(citta)==0)
				cf = cf + tab[i][j+1];
		}
		System.out.println("cf: " + cf);
	}
	
	public void stampaCodice() {
		gestCognome();
		gestNome();
		gestData();
		gestCitta();
	}
	
}













