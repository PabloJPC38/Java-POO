/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej10.extra;
import java.util.Scanner;
/**
 *
 * @author pablo
 */
public class Ej10Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer=new Scanner(System.in);
        int num1=(int)(Math.random()*10),num2=(int)(Math.random()*10);
        int result=num1*num2,resp;
        
        System.out.println("Escribir resultado:");
        resp=leer.nextInt();
        while(resp!=result){
            System.out.println("Escribir resultado valido:");
        resp=leer.nextInt();
        }
    }
    
}
