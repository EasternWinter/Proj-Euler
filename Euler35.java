public class Euler35 {
    public static boolean isPrime (int num)
    {
        if(num == 1)
            return false;
        for (int i = 2; i*i <= num; i++)
        {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isCircularPrime(int n) {
		String s = Integer.toString(n);
		for (int i = 0; i < s.length(); i++) {
			if (!isPrime(Integer.parseInt(s.substring(i) + s.substring(0, i))))
				return false;
		}
		return true;
	}

    public static int sol()
    {
        int count = 0;
        for(int j = 2; j < 1000000; j++)
        {
            if(isCircularPrime(j))
                count++;
        }
        return count;
    }
}