package domaci.nedelja2.drugidomaci;
import java.util.Scanner;

public class Zadatak2 {

    //Napraviti niz brojeva i kao rezultat vratiti sumu svih parnih brojeva iz tog niza

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Uneti broj brojeva niza: ");
        int brojBrojeva = sc.nextInt();
        int[] nizBrojeva = new int[brojBrojeva];
        int broj;
        int sum = 0;

        for (int i = 0; i < nizBrojeva.length; i++)
        {
            broj = sc.nextInt();
            nizBrojeva[i] = broj;
        }

        for (int i = 0; i < nizBrojeva.length; i++)
        {
            System.out.println("Element: " + nizBrojeva[i]);
        }

        for (int i = 0; i < nizBrojeva.length; i++)
        {
            if ( nizBrojeva[i] % 2 == 0 )
            {
                sum += nizBrojeva[i] ;
            }

        }
        System.out.println("Suma svih parnih je: " + sum);


    }
}
