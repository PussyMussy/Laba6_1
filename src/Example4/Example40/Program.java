package Example4;
public class Program {
    public static int factorial(int n)
    {
        int res = 1, val = 0 ;
        for (int i = 0; i < n; i+=2)
        {
            res *= n - val;
            val += 2;
        }
        System.out.println();
        return res;
    }
}
