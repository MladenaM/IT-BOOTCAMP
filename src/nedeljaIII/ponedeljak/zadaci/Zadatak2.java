package nedeljaIII.ponedeljak.zadaci;

import java.util.Scanner;

public class Zadatak2 {

    //2. Napisati funkciju koja prima neki tekst i ispisuje taj tekst sa svim slovima napisanim "malo" <- sva slova su mala

    static String konverzija(String a)
    {
        a.toLowerCase();
        return "";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite rec velikim slovima: ");
        String a = sc.nextLine();
        System.out.println(konverzija(a));


    }
}
