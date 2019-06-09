/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marcc
 */
public class gestionPartidaTest {
    
    public gestionPartidaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of loadGame method, of class gestionPartida.
     */
    @Test
    public void testLoadGame() throws Exception {
        System.out.println("loadGame");
        //Map expResult = new Map();
        Map expResult = new HashMap<String,String>();
        Map result = gestionPartida.loadGame();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of saveGame method, of class gestionPartida.
     */
    @Test
    public void testSaveGame() throws Exception {
        System.out.println("saveGame");
        Map<String, String> gameSettings = null;
        Boolean expResult = true;
        Boolean result = gestionPartida.saveGame(gameSettings);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
