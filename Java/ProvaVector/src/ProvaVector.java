import java.util.Vector;
import java.util.Iterator;
import java.util.Collections;
public class ProvaVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<String>();
		v.add("Di Toppa");
		v.add("Marfia");
		v.add(0,"Quadrini"); //Mette la stringa in posizione zero
		v.add(2,"Benazzi");
		
		//Stampa Vettore
		int classif = 1;
		for(int i = 0; i<v.size(); i++) {
			System.out.println(classif + "-" + v.get(i) + " ");
			classif++;
		}
		
		System.out.println();
		
		//Mette in ordine "v" grazie al comando "sort" della classe Collections
		Collections.sort(v);
				
		//Creazione dell'iteratore
		Iterator <String> it = v.iterator();
		System.out.println("\nStampa del vettore ordinato:\n");
		
		//Stampa vettore con gli iteratori
		while(it.hasNext())
			System.out.println("-" + it.next() + "  ");
		
		//Stampa del vettore in modo decrescente
		String s = new String();
		for(int i = 0; i<v.size()-1; i++) 
			for(int j = i+1; j<v.size(); j++)
				if(v.get(i).compareTo(v.get(j))<0) {
					s = v.get(i);
					v.set(i, v.get(j));
					v.set(j, s);
				}
		System.out.println("\nStampa del vettore ordinato (al contrario):\n");
		int classif2 = 1;
		for(int i = 0; i<v.size(); i++) {
			System.out.println(classif2 + "-" + v.get(i) + " ");
			classif2++;
		}
		
		//Ricerca all'interno del vettore una determinata variabile
		if(v.contains("Di Toppa"))
			System.out.println("\n\nc'è");
		else
			System.out.println("\n\nnon c'è");
		
		System.out.println("\n\nsize: " + v.size());
		System.out.println("capacity: " + v.capacity());
		
	}

}
