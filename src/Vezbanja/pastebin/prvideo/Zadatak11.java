package Vezbanja.pastebin.prvideo;
import java.util.Scanner;

public class Zadatak11 {

    // 11. Korisnik unosi ime, prezime i godinu rodjena. Ispisati:
    //	"Dobrodosao u {x}. razred, {ime} {prezime}",
    //	pod pretpostavkom da je trenutna godina 2023. Pretpostavimo da ima 12 razreda. A ako korisnik nije djak ispisati jednu odgovarajucu
    //    poruku od:
    //	"{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje"

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ime: ");
        String ime = sc.nextLine();
        System.out.println("Unesite prezime: ");
        String prezime = sc.nextLine();
        System.out.println("Unesite godinu rodjenja: ");
        int godina = sc.nextInt();

        switch (godina)
        {
            case 2017:
                System.out.println("Dobrodosli u 1 razred, " + ime + " " + prezime);
                break;
            case 2016:
                System.out.println("Dobrodosli u 2 razred, " + ime + " " + prezime);
                break;
            case 2015:
                System.out.println("Dobrodosli u 3 razred, " + ime + " " + prezime);
                break;
            case 2014:
                System.out.println("Dobrodosli u 4 razred, " + ime + " " + prezime);
                break;
            case 2013:
                System.out.println("Dobrodosli u 5 razred, " + ime + " " + prezime);
                break;
            case 2012:
                System.out.println("Dobrodosli u 6 razred, " + ime + " " + prezime);
                break;
            case 2011:
                System.out.println("Dobrodosli u 7 razred, " + ime + " " + prezime);
                break;
            case 2010:
                System.out.println("Dobrodosli u 8 razred, " + ime + " " + prezime);
                break;
            case 2009:
                System.out.println("Dobrodosli u 9 razred, " + ime + " " + prezime);
                break;
            case 2008:
                System.out.println("Dobrodosli u 10 razred, " + ime + " " + prezime);
                break;
            case 2007:
                System.out.println("Dobrodosli u 11 razred, " + ime + " " + prezime);
                break;
            case 2006:
                System.out.println("Dobrodosli u 12 razred, " + ime + " " + prezime);
                break;


        }

        if (godina > 2017)
        {
            System.out.println( ime + " " + prezime + " tek treba da zapocne obrazovanje.");
        }

        else
        {
            System.out.println(ime + " " + prezime + " je zavrsilo skolu.");
        }

    }
}
