package Vezbanja.pastebin.prvideo;
import java.util.Scanner;

public class Zadatak23 {
    //23.* Unose se double konstante a, b, c, a zatim i pozitivan ceo broj n. Zatim se unose n double brojeva jedan po jedan.
    //Cim se unese jedan od tih brojeva, na standardni izlaz ispisuje se vrednost polinoma: a*x^2 + b*x + c, gde je x taj uneti broj.

    static void funkcija( double a, double b, double c, int n)
    {
        Scanner sc = new Scanner(System.in);
        double polinom = 0;

            System.out.println("Unesite broj: ");
            n = sc.nextInt();
            while (n != 0)
            {
                polinom = a*(n^2) + b*n + c;
                System.out.println(polinom);
                n --;

            }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite vrednost a:");
        double a = sc.nextDouble();
        System.out.println("Unesite vrednost b:");
        double b = sc.nextDouble();
        System.out.println("Unesite vrednost c:");
        double c = sc.nextDouble();
        System.out.println("Unesite vrednost n:");
        int n = sc.nextInt();

        funkcija(a,b,c,n);
    }
}
