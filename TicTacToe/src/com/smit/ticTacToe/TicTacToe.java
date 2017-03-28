/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smit.ticTacToe;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author SMIT
 */
public class TicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char tic[][] = new char[3][3];

        boolean tru = true;
        int val = 0;
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                tic[i][j] = '#';
            }
        }
        while (tru) {

            System.out.println("enter first coordinate :");
            Scanner input = new Scanner(System.in);
            int ask = input.nextInt();
            System.out.println("enter second coordinate :");
            int second = input.nextInt();

            if (val == 0) {
                tic[ask][second] = 'X';
                val = 1;
            } else {
                tic[ask][second] = 'O';
                val = 0;
            }

            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j <= 2; j++) {
                    System.out.print(tic[i][j]);
                }
                System.out.println("");

            }
            tru = result(tic);
        }
    }

    static boolean result(char tic[][]) {
        for (int i = 0; i <= 2; i++) {
            int j = 0;
            if (tic[i][j] == 'X' || tic[i][j] == 'O') {

                if (tic[i][j] == tic[i][j + 1] && tic[i][j] == tic[i][j + 2]) {
                    System.out.println("you win");
                    return false;
                }
            }

        }
        for (int j = 0; j <= 2; j++) {
            int i = 0;
            if (tic[i][j] == 'X' || tic[i][j] == 'O') {

                if (tic[i][j] == tic[i + 1][j] && tic[i][j] == tic[i + 2][j]) {
                    System.out.println("you win");
                    return false;
                }
            }
        }
        if (tic[0][0] == 'X' || tic[0][0] == 'O') {
            if (tic[0][0] == tic[1][1] && tic[0][0] == tic[2][2]) {
                System.out.println("you win");
                return false;
            }
        }
        if (tic[2][0] == 'X' || tic[2][0] == 'O') {
            if (tic[2][0] == tic[1][1] && tic[2][0] == tic[0][2]) {
                System.out.println("you win");
                return false;
            }
        }
        return true;
    }
}
