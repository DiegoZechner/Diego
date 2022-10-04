import java.util.Scanner;
public class TEST
{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

    /*int[] zahlen = new int[] {21, 52, 3, 4, 45, 6, 7, 8, 9};
    for(int i = 0; i<zahlen.length; i++) {
        System.out.print(zahlen[i]+" ");
    }*/


        int[] speicher = new int[6];
        int zahlenEingeben = 0;
        System.out.println("Gib 6 Zahlen ein: ");
        for(int i = 1; i<=6; i++) {
            zahlenEingeben = s.nextInt();
        }


        int[] gibAus = new int[zahlenEingeben];
        for(int j = 0; j<gibAus.length; j++) {
            System.out.println(gibAus[j]);


        }

    }
}