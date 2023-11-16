package DopunskiCas;

public class Zadatak2 {

    //Zadatak 2:
    //Napraviti funkciju koja prima dva niza celih brojeva i kao rezultat
    // vraca najveci broj.

        public static void main(String[] args) {
            int[] niz1 = {10, -1, 90, 5, 100};
            int[] niz2 = {600, 77, 4, 46, -20};
            System.out.println(maximum(niz1, niz2));
        }
        public static int maximum(int[] niz1, int[] niz2) {
            int a = izracunajMaximum(niz1);
            int b = izracunajMaximum(niz2);
            if(a>b) {
                return a;
            } else {
                return b;
            }
        }
        public static int izracunajMaximum(int[] niz1) {
            int rez = Integer.MIN_VALUE;
            for(int i=0; i<niz1.length;i++) {
                if(rez<niz1[i]) {
                    rez = niz1[i];
                }
            }
            return rez;
        }
    }

