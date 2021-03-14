/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apuesta1;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class ApuestaTest {
       
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
    
    public ApuestaTest() {
        
    }
    
    

    @Test
    public void testApostar1() throws Exception {
        System.out.println("Apostando Dinero negativo");
        Apuesta miApuesta = new Apuesta(100, 0, 0);
        int dinero = -10;
        miApuesta.apostar(dinero);
        assertEquals(100, miApuesta.getDinero_disp());
        
        
    }
    @Test
    public void testApostar2() throws Exception {
        System.out.println("Apostando Dinero positivo válido");
        Apuesta miApuesta = new Apuesta(100, 0, 0);
        int dinero = 10;
        miApuesta.apostar(dinero);
        assertEquals(90, miApuesta.getDinero_disp());
        
        
    }
    @Test
    public void testApostar3() throws Exception {
        System.out.println("Apostando Dinero positivo no válido");
        Apuesta miApuesta = new Apuesta(100, 0, 0);
        int dinero = 110;
        miApuesta.apostar(dinero);
        assertTrue(miApuesta.getDinero_disp()==100);
        
        
    }


    @Test
    public void testCobrar_apuesta1() throws Exception {
        System.out.println("cobrar_apuesta acertada");
        int cantidad_goles_local = 0;
        int cantidad_goles_visit = 0;
        Apuesta miApuesta = new Apuesta(100,0,0);
        miApuesta.apostar(10);
        miApuesta.cobrar_apuesta(cantidad_goles_local, cantidad_goles_visit);
        assertEquals(190, miApuesta.getDinero_disp());
        //miApuesta.setDinero_disp(miApuesta.getDinero_disp()+(miApuesta.getApostado*10));
    }
    @Test
    public void testCobrar_apuesta2() throws Exception {
        System.out.println("cobrar_apuesta fallida");
        int cantidad_goles_local = 0;
        int cantidad_goles_visit = 0;
        Apuesta miApuesta = new Apuesta(100,1,0);
        miApuesta.apostar(10);
        miApuesta.cobrar_apuesta(cantidad_goles_local, cantidad_goles_visit);
        assertEquals(90 ,miApuesta.getDinero_disp());
    }
    @Test
    public void testCobrar_apuesta3() throws Exception {
        System.out.println("cobrar_apuesta valores no cálidos");
        int cantidad_goles_local = -2;
        int cantidad_goles_visit = 0;
        Apuesta miApuesta = new Apuesta(100,0,0);
        miApuesta.apostar(10);
        miApuesta.cobrar_apuesta(cantidad_goles_local, cantidad_goles_visit);
        assertTrue(miApuesta.getDinero_disp()==90);        
        
    }
    
}
