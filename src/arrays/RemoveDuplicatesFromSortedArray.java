package arrays;

public class RemoveDuplicatesFromSortedArray {

    /*
    * Given a sorted array nums, remove the duplicates in-place such that each element
    * appears only once and returns the new length. Do not allocate extra space for another array;
    * you must do this by modifying the input array in-place with O(1) extra memory.
    *
    * */
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println("Length of the array " + removeDuplicates(arr));

    }

    static int removeDuplicates(int[] nums){
        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    length = nums.length-1;
                }
            }
        }
        return length;
    }
}
