import java.util.Scanner;

public class Cerchio {
	//dichiarazione degli attributi
	private double raggio;
	//private final double piGreco = 3.14;
	
	//definizione dei costruttori 
	public Cerchio() {
		raggio = 0.0;
	}
	
	//costruttore che riceve un parametro
	public Cerchio(double r) {
		raggio = r;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci la misura del raggio");
		raggio = sc.nextDouble();	
	}
	
	public double circo() {
		return 2 * Math.PI * raggio;
	}
	
	public double area() {
		return Math.PI * Math.pow(raggio, 2.0);
	}
	
	public void output() {
		System.out.print("Stampa della circonferenza di raggio: " + raggio + "\n" + circo());
		System.out.print("\n\nStampa dell'area del cerchio: " + area());
	}

	public double getRaggio() {
		return raggio;
	}

	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}
}
