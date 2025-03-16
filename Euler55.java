public class Euler55 {
    public static String reverse(int num)
    {
        String n = Integer.toString(num);
        String rev = "";
        for (int i = n.length() - 1; i >= 0; i--)
        {
            rev = rev + n.charAt(i);
        }
        return rev;
    }
    public static Boolean isPalindrome(int num)
    {
        String rev = reverse(num);
        return rev.equals(Integer.toString(num));
    }
    public static Boolean isLychrel(int num)
    {
        int ori = num;
        int rev = Integer.parseInt(reverse(num));
        for (int i = 0; i < 50; i++)
        {
            int sum = ori + rev;
            if (isPalindrome(sum))
            {
                return true;
            }
            else
            {
                ori = sum;
                rev = Integer.parseInt(reverse(sum));
            }
        }
        return false;
    }
    public static int sol()
    {
        int count = 0;
        for (int i = 1; i < 10000; i++)
        {
            if (isLychrel(i))
            {count++;}
        }
        return count;
    }
}
