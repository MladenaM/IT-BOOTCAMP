package nedeljaIII.ponedeljak;
import java.util.Scanner;

public class Funkcije11 {

    static int zbir(int x, int y)
    {
        return x + y;
    }
    static int razlika(int x, int y)
    {
        return x - y;
    }
    static int cudnaRazlika(int x1, int x2, int x3, int x4)
    {
        return zbir(x1, x2) - zbir(x3, x4);
    }





    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
        *
        * Napisati funkciju koja prima 4 broja
        * i vraca razliku proizvoda prva dva broja od zbira druga dva broja
        *
         */



        int reuzultat = cudnaRazlika(1,2,3,4);

        //Nadovezivanje na pastebin5*


    }
}
