package Vezbanja.pastebin.prvideo;
import java.util.Scanner;
public class Zadatak14 {
    //14. Za unete brojeve a i b ispisati veci od njih.

    static void veciBroj(int a, int b)
    {
        if ( a > b)
        {
            System.out.println(a);
        }
        else if (b>a) {
        System.out.println(b);
        }
        else {
            System.out.println("Brojevi su jednaki");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti prvi broj: ");
        int broj1 = sc.nextInt();
        System.out.println("Uneti drugi broj: ");
        int broj2 = sc.nextInt();
        veciBroj(broj1,broj2);

    }

}
