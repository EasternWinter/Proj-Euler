import java.util.Arrays;

public class Euler52 {
    public static int sol()
    {
        int num = 1;
        while(true)
        {
            char[] ori = Integer.toString(num).toCharArray();
            Arrays.sort(ori);
            for(int i = 2; i <= 6; i++)
            {
                char[] n = Integer.toString(i * num).toCharArray();
                Arrays.sort(n);
                if(!Arrays.equals(ori, n))
                {break;}
                else if(i==6)
                {return num;}
            }
            num++;
        }
    }
}
