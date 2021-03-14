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
public class cobrarApuestaParametrizada {
    
    int din_disp;
    int apuestaGolesLocal;
    int apuestaGolesVisitante;
    int apuesta;
    int golesMetidosLocal;
    int golesMetidosVisitante;    
    int salida;

    public cobrarApuestaParametrizada(int din_disp, int apuestaGolesLocal, int apuestaGolesVisitante, int apuesta, int golesMetidosLocal, int golesMetidosVisitante, int salida) {
        this.din_disp = din_disp;
        this.apuestaGolesLocal = apuestaGolesLocal;
        this.apuestaGolesVisitante = apuestaGolesVisitante;
        this.golesMetidosLocal = golesMetidosLocal;
        this.golesMetidosVisitante = golesMetidosVisitante;
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
        param.add(new Object[]{300,-3,-5,100,0,0,200});
        param.add(new Object[]{1000,1,1,30,1,1,1270});
        param.add(new Object[]{5000,1,2,500,1,2,9500});
        param.add(new Object[]{250,0,0,250,0,1,0});
        param.add(new Object[]{1000,3,2,999,2,2,1});        
        return param;
    }
    
    
    @Test
    public void testCobrar_apuesta3() throws Exception {
        System.out.println("Prueba parametrizada cobrar apuesta");        
        Apuesta miApuesta = new Apuesta(din_disp,apuestaGolesLocal,apuestaGolesVisitante);
        miApuesta.apostar(apuesta);
        miApuesta.cobrar_apuesta(golesMetidosLocal, golesMetidosVisitante);
        assertTrue(miApuesta.getDinero_disp()==salida);        
        
    }
}
