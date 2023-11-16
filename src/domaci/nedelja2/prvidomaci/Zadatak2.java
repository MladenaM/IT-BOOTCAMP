package domaci.nedelja2.prvidomaci;
import java.util.Scanner;

public class Zadatak2 {

    /*
    *Napraviti program koji ce za uneti ceo broj vratiti njegov faktorijel (3! = 3*2*1).
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Uneti ceo broj: ");
        int ceoBroj = sc.nextInt();
        int faktorijel = 1;

        for (int i = 1; i <= ceoBroj; i++)
        {
            faktorijel = faktorijel * i;
        }
        System.out.println("Faktorijel broja " + ceoBroj + " je " + faktorijel);

    }
}
