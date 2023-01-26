/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctrl;


import Mod_Cafetera.Cafetera;

/**
 *
 * @author pablo
 */
public class Ctrl_Cafetera {
    
    
    public void LLenar_Cafetera(Cafetera coffe){
        
        coffe.setCantidad_Actual(coffe.getCapacidad_Maxima());
    }
    
    public void Servir_Taza(Cafetera coffe,int taza){
        
        if (taza<coffe.getCantidad_Actual()) {
            
            coffe.setCantidad_Actual(coffe.getCantidad_Actual()-taza);
            System.out.println("Se llenó");
        }
        else{
            
            System.out.println("Se pudo llenar solo "+coffe.getCantidad_Actual()+"ml de cafe a la taza");
        }
    }
    
    public void Vaciar_Taza(Cafetera coffe){
        
        coffe.setCantidad_Actual(0);
    }
    
    public void Agregar_Cafe(Cafetera coffe, int cantidad){
        
        if (coffe.getCapacidad_Maxima()<cantidad) {
            
            coffe.setCantidad_Actual(coffe.getCapacidad_Maxima());
            
        }
        else{
        
            coffe.setCantidad_Actual(cantidad);
        }
    }
    
    
}
