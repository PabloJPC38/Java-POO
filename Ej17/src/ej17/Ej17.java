/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej17;
import java.util.Scanner;
/**
 *
 * @author pablo
 */
public class Ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int N;
        
        System.out.println("Ingrese dimensión:");
        N=leer.nextInt();
        
        int []v= new int[N];
        Inicializar(v);
        Contabilizar(v);
    }
    public static void Inicializar(int v[]){
        
        for (int i = 0; i < v.length; i++) {
            Scanner leer=new Scanner(System.in);
            System.out.println("Ingrese valor para ["+i+"]:");
            v[i]=leer.nextInt();    
        }   
    }
    
    
    public static void Contabilizar(int v[]){
        
        int []c=new int[5];
       
        
        for (int i = 0; i < v.length; i++) {
            
            if (v[i]<10) {
                c[0]++;
            }
            else if(v[i]>=10 && v[i]<100){
                c[1]++;
            }
            else if(v[i]>=100 && v[i]<1000){
                c[2]++;
            }
            else if(v[i]>=1000 && v[i]<10000){
                c[3]++;
            }
            else if(v[i]>=10000 && v[i]<100000){
                c[4]++;
            }
        }
        
        System.out.println("Hay "+c[0]+" de un dígito, "+c[1]+" de dos dígitos, "+c[2]+" de tres dígitos, "+c[3]+" de cuatro dígitos y "+c[4]+" de cinco dígitos");
    }
}
