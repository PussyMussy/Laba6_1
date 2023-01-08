package Example3;
public class Program {
    public static int Max, Min;
    public static double Average;
    public static int[] Array = {-67, 90 , 2 , 200, 36, 28};
    static public void Method1() // здесь вводится массив с данными
    {
        int sum = 0;
        Max = Array[0];
        Min = Array[0];
        for (int j : Array) {
            sum += j;
            if (j > Max) Max = j;
            if (j < Min) Min = j;
        }
        Average = (double)sum / Array.length;
    }
}
