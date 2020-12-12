import java.util.Scanner;
public class RipassoMain {
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String t = "";
			String s = ""; //Stringa vuota
			String ss = new String(); //Anche questa è una stringa vuota
			System.out.print("Insersci una stringa s: ");
			s = sc.nextLine(); //non si può usare solo nextn senza "line"
			System.out.print("Insersci una stringa t: ");
			t = sc.nextLine(); 
			/*
			System.out.print("Stringa inserita: " + s);
			System.out.println("");
			*/
			
			/*
			//Codice di cesare
			for(int i = 0; i<s.length(); i++) {
				System.out.print((char)( s.charAt(i)+3));
			}
			System.out.println("");
			
			System.out.println(s.indexOf('p'));
			System.out.println(s.lastIndexOf('p'));
			System.out.println(s.replaceAll("pp", "mm")); //riampazza i caratteri
			
			//elimina caratteri
			for(int i = 0; i<s.length(); i++)
				if(s.charAt(i)!='p')
					ss = ss + s.charAt(i);
			System.out.println(ss);
			 
			//elimina vocali
			String v = "aeiouAEIOU";
			for(int i = 0; i<s.length(); i++)
				if(v.indexOf(s.charAt(i))==-1)
					ss = ss + s.charAt(i);
			System.out.println(ss);
			*/
			//controlli
			if(s.equalsIgnoreCase(t)) //saranno uguali solo se sono nella stessa zona di memoria nel caso si faccia (s == t) ma con il comando equals controllano il contenuto
				System.out.println("Sono uguali");
			else
				System.out.println("Non sono uguali");
			
			if(s.compareToIgnoreCase(t) < 0) //saranno uguali solo se sono nella stessa zona di memoria nel caso si faccia (s == t) ma con il comando equals controllano il contenuto
				System.out.println("s > t");
			else
				System.out.println("s < t");
			
			System.out.print(s.substring(6,9));
		}
}







