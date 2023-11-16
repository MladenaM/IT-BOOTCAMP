package Vezbanja.strahinjinizadaci;
import java.util.Scanner;

public class Zadatak2 {

    //2.Crveni kamion sive boje
    //Mirko treba da preveze odredjenu robu iz Beograda u neki drugi grad. Napisati program koji
    //preracunava koliko ce kostati takav put, uzimajuci u obzir koji kamion Mirko izabere,
    //koju robu prenosi i do kog grada ide:
    //
    //-Crveni kamion trosi 7L/100km
    //-Sivi kamion trosi 5L/100km
    //a)Jedan litar goriva kosta 123.25 dinara.
    //b)Korisnik unosi koliko litar goriva kosta.
    //
    //-Jabuke su teske 120kg
    //-Banane su teske 150kg
    //-Mandarine su teske 75kg
    //Svaki kilogram dodaje 0.01L/100km potrosnje
    //
    //-Novi Sad je udaljen 100km od Beograda
    //-Nis je udaljen 333km od Beograda
    //-Subotica je udaljena 220km od Beograda
    //
    //Korisnik unosi 3 niske. Nisku "Crveni" ili "Sivi", zatim Nisku "Jabuke", "Banane" ili
    //"Mandarine" a na kraju i Nisku "Novi Sad", "Nis", ili "Subotica".
    //Ukoliko radite varijantu
    // b) onda nakon toga korisnik unosi i jedan double broj.
    //Ispisati koliko dinara ce kostati put.
    //Pretpostaviti da je unos uvek validan

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite boju kamiona ( imate izbor da unesete sivi ili crveni): ");
        String bojaKamiona = sc.nextLine();
        String kamion1 = "sivi";
        String kamion2 = "crveni";

        //String voce1 = "jabuke";
        //String voce2 = "banane";
        //String voce3 = "mandarine";

        System.out.println("Unesite grad u koji se prenosi roba ( imate izbor da unesete novi sad, nis ili subotica): ");
        String grad = sc.nextLine();
        String grad1 = "novi sad";
        String grad2 = "nis";
        String grad3 = "subotica";

        double cenaPuta = 0;

