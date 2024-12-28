import java.util.ArrayList;
import java.util.HashMap;

public class Euler23 
{
    public static boolean isAbundantNum (int num)
    {
        int sum = 0;
        for (int i = 1; i <= num/2; i++)
        {
            if (num % i == 0)
            {
                sum += i;
            }
        }
        if (sum > num) 
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static int nonAbundantSums ()
    {
        //total sum from 1 to 28123
        int total = 395465626;
        //list of abundant numbers
        ArrayList<Integer> abundantNumbers = new ArrayList<Integer> ();
        for (int i = 1; i <= 28123; i++)
        {
            if (isAbundantNum(i)){
                abundantNumbers.add(i);
            }
        }
        //first loop is adding combination
        HashMap<Integer, Integer> abundantNumSums = new HashMap<Integer, Integer> ();
        for (int j = 0; j < abundantNumbers.size(); j++)
        {
            for (int k = j; k < abundantNumbers.size(); k++)
            {
                var num1 = abundantNumbers.get(j);
                var num2 = abundantNumbers.get(k);
                if ((num1 + num2) > 28123 )
                {
                    break;
                }
                else if ( abundantNumSums.get(num1 + num2) == null)
                {
                    total = total - (num1 + num2);
                    abundantNumSums.put(num1 + num2, num1+num2);
                    //System.out.println(total);
                }
            }
        }
        return total;
    }
}
