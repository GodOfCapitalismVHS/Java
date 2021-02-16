public class StipendioBis extends Stipendio {
	
	public void stampad(Anagrafica d, Stipendio b) {
		b.input();
		System.out.println();
		b.stampa();
		b.Stipendio = b.Stipendio + 1000;
		if(b.livello>=5 && b.livello<8) 
		{
			System.out.println("Stipendio con Bonus: " + b.Stipendio + "$");
			System.out.println();
			d.stampaDati();
		}
		else
		{
			System.out.println();
			d.stampaDati();
		}
	}
}