package arrays;

public class TwoDimensionalArray {
    int arr[][] = null;

    //constructor
    public TwoDimensionalArray(int noOfRows, int noOfColumns){
        this.arr = new int[noOfRows][noOfColumns];
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[0].length; column++) {
                arr[row][column] = Integer.MIN_VALUE;
            }
        }
    }

    //inserting values in the array
    public void insertValueInArray(int row, int col, int value){
        try{
            if (arr[row][col] == Integer.MIN_VALUE){
                arr[row][col] = value;
                System.out.println("The value is successfully inserted");
            }else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2D array");
        }
    }

}
