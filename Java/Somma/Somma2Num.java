import java.util.Scanner;

public class Somma2Num {
	public static void main(String[] args) {            
		Scanner sc;
		int a,b,c;
		sc=new Scanner(System.in);
		System.out.println("Inserisci il primo numero");
		a=sc.nextInt();
		System.out.println("Inserisci il secondo numero");
		b=sc.nextInt();
		c=a+b;
		System.out.println("la somma è "+c);
    }
}