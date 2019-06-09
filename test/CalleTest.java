/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import monopoly.Calle;
import monopoly.Jugador;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marcc
 */
public class CalleTest {
    
    public CalleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of toString method, of class Calle.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Calle instance = new Calle();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMiDuenyo method, of class Calle.
     */
    @Test
    public void testGetMiDuenyo() {
        System.out.println("getMiDuenyo");
        Calle instance = new Calle();
        Jugador expResult = null;
        Jugador result = instance.getMiDuenyo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setMiDuenyo method, of class Calle.
     */
    @Test
    public void testSetMiDuenyo() {
        System.out.println("setMiDuenyo");
        Jugador miDuenyo = null;
        Calle instance = new Calle();
        instance.setMiDuenyo(miDuenyo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNombreCalle method, of class Calle.
     */
    @Test
    public void testGetNombreCalle() {
        System.out.println("getNombreCalle");
        Calle instance = new Calle();
        String expResult = "";
        String result = instance.getNombreCalle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNombreCalle method, of class Calle.
     */
    @Test
    public void testSetNombreCalle() {
        System.out.println("setNombreCalle");
        String nombreCalle = "";
        Calle instance = new Calle();
        instance.setNombreCalle(nombreCalle);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPagarAlCaer method, of class Calle.
     */
    @Test
    public void testGetPagarAlCaer() {
        System.out.println("getPagarAlCaer");
        Calle instance = new Calle();
        double expResult = 0.0;
        double result = instance.getPagarAlCaer();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPagarAlCaer method, of class Calle.
     */
    @Test
    public void testSetPagarAlCaer() {
        System.out.println("setPagarAlCaer");
        double pagarAlCaer = 0.0;
        Calle instance = new Calle();
        instance.setPagarAlCaer(pagarAlCaer);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPosicion method, of class Calle.
     */
    @Test
    public void testGetPosicion() {
        System.out.println("getPosicion");
        Calle instance = new Calle();
        int expResult = 0;
        int result = instance.getPosicion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPosicion method, of class Calle.
     */
    @Test
    public void testSetPosicion() {
        System.out.println("setPosicion");
        int posicion = 0;
        Calle instance = new Calle();
        instance.setPosicion(posicion);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCoste method, of class Calle.
     */
    @Test
    public void testGetCoste() {
        System.out.println("getCoste");
        Calle instance = new Calle();
        double expResult = 0.0;
        double result = instance.getCoste();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCoste method, of class Calle.
     */
    @Test
    public void testSetCoste() {
        System.out.println("setCoste");
        double coste = 0.0;
        Calle instance = new Calle();
        instance.setCoste(coste);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isEstaCompr method, of class Calle.
     */
    @Test
    public void testIsEstaCompr() {
        System.out.println("isEstaCompr");
        Calle instance = new Calle();
        boolean expResult = false;
        boolean result = instance.isEstaCompr();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEstaCompr method, of class Calle.
     */
    @Test
    public void testSetEstaCompr() {
        System.out.println("setEstaCompr");
        boolean estaCompr2 = false;
        Calle instance = new Calle();
        instance.setEstaCompr(estaCompr2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
