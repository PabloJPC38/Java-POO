/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej9.extra;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ej9Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int num1,num2;
        System.out.println("Ingresar dividendo:");
        num1=leer.nextInt();
        System.out.println("Ingresar divisor:");
        num2=leer.nextInt();
        Division(num1,num2);
    }
    
    public static void Division(int num1,int num2){
    
        int resto=num2,cociente=0;
        
        while(num1>=num2){
            
            num1-=num2;
            resto=num1;
            cociente++;
        }
        
        System.out.println("Residuo:"+resto+" cociente:"+cociente);
    }
    
}
