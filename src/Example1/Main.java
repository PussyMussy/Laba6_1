package Example1;
import static Example1.Program.*;
public class Main {
    public static void main(String[] args)
    {
        char[] Mass1 = { 'a', 'b', 'c' };
        char[] Mass2 = { 'd' };
        MyClass A = new MyClass('A');
        System.out.println("Вызван конструктор с одним символьным параметром: {0}");
        System.out.println(A.ret_c());
        MyClass B = new MyClass("Строка");
        System.out.println("Вызван конструктор с одним строковым параметром: {0}");
        System.out.println(B.ret_txt());
        MyClass C = new MyClass(Mass1);
        System.out.println("Вызван конструктор с массивом из более одного элемента: {0}");
        System.out.println(C.ret_txt());
        MyClass D = new MyClass(Mass2);
        System.out.println("Вызван конструктор с массивом из одного элемента: {0}");
        System.out.println(D.ret_c());
    }

}
