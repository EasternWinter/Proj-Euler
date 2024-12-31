public class Euler40 {
    public static Double sol()
    {
        StringBuilder dec = new StringBuilder();
        Double product = 1.0;
        for(int i = 1; i <= 1000000; i++)
        {
            dec = dec.append(i);
            /*if (i % 10 == 0)
            {
                product = product * Integer.valueOf(dec.charAt(i));
            }*/
        }
        String decimal = dec.toString();
        for(int i = 0; i <= 6; i++)
        {
            int index = (int)Math.pow(10, i)-1;
            int dig = Integer.parseInt(decimal.substring(index, index+1));
            product = product * dig;
        }
        return product;
    }
}
