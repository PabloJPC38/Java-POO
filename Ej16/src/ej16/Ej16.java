/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej16;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int N,num;
        
        System.out.println("Ingrese dimensión:");
        N=leer.nextInt();
        
        int []v= new int[N];
        Inicializar(v);
        System.out.println("Ingrese número a buscar:");
        num=leer.nextInt();
        Encontrar(v,num);
        Mostrar(v);
        
    
    }
    
    public static void Inicializar(int v[]){
        
        for (int i = 0; i < v.length; i++) {
            v[i]=(int)(Math.random()*10);    
        }   
    }
    public static void Encontrar(int v[],int num){
        int c=0;
        
        for (int i = 0; i < v.length; i++) {
            
            if (v[i]==num) {
                System.out.println("Se encuentra en la posición ["+i+"]");
                c++;
            }
        }
        
        if (c==0) {
            System.out.println("No se encontró");
        }
   }
   public static void Mostrar(int v[]){
        
        for (int i = 0; i < v.length; i++) {
            System.out.print("v["+i+"]="+v[i]+" ");    
        }   
    }
}
