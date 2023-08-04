import java.util.*;

public class Challenge1 {


    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();
        set.add(3);
        set.add((int)3.0);
        set.add(2);
        set.add(2);
        set.add(new Integer(2));
        set.add(Integer.parseInt("2"));
        System.out.println(set);
        //parseCsv("1,2,3\n4,5,6", ",", "\"");
        //calculate(0, 1);
        //System.out.println("13" + 5 + 3);
        String s1 = " yes";
        String s2 = " yes ";
        String s3 = new String(s1);
        if (s1!=s2){
            System.out.println("yes");
        }
        String weather = "rainy";
        changeTheString(weather);
        System.out.println("The weather is "+ weather);
    }

    public static void changeTheString(String weather){
        weather = "sunny";
    }

    public static void calculate(int x, int y){

        if (x ==0 || (y/x)==3){
            System.out.println("First case");
        }else{
            System.out.println("Second case");

        }
    }

    public static ArrayList<ArrayList<String>> parseCsv(String csv, String separator, String quote) {
        String[] parsedArray = csv.split("\n", 1);
        ArrayList<String> csvArr = new ArrayList<>();
        Collections.addAll(csvArr, parsedArray);
        System.out.println("csv array" + parsedArray.length);
        return new ArrayList<ArrayList<String>>();
    }
}
