import java.util.Scanner;

public class Stringhe {
    private  String x =new String();
    private String y =new String();

    public Stringhe() {
        x="0.";
        y="";
    }

    public void input() {
        Scanner sc=new Scanner(System.in);
        String ci="0123456789";
        boolean controllo=false;
        do {
        System.out.println("Inserisci un numero frazionario");
        System.out.print(x);
        y=sc.nextLine();
        for(int i=0;i<y.length();i++) {
            if((y.substring(i,i+1)).equals(ci)==true)
                controllo=true;

        }
        if(controllo!=false) {
            System.out.println("Errore di inserimento");
            y="";
        }
    }while(controllo!=false);

}
    public void stampa() {
        System.out.println("Numero Frazionario: "+x+y);
        System.out.println("\n");
    }

    public void controll() {
        int a;
        Scanner sc=new Scanner(System.in);
        int v;
        System.out.println("Inserire la lunghezza del valore");
        v=sc.nextInt();
        if(y.length()+1>v)
            y=y.substring(0,v);
        else {
            a=v-y.length();
            for(int i=0;i<a;i++)
                y = y + 0;
        }

    }

    public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

	public static void somma(String a, String b) {
            int c = Integer.parseInt(a);
            int d = Integer.parseInt(b);
            int somma = c + d;
            String sommafinita=new String();
            sommafinita=sommafinita+somma;
            System.out.println("la somma è 0."+sommafinita);
        }

}