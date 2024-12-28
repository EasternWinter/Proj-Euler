public class Euler37{
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
        int count = 11;
        String number = "11";
        int sum = 0;
        while (count > 0)
        {
            for(int i = 0; i < number.length(); i++)
            {
                if(!isPrime(Integer.parseInt(number.substring(i))) || !isPrime(Integer.parseInt(number.substring(0, number.length()-i))))
                {
                    break;
                }
                else if(i == number.length()-1)
                {
                    sum += Integer.parseInt(number);
                    System.out.println(number);
                    count--;
                }
            }
            number = Integer.toString(Integer.parseInt(number) + 2);
        }
        return sum;
    }
}