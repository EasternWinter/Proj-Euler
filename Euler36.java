public class Euler36 {
    public static boolean isPalindrome(String word)
    {
        String rev = "";
        for (int i = word.length()-1; i>=0; i--)
        {
            rev = rev + word.charAt(i);
        }
        return rev.equals(word);
    }

    public static double sol()
    {
        double sum = 0;
        for(int i = 1; i < 1000000; i++)
        {
            if(isPalindrome(Integer.toString(i)) && isPalindrome(Integer.toBinaryString(i)))
                sum = sum + i;
        }
        return sum;
    }
}