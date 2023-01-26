/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej4.extra;

import Ctrl.Ctrl_NIF;
import Mod_NIF.NIF;

/**
 *
 * @author pablo
 */
public class POOEj4Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Ctrl_NIF CN=new Ctrl_NIF();
        NIF nif= CN.Crear_NIF();
        
       
        CN.Mostrar(nif);
    }
    
}
