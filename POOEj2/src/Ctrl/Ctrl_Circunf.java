/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctrl;
import java.util.Scanner;
import Figura.Circunferencia;

/**
 *
 * @author pablo
 */
public class Ctrl_Circunf {
    
    
    public Circunferencia Crear(){
    Scanner leer=new Scanner(System.in);
    Circunferencia C=new Circunferencia();
    System.out.println("Ingrese radio:");
    C.setRadio(leer.nextFloat());
        
    return C;
    }
    
    public void Area(Circunferencia C){
        
        System.out.println("Área:"+(Math.pow(C.getRadio(), 2)* Math.PI));
    }
    
    public void Perimetro(Circunferencia C){
        
        System.out.println("Perímetro:"+(2*Math.PI*C.getRadio()));
    }
    
}


