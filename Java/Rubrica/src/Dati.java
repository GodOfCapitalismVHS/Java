import java.util.Scanner;
public class Dati {
	public Scanner sc = new Scanner(System.in);
	private String nome;
	private String cognome;
	private String num;
	private String surname;
	private String secoNome;
	private String passw;
	private String prefiss;
	private char sex;
	
	
	//METODI GET AND SETTER
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPassw() {
		return passw;
	}
	public String getPrefiss() {
		return prefiss;
	}
	public void setPrefiss(String prefiss) {
		this.prefiss = prefiss;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getSecoNome() {
		return secoNome;
	}
	public void setSecoNome(String secoNome) {
		this.secoNome = secoNome;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	public void passw() {
		System.out.print("Inserisci la password utente per questa giornata: ");
		passw = sc.nextLine();
		System.out.println("PASSWORD SALVATA");
	}
	
	public void stampa() {
		System.out.println("\n\n--------------------------------\n");
		System.out.println("\n---CONTANTATTI SALVATO---\n");
		System.out.print("NOME: " + nome + "\n");
		System.out.print("COGNOME: " + cognome + "\n");
		System.out.print("NUMERO: " + prefiss + num + "\n");
		System.out.println("\n---DATI AGGIUNTIVI---\n");
		System.out.print("SOPRANNOME: " + surname + "\n");
		System.out.print("SECONDO NOME: " + secoNome + "\n");
		System.out.println("\n--------------------------------\n\n");
	}
	
	//Inserimento dei dati
		public void Input() {
			Dati app = new Dati();
			System.out.println("\n---INSERISCI I CONTATTI---\n");
			
			//Nome
			System.out.print("NOME: ");
			app.nome = sc.nextLine();
			
			//Cognome
			System.out.print("COGNOME: ");
			app.cognome = sc.nextLine();
			
			//Numero
			System.out.print("NUMERO: ");
			app.num = sc.nextLine();
			
			//Prefisso
			System.out.print("\n---INSERIMENTO PREFISSO---\n");
			System.out.print("PREFISSO TELEFONICO: ");
			app.prefiss = sc.nextLine();
			
			//Extra
			char risp;
			System.out.print("Vuoi inserire dati extra? (s/n): ");
			risp = sc.nextLine().charAt(0);
			if(risp == 's') {
				System.out.print("\n---INSERIMENTO DATI EXTRA---\n");	
				System.out.print("SOPRANNOME: ");
				app.surname = sc.nextLine();
				System.out.print("SECONDO NOME: ");
				app.secoNome = sc.nextLine();
			}
		}
}
