import java.util.Scanner;
public class Punto {

	String num;
	
	public Punto() {
		num = "";
	}
	
	private String Pdec(String a) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci un numero intero: ");
		a = sc.nextLine();
		for(int i = a.length()-1; i>=0; i--) {
			if(i%3==0)
				a = a + ".";
			else
				a = a + a.charAt(i);
		}
		return a;
	}
	
	public void Stampa() {
		System.out.println("Numero sistemato: " + Pdec(num));
	}
}
