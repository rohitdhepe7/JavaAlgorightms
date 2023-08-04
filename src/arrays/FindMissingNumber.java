package arrays;

public class FindMissingNumber {

    public static void main(String[] args) {
        System.out.println(findMissingNumberInArray(new int[]{21,22,23,24,26}));
    }

    static int findMissingNumberInArray(int[] array){
        int n = array.length + 1;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        for (int number : array) {
            actualSum += number;
        }

        return expectedSum - actualSum;
    }

    static int formula(int n){
        return (n * (n+1))/2;
    }
}
