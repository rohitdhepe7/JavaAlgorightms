package arrays;

import java.util.Scanner;

public class CalculateAverageTemperature {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("How many day's temperatures? ");
        int numDays = console.nextInt();
        int[] temps = new int[numDays];
        //record temperature and find average
        int sum = 0;
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Day " + (i+1) + "'s high temp: ");
            temps[i] = console.nextInt();
            sum += temps[i];
        }
        System.out.println("Total temps: " + sum);
        double average = sum/numDays;
        //count days above average
        int above = 0;
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > average){
                above++;
            }
        }
        System.out.println();
        System.out.println("Average Temperature = " + average);
        System.out.println(above + " day's above average");
    }
}
