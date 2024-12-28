import java.util.ArrayList;

public class Euler17 {
    public static void main(String[] args) {
        ArrayList<Integer> n1 = new ArrayList<Integer>();
        n1.add(0); //zero
        n1.add(3); //one
        n1.add(3);//two
        n1.add(5);//three
        n1.add(4);
        n1.add(4);
        n1.add(3);
        n1.add(5);
        n1.add(5);
        n1.add(4);
        ArrayList<Integer> n10 = new ArrayList<Integer>();
        n10.add(0);//zero
        n10.add(3);//ten
        n10.add(6);
        n10.add(6);
        n10.add(5);
        n10.add(5);
        n10.add(5);
        n10.add(7);
        n10.add(6);
        n10.add(6);
        ArrayList<Integer> n11 = new ArrayList<Integer>();
        n11.add(0);
        n11.add(6);//eleven
        n11.add(6);//twelve
        n11.add(8);
        n11.add(8);
        n11.add(7);
        n11.add(7);
        n11.add(9);
        n11.add(8);
        n11.add(8);
        ArrayList<Integer> n = new ArrayList<Integer>();
        n.add(7);//hundred
        n.add(10);//hundred and
        n.add(11);//one thousand
        int n1to99x10 = (n1.stream().mapToInt(Integer::intValue).sum() * 9 + n10.get(1) + n11.stream().mapToInt(Integer::intValue).sum() + (n10.stream().mapToInt(Integer::intValue).sum() - n10.get(1)) * 10) * 10;
        int n100to900all = n.get(0) * 9 + n.get(1) * 99 * 9 + n1.stream().mapToInt(Integer::intValue).sum() * 100;

        int letters = n1to99x10 + n100to900all + n.get(2);
        System.out.println(letters);
    }

}
