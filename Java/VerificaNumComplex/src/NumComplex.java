import java.util.Scanner; 
public class NumComplex {
	private  int a;
	private  int b;
	
	//inizializzazione variabili
	public NumComplex() {
		a = 0;
		b = 0;
	}
	
	//Input variabili
	 public void input() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Inserire la parte reale: ");
		 a = sc.nextInt();
		 System.out.print("Inserire la parte immaginaria: ");
		 b = sc.nextInt();
	 }
	 
	//Stampa risultati
	 public void stampa() {
		 System.out.println( a + "+" + b + "i");
	 }
	 
	//Modulo
	 public void modulo() {
		 int m;
		 m = (a*a) + (b*b);
		 System.out.println("il modulo è: " + m);
	 }
	 
	//Somma
	 public static void somma(NumComplex f, NumComplex e) {
		 NumComplex c = new NumComplex();
		 c.a = f.a + e.a;
		 c.b = f.b + e.b;
		 c.stampa();
	 }
	 
	//Differenza
	 public static void differenza(NumComplex h, NumComplex i) {
		 NumComplex l = new NumComplex();
		 l.a = h.a - i.a;
		 l.b = h.b - i.b;
		 l.stampa();
	 }
	 
	//Prodotto
	 public static void prodotto(NumComplex n, NumComplex p) {
		 NumComplex x = new NumComplex();
		 x.a = (n.a*p.a) + (n.b*p.b)*(- 1);
		 x.b = n.b*p.a + n.a*p.b;
		 x.stampa();
	 }
	 
	 //Reciproco
	 public void reciproco() {
		 System.out.println("("+a+" - "+b+"i ) /  ("+a+"^2 "+b+"^2 )");
	 }
}


