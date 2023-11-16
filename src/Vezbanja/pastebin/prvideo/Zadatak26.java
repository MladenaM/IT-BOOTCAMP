package Vezbanja.pastebin.prvideo;
import java.util.Scanner;
public class Zadatak26 {

    //26.* Korisnik unosi pozitivan ceo broj n, n >= 2 sa konzole. Zatim se unose imena korisnika. Ispisati "da" ako
    //	su uneta dva korisnika sa istim imenom za redom (jedan za drugim), a "ne" inace.
    //	Npr:
    //	"Ana", "Marija", "Milica", "Milica", "Jelena", "Zorica" -> "da" (zbog "Milica", "Milica")
    //	"Branko", "Aleksandar", "Marko" -> "ne"
    //	"Tara", "Jana", "Tara", "Jana" -> "ne" (iako imamo duplikate nisu uneti za redom)

            static boolean imena(int n)
            {
                boolean flag=false;
                String predhodnoIme="";
                    Scanner sc = new Scanner(System.in);


                        for (int i = 0 ; i < n; i ++)
                        {
                            System.out.println("Uneti ime: ");
                            String ime = sc.nextLine();
                            if ( ime.equals(predhodnoIme))
                            {
                                flag = true;
                            }
                            predhodnoIme = ime;

                        }
                        return flag;



            }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti broj: ");
        int n = sc.nextInt();
        if (imena(n))
        {
            System.out.println("da");
        }
        else System.out.println("ne");

    }


}
