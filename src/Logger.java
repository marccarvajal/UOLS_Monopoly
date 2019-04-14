/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcc
 */
/**
 * Created by mcarvajal on 09/05/2017.
 */
import java.io.*;

public class Logger {
    public static void getFileReady(){
        // Open file and delete all its content.
        // IMPROVES:
        // check if file exists(1), then DELETE(2).
        FileWriter file = null;
        PrintWriter pw = null;
        try{
            // must be a PARAM
            file = new FileWriter("./gameSet.txt");
            pw = new PrintWriter(file);
            pw.println("");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Closing file
                if (null != file)
                    file.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    public static void writeLine(String args){
        FileWriter file = null;
        PrintWriter pw = null;
        try{
            // must be a PARAM
            file = new FileWriter("./gameSet.txt",true);
            pw = new PrintWriter(file);
            pw.println(args);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Closing file
                if (null != file)
                    file.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
