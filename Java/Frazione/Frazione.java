import java.util.Scanner;

public class Frazione {
	private int num; //l'attributo "private" non fa vedere dall'esterno la classe
	private int den;
	
	//definizione dei costruttori (è un metodo che inizializza gli attributi di una classe e viene richiamato dal main ogni volta che deve definire un oggetto)
	//costruttore di default:
	public Frazione() {
		num=0;
		den=1;
	}
	
	public Frazione (int n) {
		num=n;
		den=1;
	}
	
	public Frazione (int n,int d) {
		this.num=n; //il comando "this.*nome variabile*" punta sempre alla classe in cui è contenuto non confondendo variabili con nomi uguali (si può mettere anche se i nomi delle variabili non sono uguali)
		this.den=d;
	}
	
	//classe void che non fa tornare indietro nulla
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("inserisci un valore per il numeratore");
		num=sc.nextInt();
		do 
		{
			System.out.println("inserisci un valore per il denominatore");
			den=sc.nextInt();
		}while(den==0);
	}
	
	public void stampa() {
		riduci();
		if (den==1) 
			System.out.println(num);
		else if(den<0) 
		{
			den=-1*den;
			System.out.println("-"+num+"/"+den);
		}		
		else
			System.out.println(num+"/"+den+" ");
	}
	
	//classe privata che non viene vista dagli esterni
	private int mcd(int a,int b) {
		int r=1;
		while(r!=0) 
		{
			r=a%b;
			a=b;
			b=r;
			
		}return a;		
	}
	
	public int getNum() { //richiama variabili private
		return num;
	}

	public void setNum(int num) { //richiama variabili private
		this.num = num;
	}

	public int getDen() { //richiama variabili private
		return den;
	}

	public void setDen(int den) { //richiama variabili private
		this.den = den;
	}

	private void riduci() {
		int z=mcd(num,den);
		num=num/z;
		den=den/z;
	}
	/*
	public Frazione somma(Frazione g) {
		Frazione h=new Frazione();
		h.num=this.num*g.den+g.num*this.den; //il comando "g." chiama la seconda variabile con quel nome
		h.den=this.den*g.den;
		h.riduci();
		return h;
	}
	*/
	public Frazione somma (Frazione g) {
		Frazione h=new Frazione();
		h.num=this.num*g.den+g.num*this.den;
		h.den=this.den*g.den;
		h.riduci();
		return h;
	}
	
	public static Frazione diff (Frazione a, Frazione b) {
		Frazione c=new Frazione();
		c.num=a.num*b.den-a.den*b.num;
		c.den=a.den*b.den;
		c.riduci();
		return c;
	}
	
	public static Frazione prodotto (Frazione a, Frazione b) {
		Frazione c=new Frazione();
		c.num=a.num*b.num;
		c.den=a.den*b.den;
		c.riduci();
		return c;
	}
	public static Frazione div (Frazione a, Frazione b) {
		Frazione c=new Frazione();
		c.num=a.num*b.den;
		c.den=a.den*b.num;
		c.riduci();
		return c;
	}
	
	public double valD() {
		return (double)this.num/this.den;
	}
}




