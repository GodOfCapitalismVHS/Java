import java.util.Scanner;
import java.util.LinkedList;

public class LibriMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedList<FunzLibri> Libri = new LinkedList<FunzLibri>();
		FunzLibri app = new FunzLibri();
		Libri.add(app);

		//Menù
		while(true) {
			int risp;
			System.out.println(
					"\n-----MENU' DI SCELTA-----\n"
					+ "1)Aggiungi libro\n"
					+ "2)Stampa libro\n"
					+ "3)Elimina Fumetto\n"
					+ "4)Ricerca Isaac\n"
					+ "5)Aumenta Prezzo\n"
					+ "6)Esci\n"
					);
			System.out.print("\nInsersici scelta: ");
			risp = sc.nextInt();
			//Switch case con funzioni a seconda del numero inserito
			switch(risp) {
				case 1:
					app.Input();;
					Libri.add(app);
					break;
				case 2:
					app.Output();
					Libri.add(app);
					break;
				case 3: 
					app.ELimFumetto();
					Libri.add(app);
					break;
				case 4: 
					app.Ricerca();
					Libri.add(app);
					break;
				case 5:
					app.AumtPrez();
					Libri.add(app);
					break;
				case 6:
					System.exit(0);
					break;
			}
		}
	}
}
