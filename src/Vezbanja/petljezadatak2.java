package Vezbanja;
import java.util.Scanner;

public class petljezadatak2 {
    /*
         * 1. Korisnik unosi neke ocene nekog osnovca. Ispisati prosek tog osnovca.
         *  - Sve dok se ne unese ocena 0
         *  - Sve ostale nevalidne ocene zanemariti.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int brojOcena = 0;
        double sumaOcena = 0.0;



        while (true)
        {
            System.out.println("Uneti ocenu");
            Double ocena = sc.nextDouble();

            if (ocena == 0)
            {
                break;
            }
            if ( ocena > 0 && ocena <= 5)
            {
                brojOcena = brojOcena + 1;
                sumaOcena = sumaOcena + ocena;
            }

        }

        double prosek = sumaOcena/brojOcena;
        System.out.println("Prosek je: " + prosek);


        }


    }
