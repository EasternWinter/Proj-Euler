public class Euler44 {
    public static boolean isPentagonal(double num)
    {
        if((1+Math.sqrt(1+24*num))%6==0)
        {return true;}
        else
        {return false;}
    }
    public static double toPentagonal(double i)
    {
        double pent = i*(3*i-1)/2;
        return pent;
    }
    public static Double sol()
    {
        double minD = -1; //-1 for not found
        for(int i = 2; ; i++)
        {
            double pentI = toPentagonal(i);
            double nextPent = toPentagonal(i-1);
            if(minD != -1 && pentI - nextPent >= minD)
            {break;}
            for(int j = i-1; j>=1; j--)
            {
                double pentJ = toPentagonal(j);
                double dif = pentI-pentJ;
                if(minD != -1 && dif >= minD)
                {break;}
                else if(isPentagonal(pentI+pentJ) && isPentagonal(dif))
                {minD = dif;}
            }
        }
        return minD;
    }
}
