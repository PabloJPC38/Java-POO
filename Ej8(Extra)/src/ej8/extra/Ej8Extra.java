/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8.extra;
import java.util.Scanner;
/**
 *
 * @author pablo
 */
public class Ej8Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner leer=new Scanner(System.in);
    int N=50;
    int []num=new int [N];
    Paridad(num);
    
    
    }
    
    public static void Paridad(int num[]){
        int i=0,par=0,impar=0;
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese número:");
        num[0]=leer.nextInt();
        
        if (num[0]%2==0) {
                par++;
            }
            else{
                impar++;
            }
        
        
        while((num[i]%5!=0)) {
            i++;
            System.out.println("Ingrese número:");
            num[i]=leer.nextInt();
            
            while(num[i]<0){
                    System.out.println("Ingrese número válido:");
                    num[i]=leer.nextInt();
                }
            
            if (num[i]%2==0) {
                par++;
            }
            else{
                impar++;
            }
            
        }
        
        System.out.println("Pares:"+par+" Impares:"+impar);
        
    }
    
}
