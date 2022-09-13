import java.util.Random;
import java.util.Scanner;

public class Würfelspiel {
    public static void main(String[] args) {
        int score = 0;
        int AIscore = 0;
        int selection;
        Random random = new Random();
        Scanner value = new Scanner(System.in);
        System.out.println("press 0 to play");
        selection = value.nextInt();
        if (selection == 0) {
            System.out.println("0" + "");
            for (int i = 0; i < 6; i++) {
                int randomNumber = random.nextInt(6) + 1;
                score += randomNumber;
                System.out.println(randomNumber);
            }


        }
        System.out.println("AI dicing..." +"");
        for (int i = 0; i < 6; i++) {
            int randomNumber = random.nextInt(6) + 1;
            AIscore += randomNumber;
            System.out.println(randomNumber);
        }

        System.out.println("AI score:" + AIscore);
        System.out.println("Your score: " + score);
        if (AIscore < score) {
            System.out.println("W");
        } else if (AIscore > score) {
            System.out.println("L");
        } else {
            System.out.println("Draw");
        }

    }
}
