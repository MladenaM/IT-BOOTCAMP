package Vezbanja.pastebin.prvideo;

import java.util.Scanner;

public class Zadatak24 {
    //24.* Uneti pozitivan ceo broj n. Zatim ispisati najmanji i najveci broj od unetih narednih n brojeva (double).

    static void minMax ( int n) {
        Scanner sc = new Scanner(System.in);

        double minimum = 363.0;
        double maxmum = 1.0;
        int broj;


            for (int i = 0; i < n; i++) {
                System.out.println("Unesite broj: ");
                broj  = sc.nextInt();

                if (broj < minimum) {
                    minimum = broj;
                } else if (broj> maxmum) {
                    maxmum = broj;
                }
            }

            System.out.println("Minimum je: " + minimum);
            System.out.println("Maksimum je: " + maxmum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj brojeva niza: ");
        int n = sc.nextInt();
        minMax(n);
    }

}
