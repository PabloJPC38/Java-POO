/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3.extra;
import java.util.Scanner;
/**
 *
 * @author pablo
 */
public class Ej3Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer=new Scanner(System.in);
    String letra;
    
        System.out.println("Escribir letra");
        letra=leer.nextLine();
        
        if(letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")
           ||letra.equalsIgnoreCase("u")){
            
            System.out.println("Es vocal");
        }
        else{
            System.out.println("No es vocal");
        }
    }
    
}
