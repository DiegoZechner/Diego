package Basic.Arrays;

import java.util.Scanner;

public class Arrays_1 {
    public static void main(String[]args){

        int[] userInput = new int[10];
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < userInput.length; i++) {
            System.out.println("Enter number, amount:" + i);
            userInput[i] = scanner.nextInt();
            {
                sum += userInput[i];
            }
        }
        System.out.println("Result of the 10 numbers is:" + sum);
    }
}
