public class Euler30 {
    public static int fifthPowers(int i)
    {
        int sum = 0;
        while(i != 0)
        {
            int x = i % 10;
            sum += (int)Math.pow(x, 5);
            i = i/10;
        }
        return sum;
    }

    public static int sol()
    {
        int  sum = 0;
        for(int i = 2; i < 1000000; i++)
        {
            if(i == fifthPowers(i))
            {
                sum += i;
            }
        }
        return sum;
    }
}
