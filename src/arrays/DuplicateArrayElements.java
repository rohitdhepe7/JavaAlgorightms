package arrays;

import java.util.Arrays;

public class DuplicateArrayElements {

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,5};
        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }

    public static int[] removeDuplicates(int[] arr) {
        //   TODO
       int n = arr.length;
       int[] uniqueArray = new int[n];
       int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = i+1; j < n ; j++) {
                if (arr[i] == arr[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate){
                uniqueArray[index++] = arr[i];
            }
        }
        return Arrays.copyOf(uniqueArray, index);
    }
}
