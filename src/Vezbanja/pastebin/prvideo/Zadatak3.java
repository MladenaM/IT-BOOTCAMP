package Vezbanja.pastebin.prvideo;
import java.util.Scanner;

public class Zadatak3 {

    //3. Za uneta dva broja a i b ispisati rezultat svih 5 osnovnih aritmetickih operacija: a+b, a-b, a*b, a/b, a%b.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti broj a: ");
        int a = sc.nextInt();
        System.out.println("Uneti broj b: ");
        int b = sc.nextInt();

        System.out.println("Zbir brojeva a i b je: " + ((a + b)));
        System.out.println("Razlika brojeva a i b je: " + (a - b));
        System.out.println("Proizvod brojeva a i b je: " + (a * b));

        if(b!=0) {
            System.out.println("Ostatak deljenja brojeva a i b je: " + (a % b));
            System.out.println("Kolicnik brojeva a i b je: " + (a/b));
        }
        else
            System.out.println("Ne mozemo deliti 0 i izracunati procenat deljenja 0.");
    }
}
