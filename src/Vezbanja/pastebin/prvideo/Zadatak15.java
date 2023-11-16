package Vezbanja.pastebin.prvideo;
import java.util.Scanner;

public class Zadatak15 {

    //15. Za unete brojeve a, b i c ispisati najmanji od njih

    static void manjiBroj(int a, int b, int c)
    {
        if ( a < b && a<c )
        {
            System.out.println(a);
        }
        else if (b<a && b<c) {
            System.out.println(b);
        }
        else if (c<a && c<b)
        {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti prvi broj: ");
        int broj1 = sc.nextInt();
        System.out.println("Uneti drugi broj: ");
        int broj2 = sc.nextInt();
        System.out.println("Uneti treci broj: ");
        int broj3 = sc.nextInt();
        manjiBroj(broj1, broj2, broj3);

    }
}
