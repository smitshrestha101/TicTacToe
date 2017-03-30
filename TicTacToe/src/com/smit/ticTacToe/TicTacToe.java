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
        
        Scanner input = new Scanner(System.in);
        while(true){
        char tic[][] = new char[3][3];
        
        boolean tru = true;     //to run the program
        int val = 0;    //to change players
        for (int i = 0; i <= 2; i++) {          //put # in all the coordinates 
            for (int j = 0; j <= 2; j++) {
                tic[i][j] = '#';
            }
        }
        int hashcheck = 0;
        while (tru) {
            boolean subHashCheck = false;
            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j <= 2; j++) {
                    if (tic[i][j] == '#') {
                        subHashCheck = true;
                    }
                }
            }
            if(subHashCheck == true){
           hashcheck = 1;
            }
            
            
            if (hashcheck == 0) {
                System.out.println("its a tie");
                break;
            }
            while (hashcheck == 1) {
                if (val == 0) {
                    System.out.print("For the first player, ");
                } else {
                    System.out.print("For the second player, ");
                }
                
                int check = 0;

                int ask = -1, second = -1;
                while (check == 0) {

                    int check1 = 0;
                    while (check1 == 0) {
                        System.out.println("enter first coordinate :");
                        ask = input.nextInt();
                        check1 = 1;
                        if (ask > 2 || ask < 0) {
                            System.out.println("Invalid first coordinate, enter again!");
                            check1 = 0;
                        }
                    }

                    int check2 = 0;
                    while (check2 == 0) {
                        System.out.println("enter second coordinate :");
                        second = input.nextInt();
                        check2 = 1;
                        if (second > 2 || second < 0) {
                            System.out.println("Invalid second coordinate, enter again!");
                            check2 = 0;
                        }
                    }

                    check = 1;
                    if (tic[ask][second] == 'X' || tic[ask][second] == 'O') {
                        System.out.println("Invalid coordinate!");
                        check = 0;
                    }
                }

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
                hashcheck=0;

            }

        }
            System.out.println("Do you want to play again?[y/n]");
            String quit=input.next(); 
            
            if (quit.equalsIgnoreCase("n")){
                System.out.println("Thank you for playing!");
                break;
            }
        }

    }

    static boolean result(char tic[][]) {

        if (horizontal(tic) == true && vertical(tic) == true && cross1(tic) == true && cross2(tic) == true)//if all are true then true
        {
            return true;

        } else {
            return false;
        }
    }

    static boolean horizontal(char tic[][]) {
        for (int i = 0; i <= 2; i++) {
            int j = 0;
            if (tic[i][j] == 'X' || tic[i][j] == 'O') {     //to see that its not #

                if (tic[i][j] == tic[i][j + 1] && tic[i][j] == tic[i][j + 2]) {     //to see that the row has same elements
                    if (tic[i][j] == 'X') {         //to check if the element was X or O
                        System.out.println("X wins");
                    } else {
                        System.out.println("O wins");
                    }
                    return false;
                }
            }

        }
        return true;
    }

    static boolean vertical(char tic[][]) {
        for (int j = 0; j <= 2; j++) {
            int i = 0;
            if (tic[i][j] == 'X' || tic[i][j] == 'O') {

                if (tic[i][j] == tic[i + 1][j] && tic[i][j] == tic[i + 2][j]) {
                    if (tic[i][j] == 'X') {         //to check if the element was X or O
                        System.out.println("X wins");
                    } else {
                        System.out.println("O wins");
                    }
                    return false;
                }
            }
        }
        return true;
    }

    static boolean cross1(char tic[][]) {
        if (tic[0][0] == 'X' || tic[0][0] == 'O') {
            if (tic[0][0] == tic[1][1] && tic[0][0] == tic[2][2]) {
                if (tic[0][0] == 'X') {
                    System.out.println("X wins");
                } else {
                    System.out.println("O wins");
                }
                return false;
            }
        }
        return true;
    }

    static boolean cross2(char tic[][]) {
        if (tic[2][0] == 'X' || tic[2][0] == 'O') {
            if (tic[2][0] == tic[1][1] && tic[2][0] == tic[0][2]) {
                if (tic[2][0] == 'X') {
                    System.out.println("X wins");
                } else {
                    System.out.println("you win");
                }
                return false;
            }
        }
        return true;

    }

}
