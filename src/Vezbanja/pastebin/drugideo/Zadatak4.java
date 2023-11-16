package Vezbanja.pastebin.drugideo;

public class Zadatak4 {

    //
/*3. [25] Napisati funkciju prostiBrojevi koja za zadati ceo broj n, 2 < n ≤ 50,
        ispisuje za svaki broj t, 2 ≤ t ≤ n poruku oblika:
        1 "<t> je prost "; ako je t prost broj
        2 "<t> je slozen "; ako t nije prost broj
OBJASNJENJE:
Broj je prost ako je deljiv samo sa 1 i sa samim sobom.
Broj x je deljiv brojem y ako je ostatak operacije x/y jedank 0.
        */

    static void prostiBrojevi( int n)
    {
        for (int t =2; t <= n; t++)
        {
            if ( t % 2 == 0 || t%3 == 0)

            {
                if (t == 2 || t == 3)
                {
                    System.out.println( t + " je prost.");
                }
                else {
                    System.out.println(t + " je slozen.");
                }
            }

            else

            if( (t/t == 1) && (t/1 == t))
            {
                System.out.println( t + " je prost.");

            }

        }

    }

    public static void main(String[] args) {

        int a = 15;

        prostiBrojevi(a);
    }

}
