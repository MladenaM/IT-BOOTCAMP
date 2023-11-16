package Vezbanja.pastebin.prvideo;
import java.util.Scanner;

public class Zadatak5 {

    //5.* Za unet cetvorocifren broj ispisati razliku proizvoda njegovih prvih dveju cifara od zbira njegovih drugih dveju cifara.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti cetvorocifreni broj: ");
       int broj = sc.nextInt();

       int prveDve = broj/100;
       int drugeDve = broj%100;


        int prviBroj = prveDve/10;
        int drugiBroj = prveDve%10;
        int treciBroj = drugeDve/10;
        int cetvrtiBroj = drugeDve%10;

        int razlika = ((prviBroj*drugiBroj) - (treciBroj+cetvrtiBroj));

        System.out.println("PRVI " + prviBroj);
        System.out.println("drugi " + drugiBroj);
        System.out.println("treci " + treciBroj);
        System.out.println("cetvrti " + cetvrtiBroj);
        System.out.println("Razlika proizvoda njegovih prvih dveju cifara od zbira njegovih drugih dveju cifara: " + razlika );









    }
}
