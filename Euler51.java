public class Euler51{
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
    public static int sol()
    {
        for(int i = 11; i < 10000; i ++)
        {
            if(!isPrime(i))
            {continue;}
            
            String str = Integer.toString(i);
            for(int j = 0; j < str.length(); j++)
            {
                char[] temp = str.toCharArray();
                int count = 0;
                for(int k = 0; k < 10; k++)
                {
                    String dig = Integer.toString(k);
                    temp[j] = dig.charAt(0);
                    int text = Integer.valueOf(temp.toString());
                    if(isPrime(text))
                    {count++;}
                }
                if(count == 8)
                {return i;}
            }
        }
        return -1;
    }
}