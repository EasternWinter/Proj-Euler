public class Euler33 {
    public static Double lowestTerms(Double numer, Double denom)
    {
        Double denominator = denom;
        for(int i = 2; i <= numer/2; i++)
        {
            if(numer % i == 0 && denom % i == 0)
            {
                denominator = denominator / i;
            }
        }
        return denominator;
    }

    public static boolean isCurious(Double numer, Double denom)
    {
        String numerator = String.valueOf(numer);
        String denominator = String.valueOf(denom);

        if(String.valueOf(numerator.charAt(1)).equals(String.valueOf(denominator.charAt(0))))
        {
            Double redNumer = Double.valueOf(numerator.substring(0, 1));
            Double redDenom = Double.valueOf(denominator.substring(1));

            Double redFraction = redNumer/redDenom;
            System.out.println(redFraction);
            Double fraction = numer/denom;
            System.out.println(fraction);

            if (redFraction.equals(fraction))
            {return true;}
            else
            {return false;}
        }
        else{return false;}
    }

    public static boolean isTrivial(Double numer, Double denom)
    {
        String redNum = Double.toString(numer).substring(0, 1);
        String redDen = Double.toString(denom).substring(0, 1);
        Double numerator = Double.valueOf(numer);
        Double denominator = Double.valueOf(denom);
        Double reNum = Double.valueOf(redNum);
        Double reDen = Double.valueOf(redDen);
        Double frac = (double)(numerator/denominator);
        Double newFrac = (double)(reNum/reDen);
        if (frac.equals(newFrac))
        {return true;}
        else
        {return false;}
    }

    public static Double sol()
    {
        //generate denominator
        Double den = 11.0;
        Double prodNumer = 1.0;
        Double prodDenom = 1.0;
        Double count = 4.0;
        while (count > 0 && den < 100)
        {
            //generate numerator
            for(Double i = 10.0; i < den; i++)
            {
                System.out.println(i);
                System.out.println(den);
                if(isCurious(i, den) && !isTrivial(i, den))
                {
                    prodNumer = prodNumer*i;
                    prodDenom = prodDenom*den;
                    count--;
                    System.out.println(prodNumer);
                    System.out.println(prodDenom);
                }
            }
            den++;
        }
        Double result = lowestTerms(prodNumer, prodDenom);
        return result;
    }
}
