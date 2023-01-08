package Example1;
public class Program {
    public static class MyClass
    {
        private char symb; // Символьное
        private String txt; // Текстовое
        public MyClass(char s)
        {
            symb = s;
        }
        // С одним строковым аргументом:
        public MyClass(String t)
        {
            txt = t;
        }
        // С символьным массивом:
        public MyClass(char[] c)
        {
            // Проверка на количество символов в массиве
            if (c.length == 1)
                symb = c[0];
            else
            {
                // Формирование строки:
                txt = "";
                for (int k = 0; k < c.length; k++)
                {
                    txt += c[k];
                }
            }
        }
        public char ret_c()
        {
            return symb;
        }
        public String ret_txt()
        {
            return txt;
        }
    }
}
