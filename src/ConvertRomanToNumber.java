import java.util.HashMap;
import java.util.Map;

public class ConvertRomanToNumber {


    public static void main(String[] args) {

        int number = romanToInt("MCMXCIV");
        System.out.println(number);
    }

    /*
     * s is the given roman number passed as a string
     * e.g. s = III, the output should be integer 3
     * */
    public static int romanToInt(String s) {
        Map<String, Integer> romanMap = new HashMap<>();
        romanMap.put("I", 1);
        romanMap.put("V", 5);
        romanMap.put("X", 10);
        romanMap.put("L", 50);
        romanMap.put("C", 100);
        romanMap.put("D", 500);
        romanMap.put("M", 1000);
        int value = 0;
        for (int i = 0; i < s.length(); i++)
            value -= i < s.length() - 1 && romanMap.get(String.valueOf(s.charAt(i))) < romanMap.get(String.valueOf(s.charAt(i + 1))) ? romanMap.get(String.valueOf(s.charAt(i))) : -romanMap.get(String.valueOf(s.charAt(i)));
        return value;
    }
}
