package LeetCodeProblems;


import static java.lang.Math.abs;

public class ScoreofString3110 {


    public int scoreOfString(String s) {
        int sum = 0;
        int sub = 0;

        for (int i = 0; i < s.length(); i++) {
            char value = s.charAt(i);
            int cha = (int) value;
            if(sum != 0 ){
                sub += abs(sum - cha);

            }
            sum = cha;

        }

        return sub ;
    }
}




