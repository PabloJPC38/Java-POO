/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2.extra;
import java.util.Scanner;
/**
 *
 * @author pablo
 */
public class Ej2Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer=new Scanner(System.in);
    int A,B,C,D;
    int [] aux=new int[4];
    
    
  
        System.out.println("Ingresar valor de A:");
        A=leer.nextInt();
        aux[0]=A;
        System.out.println("Ingresar valor de B:");
        B=leer.nextInt();
        aux[1]=B;
        System.out.println("Ingresar valor de C:");
        C=leer.nextInt();
        aux[2]=C;
        System.out.println("Ingresar valor de D:");
        D=leer.nextInt();
        aux[3]=D;
        
        System.out.println("A:"+A+" B:"+B+" C:"+C+" D:"+D);
        
        A=aux[3];
        B=aux[2];
        C=aux[0];
        D=aux[1];
        
        System.out.println("A:"+A+" B:"+B+" C:"+C+" D:"+D);
      
    
    }
    
}
