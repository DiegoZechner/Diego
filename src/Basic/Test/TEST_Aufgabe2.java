package Basic.Test;

import java.util.Random;
public class TEST_Aufgabe2 {
    public static void  main(String[] args){
        Random random = new Random();
        int Ergebnis = 0;

        while (true){
            int zufallszahl = random.nextInt(10);

            System.out.println(zufallszahl);
            if
            (zufallszahl == 5){
                break;
            }
            else{
                Ergebnis += zufallszahl;

            }
        } System.out.println(Ergebnis);

    }
}