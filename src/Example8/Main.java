package Example10;
import static Example10.Program.*;

public class Main {
    public static void main(String[] args) {

        int[] A = { 1, 3, 5, 7, 9 };
        int[] B = { 1, 2, 4 };
        System.out.println("Одномерный массив А:");
        // Отображается массив А:
        showArray(A);
        System.out.println("Его среднее арифметическое:");
        System.out.println(avgMas(A));
        System.out.println("Одномерный массив В:");
        // Отображается массив В:
        showArray(B);
        System.out.println("Его среднее арифметическое:");
        System.out.println(avgMas(B));
    }
}
