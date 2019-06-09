/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import monopoly.Juego;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

/**
 *
 * @author marcc
 */
public class JuegoTest {
    
    public JuegoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of jugar method, of class Juego.
     */
    @Test
    public void testJugar() {
        System.out.println("jugar");
        ArrayList<Calle> tablero = null;
        ArrayList<Jugador> jugadores = null;
        Juego instance = new Juego(Calle,Jugador);
        instance.jugar();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
