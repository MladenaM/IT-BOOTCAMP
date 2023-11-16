public class Case1 {


    //obrnuti niz

    static int[] obrnutiString( int[] n)
    {
        int[] obrnutiNiz = new int[n.length];
        int j = 0;

        for (int i = n.length -1; i >= 0; i--)
        {
            obrnutiNiz[j]=n[i];
            j++;
        }

        return obrnutiNiz;
    }

    public static void main(String[] args) {
        int[] niz = new int[]{1,2,3,3,5,6};

        int[] obrnuti = obrnutiString(niz);
        for (int i = 0; i < obrnuti.length; i++)
        {
            System.out.print(obrnuti[i]);

        }
    }
}
