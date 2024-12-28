public class Euler31 {
    /*
    public static int sol(int coins[], int n, int sum)
    {
        if(sum == 0)
        {
            return 1;
        }
        if(sum < 0)
        {
            return 0;
        }
        if(n <= 0)
        {
            return 0;
        }
        return sol(coins, n-1, sum) + sol(coins, n, sum - coins[n-1]);
    }*/
    
	
	private static final int TOTAL = 200;
	private static int[] COINS = {1, 2, 5, 10, 20, 50, 100, 200};
	
	public static String run() {
		// ways[i][j] is the number of ways to use any copies of
		// the first i coin values to form an unordered sum of j
		int[][] ways = new int[COINS.length + 1][TOTAL + 1];
		ways[0][0] = 1;
		for (int i = 0; i < COINS.length; i++) {
			int coin = COINS[i];
			for (int j = 0; j <= TOTAL; j++)
				ways[i + 1][j] = ways[i][j] + (j >= coin ? ways[i + 1][j - coin] : 0);
		}
		return Integer.toString(ways[COINS.length][TOTAL]);
	}
	

}
