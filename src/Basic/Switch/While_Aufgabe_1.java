package Basic.Switch;

import java.util.Random;

public class While_Aufgabe_1 {
    public static void main(String[] args) {
        Random random = new Random();
        boolean isFinished = false;
        int randomNumber = 0;


        while(!isFinished){
            int randomValue = random.nextInt( 25) + 10;
            System.out.println("Nr" + randomValue);



            if ((randomValue==15) || (randomValue==25)){
                isFinished=true;
            }

        }
        System.out.println();




    }
}