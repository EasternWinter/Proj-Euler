import java.util.ArrayList;
import java.util.Collections;
/*Failure, do not use similar method
Avoid using this method */


public class Euler32_1 {

    public static int run() {

        ArrayList<Integer> productList = new ArrayList<>();
        int  product = 0;
        int tempI = 0;
        int tempJ = 0;
        int tempProd = 0;
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 1; i < 10000; i++) { //i = multiplicand
            for (int j = 1; j < 10000; j++) { //multiplier
                System.out.println(i);
                product = i * j;
                tempI = i;
                tempJ = j;
                tempProd = product;

                do {
                    integerArrayList.add(tempI % 10);
                    tempI /= 10;
                } while (tempI > 0);

                do {
                    integerArrayList.add(tempJ % 10);
                    tempJ /= 10;
                } while (tempJ > 0);

                do {
                    integerArrayList.add(tempProd % 10);
                    tempProd /= 10;
                } while (tempProd > 0);

                Collections.sort(integerArrayList);

                if (integerArrayList.size() == 9) {
                    if (integerArrayList.get(0) == 1 && integerArrayList.get(1) == 2 && integerArrayList.get(2) == 3
                            && integerArrayList.get(3) == 4 && integerArrayList.get(4) == 5 && integerArrayList.get(5) == 6
                            && integerArrayList.get(6) == 7 && integerArrayList.get(7) == 8 && integerArrayList.get(8) == 9
                            && !productList.contains(product)) {
                        productList.add(product);
                    }
                }

                integerArrayList.clear();

            }
        }

        long productSum = 0;

        for (Integer integer : productList) {
            productSum += integer;
        }

        return (int) productSum;

    }

}
