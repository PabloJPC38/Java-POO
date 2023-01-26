/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5.extra;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ej5Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        float valor;
        char letra;
        
        System.out.println("Ingresar letra:");
        letra=leer.next().charAt(0);
        System.out.println("Ingresar valor:");
        valor=leer.nextFloat();
        Descuento(letra,valor);
        
    }
    
    public static void Descuento(char letra, float valor){
    
        switch (letra) {
            case 'A':
                
                System.out.println("Se le hace un descuento de 50% y abonan $"+(valor-(valor*0.5)));
                
                break;
                
            case 'B':
                
                System.out.println("Se le hace un descuento de 35% y abonan $"+(valor-(valor*0.35)));
                
                break;
                
            case 'C':
                
                System.out.println("No se le hace un descuento y abonan $"+valor);
                
                break;
            default:
                throw new AssertionError();
        }
    
    }
}
