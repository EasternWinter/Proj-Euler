import java.util.ArrayList;
import java.util.List;

public class Euler24_1 {
    public static <E> List<List<E>> generatePerm(List<E> original) {
        if (original.isEmpty()) {
          List<List<E>> result = new ArrayList<>();
          result.add(new ArrayList<>());
          return result;
        }
        E firstElement = original.remove(0);
        List<List<E>> returnValue = new ArrayList<>();
        List<List<E>> permutations = generatePerm(original);
        for (List<E> smallerPermutated : permutations) {
          for (int index = 0; index <= smallerPermutated.size(); index++) {
            List<E> temp = new ArrayList<>(smallerPermutated);
            temp.add(index, firstElement);
            returnValue.add(temp);
          }
        }
        return returnValue;
    }

    public static int permutation()
    {
        int[] numList = new int[10];
        int start = 0;
        int q = 1;
        int result = 0;

        for (int i = 0; i < 10; i++)
        {
            q = q*i;
            numList[i] = i;
        }
        for (int i = 10; i > 0; i--)
        {
            int counter = 0;
            q = q/i;
            while (start + q < 1000000)
            {
                start += q;
                counter += 1;
            }
            result = result*10 + numList[counter];
        }
        return result;
    }

    public static String run()
    {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = i;
        }

        // for (int i = 0; i <= 999999; i++)
        // {
        //     if (!Library.nextPermutation(array))
        //     {
        //         throw new AssertionError();
        //     }
        // }
        String ans = "";
        for (int i = 0; i < array.length; i++)
        {
            ans += array[i];
        }
        return ans;
    }
}
