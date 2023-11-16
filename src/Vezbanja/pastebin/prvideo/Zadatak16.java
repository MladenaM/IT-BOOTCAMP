package Vezbanja.pastebin.prvideo;

public class Zadatak16 {

    //16. Ispisati tablicu mnozemnja jednocifrenih brojeva (dakle tabela 10x10, 0 u prvom polju, 81 u poslednjem polju)

    static void tablica( int[] prvi, int[] drugi)
    {
        prvi = new int[10];
        drugi = new int[10];
        int broj = 1;


            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {

                    broj = i * j;
                    System.out.print(broj + " ");
                }
                System.out.println();

            }

    }

    public static void main(String[] args) {

        int[] prviBroj = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] drugiBroj = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        tablica(prviBroj,drugiBroj);

    }


}
