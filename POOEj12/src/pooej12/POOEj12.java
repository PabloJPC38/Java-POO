/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej12;
import java.util.Scanner;
import Ctrl.Ctrl_Persona;
import Mod_Persona.Persona;

/**
 *
 * @author pablo
 */
public class POOEj12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner leer=new Scanner(System.in);
        Ctrl_Persona CP=new Ctrl_Persona();
        Persona p=CP.Crear_Persona();
        CP.Calcular_Edad(p);
        System.out.println("Ingrese edad:");
        
        if (CP.Menor_Que(p,leer.nextInt())) {
            
            System.out.println(p.getNbre()+" es menor que la edad ingresada");
        }
        else{
            System.out.println(p.getNbre()+" es mayor que la edad ingresada");
        }
        
        CP.Mostrar_Persona(p);
    }
    
}
