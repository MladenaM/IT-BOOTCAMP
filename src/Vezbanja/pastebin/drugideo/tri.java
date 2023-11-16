package Vezbanja.pastebin.drugideo;

public class tri {

        public static int[] zbirPoPozicijama(int[] niz1, int[] niz2) {

            int[] rezultat = new int[niz1.length];
            for (int i = 0; i < niz1.length; i++) {
                rezultat[i] = niz1[i] + niz2[i];
            }
            return rezultat;
        }

        public static void main(String[] args) {
            int[] niz1 = {1, 2, 3, 4, 5};
            int[] niz2 = {5, 4, 3, 2, 1};

            int[] rezultat = zbirPoPozicijama(niz1, niz2);

            for (int i : rezultat) {
                System.out.print(i + " ");
            }
        }

}
