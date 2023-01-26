/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej17.extra;
import java.util.Scanner;
/**
 *
 * @author pablo
 */
public class Ej17Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingresar número:");
        num=leer.nextInt();
        
        if(Primo(num)){
            System.out.println("Es primo");
        }
        else{
            System.out.println("No es primo");
        }
    }
    
    public static boolean Primo(int num){
        
        int cont=0;
        
        for(int i = 2; i <num; i++) {
            
                if(num%i==0) {
                       
                  cont++;  
            }
            
        }
        return cont==0;
        
    }
}
