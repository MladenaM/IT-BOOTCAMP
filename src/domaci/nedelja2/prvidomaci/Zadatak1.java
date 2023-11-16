package domaci.nedelja2.prvidomaci;
import java.util.Scanner;

public class Zadatak1 {

    //Napraviti program gde cete uneti neki broj ponavljanja i tekst koji ce se toliko puta ispisati.

    public static void main(String[] args) {

        System.out.println("Uneti koliko puta zelite da se tekst ispise (unosi se ceo pozitivan broj) : ");
        Scanner sc = new Scanner(System.in);
        int brojPonavljanja = sc.nextInt();
        System.out.print("Unesite neki tekst: ");
        String nekiTekst = sc.next();

            while (brojPonavljanja > 0) {
                System.out.println(nekiTekst);
                brojPonavljanja--;
            }

    }
}
