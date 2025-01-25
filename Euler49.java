import java.util.Arrays;

public class Euler49 {
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
    public static boolean sameDigits(int x, int y)
    {
        char[] xDig = Integer.toString(x).toCharArray();
        char[] yDig = Integer.toString(y).toCharArray();
        Arrays.sort(xDig);
        Arrays.sort(yDig);
        return Arrays.equals(xDig, yDig);
    }
    public static String sol()
    {
        for(int i = 1000; i<10000; i++)
        {
            if(isPrime(i))
            {
                for(int j = 1; j<10000; j++)
                {
                    int a = i+j;
                    int b = a+j;
                    if(sameDigits(i, a) && sameDigits(a, b) && isPrime(a) && isPrime(b) && (i!=1487&&a!=3817) && a<10000 && b<10000 && sameDigits(b, i))
                    {
                        return "" + Integer.toString(i) + Integer.toString(a) + Integer.toString(b);
                    }
                }
            }
        }
        return null;
    }
}
