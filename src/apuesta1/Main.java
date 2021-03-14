/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apuesta1;

/**
 *
 * @author Alex'sCucumbah
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Apuesta miApuesta;
        int mi_dinero;

        miApuesta = new Apuesta(1000, 4, 2);
        try {
            System.out.println("Apostando...");
            miApuesta.apostar(25);
        } catch (Exception e) {
            System.out.println("Fallo al realizar la Apuesta");
        }

        try {
            System.out.println("Intento cobrar apuesta segun el resultado del partido");
            miApuesta.cobrar_apuesta(2, 3);
        } catch (Exception e) {
            System.out.println("Fallo al cobrar la apuesta");
        }
        mi_dinero = miApuesta.getDinero_disp();
        System.out.println("El dinero que tengo tras las apuestas es " + mi_dinero);
    }
    
}
