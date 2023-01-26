/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej3.extra;

import Ctrl.Ctrl_Raices;
import Mod_Raices.Raices;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class POOEj3Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner leer=new Scanner(System.in);
        Raices raiz=new Raices(leer.nextInt(),leer.nextInt(),leer.nextInt());
        Ctrl_Raices CR=new Ctrl_Raices();
        
        CR.Calcular(raiz);
        
    }
    
}
