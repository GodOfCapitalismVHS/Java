
public class Random {
	public int x;
	
	public Random() {
		x = (int)(Math.random()*50)+1;
	}
	
	public void Stampa() {
		System.out.println(x);
	}
}
