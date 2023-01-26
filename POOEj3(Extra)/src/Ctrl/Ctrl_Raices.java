/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctrl;

import Mod_Raices.Raices;

/**
 *
 * @author pablo
 */
public class Ctrl_Raices {
    
    public static int Get_Discriminante(Raices raiz){
    
        return((int)(Math.pow(raiz.getB(),2))-4*raiz.getA()*raiz.getC());
        
    }
    
    
    public static boolean Tiene_Raices(Raices raiz){
    
        return Get_Discriminante(raiz)>=0;
    }
    
    public static boolean Tiene_Raiz(Raices raiz){
    
        return Get_Discriminante(raiz)==0;
    }
    
    
    public static boolean Obtener_Raiz(Raices raiz){
    
        if (Tiene_Raiz(raiz)) {
            
             System.out.println("Raiz="+(-raiz.getB()+(Math.sqrt((Math.pow(raiz.getB(),2))-(4*raiz.getA()*raiz.getC()))))/(2*raiz.getA()));
        
             return true;
        }
        else{
        
            return false;
        }
    }
    
    public static boolean Obtener_Raices(Raices raiz){
    
        if (Tiene_Raices(raiz)) {
            
             System.out.println("Raiz 1="+(-raiz.getB()+(Math.sqrt((Math.pow(raiz.getB(),2))-(4*raiz.getA()*raiz.getC()))))/(2*raiz.getA()));
             
             System.out.println("Raiz 2="+(-raiz.getB()-(Math.sqrt((Math.pow(raiz.getB(),2))-(4*raiz.getA()*raiz.getC()))))/(2*raiz.getA()));
             return true;
        }
        else{
        
            return false;
        }
        
        
    }
    
    public void Calcular(Raices raiz){
    
        if (Tiene_Raices(raiz)) {
            
            Obtener_Raices(raiz);
        }
        else if(Tiene_Raiz(raiz)){
        
            Obtener_Raiz(raiz);
        }
        else{
            
            System.out.println("No exite solución");
        }
    
    }
    
    
    
    
}

