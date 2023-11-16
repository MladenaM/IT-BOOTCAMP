package Vezbanja.pastebin.prvideo;
import java.util.Scanner;

public class Zadatak10 {

    //10. Napraviti program koji za unet mesec i dan ispisuje odgovarajuci horoskopski znak.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite dan rodjenja: ");
        int dan = sc.nextInt();
        sc.nextLine();
        System.out.println("Unesite mesec rodjenja: ");
        String mesec = sc.nextLine();

        String januar = "januar";
        String februar = "februar";
        String mart = "mart";
        String april = "april";
        String maj = "maj";
        String jun = "jun";
        String jul = "jul";
        String avgust = "avgust";
        String septembar = "septembar";
        String oktobar  = "oktobar";
        String novembar = "novembar";
        String decembar = "decembar";

        if (mesec.equals(januar) && (dan >= 1 && dan <= 20) )
        {
            System.out.println("Tvoj horoskopski znak je jarac");

        }
        else if (mesec.equals(januar) && (dan > 21 && dan <31) )
        {
            System.out.println("Tvoj horoskopski znak je vodolija");

        }
        else if (mesec.equals(februar) && (dan >= 1 && dan <= 19))
        {
            System.out.println("Tvoj horoskopski znak je vodolija");
        }
        else if (mesec.equals(februar) && (dan > 20 && dan < 28))
        {
            System.out.println("Tvoj horoskopski znak je riba");
        }
        else if (mesec.equals(mart) && (dan >= 1 && dan <= 20))
        {
            System.out.println("Tvoj horoskopski znak je riba");
        }
        else if (mesec.equals(mart) && (dan > 21 && dan <31))
        {
            System.out.println("Tvoj horoskopski znak je ovan");
        }
        else if (mesec.equals(april) && (dan >= 1 && dan < 21))
        {
            System.out.println("Tvoj horoskopski znak je ovan");
        }
        else if (mesec.equals(april) && (dan >= 21 && dan < 31))
        {
            System.out.println("Tvoj horoskopski znak je bik");
        }
        else if (mesec.equals(maj) && (dan >= 1 && dan < 21))
        {
            System.out.println("Tvoj horoskopski znak je bik");
        }
        else if (mesec.equals(maj) && (dan >= 22 && dan < 31))
        {
            System.out.println("Tvoj horoskopski znak je blizanac");
        }
        else if (mesec.equals(jun) && (dan >= 1 && dan < 21))
        {
            System.out.println("Tvoj horoskopski znak je blizanac");
        }
        else if (mesec.equals(jun) && (dan >= 22 && dan < 31))
        {
            System.out.println("Tvoj horoskopski znak je rak");
        }
        else if (mesec.equals(jul) && (dan >= 1 && dan < 22))
        {
            System.out.println("Tvoj horoskopski znak je rak");
        }
        else if (mesec.equals(jul) && (dan >= 23 && dan < 31))
        {
            System.out.println("Tvoj horoskopski znak je lav");
        }
        else if (mesec.equals(avgust) && (dan >= 1 && dan < 22))
        {
            System.out.println("Tvoj horoskopski znak je lav");
        }
        else if (mesec.equals(avgust) && (dan >= 23 && dan < 31))
        {
            System.out.println("Tvoj horoskopski znak je devica");
        }
        else if (mesec.equals(septembar) && (dan >= 1 && dan < 22))
        {
            System.out.println("Tvoj horoskopski znak je devica");
        }
        else if (mesec.equals(septembar) && (dan >= 23 && dan < 31))
        {
            System.out.println("Tvoj horoskopski znak je vaga");
        }
        else if (mesec.equals(oktobar) && (dan >= 1 && dan < 23))
        {
            System.out.println("Tvoj horoskopski znak je vaga");
        }
        else if (mesec.equals(oktobar) && (dan >= 24 && dan < 31))
        {
            System.out.println("Tvoj horoskopski znak je skorpija");
        }
        else if (mesec.equals(novembar) && (dan >= 1 && dan <= 22))
        {
            System.out.println("Tvoj horoskopski znak je skorpija");
        }
        else if (mesec.equals(novembar) && (dan >= 23 && dan <= 31))
        {
            System.out.println("Tvoj horoskopski znak je strelac");
        }
        else if (mesec.equals(decembar) && (dan >= 1 && dan < 21))
        {
            System.out.println("Tvoj horoskopski znak je strelac");
        }
        else if (mesec.equals(decembar) && (dan >= 22 && dan < 31))
        {
            System.out.println("Tvoj horoskopski znak je strelac");
        }



    }


}
