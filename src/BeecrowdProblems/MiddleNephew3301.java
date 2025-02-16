package BeecrowdProblems;

import java.util.Scanner;

public class MiddleNephew3301 {
    public static void main(String[] args) {
        int[] ages = new int[3];
        Scanner scanner = new Scanner(System.in);
        ages[0] = scanner.nextInt();
        ages[1] = scanner.nextInt();
        ages[2] = scanner.nextInt();
        switch (ages[0]) {
            case 5:
                System.out.println("zezinho");
                break;
            case 6:
                System.out.println("huguinho");
                break;
            case 7:
                System.out.println("luizinho");
                break;
            default:
                System.out.println("Número Inválido");

        }


    }
}
