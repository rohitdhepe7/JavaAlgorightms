import java.util.Vector;

public class BaseBallGameChallenge {
    public static void main(String[] args) {

    }


    /*
    * An integer x - record a new score of x
    * "+" - represents sum of the previous two scores
    * "D" - Double the previous score.
    * "C" - remove the previous score.
    *
    * */
    public int calPoints(Vector<String> ops) {

        Vector<Integer> score = new Vector<>();

        for (int i = 0; i < ops.size(); i++) {

            if (ops.get(i) == "+"){
                //add two elements present in the score array
                //int addScore = score.get(i) + score.get();
            }else if (ops.get(i) == "D"){
                // double or mulitply by 2 the last score
                int doubeScore = score.get(i) * 2;

            }else if (ops.get(i) == "C"){
                //remove the previous score
                score.removeElementAt(i);
            }else{
                score.add(Integer.parseInt(ops.get(i)));
                System.out.println("Final array is " + score);
            }
        }
        return 0;
    }
}