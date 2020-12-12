
public class StringheMain {

    public static void main(String[] args) {
        Stringhe a=new Stringhe();
        Stringhe b=new Stringhe();
        String c=new String();
        String d=new String();
        
        System.out.println("INSERIMENTO PRIMO NUMERO\n");
        a.input();
        a.stampa();
        a.controll();
        a.stampa();
        System.out.println("\n");
        
        System.out.println("INSERIMENTO SECONDO NUMERO\n");
        b.input();
        b.stampa();
        b.controll();
        b.stampa();
        c=a.getY();
        d=b.getY();
        System.out.println("STAMPA SOMMA");
        Stringhe.somma(c,d);
    }

}