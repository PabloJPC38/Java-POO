/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej4;

import Ctrl.Ctrl_Rectangulo;
import Mod_Rectangulo.Rectangulo;

/**
 *
 * @author pablo
 */
public class POOEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Ctrl_Rectangulo CR=new Ctrl_Rectangulo();
        Rectangulo Rect=new Rectangulo();
        
        Rect=CR.Crear();
        CR.Superficie(Rect);
        CR.Perimetro(Rect);
        CR.Dibujar_Rectangulo(Rect);
    
    }
    
}
