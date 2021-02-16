import java.util.Scanner;
public class LavoratoreMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Anagrafica  d = new Anagrafica();
		d.input();
        Stipendio e = new Stipendio();
        StipendioBis c = new StipendioBis();
        c.stampad(d, e);


	}

}
