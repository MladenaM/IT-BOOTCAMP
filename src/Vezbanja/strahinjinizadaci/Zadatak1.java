package Vezbanja.strahinjinizadaci;

import java.util.Scanner;
public class Zadatak1 {

    //1. Olimpijske medalje
    //Korisnik unosi imena 3 drzava koje su se takmicile na olimpijskim igrama
    //u Tokiju 2021. Nakon toga unosi redom po 3 cela broja za svaku (ukupno 9 brojeva)
    //koje redom oznacavaju broj osvojenih zlatnih medalja,
    //broj osvojenih srebrnih medalja, broj osvojenih bronzanih medalja.
    //Na standardni izlaz ispisati ime pobednicke drzave. Pobednicka drzava je ona
    //koja ima vise zlatnih medalja u odnosu na ostale dve. Ukoliko neke 2 drzave
    //imaju isti broj osvojenih zlatnih medalja, onda je pobedila ona koja ima najvise
    //srebrnih medalja. Ukoliko dve drzave takodje imaju isti broj osvojenih
    //srebrnih medalja, onda se gledaju bronzane, a ukoliko imaju isti broj svih medalja
    //ispisati poruku "Nereseno".

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String drzave = " ";
        System.out.println("Uneti nazive tri drzava: ");
        String drzava1 = sc.nextLine();
        String drzava2 = sc.nextLine();
        String drzava3 = sc.nextLine();
        int[] medalje1 = new int[3];
        int[] medalje2 = new int[3];
        int[] medalje3 = new int[3];
        int broj;

        drzave = drzava1 + " " + drzava2 + " " + drzava3+ " ";
        System.out.println(drzave);

        System.out.println("Uneti medalje za prvu drzavu (redosled: zlatna,srebrna, bronzana ");
            for (int i = 0; i < medalje1.length; i++)
            {
                broj = sc.nextInt();
                medalje1[i]=broj;
            }

        System.out.println("Uneti medalje za prvu drugu (redosled: zlatna,srebrna, bronzana ");
        for (int i = 0; i < medalje2.length; i++)
        {
            broj = sc.nextInt();
            medalje2[i]=broj;
        }

        System.out.println("Uneti medalje za prvu drugu (redosled: zlatna,srebrna, bronzana ");
        for (int i = 0; i < medalje3.length; i++)
        {
            broj = sc.nextInt();
            medalje3[i]=broj;
        }

        if ( medalje1[0] > medalje2[0] && medalje1[0] > medalje3[0] )
        {
            System.out.println("Pobednik je:" + drzava1);
        }
        else if (medalje2[0] > medalje1[0] && medalje2[0] > medalje3[0] )
        {
            System.out.println("Pobednik je:" + drzava2);
        }
        else if (medalje3[0] > medalje1[0] && medalje3[0] > medalje2[0] )
        {
            System.out.println("Pobednik je:" + drzava3);
        }
        else if (medalje1[0] == medalje2[0] && medalje1[0] == medalje3[0] && medalje1[1] > medalje2[1] && medalje1[1] > medalje3[1] )
        {
            System.out.println("Pobednik je:" + drzava1);
        }
        else if (medalje1[0] == medalje2[0] && medalje1[0] == medalje3[0] && medalje2[1] > medalje1[1] && medalje2[1] > medalje3[1])
        {
            System.out.println("Pobednik je:" + drzava2);
        }
        else if (medalje1[0] == medalje2[0] && medalje1[0] == medalje3[0] && medalje3[1] > medalje1[1] && medalje3[1] > medalje2[1])
        {
            System.out.println("Pobednik je:" + drzava3);
        }
        else if (medalje1[0] == medalje2[0] && medalje1[0] == medalje3[0] && medalje1[1] == medalje2[1] && medalje1[1] == medalje3[1] && medalje1[2] > medalje2[2] && medalje1[2] > medalje3[2])
        {
            System.out.println("Pobednik je:" + drzava1);
        }
        else if (medalje1[0] == medalje2[0] && medalje1[0] == medalje3[0] && medalje1[1] == medalje2[1] && medalje1[1] == medalje3[1] && medalje2[2] > medalje1[2] && medalje2[2] > medalje3[2])
        {
            System.out.println("Pobednik je:" + drzava2);
        }
        else if (medalje1[0] == medalje2[0] && medalje1[0] == medalje3[0] && medalje1[1] == medalje2[1] && medalje1[1] == medalje3[1] && medalje3[2] > medalje1[2] && medalje3[2] > medalje2[2])
        {
            System.out.println("Pobednik je:" + drzava3);
        }
        else if (medalje1[0] == medalje2[0] && medalje1[0] == medalje3[0] && medalje1[1] == medalje2[1] && medalje1[1] == medalje3[1] && medalje1[2] == medalje2[2] && medalje1[2] == medalje3[2])
        {
            System.out.println("Nereseno.");
        }


    }





}
