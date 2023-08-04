package arrays;

import java.util.Arrays;

public class ArraySumTarget {

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        System.out.println("Output indices of the sum " + Arrays.toString(twoSums(nums, target)));
    }

    private static int[] twoSums(int[] nums, int target) {
        int[] indices = null;
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                total = nums[i] + nums[j];
                if (total == target){
                    indices = new int[]{i, j};
                    break;
                }
            }
        }
        return indices;
    }
}
