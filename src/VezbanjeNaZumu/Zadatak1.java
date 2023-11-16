package VezbanjeNaZumu;
import java.util.Scanner;

public class Zadatak1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti broj brojeva u nizu: ");
        int broj = sc.nextInt();
        int niz[] = new int[broj];
        for (int i = 0; i < broj; i++) {
            System.out.println("Uneti " + (i + 1) + ". " + "clan niza. ");
            int clan = sc.nextInt();
            niz[i] = clan;
        }

        if (monotonNiz(niz)) {
            System.out.println("Da");
        } else System.out.println("Ne");
    }

    public static boolean monotonNiz(int[] niz) {
        boolean flag = true;
        int prosli;
        for (int i = 0; i < niz.length-1; i++){
                if((niz[i] > niz[i+1]) || (niz[i]<niz[i+1])) //dodati jednako kod oba uslova za zadatak a
                {
                    flag = true;
                }
                else {
                   return false;
                }
        }
        return flag;
    }
}


//a) Napisati funkciju koja ispituje da li je niz monoton ili nije. Niz je monoton ako je ili rastuci ili opadajuci ili konstantan, ali ne i rastuci i opadajuci.
//b) Napisati funkciju koja ispituje da li je niz strogo monoton ili nije. Niz je strogo monoton ako je iskljucivo rastuci ili iskljucivo opadajuci i u nikojem delu nije konstantan (nema ponavljajucih elemenata)

