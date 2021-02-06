//Importazione della classi contenute in Util
import java.util.*;

public class Contatti {
	Scanner sc = new Scanner(System.in);
	Vector<Dati> contatto = new Vector<Dati>();
	Dati pa = new Dati();
	
	public void Ins() {
		Dati app = new Dati();
		app.Input();
		contatto.add(app);
	}
	
	//Stampa dei dati
	public void Output() {
		String passwSTAND = new String();
		System.out.println("size:" + contatto.size());
		System.out.print("Inserisci password: ");
		passwSTAND = sc.nextLine();
		
		//Controllo passw
		if(passwSTAND.equals(pa.getPassw())) {
			System.out.print("Contenuto vettore: ");
			for(int i = 0; i<contatto.size(); i++) {
				contatto.get(i).stampa();
			}
		}
		else {
			System.out.println("\n!!!PASSWORD ERRATA!!!\n");
		}
	}
	
	//Inserisci password
	public void InsPassw() {
		pa.passw();
		contatto.add(pa);
	}
	
}



