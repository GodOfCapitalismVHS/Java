public class ClassVerifica {
	public String s="sotto la panca la capra campa";
	public String t="la scuola mi piace molto";

	public static void Vocali(String s) {
		String p = "aeiouAEIOU";
		int n = 0;
		for(int i = 0; i<s.length(); i++) {
			if(p.indexOf(s.charAt(i))!=-1)
				n++;
		}
		System.out.println("La Stringa " + "'" + s + "'" + " ha: " + n + " vocali");
	}
	
	public static void Bonifica(String s) {
		String v = " ";
		String z = "";
		for (int i = 0; i<s.length(); i++) {
			if(v.indexOf(s.charAt(i))==-1)
				z = z + s.charAt(i);	
			}
		System.out.println("La Stringa è stata bonificata: " + z); 
	}
	
}
	
