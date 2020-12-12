import java.util.Scanner;

public class NumPrimo {
	public static void main(String[] args) {
        int num;
        Scanner sc;
        sc=new Scanner(System.in);
        System.out.println("insercici un numero intero");
        num=sc.nextInt();
        boolean primo=true;
        int i=2;
        while(i<num/2 && primo==true)
        {
        	if(num%i==0)
        		primo=false;
        	else
                i++;
       	}
        if(primo)
        	System.out.println("il numero "+num+" è primo");
        else
        	System.out.println("il numero "+num+" non è primo");
	}
}
