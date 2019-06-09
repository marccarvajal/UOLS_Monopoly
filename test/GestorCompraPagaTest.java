/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import monopoly.Banca;
import monopoly.GestorCompraPaga;
import monopoly.Jugador;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marcc
 */
public class GestorCompraPagaTest {
    
    public GestorCompraPagaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of compraOPaga method, of class GestorCompraPaga.
     */
    @Test
    public void testCompraOPaga() {
        System.out.println("compraOPaga");
        ArrayList tablero = null;
        ArrayList compraArray = null;
        Jugador jugador = null;
        int pos = 0;
        Banca banca = null;
        GestorCompraPaga instance = new GestorCompraPaga();
        instance.compraOPaga(tablero, compraArray, jugador, pos, banca);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of quienDuenyo method, of class GestorCompraPaga.
     */
    @Test
    public void testQuienDuenyo() {
        System.out.println("quienDuenyo");
        int pos = 0;
        Jugador jugadorTURNO = null;
        ArrayList compraArray = null;
        GestorCompraPaga instance = new GestorCompraPaga();
        instance.quienDuenyo(pos, jugadorTURNO, compraArray);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of listaCompras method, of class GestorCompraPaga.
     */
    @Test
    public void testListaCompras() {
        System.out.println("listaCompras");
        ArrayList compraArray = null;
        GestorCompraPaga instance = new GestorCompraPaga();
        instance.listaCompras(compraArray);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
