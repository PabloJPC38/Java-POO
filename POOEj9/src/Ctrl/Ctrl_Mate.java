/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctrl;

import Mod_Mate.Mate;




/**
 *
 * @author pablo
 */
public class Ctrl_Mate {
    

    public static float Devolver_Mayor(Mate m){
    
        if (m.getNum1()>m.getNum2()) {
            
            return m.getNum1();
            
        }
        else{
        
            return m.getNum2();
        }
        
    }
    
    public static float Devolver_Menor(Mate m){
    
        if (m.getNum1()<m.getNum2()) {
            
            return m.getNum1();
            
        }
        else{
        
            return m.getNum2();
        }
        
    }
    
    public void Calcular_Potencia(Mate m){
    
        System.out.println("Potencia de "+Devolver_Mayor(m)+" elevado a "+Devolver_Menor(m)+":"
                +Math.pow(Math.round(Devolver_Mayor(m)),Math.round(Devolver_Menor(m))));
    }
    
    public void Calcular_Raiz(Mate m){
    
        System.out.println("Raiz de "+Devolver_Menor(m)+":"+Math.sqrt(Math.abs(Devolver_Menor(m))));
    }
}
