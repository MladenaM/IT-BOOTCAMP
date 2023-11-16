package Vezbanja.pastebin.prvideo;
import java.util.Scanner;
public class Zadatak18 {

    //18. Uneti pozitivan ceo broj n. Zatim izracunati sumu unetih narednih n brojeva (double).

    static double suma(int a)
    {
        Scanner sc = new Scanner(System.in);
        double ukupno = 0.0;
        double broj;


        for (int i = 0; i < a;i++)
        {
            System.out.println("Unesite broj: ");
            broj = sc.nextDouble();
            ukupno = ukupno + broj;
        }

        return ukupno;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj brojeva: ");
        int broj = sc.nextInt();
        System.out.println(suma(broj));


    }

}
