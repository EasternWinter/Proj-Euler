import java.math.BigInteger;

public class Euler55 {
    public static String reverse(BigInteger num)
    {
        String n = String.valueOf(num);
        String rev = "";
        for (int i = n.length() - 1; i >= 0; i--)
        {
            rev = rev + n.charAt(i);
        }
        return rev;
    }
    public static Boolean isPalindrome(BigInteger num)
    {
        String rev = reverse(num);
        String n = String.valueOf(num);
        return rev.equals(n);
    }
    public static Boolean isLychrel(int num)
    {
        BigInteger ori = BigInteger.valueOf(num);
        BigInteger rev = BigInteger.valueOf(Integer.parseInt(reverse(ori)));
        for (int i = 0; i < 49; i++)
        {
            BigInteger sum = ori.add(rev);
            if (isPalindrome(sum))
            {
                return true;
            }
            else
            {
                ori = sum;
                rev = BigInteger.valueOf(Integer.parseInt(reverse(sum)));
            }
        }
        return false;
    }
    public static int sol()
    {
        int count = 0;
        for (int i = 1; i < 10000; i++)
        {
            if (isLychrel(i))
            {count++;}
        }
        return count;
    }
}
