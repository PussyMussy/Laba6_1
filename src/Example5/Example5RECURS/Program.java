package Example5RECURS;

public class Program {
    static int foo(int n)
    {
        if (n <= 1)
            return n;
        else
            return foo(n - 1) + n * n;
    }}