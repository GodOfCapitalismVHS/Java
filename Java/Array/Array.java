

public class Array {
	public static void main(String[] args) {
		//int v[]; //dichiarazione di un array
		//v=new int[10]; //allocazione dello spazio in memoria
		int z[]=new int[10]; //dichiarazione di un array
		z[5]=9;
		//z[z.length-1]=15;
		for(int i=0;i<z.length;i++)
			z[i]=(int)(Math.random()*100)+1;
		for(int i=0;i<z.length;i++)
			System.out.println(z[i]+" ");
	}
}