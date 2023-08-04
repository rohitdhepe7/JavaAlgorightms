package arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        TwoDimensionalArray sda = new TwoDimensionalArray(3,3);
        sda.insertValueInArray(0,0,10);
        sda.insertValueInArray(0,0,20);
        System.out.println(Arrays.deepToString(sda.arr));
    }
}
