/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej9;

import Ctrl.Ctrl_Mate;
import Mod_Mate.Mate;
import java.util.Random;

/**
 *
 * @author pablo
 */
public class POOEj9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rnd=new Random();
       Ctrl_Mate CM=new Ctrl_Mate();
       Mate m=new Mate(rnd.nextFloat()*10,rnd.nextFloat()*10);
       CM.Calcular_Potencia(m);
       CM.Calcular_Raiz(m);
        
        
    }
    
}
