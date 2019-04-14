/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcc
 */

import java.io.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class gestionPartida {
    public static Map loadGame() throws IOException{
        Map<String,String> gameSettings = new HashMap<String,String>();
        Scanner s =null;
        try {
            // CHECK IF FILE EXISTS
            // Debugging filePath must be a PARAM.
            String filePath = "./gameSet.txt";
            File file=new File(filePath);
            if(!file.exists()){
                System.out.println("File "+ filePath +" doesn't exist. Exiting program...");
                System.exit(1); // EXIT WITH ERRORS
            } else {
                s = new Scanner(new BufferedReader(new FileReader(filePath)));
                s.useDelimiter("\r\n");
                while (s.hasNext()) {
                    String formattedText = s.next();
                    formattedText = formattedText.toLowerCase(); // Error control
                    //System.out.println(formattedText); // DEBUGGING
                    String[] elements = formattedText.split("=");
                    String ParamName = elements[0].replace(" ", "");
                    gameSettings.put(ParamName, elements[1].replace(" ", ""));
                    // Debugging
                    System.out.println(ParamName + " has a value of: \n" + gameSettings.get(ParamName));
                }
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
        return gameSettings;
    }
    public static Boolean saveGame(Map<String,String> gameSettings) throws IOException{
        // TO DEVELOP
        return true;
    }
}
