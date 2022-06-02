import java.util.Random;

public class TEST_Aufgabe2 {
    public static void  main(String[] args){

        Random random = new Random();
        int summe = 0;

        while (true){
            int Rand = random.nextInt(10);

            System.out.println(Rand);
            if (Rand == 5){
                break;
            }
            else{
                summe += Rand;

            }
        }
        System.out.println("das ist das Ergebnis " +summe);
    }
}