package Kalender_ATM_TicToc_Dicegame;

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
        String[] days = {"| MO |", "| DI |", "| MI |", "| DO |", "| FR |", "| SA |", "| SO |"};


        int daysinmonths = 0;
        switch (month) {
            case 1:
                System.out.println("January");
                daysinmonths = 31;
                break;
            case 2:
                System.out.println("February");
                daysinmonths = 28;
                break;
            case 3:
                System.out.println("March");
                daysinmonths = 30;
                break;
            case 4:
                System.out.println("April");
                daysinmonths = 30;
                break;
            case 5:
                System.out.println("May");
                daysinmonths = 31;
                break;
            case 6:
                System.out.println("June");
                daysinmonths = 30;
                break;
            case 7:
                System.out.println("July");
                daysinmonths = 31;
                break;
            case 8:
                System.out.println("August");
                daysinmonths = 31;
                break;
            case 9:
                System.out.println("September");
                daysinmonths = 30;
                break;
            case 10:
                System.out.println("October");
                daysinmonths = 31;
                break;
            case 11:
                System.out.println("November");
                daysinmonths = 30;
                break;
            case 12:
                System.out.println("December");
                daysinmonths = 31;
                break;
        }
        System.out.println(" ");
        for (int i = 0; i < days.length; i++) {
            System.out.print(days[i]);

        }
        System.out.println(" ");
        for (int j = 1; j <= daysinmonths ; j++) {
            System.out.print(j);
        }


    }


}



