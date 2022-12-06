package Basic.Quersumme;

import java.util.*;

public class test {

    public static void main(String[] args) {


        int month;
        int daystart;

        System.out.println("Geben Sie den Monat ein.");
        System.out.println();

        month = input();

        while (month < 1 || month > 12) {
            System.out.println("Geben Sie eine Zahl ein.");
            month = input();
        }

        System.out.println();
        System.out.println("Geben Sie den Wochentag ein an welchem der Monat beginnt.");
        System.out.println();

        daystart = input() - 1;

        while (daystart < 0 || daystart > 6) {
            System.out.println("Geben Sie eine Zahl zwischen 1 und 7 ein.");
            daystart = input() - 1;
        }

        System.out.println();

        printCalendar(month, daystart);

    }

    public static int input() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                return (scanner.nextInt());
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Geben Sie keine Kommastellen oder zu hohen Zahlen ein.");
            } finally {
                scanner.nextLine();
            }
        }

    }

    public static void printCalendar(int month, int startDay) {

        int numOfDays;
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int i = 0;

        if (month == 2)
            numOfDays = 28;
        else if (month % 2 == 0 && month <= 7)
            numOfDays = 30;
        else if (month % 2 == 1 && month <= 7)
            numOfDays = 31;
        else if (month % 2 == 0)
            numOfDays = 31;
        else
            numOfDays = 30;


        while (i < 7) {
            if (i == 0)
                System.out.print(" |");
            else
                System.out.print(" | ");

            System.out.print(days[i]);
            i++;

            if (i == 7) System.out.println("| ");
        }
        i = 0;


        while (i < numOfDays + startDay + 7 - (numOfDays + startDay) % 7) {
            if (i % 7 == 0)
                System.out.print("| ");
            else
                System.out.print(" | ");

            if (i < startDay || i > numOfDays + startDay - 1) System.out.print("  ");
            else System.out.print(i - startDay + 1);

            if (i - startDay + 1 < 10 && i >= startDay) System.out.print(" ");
            i++;

            if (i % 7 == 0) System.out.println(" |");
        }

    }

}