import java.util.Scanner;
public class Stipendio extends Anagrafica {
	//Variabili
	public int Stipendio;
	public int livello;
	public String Error;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserire livello dipendente: ");
		livello = sc.nextInt();
		switch (livello) {
		case 1:
			Stipendio = 400;
			System.out.println("Stipendio LVL 1: " + Stipendio + "$");
			break;
		case 2:
			Stipendio = ((400*10)/100)+400;
			System.out.println("Stipendio LVL 2: " + Stipendio + "$");
			break;
		case 3:
			Stipendio = ((400*20)/100)+400;
			System.out.println("Stipendio LVL 3: " + Stipendio + "$");
			break;
		case 4:
			Stipendio = ((400*30)/100)+400;
			System.out.println("Stipendio LVL 4: " + Stipendio + "$");
			break;
		case 5:
			Stipendio = ((400*40)/100)+400;
			System.out.println("Stipendio LVL 5: " + Stipendio + "$");
			break;
		case 6:
			Stipendio = ((400*50)/100)+400;
			System.out.println("Stipendio LVL 6: " + Stipendio + "$");
			break;
		case 7:
			Stipendio = ((400*60)/100)+400;
			System.out.println("Stipendio LVL 6: " + Stipendio + "$");
			break;
		default:
			Error = "Error 404 Stipendio not found";
			System.out.println("Inserimento del Livello errato (deve andare da 1 a 7)");
			break;
		}
	}
	public void stampa(){
		if(Stipendio>0)
		{
			System.out.println("Livello lavoratore: " + livello);
			System.out.println("Stipendio lavoratore: " + Stipendio + "$");
		}
		else
		{
			System.out.println("Stipendio lavoratore: " + Error);
		}
	}
}