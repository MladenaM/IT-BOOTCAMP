package domaci.nedelja2.trecidomaci;
import java.util.Scanner;


//Napisati funkciju koja ce za prosledjeni String da vrati broj samoglasnika u tom Stringu
//(Koristiti .charAt(index) da pristupite svakom pojedinacnom karakteru iz Stringa).
public class Zadatak1 {

    static int brojSamoglasnika(String a) {

        int brojac = 0;

        for(int i = 0; i < a.length(); i++)
            if ( a.charAt(i) == 'a'|| a.charAt(i) == 'e'|| a.charAt(i) == 'i'|| a.charAt(i) == 'o'|| a.charAt(i) == 'u' )
            {
                brojac += 1;
            }

        return brojac;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite string: ");
        String a = sc.nextLine();
        System.out.println("Broj samoglasnika je: " + brojSamoglasnika(a));

    }


}
