package Example5;

public static class foo {
    int n=4;
    {
        if (n <= 1)
            return n;
        else
        {
            int result = 0;
            for (int i = 1; i <= n; i++)
                result += Convert.ToInt32(Math.Pow(i, 2));
            return result;
        }


}
