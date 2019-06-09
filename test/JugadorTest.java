/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import monopoly.Jugador;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marcc
 */
public class JugadorTest {
    
    public JugadorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getTurnosCarcel method, of class Jugador.
     */
    @Test
    public void testGetTurnosCarcel() {
        System.out.println("getTurnosCarcel");
        Jugador instance = new Jugador();
        int expResult = 3; // marcc: Default turns in Jail
        int result = instance.getTurnosCarcel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTurnosCarcel method, of class Jugador.
     */
    @Test
    public void testSetTurnosCarcel() {
        System.out.println("setTurnosCarcel");
        int turnosCarcel = 0;
        Jugador instance = new Jugador();
        instance.setTurnosCarcel(turnosCarcel);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isCarcel method, of class Jugador.
     */
    @Test
    public void testIsCarcel() {
        System.out.println("isCarcel");
        Jugador instance = new Jugador();
        boolean expResult = false;
        boolean result = instance.isCarcel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCarcel method, of class Jugador.
     */
    @Test
    public void testSetCarcel() {
        System.out.println("setCarcel");
        boolean carcel = true;
        Jugador instance = new Jugador();
        instance.setCarcel(carcel);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isQuiebra method, of class Jugador.
     */
    @Test
    public void testIsQuiebra() {
        System.out.println("isQuiebra");
        Jugador instance = new Jugador();
        boolean expResult = false;
        boolean result = instance.isQuiebra();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setQuiebra method, of class Jugador.
     */
    @Test
    public void testSetQuiebra() {
        System.out.println("setQuiebra");
        boolean quiebra = false;
        Jugador instance = new Jugador();
        instance.setQuiebra(quiebra);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPosicion method, of class Jugador.
     */
    @Test
    public void testGetPosicion() {
        System.out.println("getPosicion");
        Jugador instance = new Jugador();
        int expResult = 0;
        int result = instance.getPosicion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPosicion method, of class Jugador.
     */
    @Test
    public void testSetPosicion() {
        System.out.println("setPosicion");
        int posicion = 0;
        Jugador instance = new Jugador();
        instance.setPosicion(posicion);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDinero method, of class Jugador.
     */
    @Test
    public void testGetDinero() {
        System.out.println("getDinero");
        Jugador instance = new Jugador();
        double expResult = 0.0;
        double result = instance.getDinero();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDinero method, of class Jugador.
     */
    @Test
    public void testSetDinero() {
        System.out.println("setDinero");
        double dinero = 0.0;
        Jugador instance = new Jugador();
        instance.setDinero(dinero);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Jugador.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Jugador instance = new Jugador();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Jugador.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Jugador instance = new Jugador();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumJuga method, of class Jugador.
     */
    @Test
    public void testGetNumJuga() {
        System.out.println("getNumJuga");
        Jugador instance = new Jugador();
        int expResult = 0;
        int result = instance.getNumJuga();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNumJuga method, of class Jugador.
     */
    @Test
    public void testSetNumJuga() {
        System.out.println("setNumJuga");
        int numJuga = 100;
        Jugador instance = new Jugador();
        instance.setNumJuga(numJuga);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isEsMiTurno method, of class Jugador.
     */
    @Test
    public void testIsEsMiTurno() {
        System.out.println("isEsMiTurno");
        Jugador instance = new Jugador();
        boolean expResult = false;
        boolean result = instance.isEsMiTurno();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEsMiTurno method, of class Jugador.
     */
    @Test
    public void testSetEsMiTurno() {
        System.out.println("setEsMiTurno");
        boolean esMiTurno = true;
        Jugador instance = new Jugador();
        instance.setEsMiTurno(esMiTurno);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isJugando method, of class Jugador.
     */
    @Test
    public void testIsJugando() {
        System.out.println("isJugando");
        Jugador instance = new Jugador();
        boolean expResult = false;
        boolean result = instance.isJugando();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setJugando method, of class Jugador.
     */
    @Test
    public void testSetJugando() {
        System.out.println("setJugando");
        boolean jugando = false;
        Jugador instance = new Jugador();
        instance.setJugando(jugando);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
