package Vezbanja.pastebin.prvideo;

import java.util.Scanner;

public class Zadatak20 {

    //20. Uneti pozitivan ceo broj n. Zatim izracunati prosek unetih narednih n brojeva (double).

    static double prosek(int a)
    {
        Scanner sc = new Scanner(System.in);
        double ukupno = 0.0;
        double broj;
        double rezultat;


        for (int i = 0; i < a;i++)
        {
            System.out.println("Unesite broj: ");
            broj = sc.nextDouble();
            ukupno = ukupno + broj;
        }
        rezultat = ukupno/a;

        return rezultat;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj brojeva: ");
        int broj = sc.nextInt();
        System.out.println(prosek(broj));


    }
}
