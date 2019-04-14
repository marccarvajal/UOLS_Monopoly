/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcc
 */
import java.util.*;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        // FIRST TEST LOAD GAME
        gestionPartida p1 = new gestionPartida();
        Map<String,String> gameSettings = new HashMap<String,String>();
        try{
            gameSettings = p1.loadGame();
        } catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }
        
        // SECOND TEST SAVE GAME
        
        
    }
}


