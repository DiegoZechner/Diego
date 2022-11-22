package Kalender_ATM_TicToc_Dicegame;

import java.util.*;

public class tictoc {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[][] playground = new int[3][3];

            System.out.println("Tik Tak Toe: ");
            for (int row = 0; row < playground.length; row++) {
                for (int column = 0; column < playground.length; column++) {
                    System.out.print(playground[row][column] + "  ");
                }
                System.out.println();
            }

            boolean win = false;
            while (!win) {

                System.out.println("Claim your field Player X");
                int player1Input = scanner.nextInt();
                for (int rowTaken = 0; rowTaken < player1Input; rowTaken++) {
                    for (int columnTaken = 0; columnTaken < player1Input; columnTaken++) {
                        System.out.print(playground[rowTaken][columnTaken] + " ");
                    }
                }

                System.out.println("Claim your field PLayer O");
                int player2Input = scanner.nextInt();
            }
        }
    }