package Vezbanja.pastebin.drugideo;

public class Duplikati {
    public static int brojDuplikata(String[] imena) {
        int brojDuplikata = 0;

        for (int i = 0; i < imena.length; i++) {
            for (int j = i + 1; j < imena.length; j++) {
                if (imena[i].equals(imena[j])) {
                    brojDuplikata++;
                    break;
                }
            }
        }

        return brojDuplikata;
    }

    public static void main(String[] args) {
        String[] imena = {"Ana", "Marko", "Jovan", "Ana", "Jovan", "Elena", "Petar"};
        int broj = brojDuplikata(imena);
        System.out.println("Broj duplikata imena: " + broj);
    }
}