import java.util.Random;

public class TEST {
    public static void main(String[] args) {

        Random random = new Random();

        int Rand1 = random.nextInt(1000);

        int Rand2 = random.nextInt(Rand1) ;



        for (int x = Rand1; x>= Rand2; x--  )
            System.out.println(x);
        System.out.println("-");
        System.out.println(Rand1);
        System.out.println(Rand2);
    }
}