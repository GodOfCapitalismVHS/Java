import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;

public class ListCont {
	LinkedList<Contatto>ll;
	
	public ListCont() {
		ll = new LinkedList<Contatto>();
	}
	
	public void inTesta() {
		Contatto c = new Contatto();
		c.inserisci();
		ll.addFirst(c);
	}
	
	public void inMezzo() {
		Contatto c = new Contatto();
		c.inserisci();
		int pos; 
		Scanner sc = new Scanner(System.in);
		System.out.println("in che posizione vuoi inserire ?");
		pos = sc.nextInt();
		ll.add(pos, c);
	}
	
	public void inCoda() {
		Contatto c = new Contatto();
		c.inserisci();
		ll.addLast(c);
	}
	
	public void elimina() {
		char risp;
		String c = "";
		System.out.println("inserisci il conogme da eliminare");
		Scanner sc = new Scanner(System.in);
		c = sc.nextLine();
		Contatto t = new Contatto();
		Iterator<Contatto> it = ll.iterator();
		while(it.hasNext()) {
			t = (Contatto)it.next();
			if(t.getCognome().equals(c)) {
				System.out.println(c.toString());
				System.out.println("Sei sicuro di voler cancellare questo contatto?");
				risp = sc.nextLine().charAt(0);
				if(risp=='s') {
					ll.remove();
					break;
				}
			}
			
		}
	}
	
	public void stampa() {
		System.out.println("Stampa");
		for(int i = 0; i<ll.size(); i++) {
			System.out.println(ll.get(i).getCognome());
			System.out.println(ll.get(i).getNumero());
			System.out.println(ll.get(i).getMail());
		}
	}
}





















