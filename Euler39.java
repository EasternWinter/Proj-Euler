import java.util.List;

public class Euler39 {
    public static Boolean isRightTriangle(List<Integer> sides)
    {
        int a = sides.get(0);
        int b = sides.get(1);
        int c = sides.get(2);
        if (a * a + b * b == c * c)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static int sol()
    {
        int maxCount = 0;
        int perimeter = 0;
        for(int p = 1; p <= 1000; p++)
        {
            int count = 0;
            for(int a = 1; a < p; a++)
            {
                for(int b = a; b < p; b++)
                {
                    int c = p - a - b;
                    if (isRightTriangle(List.of(a, b, c)))
                    {
                        count++;
                    }
                }
            }
            if (count > maxCount)
            {
                maxCount = count;
                perimeter = p;
            }
        }
        return perimeter;
    }
}
