public class Euler47 {
    public static boolean isPrime(double n)
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
    public static boolean has4(double num)
    {
        int factor = 2;
        int count = 0;
        double number = num;
        while(number != 1)
        {
            if(number % factor == 0 && isPrime(factor))
            {
                count++;
                while(number % factor==0)
                {number /= factor;}
            }
            
            if(factor % 2 == 0)
            {factor++;}
            else
            {factor+=2;}
        }
        return count==4;
    }
    public static double sol()
    {
        for(double i = 2; ; i++)
        {
            if(has4(i) && has4(i+1) && has4(i+2) && has4(i+3))
            {return i;}
        }
    }
}
