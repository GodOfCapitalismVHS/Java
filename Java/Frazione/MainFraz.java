import java.util.Scanner;

public class MainFraz {

	public static void main(String[] args) {
		/*
		// TODO Auto-generated method stub
		//inizializzazione di una variabile inserendo una classe senza parametri (da inserire con il comando inut):
		Frazione f=new Frazione(); //facendo il comando new (con il nome della classe) la variabile viene inizializzata prendendo tutte le informazioni da quella classe
		f.input(); //comando della classe frazione
		f.stampa(); //comando della classe frazione
		//inizializzazione di una variabile inserendo una classe con parametri inseriti:
		Frazione f1=new Frazione(2,3); //qua va a richiamare la classe "public Frazione (int n,int d)"
		f1.stampa(); //comando della classe frazione
		
		//somma
		Frazione s= Frazione.somma(f,f1);
		System.out.print("La somma è = ");
		s.stampa();
		
		//differenza
		Frazione d=new Frazione();
		d=Frazione.diff(f, f1);
		System.out.print("La differenza è = ");
		d.stampa();
		
		//prodotto
		Frazione p=new Frazione();
		p=Frazione.prodotto(f, f1);
		System.out.print("Il prodotto è = ");
		p.stampa();
		
		//divisione
		Frazione divi=new Frazione();
		divi=Frazione.div(f, f1);
		System.out.print("La divisione è = ");
		divi.stampa();
		*/
		
		//array con le frazioni e le variabili private rese pubbliche col comando "get"
		Scanner sc=new Scanner(System.in);
		Frazione[]fr=new Frazione[4];
		for(int i=0; i<fr.length; i++) 
		{
			fr[i]=new Frazione();
			fr[i].input();
		}
		/*
		for(int i=0; i<fr.length; i++) 
		{
			System.out.println("numeratore");
			fr[i].setNum(sc.nextInt());
			System.out.println("denominatore");
			fr[i].setDen(sc.nextInt());
		}
		*/
		
		/*
		//somma tra frazioni
		for(int i=0; i<fr.length; i++)
			fr[i].stampa();	
		
		Frazione k=new Frazione();
		
		for(int i=0; i<fr.length; i++) 
		{
			k=k.somma(fr[i]);
		}
		System.out.print("frazione somma = ");
		k.stampa();
		*/
		
		System.out.println("ordinamento di un array di frazione");
		for(int i=0; i<fr.length-1; i++)
			for(int j=i+1; j<fr.length; j++) 
			{
				if(fr[i].valD()<fr[j].valD()) 
				{
					Frazione z=new Frazione();
					z=fr[i];
					fr[i]=fr[j];
					fr[j]=z;
				}
			}
		for(int i=0; i<fr.length; i++)
			fr[i].stampa();
	}
	
}
