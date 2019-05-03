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
public class IronMan implements Volador {

    public void Despegar() {
        System.out.println("Despega por medio de propulsion y un generador de energia. ");
    }

    public void Planear() {
        System.out.println("Se mantiene en el aire por medio de propulsion, no puede volar demasiado alto. ");
    }

    public void Aterrizar() {
        System.out.println("Aterriza cuando el generador de energia se empieza acabar.  ");
    }

    public void potencia() {
        System.out.println(" Cuando inicia a volar es muy rapido cuando cae es por que pierde potencia. ");
    }

}
