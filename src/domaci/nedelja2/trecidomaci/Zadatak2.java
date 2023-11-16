package domaci.nedelja2.trecidomaci;
import java.util.Scanner;

public class Zadatak2 {

    //Napisati funkciju koja ce primiti niz celih brojeva, i broj koji zelimo da lociramo unutar tog
    //niza. Ukoliko prolaskom kroz niz naidjemo na pogresan broj, ispisati poruku da je pogresan
    //element, cim naidjemo na zadati element, ispisati poruku da je pronadjen i zavrsiti funkciju
    //(Cim naidje na taj element, ne treba da ga trazi dalje).

    static int funkcija(int[] niz, int broj)
    {
        for (int i = 0; i < niz.length; i++)
        {
            if (niz[i] ==  broj)
            {
                System.out.println("Element " + broj + " se nalazi u nizu." );
                break;
            }

            else
            {
                System.out.println("Pogresan element!");
            }

        }

        return 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int broj;

        System.out.println("Unesite broj brojeva niza: ");
        int brojBrojevaNiza = sc.nextInt();
        System.out.println("Unesite brojeve vaseg niza:");

        int[] niz = new int[brojBrojevaNiza];
            for (int i = 0; i < niz.length; i++)
            {
                broj = sc.nextInt();
                niz[i] = broj;
            }
        System.out.println("Unesite broj koji zelite da locirate: ");
            int brojKojiSeLocira = sc.nextInt();

        funkcija(niz,brojKojiSeLocira);

    }
}
