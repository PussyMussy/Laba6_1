package Example10;
public class Program {
    public static int[] A = {6, 100, 1, 7, 910, 4};
    public static int c =0;
    public static int f =0;
    public static int i = A[1];
    public static void numberLOL() {
        while (f < 6) {
            int b = A[c];
            if (i <= b) {
                if (c >= 5) {
                    f++;
                } else {
                    c++;
                }
            }
            else
            {
                i = b;
            }
        }
        System.out.println("Наименьшее значение в массиве = " +i);
        int[] mass = new int[2];
        mass [0] =i;
        f=0;
        c=0;
        while (f < 6) {
            int b = A[c];
            if (i >= b) {
                if (c >= 5) {
                    f++;
                } else {
                    c++;
                }
            }
            else
            {
                i = b;
            }
        }
        System.out.println("Наибольшее значение в массиве = " +i);
        mass [1] =i;
        System.out.print("["+mass[0]+ "] ");
        System.out.print("["+ mass[1]+"] ");
    }
}