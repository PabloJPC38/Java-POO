/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej6;
import Ctrl.Ctrl_Cafetera;
import Mod_Cafetera.Cafetera;
import java.util.Scanner;


/**
 *
 * @author pablo
 */
public class POOEj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer=new Scanner(System.in);
    
    Ctrl_Cafetera CC=new Ctrl_Cafetera();
    Cafetera coffe=new Cafetera(0,1000);
    
    CC.Agregar_Cafe(coffe, 850);
    System.out.println(coffe);
    CC.Servir_Taza(coffe, 500);
    System.out.println(coffe);
    CC.Servir_Taza(coffe, 800);
    CC.LLenar_Cafetera(coffe);
    System.out.println(coffe);
    CC.Vaciar_Taza(coffe);
    System.out.println(coffe);
    
        
       
    }
    
}
