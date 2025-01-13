public class Euler46 {
    public static boolean isPrime(double num)
    {
        for(double i = 2; i <= Math.sqrt(num); i++)
        {
            if(num % i != 0)
            {continue;}
            else
            {return false;}
        }
        return true;
    }
    public static boolean isComposite(double num)
    {
        for(double i = 2; i <= Math.sqrt(num); i++)
        {
            if(num % i == 0)
            {return true;}
            else
            {continue;}
        }
        return false;
    }
    public static boolean isGoldbach(double num)
    {
        if(isPrime(num) || num%2==0)
        {return true;}
        for(double i = 1; i * i * 2 <= num; i++)
        {
            if(isPrime(num-i*i*2))
            {return true;}
        }
        return false;
    }
    public static double sol()
    {
        for(double i = 9; ; i++)
        {
            if(!isGoldbach(i))
            {return i;}
        }
    }
}
