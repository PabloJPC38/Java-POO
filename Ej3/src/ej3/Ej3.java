/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String frase;
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese frase:");
        frase=leer.nextLine();
        
        System.out.println("Frase en mayúscula:"+frase.toUpperCase());
        
         System.out.println("Frase en minúscula:"+frase.toLowerCase());
    }
    
}
