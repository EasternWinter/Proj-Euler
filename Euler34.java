public class Euler34 {
    public static int factorial(int num)
    {
        if(num > 1)
        {
            int product = 1;
            for(int i = 1; i<= num; i++)
            {
                product = product * i;
            }
            return product;
        }
        else
            return 1;
    }

    public static boolean isCurious(int number)
    {
        Integer num = number;
        Integer sum = 0;
        while(num != 0)
        {
            sum += factorial(num%10);
            num = num/10;
        }
        if(sum.equals(number))
            return true;
        else
            return false;
    }

    public static int sol()
    {
        int sum = 0;
        int bigNum = 0;
        int count = 1;
        int nines = 9;
        while(true)
        {
            int nine = factorial(9)*count;
            if(nine <= nines)
            {
                bigNum = nines;
                break;
            }
            else
            {
                nines = nines*10 + 9;
                count++;
            }
        }
        System.out.println(bigNum);
        for(int i = 3; i <= bigNum; i++)
        {
            if(isCurious(i))
            {
                sum += i;
            }
        }
        return sum;
    }
}
