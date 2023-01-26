/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej1;

import Ctrl.Ctrl_Libro;
import Mod_Libro.Libro;

/**
 *
 * @author pablo
 */
public class POOEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Ctrl_Libro CL=new Ctrl_Libro();
        Libro L=CL.Crear_Libro();
       
        System.out.println(L);
        
    }
    
}
