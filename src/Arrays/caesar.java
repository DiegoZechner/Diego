package Arrays;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class caesar {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random rn = new Random();

        System.out.println("Geben Sie gewünschtes Wort ein!");

        String textInput = scanner.next();

        int offset = rn.nextInt(2,4);

        char string[] = textInput.toCharArray();

        for(int i = 0; i<string.length; i++){
            char text = string[i];
             text += offset;
            string[i] = text;

        }
        System.out.println("");
        System.out.println("um so viele Stellen verändert: " + offset);
        System.out.println("");
        System.out.println(string);
        System.out.println("");
        System.out.println("original: " + textInput);

    }
}
