package domaci.nedelja2.drugidomaci;
import java.util.Scanner;

public class Zadatak1 {

    //Napraviti niz brojeva kroz koji cete proci i istampati samo neparne brojeve.


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite broj brojeva niza: ");
        int brojBrojevaNiza = sc.nextInt();
        int broj;

        int[] nizBrojeva = new int[brojBrojevaNiza];
        for (int i = 0; i < nizBrojeva.length ; i++)
        {
            nizBrojeva[i] = sc.nextInt();
        }

        for (int i = 0; i < nizBrojeva.length; i++)
        {
            System.out.println("Element: " + nizBrojeva[i]);


        }

        for (int i = 0; i < nizBrojeva.length; i++) {
            if (nizBrojeva[i] % 2 != 0) {
                System.out.println("Element je neparan:" + nizBrojeva[i]);

            }
        }
    }
}
