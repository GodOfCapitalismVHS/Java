import java.util.Scanner;
public class ProvaStringhe {
//le stringhe in java sono oggetti immutabili
	public static void main(String[] args) {
		
		String s,t; //definizione di una stringa
		s = "pippoa"; //dichiaro una stringa vuota
		t = new String("pippo"); //dichiaro una stringa vuota
		
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
		System.out.println("RICERCHE NELLE STRINGHE: ");
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
	}
}
