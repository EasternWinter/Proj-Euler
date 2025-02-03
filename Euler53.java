public class Euler53 {
    public static double combinatorics(double n, double r)
    {
        double nFact = 1;
        for(double i = 1; i <= n; i++)
        {nFact *= i;}

        double rFact = 1;
        for(double j = 1; j <= r; j++)
        {rFact *= j;}
        System.out.println(nFact);
        System.out.println(rFact);

        double nSubR = 1;
        if(n > r)
        {
            
            for(double k = 1; k <= n-r; k++)
            {nSubR *= k;}
        }
        System.out.println(n);
        System.out.println(r);
        double fin = (nFact / (rFact * nSubR));
        return fin;
    }
    
    public static int sol()
    {
        int count = 0;
        for(int n = 1; n <= 100; n++)
        {
            for(int r = 1; r <= n; r++)
            {
                double comb = combinatorics(n, r);
                if(comb >= 1000000)
                {count++;}
            }
        }
        return count;
    }
}
