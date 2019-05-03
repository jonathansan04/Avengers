/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avengers.logica;

/**
 *
 * @author tatan
 */
public interface Volador {

    /**
     * Elevarse del suelo.
     */
    public void Despegar();

    /**
     * Manteerse elevado del sueloy maneobrar.
     */
    public void Planear();

    /**
     * llegar al suelo.
     */
    public void Aterrizar();
    
    /**
     * Rapidez y velocidad con la que vuela.
     */
    public void potencia();
    

}
