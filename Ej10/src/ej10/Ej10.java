/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10;
import java.util.Scanner;
/**
 *
 * @author pablo
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int max,suma=0,num;
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingresar MAX:");
        max=leer.nextInt();
        
        System.out.println("Ingresar número");
        num=leer.nextInt();
        suma+=num;
        
        while(suma<max){
            
            System.out.println("Suma:"+suma);
            System.out.println("Ingresar número");
            num=leer.nextInt();
            suma+=num;
        }
        
    }
    
}
