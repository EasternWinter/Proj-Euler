import java.util.ArrayList;

public class Euler43 {
    /*public static boolean isPandigital(String s)
    {
        for (int i = 0; i <= s.length(); i++)
        {
            if (!s.contains(Integer.toString(i)))
            {
                return false;
            }
        }
        return true;
    }*/
    public static boolean nextPermutation(int[] arr) {
		int i = arr.length - 1;
		for (; i > 0 && arr[i - 1] >= arr[i]; i--);
		if (i <= 0)
			return false;
		{
			int j = arr.length - 1;
			for (; arr[j] <= arr[i - 1]; j--);
			int temp = arr[i - 1];
			arr[i - 1] = arr[j];
			arr[j] = temp;
		}
		for (int j = arr.length - 1; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		return true;
	}
    private static long toInteger(int[] digits, int off, int len) {
		long result = 0;
		for (int i = off; i < off + len; i++)
			result = result * 10 + digits[i];
		return result;
	}
    public static double sol()
    {
        double sum = 0;
        ArrayList<Integer> prim = new ArrayList<Integer>();
        prim.add(2);
        prim.add(3);
        prim.add(5);
        prim.add(7);
        prim.add(11);
        prim.add(13);
        prim.add(17);
        /*for(double i = 1023456789.0; i <= 9876543210.0; i++)
        {
            String strI = Double.toString(i);
            String real = strI.substring(0, strI.length()-2);
            if(isPandigital(real))
            {
                for(int j = 1; j < real.length()-2; j++)
                {
                    if(Double.valueOf(real.substring(j, j+3)) % prim.get(j-1) == 0)
                    {continue;}
                    else
                    {break;}
                }
                sum += i;
            }
        }*/
        //long sum = 0;
		int[] digits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		outer:
		do {
			for (int i = 0; i < prim.size(); i++) {
				if (toInteger(digits, i + 1, 3) % prim.get(i) != 0)
					continue outer;
			}
			sum += toInteger(digits, 0, digits.length);
		} while (nextPermutation(digits));
        return sum;
    }
}
