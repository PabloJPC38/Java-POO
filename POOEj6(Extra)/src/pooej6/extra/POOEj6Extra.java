/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej6.extra;

import Ctrl.Ctrl_Ahorcado;
import Mod_Ahorcado.Ahorcado;

/**
 *
 * @author pablo
 */
public class POOEj6Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        /*
            |---
               |
               O
              /|\
               |
              / \
             -   -
        */
    
        Ctrl_Ahorcado CA=new Ctrl_Ahorcado();
        Ahorcado A=CA.Crear_Juego();
        CA.Juego(A);
    }
    
}

