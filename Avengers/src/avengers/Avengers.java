
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avengers;

import avengers.logica.*;
import java.util.Scanner;

/**
 *
 * @author tatan
 */
public class Avengers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" Seleccione el personaje  ");
        System.out.println(" 1.IronMan   ");
        System.out.println(" 2.Hulk   ");
        System.out.println(" 3.Makkari   ");
        System.out.println(" 4.BRStrange  ");
        System.out.println(" 5.IronMan   ");
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        switch (num) {
            case 1:
                IronMan i = new IronMan();
                i.Despegar();
                i.Planear();
                i.Aterrizar();
                i.potencia();
                break;
            case 2:
                Hulk h = new Hulk();
                h.brazos();
                h.golpe();
                h.piernas();
                h.resistencia();
                break;
            case 3:
                Makkari m = new Makkari();
                m.alcance();
                m.forma();
                m.superficie();
                m.medio();
                break;
            case 4:
                DRStrange d = new DRStrange();
                d.Alcance();
                d.Invisibilidad();
                d.Poder();
                d.TipoDeMagia();
                break;
        }
    }

}
