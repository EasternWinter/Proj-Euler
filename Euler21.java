public class Euler21 {
    public static int divisorSum(int num)
    {
        int sum = 0;
        for (int i = 1; i < num; i++){
            if (num % i == 0)
                sum += i;
        }
        return sum;
    }

    public static boolean isAmicableNumbers (int num1, int num2){
        if (num1 == divisorSum(num2) && divisorSum(num1) == num2 && num1 != num2)
            return true;
        else
            return false;
    }
    
    public static int solution (){
        int total = 0;
        for (int i = 1; i < 10000; i++){
            int next = divisorSum(i);
            if (isAmicableNumbers(i, next))
                total = total + i;
        }
        return (total);
    }
}
