import java.util.ArrayList;

public class Permute {
    public static void main(String[] args) {
        String str = "abcd";
        ArrayList<String> permutations = new ArrayList<>();
        permute(str, "", permutations);
        for (String s : permutations) {
            System.out.println(s);
        }
    }

    public static void permute(String str, String prefix, ArrayList<String> permutations) {
        if (str.length() == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                permute(rem, prefix + str.charAt(i), permutations);
            }
        }
    }
}
