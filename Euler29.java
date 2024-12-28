import java.util.ArrayList;

public class Euler29 {
    public static int sol()
    {
        //list of distinct results
        ArrayList<Double> aB = new ArrayList<Double>();
        //loop through possible values of a.
        for(int a = 2; a <= 100; a++)
        {
            //goes through possible exponents b.
            for(int b = 2; b <= 100; b++)
            {
                //this is each result of a^b
                double result = Math.pow(a, b);
                //if result not in list, then we add result to list
                if(aB.contains(result) == false)
                {
                    aB.add(result);
                }
            }
        }
        return aB.size();
    }
}
