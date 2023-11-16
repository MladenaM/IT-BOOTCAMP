package Vezbanja.pastebin.prvideo;
import java.util.Scanner;

public class Zadatak12 {

    //12. Za unet ceo broj n, ispisati za svaki od brojeva [1, n] "Fizz" ako je deljiv sa 3, "Buzz" ako je deljiv sa 5,
    //"Zazz" ako je deljiv sa 7 i sve ostale varijacije ("BuzzZazz" ako je deljiv i sa 5 i sa 7, ...)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ceo broj: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++)
        {
            if ( i % 3 == 0)
            {
                System.out.println(i);
                System.out.println("Fizz");
            }
            if ( i % 5 == 0)
            {
                System.out.println(i);
                System.out.println("Buzz");
            }
            if ( i % 7 == 0)
            {
                System.out.println(i);
                System.out.println("Zazz");
            }
            if ((i % 3 == 0) && (i % 5 == 0) )
            {
                System.out.println(i);
                System.out.println("FizzBuzz");
            }
            if (i % 3 == 0 && i % 7 == 0 )
            {
                System.out.println(i);
                System.out.println("FizzZazz");
            }
            if (i % 5 == 0 && i % 7 == 0 )
            {
                System.out.println(i);
                System.out.println("BuzzZazz");
            }
            if (i % 5 == 0 && i % 7 == 0 && i % 3 == 0)
            {
                System.out.println(i);
                System.out.println("FizzBuzzZazz");
            }

        }

    }


}
