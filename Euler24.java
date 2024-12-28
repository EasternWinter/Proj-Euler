import java.util.ArrayList;

public class Euler24
{
    public static String solution()
    {
        ArrayList<String> num = new ArrayList<String>();
        String initial = "0123456789";
        num.add(initial);
        char[] arr = initial.toCharArray();

        for (int j = 0; j < arr.length; j++)
        {
            String str = "";
            if (!str.contains(Integer.toString(j)))
            {
                str += Integer.toString(j);
                solution();
            }
            num.add(str);
        }
        return num.get(0);
        /*//first digit
        for (int i = 0; i <= 9; i++)
        {
            //second digit
            for (int j = 0; j <= 9; j++)
            {
                //if first not equal to second, continue
                if (j != i)
                {
                    //third digit
                    for (int k = 0; k <= 9; k++)
                    {
                        //if all digits are different, add to list
                        if (k != j && k != i)
                        {
                            num.add(i*100 + j*10 + k);
                            if (num.size() == 1000000)
                            {
                                break;
                            }
                        }
                    }
                }
            }
        }
        //return digit at index 999999, or millionth
        return num.get(999999);*/
    }
}
