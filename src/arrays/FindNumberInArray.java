package arrays;

public class FindNumberInArray {

    // Write a program to to check if an array contains a number in Java.
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,6};
        int valueToSearch = 3;
        System.out.println("Number is found at Index " + searchInArray(intArray, valueToSearch));
    }

    private static int searchInArray(int[] intArray, int valueToSearch) {
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == valueToSearch){
                return i;
            }
        }
        return 0;
    }


}
