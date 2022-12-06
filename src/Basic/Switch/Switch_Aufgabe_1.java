package Basic.Switch;

import java.util.Random;
public class Switch_Aufgabe_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println(randomNumber);

        switch (randomNumber){
            case 10:
                System.out.println("Ten");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 6:
                System.out.println("six");
                break;
            case 5:
                System.out.println("five");
                break;
            case 4:
                System.out.println("four");
                break;
            case 3:
                System.out.println("three");
                break;
            case 2:
                System.out.println("two");
                break;
            case 1:
                System.out.println("one");
                break;
            case 0:
                System.out.println("zero");
                break;
        }
    }
}