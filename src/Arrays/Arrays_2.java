package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Arrays_2 {
    public static void main(String[] args) {


        int[] randomnumber = new int[50];
        int sum = 0;
        int selection;
        Random random = new Random();
        Scanner value =new Scanner(System.in);
        System.out.println("press 0 to play");
        selection =value.nextInt();
        if(selection == 0){
            System.out.println("Starting to generate...");
            System.out.println("");
        }
        for (int i = 0; i < randomnumber.length; i++){
            randomnumber[i] = random.nextInt(100);
            sum += randomnumber[i];

            System.out.println(randomnumber[i]);
        }

        System.out.println(sum);
        System.out.println("");
        System.out.println("done");

    }

}