/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej13;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer=new Scanner(System.in);
        int N;
        
        System.out.println("Ingrese longitud:");
        N=leer.nextInt();
        
        for (int i = 0; i < N; i++) {   
            System.out.print("*");   
        
        }
        System.out.println("");
        
        
        for (int j = 1; j < N-1; j++) {
            
        
        for (int k = 0; k < N; k++) {
            
            
            
            if (k==0 || k==N-1) {
                
                System.out.print("*");   
                
            }
            else{
                System.out.print(" ");
            }
            
        }
        
        System.out.println("");
        } 
        
        for (int i = 0; i < N; i++) {   
            System.out.print("*");   
        
        }
        System.out.println("");
    }
    
}
