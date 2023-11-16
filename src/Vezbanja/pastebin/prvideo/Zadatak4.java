package Vezbanja.pastebin.prvideo;
import java.util.Scanner;

public class Zadatak4 {

    //4. Za uneta dva broja ispisati poruku "Istog znaka" ako su oba broja istog znaka, a poruku "Suprotnog znaka", ako nisu istog znaka.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti prvi broj: ");
        int prviBroj = sc.nextInt();
        System.out.println("Uneti drugi broj: ");
        int drugiBroj = sc.nextInt();
         if ( (prviBroj >= 0 && drugiBroj >= 0) || ( prviBroj < 0 && drugiBroj < 0 ))
         {
             System.out.println("Istog znaka");
         }
         else
             System.out.println("Suprotnog znaka");


    }
}
