package Vezbanja.pastebin.prvideo;
import java.lang.Math;
import java.util.Scanner;


public class Zadatak17 {

    //17. Napraviti digitron koji prima double, char, double, gde je char neki od simbola: {+, -, *, /, %, ^}
    // i ispisuje resenje odgovarajuce operacije.

    static  double Kalkulator(double a, char c, double b)
    {

        if ( c == '*')
        {
            System.out.println(a*b);
        }
        if ( c == '+')
        {
            System.out.println(a+b);
        }
        if ( c == '-')
        {
            System.out.println(a-b);
        }
        if ( c == '/')
        {
            System.out.println(a/b);

        }
        if ( c == '%')
        {
            System.out.println(a%b);
        }
        if ( c == '^')
        {
            System.out.println(Math.pow(a, b));
        }



        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti prvi broj: ");
        double a = sc.nextDouble();
        System.out.println("Uneti prvi broj: ");
        double b = sc.nextDouble();
        System.out.println("Uneti neki od simbola: {+, -, *, /, %, ^}: ");
        char c = sc.next().charAt(0);

        Kalkulator(a,c,b);



    }



}
