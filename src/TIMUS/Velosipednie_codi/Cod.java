package TIMUS.Velosipednie_codi;
import java.util.Scanner;

public class Cod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int code1 = in.nextInt();
        int code2 = in.nextInt();
        int a = code1 % 2;
        int b = code2 % 2;
        if (a == 0 | b != 0 )
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
