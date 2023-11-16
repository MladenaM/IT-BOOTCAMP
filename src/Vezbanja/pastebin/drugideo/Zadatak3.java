package Vezbanja.pastebin.drugideo;

public class Zadatak3 {
    //1. [40] Napisati funkciju najmanjiOdCetiri koja prima 4 niza celih brojeva i
    //        vraca najmanji broj medju ta 4 prosledjena niza.*/


    static int najmanjiBroj(int[] niz1) {
        int minimum = Integer.MIN_VALUE;

        for (int i = 0; i < niz1.length; i++) {

            if (niz1[i] > minimum) {
                minimum = niz1[i];
            }
        }

        return minimum;
    }


    static int najmanjiOdCetiri(int[] niz1, int[] niz2,int[] niz3, int[] niz4) {
        niz1 = new int[]{najmanjiBroj(niz1)};
        niz3 = new int[]{najmanjiBroj(niz3)};
        niz4 = new int[]{najmanjiBroj(niz4)};
        niz2 = new int[]{najmanjiBroj(niz2)};

        int[] nizMaksimuma = new int[] {niz1[0],niz2[0],niz3[0],niz4[0]};

        return nizMaksimuma[0];
    }

    public static void main(String[] args) {

    }






    }


