package Vezbanja.pastebin.prvideo;
import java.util.Scanner;
public class Zadatak7 {

    //7. Za unet negativan ceo broj n, ispisati sve brojeve od i zakljucno sa n do i zakljucno sa 0.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite negativan broj");
        int n = sc.nextInt();
        int broj = 0;

        while(n <= 0)
        {
            System.out.println(n);
            n++;
        }
    }

}
