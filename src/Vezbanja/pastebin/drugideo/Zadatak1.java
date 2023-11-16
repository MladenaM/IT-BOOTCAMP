package Vezbanja.pastebin.drugideo;

public class Zadatak1 {

    //(a) [15] Napisati funkciju daLiSuIsti koja prima 3 niza realnih brojeva i
    //        vraca odgovor na pitanje da li su oni medjusobno jednaki.

    static boolean daLiSuIsti(int[] niz1, int[] niz2,int[] niz3)
    {
        boolean daLiSuJednaki = false;

        if (niz1.length == niz2.length && niz1.length == niz3.length)
        {
            for (int i = 0; i< niz1.length; i++)
            {
                if (niz1[i] == niz2[i] && niz1[i] == niz3[i])
                {
                    daLiSuJednaki = true;

                }
                else {
                    daLiSuJednaki = false;
                    break;
                }
            }
        }
            return daLiSuJednaki;
    }

    public static void main(String[] args) {

        int[] niz1 = new int[]{1,2,3,4,5};
        int[] niz2 = new int[]{1,2,4,4,5};
        int[] niz3 = new int[]{1,2,3,4,5};

        System.out.println(daLiSuIsti(niz1,niz2,niz3));
    }


}






