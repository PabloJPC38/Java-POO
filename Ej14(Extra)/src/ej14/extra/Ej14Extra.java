/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej14.extra;
import java.util.Scanner;
/**
 *
 * @author pablo
 */
public class Ej14Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer=new Scanner(System.in);
        int N,M,edad,prom=0;
        
        System.out.println("Ingresar cantidad de familias:");
        N=leer.nextInt();
        for (int i = 0; i < N; i++) {
            
            System.out.println("Ingrese cantidad de hijos:");
            M=leer.nextInt();
            
            for (int j = 0; j < M; j++) {
                
                System.out.println("Ingrese edad de hijo "+(j+1)+":");
                edad=leer.nextInt();
                prom+=edad;
            }
            
            System.out.println("Promedio de la edad de los hijos de la familia "+(i+1)+":"+prom/M);
            prom=0;
            
        }
   }
    
}
