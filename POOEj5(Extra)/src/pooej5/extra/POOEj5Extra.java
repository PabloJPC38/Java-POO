/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej5.extra;
import java.util.Scanner;
import Mod_Mes.Mes;

/**
 *
 * @author pablo
 */
public class POOEj5Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner leer=new Scanner(System.in);
        Mes mes=new Mes();
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:");
        
        
        while (!mes.getMes_secreto().equals(leer.next())) {
         
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            
        }

        System.out.println("¡Ha acertado!");
    }
    
}
