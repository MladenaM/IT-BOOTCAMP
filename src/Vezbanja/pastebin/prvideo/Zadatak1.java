package Vezbanja.pastebin.prvideo;
import java.util.Scanner;

public class Zadatak1 {
    //Za unet broj n, ispisati "Paran" ako je paran, a "Neparan" ako je neparan.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti ceo broj: ");
        int n = sc.nextInt();
        if (n < 0)
        {
            System.out.println("Broj je negativan");
        }

        else if (n >= 0)
        {
            System.out.println("Broj je pozitivan");
        }

        else
            System.out.println("Unos nije ispravan");


    }

}
