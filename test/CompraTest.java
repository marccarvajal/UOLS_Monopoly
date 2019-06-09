/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import monopoly.Calle;
import monopoly.Compra;
import monopoly.Jugador;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marcc
 */
public class CompraTest {
    
    public CompraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getJugador method, of class Compra.
     */
    @Test
    public void testGetJugador() {
        System.out.println("getJugador");
        Jugador jugador = new Jugador();
        Calle calle = new Calle();
        Compra instance = new Compra(jugador, calle, 0);
        Jugador expResult = new Jugador();
        Jugador result = instance.getJugador();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setJugador method, of class Compra.
     */
    @Test
    public void testSetJugador() {
        System.out.println("setJugador");
        Jugador jugador = new Jugador();
        Calle calle = new Calle();
        Compra instance = new Compra(jugador, calle, 0);
        instance.setJugador(jugador);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPosicion method, of class Compra.
     */
    @Test
    public void testGetPosicion() {
        System.out.println("getPosicion");
        Jugador jugador = new Jugador();
        Calle calle = new Calle();
        Compra instance = new Compra(jugador, calle, 0);
        int expResult = 0;
        int result = instance.getPosicion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPosicion method, of class Compra.
     */
    @Test
    public void testSetPosicion() {
        System.out.println("setPosicion");
        int posicion = 0;
        Jugador jugador = new Jugador();
        Calle calle = new Calle();
        Compra instance = new Compra(jugador, calle, 0);
        instance.setPosicion(posicion);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCalle method, of class Compra.
     */
    @Test
    public void testGetCalle() {
        System.out.println("getCalle");
        Jugador jugador = new Jugador();
        Calle calle = new Calle();
        Compra instance = new Compra(jugador, calle, 0);
        Calle expResult = new Calle();
        Calle result = instance.getCalle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCalle method, of class Compra.
     */
    @Test
    public void testSetCalle() {
        System.out.println("setCalle");
        Calle calle = null;
        Compra instance = null;
        instance.setCalle(calle);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
