import java.util.*;

public class Euler32{
    /*public static boolean isPandigital(int a, int b, int c)
    {
        ArrayList<Integer> digits = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        
        String combDigits = Integer.toString(a) + Integer.toString(b) + Integer.toString(c);
        if(combDigits.length() == digits.size())
        {
            for(int i = combDigits.length() - 1; i <= 0; i--)
            {
                int x = Integer.parseInt(String.valueOf(combDigits.charAt(i)));
                if(digits.contains(x))
                {
                    digits.remove(digits.indexOf(x));
                }
                else{return false;}
            }
        }        
        return false;
    }*/
    public static boolean isPandigital(String n)
    {
        if(n.length() != 9)
        {return false;}
        char[] temp = n.toCharArray();
        Arrays.sort(temp);
        return new String(temp).equals("123456789");
    }

    /*public static int findRemain(int s)
    {
        String allDigits = "123456789";
        char[] input = String.valueOf(s).toCharArray();
        for(int i=0; i < input.length; i++)
        {
            allDigits.replace(String.valueOf(input[i]), "");
        }
        return Integer.valueOf(allDigits);
    }*/

    public static boolean hasPanProd(int s)
    {
        if (isPandigital(String.valueOf(s)))
            return false;
        int squareRoot = (int) Math.sqrt(s);
        for(int i = 2; i <= squareRoot; i++)
        {
            if(s % i == 0 && isPandigital(""+s+""+i+""+s/i))
            {return true;}
        }
        return false;
    }

    public static int sol()
    {
        int sum = 0;
        //We can tell that product can atmost have 4 digits
        //If we have 5 digits, we need atleast a total of 5 digits in multiplicands.
        //99*99 = 9801.
        for(int i = 1234; i <= 10000; i++)
        {
            if(hasPanProd(i))
            {
                sum += i;
            }
        }
        return sum;
    }
}
