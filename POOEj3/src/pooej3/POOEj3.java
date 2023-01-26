/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej3;

import Ctrl.Ctrl_Operacion;
import Op.Operacion;

/**
 *
 * @author pablo
 */
public class POOEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Ctrl_Operacion CO=new Ctrl_Operacion();
        Operacion num=new Operacion();
        
        num=CO.Crear();
        
        System.out.println("Suma:"+CO.Sumar(num));
        System.out.println("Resta:"+CO.Restar(num));
        
        if(CO.Multiplicar(num)==0){
          
            System.out.println("Error, hay al menos un valor con cero");
        }
        else{
            System.out.println("Multiplicación:"+CO.Multiplicar(num));
        }
        
        
        if(CO.Dividir(num)==0){
          
            System.out.println("Error, hay al menos un valor con cero");
        }
        else{
            System.out.println("División:"+CO.Dividir(num));
        }
        
    }
    
}
