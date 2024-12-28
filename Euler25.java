import java.math.BigInteger;

public class Euler25 {
    public static double fib()
    {
        BigInteger first = BigInteger.ONE;
        BigInteger second = BigInteger.ONE;
        int count = 2;
        BigInteger lim = (new BigInteger("10")).pow(999);
        while (second.divide( lim ).compareTo(BigInteger.ONE)< 0)
        {
            //next number
            BigInteger third = first.add(second);
            //shifting values
            first = second;
            second = third;
            count++;
        }
        return count;
    }
    public static int fibbonaci()
    {
        int i = 0;
        int count = 2;
        BigInteger limit = (new BigInteger("10")).pow(999);
        BigInteger[] fib = new BigInteger[3];

        fib[0] = BigInteger.ONE;
        fib[2] = BigInteger.ONE;

        while ((fib[i]).compareTo(limit) < 0)
        {
            i = (i + 1) % 3;
            count++;
            fib[i] = fib[(i + 1) % 3].add(fib[(i + 2) % 3]);
        }
        return count;
    }
}
