import java.util.Vector; //import dei comandi per i vettori
import java.util.Iterator; //import dei comandi per l'iteratore
public class VectorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector w = new Vector(); //crea un vector con dimensione iniziale 10
		Vector q = new Vector(8,5); //crea un vector con capacità iniziale 8 e incremento di 5
		Vector v = new Vector(8,2); //inizializzazione vettore, (capacità iniziale, capacità che viene aggiunta se viene superata quella iniziale)
		System.out.println("NUMERO DI ELEMENTI CONTENUTI:\n");
		System.out.println("size: " + v.size()); //stampa la misura del vettore (se è zero significa che il vettore è vuoto)
		System.out.println("capacity: " + v.capacity() + "\n"); //stampa della capacità del vettore
		
		//Carica del vettore con numeri random
		for(int i = 0; i<v.capacity(); i++)
			v.add((Integer)(10*(i+1)));
			
		//Stampa del contenuto del vettore
		System.out.print("Contenuto vettore: ");
		for(int i = 0; i<v.capacity(); i++)
			System.out.print(v.get(i) + " "); //il get stampa l'oggeto nella posizione determinata
		
		//ristampa della misura e della capacità del vettore
		System.out.println("\n\nsize: " + v.size());
		System.out.println("capacity: " + v.capacity());
		
		v.add(2,199); //inserimento di un numero per aumentare la capacità e la misura del vettore 
		
		//Stampa dopo l'aumento del vettore
		System.out.print("\nContenuto vettore: ");
		for(int i = 0; i<v.size(); i++)
			System.out.print(v.get(i) + " ");
		
		//ristampa della misura e della capacità del vettore dopo l'aggiunta dell'elemento extra
		System.out.println("\n\nsize: " + v.size());
		System.out.println("capacity: " + v.capacity());
		
		v.remove(2); //rimozione del contenuto nella posizione inserita
		
		//Stampa dopo l'aumento del vettore
		System.out.print("\nContenuto vettore: ");
		for(int i = 0; i<v.size(); i++)
			System.out.print(v.get(i) + " ");
		
		//ristampa del vettore dopo la rimozione di un valore all'interno
		System.out.println("\n\nsize: " + v.size());
		System.out.println("capacity: " + v.capacity());
		
		v.add(2,true); //nei vettori possiamo inserire anche variabili non per forza tutte dello stesso tipo
		
		//Stampa dopo l'aumento del vettore
		System.out.print("\nContenuto vettore: ");
		for(int i = 0; i<v.size(); i++)
			System.out.print(v.get(i) + " ");
				
		//ristampa del vettore dopo l'inserimento di un valore all'interno di tipo boolean
		System.out.println("\n\nsize: " + v.size());
		System.out.println("capacity: " + v.capacity());
		
		v.set(2, "ciao"); //cosi abbiamo cambiato l'elemento in posizione 2 da "True" a una stringa "ciao"
		
		//Stampa dopo l'aumento del vettore
		System.out.print("\nContenuto vettore: ");
		for(int i = 0; i<v.size(); i++)
			System.out.print(v.get(i) + " ");
				
		//ristampa del vettore dopo aver cambiato il valore all'interno della posizione numero 2
		System.out.println("\n\nsize: " + v.size());
		System.out.println("capacity: " + v.capacity());
		
		v.add(1, "peppe"); //inseriemento di una stringa in posizione uno (facendo slittare il vettore)
		v.add(1,"pippo");
		
		//Stampa dopo l'inserimento di altre stringe del vettore
		System.out.print("\nContenuto vettore (solo stringe): ");
		for(int i = 0; i<v.size(); i++)
			if(v.get(i) instanceof String) //instanceof controlla se un oggetto è una istanza di una determinata classe
				System.out.print(v.get(i) + " "); //stampa solo le stringhe
				
		//ristampa del vettore dopo l'inserimento delle stringhe
		System.out.println("\n\nsize: " + v.size());
		System.out.println("capacity: " + v.capacity());
		
		//Stampa dopo l'aumento del vettore
		System.out.print("\nContenuto vettore (solo interi): ");
		for(int i = 0; i<v.size(); i++)
			if(v.get(i) instanceof Integer) //instanceof controlla se un oggetto è una istanza di una determinata classe
				System.out.print(v.get(i) + " "); //stampa solo gli interi
				
		//ristampa del vettore
		System.out.println("\n\nsize: " + v.size());
		System.out.println("capacity: " + v.capacity());
		
		//Stampa la posizione della variabile dentro il vettore che stiamo cercando
		System.out.println("\n\nPosizione della Stringa 'pippo': " + v.indexOf("pippo"));
		
		//Stampa del primo e dell'ultimo elemento del vettore
		System.out.println("\nPrimo elemento del Vettore': " + v.firstElement());
		System.out.println("Ultimo elemento del Vettore': " + v.lastElement());
		
		Iterator it = v.iterator(); //abbiamo inizializzato l'iteratore usandolo sul vettore
		
		/*
		System.out.print("\n\nStampa del vettore usando l'iteratore: ");
		while(it.hasNext()) { //controlla se c'è qualcosa nella prossima posizione finché non finisce (scansione)
			System.out.print(it.next() + " ");
		}
		*/
		
		System.out.print("\n\nStampa del vettore usando l'iteratore (solo le stringhe): ");
		while(it.hasNext()) { //controlla se c'è qualcosa nella prossima posizione finché non finisce (scansione)
			Object ob = it.next();
			if(ob instanceof String)
			System.out.print(ob + " ");
		}	
		//Vedere classe "MainFraz" per il resto
	}
}
