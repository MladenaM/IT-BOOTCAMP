package Vezbanja.pastebin.drugideo;

public class jednakiNizovi {

    //// Napraviti funkciju koja prima dva niza celih brojeva i proverava da li su jednaki.

    static boolean jednakiNizovi(int[] niz1, int[] niz2)
    {
        boolean daLiSuJednaki = false;

        if (niz1.length == niz2.length)
        {
            for (int i = 0; i< niz1.length; i++)
            {
                if (niz1[i] == niz2[i])
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

        int[] niz1 = new int[] {1,2,2,2,5,6};
        int[] niz2 = new int[] {1,2,5,2,5,6};
        System.out.println(jednakiNizovi(niz1,niz2));

        if (jednakiNizovi(niz1,niz2))
        {
            System.out.println("Nizovi su jednaki");
        }
        else
        {
            System.out.println("Nizovi nisu jednaki");
        }

    }



}
