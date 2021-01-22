
public class Carta {
//attributi
	protected char seme;
	protected int numero;
//metodi	
	public Carta(char seme, int numero) {
		this.seme = seme;
		this.numero = numero;
	}
	public char getSeme() {
		return seme;
	}
	public int getNumero() {
		return numero;
	}
	public void stampa()
	{
		System.out.print(numero + " ");
		switch (seme) {
		case 's':
			System.out.print("di spade");
			break;
		case 'c':
			System.out.print("di coppe");
			break;
		case 'd':
			System.out.print("di denara");
			break;
		case 'b':
			System.out.print("di bastoni");
			break;

		default:
			break;
		}
	}
	
}
