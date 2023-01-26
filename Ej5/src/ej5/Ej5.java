/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5;
import java.util.Scanner;
/**
 *
 * @author pablo
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int num;
    Scanner leer=new Scanner(System.in);
    
        System.out.println("Ingrese número:");
        num=leer.nextInt();
        
        System.out.println("Doble:"+(num*2)+" Triple:"+(num*3)+" Raiz:"+ (int) Math.sqrt(num));
    }
    
    
}
