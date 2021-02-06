import java.util.Scanner;
import java.util.Vector;

public class RubricaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//INIZIALIZZAZIONI VARIABILI
		Scanner sc = new Scanner(System.in);
		Vector<Contatti> rubrica = new Vector<Contatti>();
		Contatti app = new Contatti();
		app.InsPassw();
		rubrica.add(app);

		//Menù
		while(true) {
			int risp;
			System.out.println(
					"\n-----MENU' DI SCELTA-----\n"
					+ "1)Aggiungi contatto\n"
					+ "2)Stampa contatto\n"
					+ "3)Elimina contatto\n"
					+ "4)Modifica contatto\n"
					+ "5)Esci\n"
					);
			System.out.print("\nInsersici scelta: ");
			risp = sc.nextInt();
			//Switch case con funzioni a seconda del numero inserito
			switch(risp) {
				case 1:
					app.Ins();
					rubrica.add(app);
					break;
				case 2:
					app.Output();
					rubrica.add(app);
					break;
				case 3: 
					break;
				case 4: 
					break;
				case 5:
					System.exit(0);
					break;
			}
		}
	}

}
