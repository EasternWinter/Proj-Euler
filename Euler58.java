//import java.math.BigInteger;

public class Euler58 {
    public static boolean isPrime(int n)
    {
        if(n < 2)
        {return false;}
        for(int i = 2; i <= Math.sqrt(n); i++)
        {
            if(n % i == 0)
            {return false;}
        }
        return true;
    }
    public static int amountPrim(int start, int end)
    {
        int count = 0;
        for (int i = start; i <= end; i++)
        {
            if(isPrime(i))
            {count++;}
        }
        return count;
    }
    public static void sol()
    {
        int primCount = 8;
        int start = 0;
        for(int i = 8; ; i+=2)
        {
            int end = i*i;
            primCount += amountPrim(start, end);
        }
    }
}