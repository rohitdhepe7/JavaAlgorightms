package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        rotateMatrix(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    private static boolean rotateMatrix(int[][] matrix){
        //check if the matrix length is 0 and matrix rows and cols are equal
        if (matrix.length == 0 || matrix.length != matrix[0].length) return false;

        //length of the matrix
        int n = matrix.length;
        for (int layer = 0; layer < n/2; layer++){
            System.out.println("Layer " + layer);
            int first = layer;
            int last = n-1-layer;
            System.out.println("First " + first);
            System.out.println("Last " + last);
            for (int i = first; i<last; i++){
                int offset = i - first;
                int top = matrix[first][i];
                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last-offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
        return true;
    }
}
