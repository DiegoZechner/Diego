package Basic.Quersumme;

public class Quersumme_3 {

    public static int CNB(int number) {
        int sum = 0;
        while (0 != number) {
            sum = sum + (number % 10);
            number = number / 10;
        }
        return sum;
    }

    public static int[] amount(int Min, int Max) {
        int amountQS = 0;
        int temp = Max;
        while (0 != temp) {
            amountQS = amountQS + 1;
            temp = temp / 10;
        }
        int[] Crosssum = new int[amountQS * 9];
        for (int i = Min; i <= Max; i++) {
            int qs = CNB(i);
            Crosssum[qs] = Crosssum[qs] + 1;
        }
        return Crosssum;
    }

    public static int array(int[] crosssum) {
        int max = 0;
        for (int i = 0; i < crosssum.length; i++) {
            if (crosssum[i] >= max) {
                max = crosssum[i];
            }
        }
        return max;
    }

    public static void printMaxQS(int Min, int Max) {
        int[] qs = amount(Min, Max);
        System.out.println(array(qs));
    }

    public static void main(String[] args) {

        printMaxQS(0, 1000);



    }
}