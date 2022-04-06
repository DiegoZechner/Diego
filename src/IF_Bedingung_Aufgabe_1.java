
import java.util.Random;

public class IF_Bedingung_Aufgabe_1 {
    public static void main(String[]args) {

        Random random =new Random();
        int randomNumber = random.nextInt(100);

        if((randomNumber>1) && (randomNumber<20)){
            System.out.println("Mini");

        }else if ((randomNumber>20) &&(randomNumber<50)){
            System.out.println("Medium");
        }else{
            System.out.println("Large");
        }
    }



}
