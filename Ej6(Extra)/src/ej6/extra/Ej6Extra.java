/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6.extra;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ej6Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int N;
        System.out.println("Ingresar Dimensión");
        N=leer.nextInt();
        
        float []alt=new float [N];
        Llenar_Arreglo(alt);
        Calcular_Promedio(alt);
        
        
        
    }
    
    public static void Llenar_Arreglo(float alt[]){
        Scanner leer=new Scanner(System.in);
        
        for (int i = 0; i < alt.length; i++) {
            
            System.out.println("Ingrese altura:");
            alt[i]=leer.nextFloat();
            
        }
    }
    
    public static void Calcular_Promedio(float alt[]){
    
        float prom_general=0,prom=0;
        int c=0;
        
        for (int i = 0; i < alt.length; i++) {
            
            if(alt[i]<1.6){
                prom+=alt[i];
                c++;
            }
            
            prom_general+=alt[i];
            
        }
        
        System.out.println("Promedio General:"+prom_general/alt.length);
        System.out.println("Promedio de menores de 1.6m:"+prom/c);
    }
    
}
