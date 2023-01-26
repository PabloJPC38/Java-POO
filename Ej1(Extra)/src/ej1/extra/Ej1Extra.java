/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1.extra;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ej1Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer=new Scanner(System.in);
    int min;
    
        System.out.println("Ingrese los minutos:");
        min=leer.nextInt();
        
        System.out.println("Equivale a "+(int)(min*0.000694)+" días y a "+(int)(min*0.0167)+" horas");
    
    }
    
}
