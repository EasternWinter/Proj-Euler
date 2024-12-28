public class Euler28 {
    public static int sumOfDiagonals()
    {
        int dimension = 1001;
        int sum = 1;
        for(int i = dimension; i >= 3; i -= 2)
        {
            sum += 4*i*i - 6*(i-1);
        }
        return sum;
    }
}
