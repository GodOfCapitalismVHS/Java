import java.util.Iterator;
import java.util.Vector;
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector <Carta> mazzo = new Vector<Carta>();
		mazzo.add(new Carta('b', 4));
		mazzo.add(new Carta('c', 6));
		mazzo.add(new Carta('d', 10));
		
		for (Iterator iterator = mazzo.iterator(); iterator.hasNext();) {
			Carta carta = (Carta) iterator.next();
			System.out.println(); //da sistemare
			carta.stampa();
		}
		
		mazzo.remove(0); //rimozione carta
		
		for (int i = 0; i < mazzo.size(); i++) {
			System.out.println(); //da sistemare
			System.out.println("Posizione: " + i);
			mazzo.get(i).stampa();
			
		}
	}

}
