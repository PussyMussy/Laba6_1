package Example6;

public class Program {

    public static void numberIncriment()
    {
        int[] a = new int[] {1, 2, 3};
        char[] y = new char[] {' ', ' ', ' '};
        char[] b = new char[] {'x', 'y', 'z'};
        int d =0;

        for (int k = a[1]; k > 0; k--)
        {
            char x = b [d];
            y [d] = x;
            System.out.print("["+y[d]+"]");
            d++;

        }
    }
}