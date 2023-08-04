package arrays;

import java.util.Arrays;

public class SumOfDiagonalElements {

    public static void main(String[] args) {

        int[][] myArray2D= new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Length of the 2D array " +  myArray2D.length);
        System.out.println(Arrays.deepToString(myArray2D));
        int sum = sumDiagonalElements(myArray2D);
        System.out.println("Sum of diagonal elements is " + sum);
    }

    public static int sumDiagonalElements(int[][] array) {
       int sum = 0;
       int numRows = array.length;

        for (int i = 0; i < numRows; i++) {
            sum += array[i][i];
        }
        return sum;
    }
}
