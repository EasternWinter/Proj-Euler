public class Euler38 {
    public static boolean isPandigital(String s) {
        if (s.length() != 9)
        {
            return false;
        }
        for (int i = 1; i <= 9; i++)
        {
            if (!s.contains(Integer.toString(i)))
            {
                return false;
            }
        }
        return true;
    }
    public static int sol() {
        int max = 0;
        for (int i = 1; i < 10000; i++)
        {
            String s = "";
            for (int j = 1; s.length() < 9; j++)
            {
                s += Integer.toString(i * j);
            }
            if (isPandigital(s))
            {
                max = Math.max(max, Integer.parseInt(s));
            }
        }
        return max;
    }
}
