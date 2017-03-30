/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smit.ticTacToe;

import com.smit.ticTacToe.automation.AI;
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
        DoublePlayer dp = new DoublePlayer();
        dp.run();
    }
}