/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej15;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ej15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] v =new int[100];
        
        
        Inicializar_Y_Mostrar(v);
    }
    
    public static void Inicializar_Y_Mostrar(int v[]){
    
        for (int i = 0; i < 100; i++) {
            v[i]=i+1;    
        }
        
        for (int i = 99; i > 0; i--) {
            v[i]=i;   
            System.out.println("v["+(i-1)+"]="+v[i]);
        }
    
    }
}
