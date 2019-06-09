/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import monopoly.FicheroPropiedad;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marcc
 */
public class FicheroPropiedadTest {
    
    public FicheroPropiedadTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of cargaEnMemoria method, of class FicheroPropiedad.
     */
    @Test
    public void testCargaEnMemoria() {
        System.out.println("cargaEnMemoria");
        ArrayList tablero = null;
        FicheroPropiedad instance = new FicheroPropiedad();
        instance.cargaEnMemoria(tablero); // Generates error.
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
