package Basic.Loop;

import java.util.Random;

public class Loop_Aufgabe_1 {
    public static void main(String[] args){
        Random random =new Random();
        int randomNumber = random.nextInt(5);
        int summe = 0;

        for (int i = 1; i <= 100; i++) {
            summe += i;
            System.out.println(summe);
        }

    }

}
