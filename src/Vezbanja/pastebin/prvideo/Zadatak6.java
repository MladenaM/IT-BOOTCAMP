package Vezbanja.pastebin.prvideo;
import java.util.Scanner;

public class Zadatak6 {

    //6. Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa 0 do i zakljucno sa n.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite pozitivan broj");
        int n = sc.nextInt();
        int broj = 0;

        while(n >= 0)
        {
            System.out.println(n);
            n--;
        }

    }

}
