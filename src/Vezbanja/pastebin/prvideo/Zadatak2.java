package Vezbanja.pastebin.prvideo;
import java.util.Scanner;

public class Zadatak2 {

    //2. Za unet broj n, ispisati "Pozitivan" ako je strogo veci od 0, "Negativan" ako je strogo manji od 0 ili "Neutralan" ako je tacno 0.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti ceo broj: ");
        int n = sc.nextInt();
        if (n < 0)
        {
            System.out.println("Broj je negativan");
        }

        else if (n > 0)
        {
            System.out.println("Broj je pozitivan");
        }

        else if ( n == 0)
        {
            System.out.println("Broj je neutralan");
        }
    }
}
