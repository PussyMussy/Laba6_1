package Example41;
public class Program {
    public static int factorial(int n)
    {
        //рекурсия
        if (n == 1 || n == 2) return n;
        else return n * factorial(n - 2);
    }
}
