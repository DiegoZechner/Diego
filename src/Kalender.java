import java.util.InputMismatchException;
import java.util.Scanner;

public class Kalender {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("Gib den Monat ein");
            int month = sc.nextInt();
            System.out.println("Gib den Starttag ein");
            int startday = sc.nextInt() + 20;

            if (month > 0 && month < 13 && startday >= 21 && startday < 28) {
                createCA(month, startday);
            } else {
                System.out.println("NOOOOOOOOOOO");
            }
            break;
        }
    }

    public static void createCA(int month, int startday) {
        String[] Days = {"MO", "DI", "MI", "DO", "FR", "SA", "SO"};
        int i = 0;

        int daysinmonths = 0;
        switch (month) {
            case 1:
                daysinmonths = 31;
                break;
            case 2:
                daysinmonths = 28;
                break;
            case 3:
                daysinmonths = 30;
                break;
            case 4:
                daysinmonths = 30;
                break;
            case 5:
                daysinmonths = 31;
                break;
            case 6:
                daysinmonths = 30;
                break;
            case 7:
                daysinmonths = 31;
                break;
            case 8:
                daysinmonths = 31;
                break;
            case 9:
                daysinmonths = 30;
                break;
            case 10:
                daysinmonths = 31;
                break;
            case 11:
                daysinmonths = 30;
                break;
            case 12:
                daysinmonths = 31;
                break;
        }
        for (int j = 0; j <= daysinmonths ; j++) {
            System.out.println(j);
        }

    }



}