        if (bojaKamiona.equals(kamion1)) //-Sivi kamion trosi 5L/100km a)Jedan litar goriva kosta 123.25 dinara.
        {
            if (grad.equals(grad1)) //-Novi Sad je udaljen 100km od Beograda
            {
                System.out.println("Unesite voce koje prenosi ( imate izbor da unesete jabuke, banane ili mandarine): ");
                String voce = sc.nextLine();

                switch (voce)
                {
                    case "jabuke": //-Jabuke su teske 120kg
                        cenaPuta = 5 * 123.25 + (120 * 0.01) * 123.25;
                        System.out.println("Put ce kostati: " + cenaPuta + " rsd.");
                        break;
                    case "banane": //-Banane su teske 150kg
                        cenaPuta = 5 * 123.25 + (150 * 0.01) * 123.25;
                        System.out.println("Put ce kostati: " + cenaPuta + " rsd.");
                        break;
                    case "mandarine": //-Mandarine su teske 75kg
                        cenaPuta = 5 * 123.25 + (75 * 0.01) * 123.25;
                        System.out.println("Put ce kostati: " + cenaPuta + " rsd.");
                        break;
                }
            } else if (grad.equals(grad2)) { //-Sivi kamion trosi 5L/100km //-Nis je udaljen 333km od Beograda a)Jedan litar goriva kosta 123.25 dinara.
                System.out.println("Unesite voce koje prenosi ( imate izbor da unesete jabuke, banane ili mandarine): ");
                String voce = sc.nextLine();

                switch (voce) //Svaki kilogram dodaje 0.01L/100km potrosnje //Ispisati koliko dinara ce kostati put.//Svaki kilogram dodaje 0.01L/100km potrosnje
                {
                    case "jabuke": //-Jabuke su teske 120kg
                        cenaPuta = (5 * 123.25) * 3 + 0.33 * 123.25 + 120 * (0.03 * 123.25 + 0.003 * 123.5);
                        System.out.println("Put ce kostati: " + cenaPuta + " rsd.");
                        break;
                    case "banane": //-Banane su teske 150kg
                        cenaPuta = (5 * 123.25) * 3  + 0.33 * 123.25 + 150 * (0.03 * 123.25 + 0.003 * 123.5);
                        System.out.println("Put ce kostati: " + cenaPuta + " rsd.");
                        break;
                    case "mandarine": //-Mandarine su teske 75kg
                        cenaPuta = (5 * 123.25) * 3  + 0.33 * 123.25 + 75 * (0.03 * 123.25 + 0.003 * 123.5);
                        System.out.println("Put ce kostati: " + cenaPuta + " rsd.");
                        break;
                }
            } else if (grad.equals(grad3)) { //Subotica je udaljena 220km od Beograda //-Sivi kamion trosi 5L/100km a)Jedan litar goriva kosta 123.25 dinara.
                System.out.println("Unesite voce koje prenosi ( imate izbor da unesete jabuke, banane ili mandarine): ");
                String voce = sc.nextLine();

                switch (voce) //Svaki kilogram dodaje 0.01L/100km potrosnje //Ispisati koliko dinara ce kostati put.//Svaki kilogram dodaje 0.01L/100km potrosnje
                {
                    case "jabuke": //-Jabuke su teske 120kg
                        cenaPuta = (5 * 123.25) * 2 + 0.20 * 123.25 + 120 * (0.02 * 123.25 + 0.002 * 123.5);
                        System.out.println("Put ce kostati: " + cenaPuta + " rsd.");
                        break;
                    case "banane": //-Banane su teske 150kg
                        cenaPuta = (5 * 123.25) * 2  + 0.20 * 123.25 + 150 * (0.02 * 123.25 + 0.002 * 123.5);
                        System.out.println("Put ce kostati: " + cenaPuta + " rsd.");
                        break;
                    case "mandarine": //-Mandarine su teske 75kg
                        cenaPuta = (5 * 123.25) * 2  + 0.20 * 123.25 + 75 * (0.02 * 123.25 + 0.002 * 123.5);
                        System.out.println("Put ce kostati: " + cenaPuta + " rsd.");
                        break;
                }

            }
        } else if (bojaKamiona.equals(kamion2)) { //Crveni kamion trosi 7L/100km a)Jedan litar goriva kosta 123.25 dinara.
            if (grad.equals(grad1)) //-Novi Sad je udaljen 100km od Beograda
            {
                System.out.println("Unesite voce koje prenosi ( imate izbor da unesete jabuke, banane ili mandarine): ");
                String voce = sc.nextLine();

                switch (voce) //Svaki kilogram dodaje 0.01L/100km potrosnje
                {
                    case "jabuke": //-Jabuke su teske 120kg
                        cenaPuta = 7 * 123.25 + (120 * 0.01) * 123.25;
                        System.out.println("Put ce kostati: " + cenaPuta + " rsd.");
                        break;
                    case "banane": //-Banane su teske 150kg
                        cenaPuta = 7 * 123.25 + (150 * 0.01) * 123.25;
                        System.out.println("Put ce kostati: " + cenaPuta + " rsd.");
                        break;
                    case "mandarine": //-Mandarine su teske 75kg
                        cenaPuta = 7 * 123.25 + (75 * 0.01) * 123.25;
                        System.out.println("Put ce kostati: " + cenaPuta + " rsd.");
                        break;
                }
            } else if (grad.equals(grad2)) { //Crveni kamion trosi 7L/100km //-Nis je udaljen 333km od Beograda a)Jedan litar goriva kosta 123.25 dinara.
                System.out.println("Unesite voce koje prenosi ( imate izbor da unesete jabuke, banane ili mandarine): ");
                String voce = sc.nextLine();

                switch (voce) //Svaki kilogram dodaje 0.01L/100km potrosnje //Ispisati koliko dinara ce kostati put.//Svaki kilogram dodaje 0.01L/100km potrosnje
                {
                    case "jabuke": //-Jabuke su teske 120kg
                        cenaPuta = (7 * 123.25) * 3 + 0.33 * 123.25 + 120 * (0.03 * 123.25 + 0.003 * 123.5);
                        System.out.println("Put ce kostati: " + cenaPuta + " rsd.");
                        break;
                    case "banane": //-Banane su teske 150kg
                        cenaPuta = (7 * 123.25) * 3  + 0.33 * 123.25 + 150 * (0.03 * 123.25 + 0.003 * 123.5);
                        System.out.println("Put ce kostati: " + cenaPuta + " rsd.");
                        break;
                    case "mandarine": //-Mandarine su teske 75kg
                        cenaPuta = (7 * 123.25) * 3  + 0.33 * 123.25 + 75 * (0.03 * 123.25 + 0.003 * 123.5);
                        System.out.println("Put ce kostati: " + cenaPuta + " rsd.");
                        break;
                }
            } else if (grad.equals(grad3)) { //Subotica je udaljena 220km od Beograda //-Sivi kamion trosi 5L/100km a)Jedan litar goriva kosta 123.25 dinara.
                System.out.println("Unesite voce koje prenosi ( imate izbor da unesete jabuke, banane ili mandarine): ");
                String voce = sc.nextLine();

                switch (voce) //Svaki kilogram dodaje 0.01L/100km potrosnje //Ispisati koliko dinara ce kostati put.//Svaki kilogram dodaje 0.01L/100km potrosnje
                {
                    case "jabuke": //-Jabuke su teske 120kg
                        cenaPuta = (7 * 123.25) * 2 + 0.20 * 123.25 + 120 * (0.02 * 123.25 + 0.002 * 123.5);
                        System.out.println("Put ce kostati: " + cenaPuta + " rsd.");
                        break;
                    case "banane": //-Banane su teske 150kg
                        cenaPuta = (7 * 123.25) * 2 + 0.20 * 123.25 + 150 * (0.02 * 123.25 + 0.002 * 123.5);
                        System.out.println("Put ce kostati: " + cenaPuta + " rsd.");
                        break;
                    case "mandarine": //-Mandarine su teske 75kg
                        cenaPuta = (7 * 123.25) * 2 + 0.20 * 123.25 + 75 * (0.02 * 123.25 + 0.002 * 123.5);
                        System.out.println("Put ce kostati: " + cenaPuta + " rsd.");
                        break;
                }
            }
        }
    }
}
