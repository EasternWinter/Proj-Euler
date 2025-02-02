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
        for(int i = 11; i < 1000000; i ++)
        {
            if(!isPrime(i))
            {continue;}

            String str = Integer.toString(i);
            for(int j = 0; j < str.length(); j++)
            {
                char[] temp = str.toCharArray();
                int count = 0;
                for(Integer k = 0; k < 10; k++)
                {
                    if(!k.equals(Integer.valueOf(String.valueOf(temp[j]))))
                    {
                        String dig = Integer.toString(k);
                        temp[j] = dig.charAt(0);
                        String n = "";
                        for(int l = 0; l < str.length(); l++)
                        {n = n + String.valueOf(temp[l]);}
                        int text = Integer.valueOf(n);
                        if(isPrime(text))
                        {count++;}
                    }
                }
                if(count == 8)
                {return i;}
            }
        }
        return -1;
    }
}