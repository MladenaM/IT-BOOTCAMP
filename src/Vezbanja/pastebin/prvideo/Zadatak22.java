package Vezbanja.pastebin.prvideo;
import java.util.Scanner;
public class Zadatak22 {

    // 22. Korisnik unosi neke pozitivne cele brojeve n i k. Ispisati sve parne brojeve od 2 do n
    // ali zaustaviti program ako se ispise paran broj koji je deljiv sa k.

    static void parniBrojevi (int n, int k)
    {

        while (n>=2)

        {
            if ( n % 2 == 0)
            {
                System.out.println(n);
            }
            if (n % k == 0)
            {
                break;
            }

            n++;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj n: ");
        int n = sc.nextInt();
        System.out.println("Unesite broj k: ");
        int k = sc.nextInt();

        parniBrojevi(n,k);
    }

}
