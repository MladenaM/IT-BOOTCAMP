package Vezbanja.pastebin.prvideo;

import java.security.KeyStore;
import java.util.Scanner;

public class Zadatak21 {

    // 21. Korisnik unosi imena cveca sve dok ne unese nisku "stop".
    // Izracunati koliko ukupno korisnik treba da plati cvece koje je izabrao. Cvece koje se mogu kupiti i njihova cena je:
    //    - "Ruza" - 100 din
    //    - "Zumbul" - 200 din
    //    - "Lala" - 300 din

    static void cena(String a) {

        int ukupno = 0;
        int ukupnoRuza = 0;
        int ukupnoLala = 0;
        int ukupnoZumbul = 0;

        String ruza = "ruza";
        String zumbul = "zumbuli";
        String lala = "lala";


        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Izaberite cvece (ruza,lala,zumbuli): ");
            String cvet = sc.next();

            if (cvet.equals(ruza)) {
                //ukupnoRuza = ukupnoRuza + 100;
                System.out.println(ukupnoRuza);
            }
            if (cvet.equals(lala)) {
                //ukupnoLala = ukupnoLala + 200;
                System.out.println(ukupnoLala);
            }
            if (cvet.equals(zumbul)) {
                ukupnoZumbul = ukupnoZumbul + 300;
                //System.out.println(ukupnoZumbul);
            }

            if (cvet.equals("stop")) {

                ukupno = ukupnoLala + ukupnoRuza + ukupnoZumbul;
                System.out.println(ukupno);
                break;
            }
            //ukupno = ukupnoLala + ukupnoRuza + ukupnoZumbul;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite svoje ime: ");
        String a = sc.next();
        cena(a);

    }
}
