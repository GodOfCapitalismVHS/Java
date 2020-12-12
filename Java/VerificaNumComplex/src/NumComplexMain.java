
public class NumComplexMain {

	public static void main(String[] args) {
		
		//Variabili
		NumComplex a,b;
		
		//Inizializzazione variabili
		a = new NumComplex();
		b = new NumComplex();
		
		//Inserimento dei dati
		System.out.println("PRIMO NUMERO COMPLESSO\n");
		a.input();
		System.out.println("\nSECONDO NUMERO COMPLESSO\n");
		b.input();
		
		//Stampa dei Moduli
		System.out.println("\nMODULO DELLA PRIMO NUMERO COMPLESSO");
		a.modulo();
		System.out.println("\nMODULO DEL SECONDO NUMERO COMPLESSO");
		b.modulo();
		
		//Stampa della Somma
		System.out.println("\nSOMMA");
		NumComplex.somma(a, b);
		
		//Stampa della Differenza
		System.out.println("\nDIFFERENZA");
		NumComplex.differenza(a, b);
		
		//Stampa del Prodotto
		System.out.println("\nPRODOTTO");
		NumComplex.prodotto(a, b);
		
		//Stampa del Reciproco
		System.out.println("\nRECIPROCO DEL PRIMO NUMERO COMPLESSO");
		a.reciproco();
		System.out.println("\nRECIPROCO DEL SECONDO NUMERO COMPLESSO");
		b.reciproco();
	}

}
