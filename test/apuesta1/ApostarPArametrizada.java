/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apuesta1;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Alex'sCucumbah
 */
@RunWith(value=Parameterized.class)
public class ApostarPArametrizada {
    
    
    int din_disp;
    int apuestaGolesLocal;
    int apuestaGolesVisitante;
    int apuesta;
    int salida;

    public ApostarPArametrizada(int din_disp, int apuestaGolesLocal, int apuestaGolesVisitante, int apuesta, int salida) {
        this.din_disp = din_disp;
        this.apuestaGolesLocal = apuestaGolesLocal;
        this.apuestaGolesVisitante = apuestaGolesVisitante;
        this.apuesta = apuesta;
        this.salida = salida;
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
    
    @Parameterized.Parameters
    public static Iterable<Object[]> getData(){
        ArrayList<Object[]> param = new ArrayList<>();
        param.add(new Object[]{111,4,5,-100,111});
        param.add(new Object[]{1000,1,1,0,1000});
        param.add(new Object[]{5000,1,2,500,4500});
        param.add(new Object[]{122,0,0,122,0});
        param.add(new Object[]{122,0,0,123,122});
        
        return param;
    }
    
    
    @Test
    public void testApostar(){
        System.out.println("prueba parametrizada Apostar");
        Apuesta miApuesta = new Apuesta(din_disp, apuestaGolesLocal, apuestaGolesVisitante);
        miApuesta.apostar(apuesta);
        assertEquals(salida, miApuesta.getDinero_disp());
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
