/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej13.extra;
import java.util.Scanner;
/**
 *
 * @author pablo
 */
public class Ej13Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer=new Scanner(System.in);
        int num;
        
        /* escalera1 tipo "StringNuilder"*/
        StringBuilder escalera1= new StringBuilder();
        /*escalera2 y escalera3 tipo "String"*/
        String saludo="Hola",escalera2="",escalera3="";
        
       
       
        
        System.out.println("Ingresar número:");
        num=leer.nextInt();
                       
        ////////////////////////////////////////
        System.out.println("Primer Método:");
        for (int i = 1; i <=num; i++) {
            
            escalera1.append(Integer.toString(i));
            System.out.println(""+escalera1);                        
        }
        ////////////////////////////////////////
        System.out.println();
        
        System.out.println("Segundo Método:");
         for (int i = 1; i <=num; i++) {
            
            escalera2+=String.valueOf(i);
            System.out.println(""+escalera2);                        
        }
        ////////////////////////////////////////
        
        System.out.println();
        System.out.println("Tercer Método:");
        for (int i = 1; i <=num; i++) {
            
            escalera3=escalera3.concat(String.valueOf(i));
            System.out.println(""+escalera3);                        
        }
        ////////////////////////////////////////
    }
    
}
