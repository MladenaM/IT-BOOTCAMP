package domaci.nedelja2.prvidomaci;
import java.util.Scanner;

public class Zadatak3 {
    //Napraviti program gde cete unositi neki tekst sve dok se ne unese tacka("."), cim se unese
    //tacka program se zavrsava i vraca prethodno unete tekstove.

    public static void main(String[] args) {

        System.out.println("Unesite tekst sve dok se ne unese tacka (.) :  ");
        Scanner sc = new Scanner(System.in);
        String tacka = ".";
        String sviTekstovi = "";

        while(true)
        {
            String nekiTekst = sc.next();
                if (nekiTekst.equals(tacka))
                {
                    break;
                }

            sviTekstovi += nekiTekst + " ";

        }

        System.out.println(sviTekstovi);


    }
}
