package Vezbanja.pastebin.prvideo;

import java.util.Scanner;

//13.* Za unet pozitivan ceo broj n, ispisati za svaki pozitivan ceo broj t,
// koji je strogo manji od njega (dakle t < n), sumu svih pozitivnih celih brojeva od 1 do tog broja (dakle 1 + 2 + 3 + ... + t).
public class Zadatak13 {

    static void suma (int broj)
    {
        int sum = 0;
        for (int i = 1; i < broj; i++)
        {
            System.out.println(i);
            sum += i;
            System.out.println(sum);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int broj = sc.nextInt();
        suma(broj);
    }



}
