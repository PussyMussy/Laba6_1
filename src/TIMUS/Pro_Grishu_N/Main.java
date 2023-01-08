package TIMUS.TR;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int b = (12-n)*45;
        if (b<240)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
