package Example7;
public class Program {
   public static int[] mas()
    {
        char [] a ={ 'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        int dlina = 7;
        int[] num = new int[dlina];
        for(int i = 0; i < dlina; i++)
        {
            num[i] = a[i];
            System.out.println(num[i]);
        }
        return num;

    }
    }
