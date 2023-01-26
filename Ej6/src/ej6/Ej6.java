/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int num;
    Scanner leer=new Scanner(System.in);
    
        System.out.println("Ingresar número:");
        num=leer.nextInt();
        
        
        if (num%2==0){
            System.out.println("El número es par");
        }
        else{
             System.out.println("El número es impar");
        }
    }
    
}
