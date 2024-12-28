import java.util.ArrayList;

public class Euler24_2 {
    public static String sol()
    {
        //initialize list in original order
        ArrayList<String> nums = new ArrayList<String>();
        nums.add("0");
        nums.add("1");
        nums.add("2");
        nums.add("3");
        nums.add("4");
        nums.add("5");
        nums.add("6");
        nums.add("7");
        nums.add("8");
        nums.add("9");
        //counts
        int counter = 0;
        //list of factorials 9! to 1!
        ArrayList<Integer> factorials = new ArrayList<Integer>();
        factorials.add(362880);
        factorials.add(40320);
        factorials.add(5040);
        factorials.add(720);
        factorials.add(120);
        factorials.add(24);
        factorials.add(6);
        factorials.add(2);
        factorials.add(1);
        //empty string
        String answer = "";
        //determines index of which factorial
        for (int i = 0; i < factorials.size(); i++)
        {
            //counter, determines index to remove and add to string
            int j = 0;
            //while counter is less than 1000000, add factorial using index
            while (counter <= 1000000)
            {
                //adds
                counter += factorials.get(i);
                if (counter >= 1000000)
                {
                    counter -= factorials.get(i);
                    System.out.println(counter);
                    break;
                }
                else if (counter < 1000000)
                {
                    //increases to show index
                    j++;
                    System.out.println(j);
                }
            }
            //adds the integer 
            if (counter == 999999 && i <= factorials.size()-1)
            {
                answer = answer + nums.get(j);
                nums.remove(j);
                for (int k = 0; k < nums.size(); k++)
                {
                    answer = answer + nums.get(k);
                    System.out.println(answer);
                }
            }
            else
            {
                answer = answer + nums.get(j);
                nums.remove(j);
                System.out.println(nums);
                System.out.println(answer);
            }

        }
        return answer;
    }
}
