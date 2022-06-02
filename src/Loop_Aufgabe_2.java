import java.util.Random;

public class Loop_Aufgabe_2 {
    public static void main(String[] args) {
        Random random = new Random();

        int summe = 0;

        for (int i = 2; i <= 1000; i += 2) {
            summe += i;
            System.out.println(summe);
        }

    }
}