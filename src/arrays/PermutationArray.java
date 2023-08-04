package arrays;

public class PermutationArray {

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {5,1,5,3,4,6};
        PermutationArray pa = new PermutationArray();
        System.out.println(pa.permutation(array1, array2));
    }

    public boolean permutation(int[] array1, int[] array2){
        // TODO
        int sum1 = 0;
        int sum2 = 0;
        int mul1 = 0;
        int mul2 = 0;
        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
            sum2 += array2[i];
            mul1 *= array1[i];
            mul2 *= array2[i];
        }

        if (sum1 == sum2 && mul1 == mul2){
            return true;
        }
        return false;
    }
}
