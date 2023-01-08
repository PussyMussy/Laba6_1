package Example10;

public class Program {
    // Метод для вычисления среднего арифметического элементов в массиве:
    static double avgMas(int[] nums)
    {
        // Начальное значение суммы:
        int s = 0;
        // Вычисление суииы элементов:
        for (int k = 0; k < nums.length; k++)
        {
            s += nums[k];
        }
        // Результат метода.
        // Возврат среднего арифметического:
        return (double)s / nums.length;
    }

    // Метод для отображения одномерного
    // целочисленного массива:
    public static void showArray(int[] nums)
    {
        // Перебор элементов массива:
        for (int k = 0; k < nums.length; k++)
        {
            // Отображение значения элемента:
            System.out.println("| {0} " + nums[k]);
        }
        System.out.println("|");

}}
