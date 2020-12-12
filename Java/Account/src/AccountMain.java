
public class AccountMain {

	public static void main(String[] args) {
		//Inizializzazione variabili
		Account pippo = new Account();
		Account peppe = new Account();
		Account mimmo = new Account();
		int costoAbbTot = 0;
		
		//Svolgimento del programma con stampa dei risultati
		pippo.input();
		pippo.StampaDatiInser();
		System.out.println("\nCosto dell'Abbonamento: " + pippo.costoTot());
		
		peppe.input();
		peppe.StampaDatiInser();
		System.out.println("\nCosto dell'Abbonamento: " + peppe.costoTot());
		
		mimmo.input();
		mimmo.StampaDatiInser();
		System.out.println("\nCosto dell'Abbonamento: " + mimmo.costoTot());
		
		//Stampa della somma dei risultati totali
		costoAbbTot = pippo.costoTot()+peppe.costoTot()+mimmo.costoTot();
		System.out.println("\nCosto di tutti gli abbonamenti: " + costoAbbTot);
	}
}
