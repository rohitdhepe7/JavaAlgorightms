package Recursion;

public class Recursion {

    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        int[] arr = {1,2,3,4,5};
        int result = recursion.fib(4);
        System.out.println(recursion.capitalizeWord("java"));

    }

    static void openRussianDolls(int doll) {
        System.out.println(doll);
        if (doll == 1){
            System.out.println("All dolls are opened");
        }else{
            openRussianDolls(doll-1);
        }
    }

    public int power(int base, int exponent) {
        if (exponent == 0){
            return 1;
        }
        return base * power(base, exponent - 1);
    }

    public int factorial(int n){
        if (n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public int productOfArray(int[] arr, int length){
        if (length == 0) {
            return 1;
        }
        return arr[length - 1] * productOfArray(arr, length-1);
    }

    public int recursiveRange(int num) {
        if (num>0){
            return num + recursiveRange(num - 1);
        }else {
            return 0;
        }
    }

    public int fib(int n){
        if (n<0){
            return -1;
        }

        if (n==0 || n==1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    public String reverse(String str){
        if (str.isEmpty()){
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public boolean isPalindrome(String s){
        if (s.isEmpty()){
            return false;
        }
        String str = reverse(s);
        if (str.equals(s)){
            return true;
        }else{
            return false;
        }
    }

    public char first(String str){
        if (Character.isUpperCase(str.charAt(0))){
            return str.charAt(0);
        }else{
            return first(str.substring(1, str.length()));
        }
    }

    public static String capitalizeWord(String str){
        //   TODO
        if (str.isEmpty()){
            return str;
        }

        char chr = str.charAt(str.length()-1);
        if (str.length()==1){
            return Character.toString(Character.toUpperCase(chr));
        }

        if (str.substring(str.length()-2, str.length()-1).equals(" ")){
            chr = Character.toUpperCase(chr);
        }
        return capitalizeWord(str.substring(0, str.length()-1)) + chr;
    }
}
