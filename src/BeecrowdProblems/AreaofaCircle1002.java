package BeecrowdProblems;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class AreaofaCircle1002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double   π  = 3.14159;
        double r = scanner.nextDouble();
        double a = (r * r) *  π ;
        BigDecimal bd = new BigDecimal(a).setScale(4, RoundingMode.HALF_UP);
        System.out.println(bd);
        System.out.println("A=" + Math.round(a));
        System.out.println(String.format("A="+"%.2f ", a));
        System.out.println("A=" + a);

    }
}
