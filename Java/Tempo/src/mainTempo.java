
public class mainTempo {

	public static void main(String[] args) {
		Tempo t,p; //dichiarazione di due oggetti di classe Tempo
		t = new Tempo(5,33,44);
		p = new Tempo();
		t.stampa();
		System.out.println("\n");
		p.input();
		p.stampa();
		Tempo x = t.somma(p);
		System.out.println("\n somma di due tempi");
		x.stampa();
		Tempo d = t.diff(p);
		System.out.println("\n differenza di due tempi");
		d.stampa();
	}
}
