package arrays;

import java.util.Arrays;

public class MiddleArray {

    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5};
        middleArr(myArray);
    }

    public static int[] middleArr(int[] arr){
       if (arr.length < 2 ){
           return new int[0]; // Return an empty array if the input array has 2 or fewer elements
       }

       //create a new array with the size of the input array minus 2
       int[] midArr = new int[arr.length - 2];
       //copy the elements from the input array, excluding the first and the last element
       int index = 1;
       while (index < arr.length-1){
           midArr[index - 1] = arr[index];
           index++;
       }
        System.out.println("Middle element array " + Arrays.toString(midArr));
       return midArr;
    }
}
