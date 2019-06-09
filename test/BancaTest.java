/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import monopoly.Banca;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marcc
 */
public class BancaTest {
    
    public BancaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDinero method, of class Banca.
     */
    @Test
    public void testGetDinero() {
        System.out.println("getDinero");
        Banca instance = new Banca(0.0,"Test");
        double expResult = 0.0;
        double result = instance.getDinero();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDinero method, of class Banca.
     */
    @Test
    public void testSetDinero() {
        System.out.println("setDinero");
        double dinero = 0.0;
        Banca instance = new Banca(0.0,"Test");
        instance.setDinero(dinero);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCausaHistorico method, of class Banca.
     */
    @Test
    public void testGetCausaHistorico() {
        System.out.println("getCausaHistorico");
        Banca instance = new Banca(0.0,"Test");
        String expResult = "Test";
        String result = instance.getCausaHistorico();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCausaHistorico method, of class Banca.
     */
    @Test
    public void testSetCausaHistorico() {
        System.out.println("setCausaHistorico");
        String causaHistorico = "";
        Banca instance = new Banca(0.0,"Test");
        instance.setCausaHistorico(causaHistorico);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
