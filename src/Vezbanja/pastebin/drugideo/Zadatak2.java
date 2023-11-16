package Vezbanja.pastebin.drugideo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Zadatak2 {

    //(b) [25] Napisati funkciju daLiSuIstiOgledalo koja prima 2 niza
    // realnih
    //brojeva i vraca odgovor na pitanje da li su oni isti u
    // slucaju kada drugi
    //niz posmatramo od pozadi.
    //*/
     static boolean daLiSuIstiOgledalo(int[] niz1, int[] niz2)
     {
         boolean daLiSuIsti = false;
         int[] obrnutiNiz= new int[niz2.length];
         int j=0;

         for (int i = niz2.length-1; i >= 0; i-- )
         {
             obrnutiNiz[j] = niz2[i];
             j++;
         }

         if (niz1.length == obrnutiNiz.length)
         {
             for (int i=0; i<niz1.length;i++)
             {
                 if (niz1[i] == obrnutiNiz[i])
                 {
                     daLiSuIsti = true;
                 }
                 else {
                     daLiSuIsti = false;
                     break;
                 }
             }
         }


        return daLiSuIsti;
     }

    public static void main(String[] args) {

         int[] niz2 = new int[]{1,2,3,4,5};
        int[] niz1 = new int[]{1,4,3,2,1};

        System.out.println(daLiSuIstiOgledalo(niz1,niz2));

    }

}
