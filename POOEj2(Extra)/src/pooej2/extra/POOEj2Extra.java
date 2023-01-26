/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej2.extra;

import Ctrl.Ctrl_Puntos;
import Mod_Puntos.Puntos;

/**
 *
 * @author pablo
 */
public class POOEj2Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Puntos puntos=new Puntos();
        Ctrl_Puntos CP=new Ctrl_Puntos();
        
        puntos=CP.Crear();
        System.out.println("Distancia entre ambos puntos:"+CP.Calcular_Distancia(puntos));
    }
    
}
