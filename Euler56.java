import java.math.BigInteger;

public class Euler56 {
    public static int digitSum(BigInteger n) {
		int sum = 0;
		String s = n.toString();
		for (int i = 0; i < s.length(); i++)
			sum += s.charAt(i) - '0';
		return sum;
	}
    public static int sol()
    {
        int max = 0;
        for(int a = 1; a < 100; a++)
        {
            for(int b = 1; b < 100; b++)
            {
                BigInteger temp = BigInteger.valueOf(a).pow(b);
                int sum = digitSum(temp);
                if(sum > max)
                {max = sum;}
            }
        }
        return max;
    }
}