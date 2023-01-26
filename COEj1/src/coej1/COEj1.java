/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coej1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class COEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer=new Scanner(System.in);
        ArrayList <String> raza=new ArrayList();
        String respuesta="no";

    //////////////////LEER RAZAS///////////////////////////
    
        System.out.println("Ingrese raza:");
        raza.add(leer.next());
        
        System.out.println("Quiere salir?");
        respuesta=leer.next();
        
        while(!respuesta.equalsIgnoreCase("si")){
        
            System.out.println("Ingrese raza:");
            raza.add(leer.next());
        
            System.out.println("Quiere salir?");
            respuesta=leer.next();
              
        }
        
    /////////////////MOSTRAR RAZAS//////////////////////////
        
        System.out.println("Razas:");
    
        for (String r : raza) {
            
            System.out.println(r);
            
        }
    /////////////////PEDIR UN PERRO/////////////////////////
    
        System.out.println("Ingrese raza de perro:");
        
        boolean noHay=true;
        
        respuesta=leer.next();
        
        Iterator <String> it=raza.iterator();
        
        
        
        while (it.hasNext()) {
            
            if(it.next().equalsIgnoreCase(respuesta)){
                
                it.remove();
                noHay=false;
            }
                     
        }
        
        if (noHay) {
            
            System.out.println("No se encontró la raza");
        }
    
    /////////////////MOSTRAR RAZAS//////////////////////////
        
        System.out.println("Razas:");
        
        Collections.sort(raza);
    
        for (String r : raza) {
            
            System.out.println(r);
            
        }
        
    }
    
}
