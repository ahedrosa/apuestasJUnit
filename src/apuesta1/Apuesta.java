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
public class Apuesta {
    private int dinero_disp;
    private int goles_local;
    private int goles_visitante;
    private int apostado;

    /*Contructor por defecto*/
    public Apuesta() {
    }

    /*Contructor por parámetros*/
    public Apuesta(int dinero_disp, int goles_local, int goles_visitante) {
        this.dinero_disp = dinero_disp;
        this.goles_local = goles_local;
        this.goles_visitante = goles_visitante;
        this.apostado = 0;
    }
    /*Método para obtener el valor del atributo dinero_disp*/

    public int getDinero_disp() {
        return dinero_disp;
    }
    /*Método para modificar el valor del atributo dinero_disp*/

    public void setDinero_disp(int dinero_disp) {
        this.dinero_disp = dinero_disp;
    }

    /*Método para apostar.
     * Permite elegir la cantidad a apostar, no pudiendo ser inferior a 1 ni superior a tu saldo disponible
     * Este método será probado con JUnit
     */
    public void apostar(int dinero){
        if (dinero <= 0) {
            System.out.println("No se puede apostar menos de 1€");
        }else if (dinero > dinero_disp) {
            System.out.println("No se puede apostar mas de lo que tienes");
        }else {
            dinero_disp = dinero_disp - dinero;
            apostado = dinero;
        }
    }
    /*Método que comprueba si se ha acertado el resultado del partido
     * En caso de que lo haya acertado devuelve true. Chequea que no se metan menos de 0 goles
     * 
     */

    public boolean comprobar_resultado(int local, int visitante){
        boolean acertado = false;
        if ((local < 0) || (visitante) < 0) {
            System.out.println("Un equipo no puede meter menos de 0 goles, por malo que sea");
        }else if (goles_local == local && goles_visitante == visitante) {
            acertado = true;
        }
        return acertado;
    }
    /* Método para cobrar la apuesta.
     * Comprueba que se acertó el resultado y, en ese caso, añade el valor apostado multiplicado por 10
     * al saldo disponible
     * Este método se va a probar con Junit
     */

    void cobrar_apuesta(int cantidad_goles_local, int cantidad_goles_visit){

        if (comprobar_resultado(cantidad_goles_local, cantidad_goles_visit) == false) {
            System.out.println("No se puede cobrar una apuesta no acertada");
        }else{
            dinero_disp=(dinero_disp+(apostado*10));
        }
    }
    
}