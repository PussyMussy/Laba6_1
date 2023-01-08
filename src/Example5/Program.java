package Example5;

public class Program {
    static int foo(int n)
    {
        int result = 0;
        for (int i = 1; i <= n; i++)
            result += (int)(Math.pow(i, 2));
        return result;
    }
}
