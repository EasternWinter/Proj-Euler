import java.math.BigInteger;

public class Euler57 {
    public static int sol()
    {
        int count = 0;
        BigInteger preN = BigInteger.valueOf(1);
        BigInteger preD = BigInteger.valueOf(1);
        BigInteger num = BigInteger.valueOf(3);
        BigInteger den = BigInteger.valueOf(2);
        for(int i = 1; i <= 1000; i++)
        {
            BigInteger tempN = num;
            BigInteger tempD = den;
            num = num.multiply(BigInteger.valueOf(2)).add(preN);
            den = den.multiply(BigInteger.valueOf(2)).add(preD);
            preN = tempN;
            preD = tempD;

            if(String.valueOf(num).length() > String.valueOf(den).length())
            {count++;}
        }
        return count;
    }
}