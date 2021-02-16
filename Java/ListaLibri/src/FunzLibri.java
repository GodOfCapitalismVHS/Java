import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class FunzLibri {
	LinkedList<DatiLibri>Libro;
	
	public FunzLibri() {
		Libro = new LinkedList<DatiLibri>();
	}
	
	public void Input() {
		DatiLibri c = new DatiLibri();
		c.Input();
		Libro.addFirst(c);
	}
	
	
	public void Output() {
		for(int i = 0; i<Libro.size(); i++) {
			Libro.get(i).stampa();
		}
	}
	
	public void AumtPrez() {
		DatiLibri t = new DatiLibri();
		Iterator<DatiLibri> it = Libro.iterator();
		char risp;
		float app;
		float app2;
		String c = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("INSERISCI IL TITOLO DEL LIBRO: ");
		c = sc.nextLine();
		while(it.hasNext()) {
			t = (DatiLibri)it.next();
			if(t.getTitolo().equals(c)) {
				System.out.println("LIBRO: " + c.toString());
				app = t.getPrezzo();
				app2 = app + (t.getPrezzo()/100*10);
				t.setPrezzo(app2);
			}
		}
	}
	
	public void Ricerca() {
	    String ric;
	    for(int i=0;i<Libro.size();i++) {
	            ric=((DatiLibri) Libro.get(i)).getAutore();
	            if(ric.equals("Isaac Asimov")) {
	                System.out.print("TITOLO: ");
	                System.out.println(((DatiLibri) Libro.get(i)).getTitolo());
	            }
	    }
	}
	
	public void ELimFumetto() {
	    String ric;
	    for(int i=0;i<Libro.size();i++) {
	            ric=((DatiLibri) Libro.get(i)).getGenere();
	            if(ric.equals("Fumetto")) {
	            	Libro.remove(i);
	            }
	    }
	}

}
