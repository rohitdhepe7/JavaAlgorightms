import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        generateRandomNumber(1,5);
        //printJ();
    }

    public static void generateRandomNumber(int origin, int bound){
        // Generates random integers 1 to 4
        int x = ThreadLocalRandom.current().nextInt(bound);
        Random random = new Random();
        random.nextInt(5);
        System.out.println(random.nextInt(5));
        System.out.println(random.nextInt(5));
        System.out.println(random.nextInt(5));
        System.out.println(random.nextInt(5));
        System.out.println(random.nextInt(5));
        System.out.println(random.nextInt(5));
        System.out.println(random.nextInt(5));
        System.out.println(random.nextInt(5));
        System.out.println(random.nextInt(5));
        System.out.println(random.nextInt(5));
        System.out.println(random.nextInt(5));
        System.out.println(random.nextInt(5));
        System.out.println(random.nextInt(5));
        System.out.println(random.nextInt(5));
        System.out.println(random.nextInt(5));
        System.out.println(random.nextInt(5));
        System.out.println(random.nextInt(5));
        System.out.println(random.nextInt(5));
        System.out.println(random.nextInt(5));
        System.out.println(random.nextInt(5));
        System.out.println(random.nextInt(5));
        System.out.println(random.nextInt(5));
        System.out.println(random.nextInt(5));
        System.out.println(random.nextInt(5));


        switch (x){
            case 1:
                System.out.println("Event 1 is clicked");
                break;
            case 2:
                System.out.println("Event 2 is clicked");
                break;
            case 3:
                System.out.println("Event 3 is clicked");
                break;
            case 4:
                System.out.println("Event 4 is clicked");
                break;
        }
    }

    public static void printJ(){
        int j = 100;

        System.out.println("j--  " + j--);
        System.out.println("--j  " + --j);
        int result = j-- - --j;
        System.out.println("result " + result);
    }
}
