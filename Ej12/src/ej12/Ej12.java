/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej12;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        String frase;
        int co=0,ci=-1;
        Scanner leer=new Scanner(System.in);
        
        do {  
            
            System.out.println("Ingresar frase:");
            frase=leer.nextLine();
            
            
            if ((frase.substring(0, 1).equals("X"))&&(frase.substring(frase.length()-1, frase.length()).equals("O"))&&(frase.length()==5)) {
                co++;
               
            }else{
               ci++; 
            }
            
        } while(!frase.equals("&&&&&"));
        
        
        System.out.println("Correctas:"+co+" Incorrectas:"+ci);
          
    }
    
}
