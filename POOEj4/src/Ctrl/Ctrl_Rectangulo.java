/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctrl;
import java.util.Scanner;
import Mod_Rectangulo.Rectangulo;

/**
 *
 * @author pablo
 */
public class Ctrl_Rectangulo {
    
    
    public Rectangulo Crear(){
        
        Scanner leer=new Scanner(System.in);
        Rectangulo Rect=new Rectangulo();
        System.out.println("Ingrese base:");
        Rect.setBase(leer.nextInt());
        System.out.println("Ingrese altura:");
        Rect.setAltura(leer.nextInt());
        return Rect;
        
    }
    
    public void Superficie(Rectangulo Rect){
        
        System.out.println("Superficie:"+(Rect.getBase()*Rect.getAltura()));
    }
    
    public void Perimetro(Rectangulo Rect){
        
        System.out.println("Perímetro:"+((Rect.getBase()+Rect.getAltura()))*2);
    }
    
    public void Dibujar_Rectangulo(Rectangulo Rect){
    
    
        for (int i = 0; i <Rect.getBase(); i++) {
            
            System.out.print("*"); 
            
        }
        
        System.out.println("");
        
        
        for (int j = 1; j < Rect.getAltura()-1; j++) {
            
        
        for (int k = 0; k <Rect.getBase() ; k++) {
            
            
            
            if (k==0 || k==Rect.getBase()-1) {
                
                System.out.print("*");   
                
            }
            else{
                System.out.print(" ");
            }
            
        }
        
        System.out.println("");
        }
        
        
        for (int i = 0; i <Rect.getBase(); i++) {
            
            System.out.print("*"); 
            
        }
        
    }
}
