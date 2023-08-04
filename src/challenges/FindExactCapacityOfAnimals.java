package challenges;

import java.util.*;

public class FindExactCapacityOfAnimals {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();

        List<Integer> arr = new ArrayList<>();
        System.out.println("Enter ");
        for (int i = 0; i < N; i++) {
            arr.add(scanner.nextInt());
        }
        System.out.println("Value of P " + getEnergyLevel(N, X, arr));
    }
    //arr = [1, 3, 2, 4, 5]
    //All the animals with energy level equal to P or greater than P can board the available transports
    public static int getEnergyLevel(int N, int X, List<Integer> arr){
        Collections.sort(arr, Collections.reverseOrder());
        if (X == N) {
            return arr.get(X - 1);
        } else if (arr.get(X - 1).equals(arr.get(X))) {
            return -1;
        } else {
            return arr.get(X - 1);
        }
    }
}
