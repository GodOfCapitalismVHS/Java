import java.util.Scanner;
public class LavoratoreMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Anagrafica  d = new Anagrafica();
		d.input();
        Stipendio e = new Stipendio();
        e.input();
        System.out.println();
        e.stampa(d);
        
	}

}