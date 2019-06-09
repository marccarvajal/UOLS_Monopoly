/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marcc
 */
public class LoggerTest {
    
    public LoggerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getFileReady method, of class Logger.
     */
    @Test
    public void testGetFileReady() {
        System.out.println("getFileReady");
        Logger.getFileReady();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of writeLine method, of class Logger.
     */
    @Test
    public void testWriteLine() {
        System.out.println("writeLine");
        String args = "./test.txt";
        Logger.writeLine(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
