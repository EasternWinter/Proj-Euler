public class Euler56 {
    public static int digitSum(double num)
    {
        int sum = 0;
        String n = String.valueOf(num);
        for (int i = 0; i < n.length(); i++)
        {
            if(Character.isDigit(n.charAt(i)))
            {sum += Integer.valueOf(n.substring(i, i+1));}
        }
        return sum;
    }
    public static int sol()
    {
        int max = 0;
        for(double a = 2; a < 100; a++)
        {
            for(double b = 1; b < 100; b++)
            {
                double temp = Math.pow(a, b);
                int sum = digitSum(temp);
                if(sum > max)
                {max = sum;}
            }
        }
        return max;
    }
}