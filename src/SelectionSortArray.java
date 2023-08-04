public class SelectionSortArray {

    /*
    *The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning.
    * The algorithm maintains two subarrays in a given array.
    * The subarray which is already sorted.
    * Remaining subarray which is unsorted.
    * In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray.
    *
    * */

    void sort(int arr[]){
        int n = arr.length;
        System.out.println("The length of the array is " + n);
        for (int i = 0; i < n - 1; i++) {
            System.out.println("Value of i " + i);
            //find the smallest element of unsorted array
            int min_idx = i;
            System.out.println("value inside min_idx " + min_idx);
            for (int j = i+1; j < n; j++) {
                System.out.println("Value of j " + j);
                System.out.println("check if value at index " + j + " "+ arr[j] + " is less than value of " + arr[min_idx]);
                if (arr[j] < arr[min_idx]){
                    System.out.println("yes the value at index " + j + " "+ arr[j] + " is less than value of " + arr[min_idx]);
                    min_idx = j;
                    System.out.println("Value of min_idx is replaced with the smallest value " + j);
                    //swap the found element with the first element
                    int temp = arr[min_idx];
                    System.out.println("storing the smallest value in temp variable " + temp);
                    arr[min_idx] = arr[i];
                    System.out.println("replacing the min_idx " + min_idx + " value with " + arr[i]);
                    arr[i] = temp;
                    System.out.println("value at index " + i + " is " + arr[i]);
                    printArray(arr);
                    System.out.println("******************loop finished********************");
                }
            }

        }

    }

    //prints the array
    void printArray(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SelectionSortArray sortArray = new SelectionSortArray();
        int arr[] = {5, 6, 2, 1, 4};
        sortArray.sort(arr);
        System.out.println("Sorted array");
        sortArray.printArray(arr);
    }
}
