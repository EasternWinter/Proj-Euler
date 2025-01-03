public class Euler41 {
    public static boolean isPandigital(String s) {
        for (int i = 1; i <= s.length(); i++)
        {
            if (!s.contains(Integer.toString(i)))
            {
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime(int n)
    {
        if(n < 2) return false;
        for(int i = 2; i <= Math.sqrt(n); i++)
        {
            if(n % i == 0) return false;
        }
        return true;
    }
    public static int sol()
    {
        int max = 0;
        for(int i = 1; i < 987654321; i++)
        {
            if(isPandigital(Integer.toString(i)) && isPrime(i) && i > max)
            {
                max = i;
            }
        }
        return max;
    }
}
