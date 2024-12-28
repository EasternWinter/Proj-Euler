import java.util.ArrayList;

public class Euler26 {
    public static int repetition(int denominator)
    {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        ArrayList<Integer> remainder = new ArrayList<Integer>();
        Integer cur = 1;
        while(true)
        {
            Integer number = cur / denominator;
            cur = cur % denominator;
            if (remainder.contains(cur))
            {
                break;
            }
            digits.add(number);
            remainder.add(cur);
            cur = cur * 10;
        }
        return remainder.size();
    }
    public static int sol()
    {
        int max = 0;
        int pos = 1;
        for (int i = 2; i < 1000; i++)
        {
            if(repetition(i) > max)
            {
                max = repetition(i);
                pos = i;
            }
        }
        return pos;
    }
}
