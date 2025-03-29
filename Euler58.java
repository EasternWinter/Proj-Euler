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
    public static int sol()
    {
        int numPrimes = 0;
        for(int i = 1; ;i+=2)
        {
            for(int j = 0; j<4; j++)
            {
                if(isPrime(i*i-j*(i-1)))
                {numPrimes++;}
            }
            //i*2-1 is number of elements in the diagonals.
            if(i>1 && numPrimes*10<i*2-1)
            {return i;}
        }
    }
}