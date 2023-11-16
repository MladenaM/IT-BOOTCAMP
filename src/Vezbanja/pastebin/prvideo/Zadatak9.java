package Vezbanja.pastebin.prvideo;
import java.util.Scanner;

public class Zadatak9 {

    //9. Ispisati proizvod prvih n celih brojeva [1, n].

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti ceo pozitivan broj: ");
        int n = sc.nextInt();
        int proizvod = 1;

        for (int i = 1; i <= n; i++)
        {
            proizvod*=i;

        }
        System.out.println(proizvod);

    }




}
