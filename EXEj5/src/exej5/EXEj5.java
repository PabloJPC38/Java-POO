
package exej5;

import java.util.InputMismatchException;
import java.util.Scanner;
// @author Pablo

import java.util.Random;

public class EXEj5 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random rnd = new Random();
        int num=rnd.nextInt(501)+1,resp=0,cont=0;
        
        
        do{

            try{
                
                cont++;
                System.out.println("Ingrese número:");
                resp=leer.nextInt();

                if (resp<num){
                    
                    System.out.println("El número a adivinar es mayor al ingresado");
                    
                }
                
                if (resp>num){
                
                    System.out.println("El número a adivinar es menor al ingresado");
                }
            }
            
            catch(InputMismatchException e){

                System.out.println("Error, se ingresó un valor que no corresponde al tipo de dato");
                leer.next();
            }
            
        } while (resp!=num);
        
        System.out.println("Adivinaste el numero es "+num);
        System.out.println("Número de intentos:"+cont);
    }
}


