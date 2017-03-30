/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smit.ticTacToe.automation;

import com.smit.ticTacToe.TicTacToe;
import java.util.Random;

/**
 *
 * @author SMIT
 */
public class AI {

    
    public int randNumGenerator(){
        Random ran=new Random();
        return ran.nextInt(3);
        
        
    }
    
  
}
