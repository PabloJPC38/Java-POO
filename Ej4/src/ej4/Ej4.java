/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float grado;
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingresar grados centígrado:");
        grado=leer.nextFloat();
        
        System.out.println("Equivalente en Fahrenheit:"+(32+(9*grado/5)));
        
        
    }
    
}
