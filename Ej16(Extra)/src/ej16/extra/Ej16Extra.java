/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej15.extra;
import java.util.Scanner;
/**
 *
 * @author pablo
 */
public class Ej15Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mostrar_Datos();
    }
    
    public static void Mostrar_Datos(){
        
        Scanner leer=new Scanner(System.in);
        int N,i=0,edad;
        String resp="",nbre;
        System.out.println("Ingrese cuántas personas:");
        N=leer.nextInt();
        
        while (i<N && !"No".equals(resp) ) {
            
            System.out.println("Ingrese nombre:");
            nbre=leer.next();
            System.out.println("Ingrese edad:");
            edad=leer.nextInt();
            
            if(edad>17){
                System.out.println(nbre+" es mayor de edad, tiene "+edad+" años");
            }
            else{
                System.out.println(nbre+" es menor de edad, tiene "+edad+" años");
            }
            
            System.out.println("Desea continuar?");
            resp=leer.next();
            i++;
        }
        
    }
    
}
