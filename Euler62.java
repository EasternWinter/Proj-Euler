import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Euler62 {
    /*public static String cubeClass(int n)
    {
        char[] digits = BigInteger.valueOf(n).pow(3).toString().toCharArray();
        Arrays.sort(digits);
        return new String(digits);
    }
    public static int count = 0;
    public static boolean isCube(long input) {
        double cubeRoot = Math.pow(input,1.0/3.0);
        return Math.round(cubeRoot) == cubeRoot;
    }
    public static void permutation(String str) {
        permutation("", str); 
    }
    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0)
        {
            BigInteger num = new BigInteger(prefix);
            if(isCube(num.longValue()))
            {count++;}
        }
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }
    public static String sol()
    {
        for(int i = 11; ; i++)
        {
            BigInteger cube = BigInteger.valueOf(i).pow(3);
            String str = String.valueOf(cube);
            permutation(str);
            if(count == 5)
            {return str;}
            else{count = 0;}
        }
    }*/
    private static String getCubeNumberClass(int x) {
		char[] digits = cube(x).toString().toCharArray();
		Arrays.sort(digits);
		return new String(digits);
	}
	private static BigInteger cube(int x) {
		return BigInteger.valueOf(x).pow(3);
	}
    public static String sol() {
		int numDigits = 0;
		Map<String,Integer> lowest = new HashMap<>();
		Map<String,Integer> counts = new HashMap<>();
		for (int i = 0; ; i++) {
			String numClass = getCubeNumberClass(i);
			
			if (numClass.length() > numDigits) {
				//Process and flush data for smaller number of digits
				int min = Integer.MAX_VALUE;
				for(String nc : counts.keySet()) {
					if (counts.get(nc) == 5)
						min = Math.min(lowest.get(nc), min);
				}
				if(min != Integer.MAX_VALUE)
					return cube(min).toString();
				
				lowest.clear();
				counts.clear();
				numDigits = numClass.length();
			}
			
			if(!lowest.containsKey(numClass)) {
				lowest.put(numClass, i);
				counts.put(numClass, 0);
			}
			counts.put(numClass, counts.get(numClass) + 1);
		}
	}
}
