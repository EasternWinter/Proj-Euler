import java.math.BigInteger;

public class Euler48 {
    public static BigInteger sol()
    {
        BigInteger modulus = BigInteger.TEN.pow(10);
        BigInteger sum = BigInteger.ZERO;
        for(int i = 1; i <= 1000; i++)
        {
            sum = sum.add(BigInteger.valueOf(i).pow(i));
        }
        return sum.mod(modulus);
    }
}
