/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11.extra;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ej11Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int num;
        System.out.println("Escribir número:");
        num=leer.nextInt();
        Cantidad_Digitos(num);
        
    }
    
    public static void Cantidad_Digitos(int num){
        int c=0;
        
        while(num>1){
            
            num/=10;
            c++;
        }
        
        System.out.println("Hay "+c+" dígitos");
    }
}
