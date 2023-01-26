/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej7.extra;
import java.util.Scanner;
/**
 *
 * @author pablo
 */
public class Ej7Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int N;
        System.out.println("Ingresar dimensión:");
        N=leer.nextInt();
        int []num=new int [N];
        Llenar_Arreglo1(num);
        Maximo_Minimo_Promedio(num);
        
        Llenar_Arreglo2(num);
        Maximo_Minimo_Promedio(num);
        
        
    }
    
    public static void Llenar_Arreglo1(int num[]){
        int i=0;
        Scanner leer=new Scanner(System.in);
        
            System.out.println("Ingrese número:");
            num[i]=leer.nextInt();
            i++;
            while (i<num.length) {
              
                
                System.out.println("Ingrese número:");
                num[i]=leer.nextInt();
                
                while(num[i]<0){
                    System.out.println("Ingrese número válido:");
                    num[i]=leer.nextInt();
                }
                i++;
            }
        }
    
    
    public static void Llenar_Arreglo2(int num[]){
        int i=0;
        Scanner leer=new Scanner(System.in);
        
        do{
                
            System.out.println("Ingrese número:");
            num[i]=leer.nextInt();
            while(num[i]<0){
                    System.out.println("Ingrese número válido:");
                    num[i]=leer.nextInt();
                }
            i++;
            
        } while (i<num.length);
        
    }
    
    public static void Maximo_Minimo_Promedio(int num[]){
        
        int max=num[0],min=num[0],prom=0;
        
        for (int i = 1; i < num.length; i++) {
            
            if (max<num[i]) {
                
                max=num[i];
            }
            
            if (min>num[i]) {
                
                min=num[i];
            }
            
            prom+=num[i];
        }
        
        System.out.println("Máximo:"+max+" Mínimo:"+min+" Promedio:"+prom/num.length);
        
    
    }
    
}
