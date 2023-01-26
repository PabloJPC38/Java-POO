/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej2;

import Ctrl.Ctrl_Circunf;
import Figura.Circunferencia;


/**
 *
 * @author pablo
 */
public class POOEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Ctrl_Circunf CC=new Ctrl_Circunf();
        Circunferencia c=CC.Crear();
        CC.Area(c);
        CC.Perimetro(c);
        
        
    }
    
}
