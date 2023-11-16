package nedeljaIII.ponedeljak.zadaci;
import java.util.Scanner;

public class Zadatak1 {

    //1. Napisati funkciju koja od korisnika prima dva double broja i vraca povrsinu pravougaonika cije su duzine stranica jednake tim
    // unetim brojevima (stranica a = prvi broj; stranica b = drugi broj)

    static double povrsina ( double x, double y)
    {
        double c = x * y;
        return c;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite prvi broj: ");
        int a = sc.nextInt();
        System.out.println("Unesite prvi broj: ");
        int b = sc.nextInt();

        System.out.println(povrsina(a,b));


    }
}
