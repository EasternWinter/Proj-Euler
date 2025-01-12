public class Euler45 {
    public static boolean isTriangle(double n)
    {
        if((-1 + Math.sqrt(1 + 8 * n))/2 % 1 == 0)
        {return true;}
        else
        {return false;}
    }
    public static double toTriangle(double n)
    {
        double tri = n * (n+1) / 2;
        return tri;
    }
    public static boolean isPentagonal(double num)
    {
        if((1+Math.sqrt(1+24*num))%6==0)
        {return true;}
        else
        {return false;}
    }
    public static boolean isHexagonal(double num)
    {
        if((1 + Math.sqrt(1 + 8 * num)) % 4 == 0)
        {return true;}
        else
        {return false;}
    }
    public static double sol()
    {
        for(double i = 286; ;i++)
        {
            double iTri = toTriangle(i);
            if(isHexagonal(iTri) && isPentagonal(iTri))
            {
                return iTri;
            }
        }
    }
}
