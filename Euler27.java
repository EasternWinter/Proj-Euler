public class Euler27 {
    public static boolean isPrime (int num)
    {
        if(num == 1)
        {
            return false;
        }
        for (int i = 2; i*i <= num; i++)
        {
            if (num % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    /*public static int consecutivePrimes(int a, int b)
    {
        for(int i = 0; ; i++)
        {
            int n = i*i + i*a + b;
            if(n<0 || !isPrime(n))
            {
                return i;
            }
        }
    }*/

    public static int sol()
    {
        int max = 0;
        int bestA = 0;
        int bestB = 0;
        for(int a = -1000; a <= 1000; a++)
        {
            for(int b = -1000; b <= 1000; b++)
            {
                int n = 0;
                while(isPrime(Math.abs(n*n + n*a + b)))
                {
                    n++;
                }
                if(n > max)
                {
                    max = n;
                    bestA = a;
                    bestB = b;
                }
            }
        }
        return bestA * bestB;
    }
}
