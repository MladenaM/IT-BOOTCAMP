package Vezbanja;
import java.util.Scanner;


public class PetljezadatK {

    /*
     * 4. Napisati program koji za uneti ceo broj n racuna proizvod svih brojeva od 1...n
     *
     * (ovo je faktorijel, n! = n * (n-1) * ... * 2 * 1  (0! = 1))
     *
     * */
    public static void main(String[] args) {


        System.out.println("Uneti ceo pozitivan broj");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int proizvod = 1;

        for( int i = 1; i <= n; i++)
        {
            proizvod = proizvod * i;
        }
        System.out.println("Proizvod = " + proizvod);

    }

}
