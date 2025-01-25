public class Euler50 {
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
        int sum = 0;
        int max = 0;
        //Adjust start i each time to attempt to get a larger value.
        for(int i = 7; i < 1000000; i++)
        {
            if(isPrime(i))
            {
                sum += i;
                if(isPrime(sum) && sum > max && sum < 1000000)
                {
                    max = sum;
                }
                else if(sum > 1000000)
                {break;}
            }
        }
        return max;
    }
}