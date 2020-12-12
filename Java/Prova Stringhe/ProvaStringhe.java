import java.util.Scanner;
public class ProvaStringhe {
//le stringhe in java sono oggetti immutabili
	public static void main(String[] args) {
		
		String s,t; //definizione di una stringa
		s = "pippo"; //dichiaro una stringa vuota
		t = new String("angelo lo sa ha solo legna"); //dichiaro una stringa vuota

		//stampa e misura della stringa
		System.out.println("STAMPA E MISURA DELLA STRINGA: ");
		System.out.println("s: " + s + "\t t: " + t);
		System.out.println("La lunghezza di s è: " + s.length());
		System.out.println("L'ultimo carattere di s è: " + s.charAt(s.length()-1));//pesca il carattere in posizione in base all'indice, si può fare anche s.charAt(4) per prendere il quarto carattere
		System.out.println("\n");
		
		//i metodi toLower e toUpper agiscono su tutta la stringa e non sui singoli caratteri
		System.out.println("METODI toLower E toUpper: ");
		System.out.println("Stringa s in maiuscolo: " + s.toUpperCase());//mette la stringa in maiuscolo
		System.out.println("Stringa s in minuscolo: " + s.toLowerCase());//mette la stringa in minuscolo
		System.out.println("\n");
		
		//metodi di ricerca
		System.out.println("RICERCHE NELLE STRINGHE: "); //se esce -1 è perché non ha trovato il carattere o la parte dela stringa desiderato
		System.out.println("Indice dell'ultima comparsa di p: " + s.lastIndexOf('p')); //dove compare l'ultima volta il carattere nella stringa
		System.out.println("Indice della prima occorenza di pp: " + s.indexOf("pp")); //dove compare la prima volta la stringa nella stringa
		System.out.println("Indice della prima occorenza di a: " + s.indexOf('a',5)); //dove compare la prima volta la stringa nella stringa, però partendo da un punto specifico
		System.out.println("\n");
		
		//concatenazioni
		System.out.println("CONCATENAZIONI: ");
		System.out.println("Concatenazione di s con 'ne' : " + s.concat("ne")); //concatena una stringa
		System.out.println("\n");
		
		//controlli
		System.out.println("CONTROLLI CON CICLI FOR: ");
		System.out.print("Codice di Cesare(muove di tre posizioni ogni lettera): ");
		for(int i = 0; i<s.length(); i++) 
		{
			System.out.print((char)(s.charAt(i)+3));
		}
		System.out.println("\n");
		
		//modifiche della stringa
		System.out.println("MODIFICHE DELLA STRINGA: ");
		String T = new String("peppe");
		T = s.replace('p','m'); //rimpiazza le lettere della stringa con altre decise da noi
		System.out.println("Stringa modificata T: " + T);
		System.out.println("Stringa modificata (solo nel System.out) s: " + s.replace('p','c')); //in questo caso la stringa viene modificato solo nel sistem.out ma al di fuori rimane invariata
		
		if(T.startsWith("mi")==true)//startWith (sarebbe: inizia con("....s"))
			System.out.println("La stringa T inizia con 'mi'");
		else
			System.out.println("La stringa T non inizia con 'mi'");
		
		if(s.startsWith("pi")==true)//startWith (sarebbe: inizia con("....s"))
			System.out.println("La stringa s inizia con 'pi'");
		else
			System.out.println("La stringa s non inizia con 'pi'");
		
		if(T.endsWith("mmo")==true)//endstWith (sarebbe: finisce con("....s"))
			System.out.println("La stringa T finisce con 'mmo'");
		else
			System.out.println("La stringa T non finisce con 'mmo'");
		System.out.println("\n");
		
		//confronto tra stringhe
		System.out.println("CONFRONTO TRA STRINGHE: "); //le stringhe in java si confrontano non con "==" ma col comando "equals"
		if(s.equals(T)) //serve per vedere se sono uguali le stringhe
			System.out.println("La stringa T è uguale alla stringa s");
		else
			System.out.println("La stringa T non è uguale alla stringa s");
		
		if(s.compareToIgnoreCase(T)>0) //il compareToIgnoreCase confronta due stringhe però ignorando maiuscole e minuscole
			System.out.println("La stringa: " + s + " è maggiore della stringa: " + T);
		else
			System.out.println("La stringa: " + s + " è non maggiore della stringa: " + T);
		
		if(s.compareToIgnoreCase(T)<0) ////compare restituisce un intero nel caso la condizioni sono rispettate, se no restituisce -1
			System.out.println("La stringa: " + s + " è minore della stringa: " + T);
		else
			System.out.println("La stringa: " + s + " è non minore della stringa: " + T);
		System.out.println("\n");
		
		//comando substring
		System.out.println("COMANDO SUBSTRING: ");
		String c = s.substring(3); // in questo caso prende la stringa dal carattere 3 in poi
		String f = s.substring(1,3); // in questo caso prende la stringa dal carattere 1 al carattere 3
		System.out.println("La stringa c è: " + c);
		System.out.println("La stringa f è: " + f);
		
		//Maiuscolo diversi CaRaTtErI
		System.out.println("Maiuscole su diversi punti della stringa: " + s.substring(0,1).toUpperCase()+s.substring(1,s.length()/2-1)+s.substring(s.length()/2-1,s.length()/2+1).toUpperCase()+ s.substring(s.length()/2+1,s.length()-1)+s.substring(s.length()-1,s.length()) .toUpperCase()); // il metodo substring estrae la sotto stringa a seconda dei parametri (0,1) solo quei caratteri (1) da quel carattere in poi
		System.out.println("\n");


		//Controllo vocali e consonanti
		System.out.println("CONTROLLI SULLE STRINGHE: ");
		String v = "+-;.:*' ";
		String p = "aeiouAEIOU";
		int n = 0;
		int k = 0;
		for(int i = 0; i<t.length(); i++) {
			if(p.indexOf(t.charAt(i))!=-1)
				n++;
			else if(p.indexOf(t.charAt(i))==-1)
				k++;
		}
		System.out.println("La Stringa " + "'" + t + "'" + " ha: " + n + " vocali"); 
		System.out.println("La Stringa " + "'" + t + "'" + " ha: " + k + " consonanti"); 
		// System.out.println("La Stringa " + "'" + t + "'" + " ha: " + n + " segni di punteggiatura"); //non funziona
		
		String z = "";
		for (int i = 0; i<t.length(); i++) {
			if(v.indexOf(t.charAt(i))==-1)
				z = z + t.charAt(i);	
			}
		System.out.println("La Stringa è stata bonificata: " + z); 
		
		//capovolge la stringa
		String x = "";
		for (int i = 0; i<z.length(); i++)
			x = z.charAt(i) + x;
		System.out.println("x: " + x);
		
		//palindroma
		if(z.equals(x))
			System.out.println("La Stringa è palindroma");
		else
			System.out.println("La Stringa non è palindroma");
	}

}


//equals restituisce un boolean
//compare restituisce un intero
