/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej19;
import java.util.Scanner;
/**
 *
 * @author pablo
 */
public class Ej19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N=3;
        int [][]M=new int[N][N];
        int [][]T=new int[N][N];
        Llenar_Matriz(M);
        Trasponer_Matriz(M,T);
        Comprobar_Antisimetrica(M,T);
    }
    
    public static void Llenar_Matriz(int M[][]){
        Scanner leer= new Scanner(System.in);
        
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                System.out.println("Ingrese valor para ["+i+"]["+j+"]:");
                M[i][j]= leer.nextInt();     
            }    
        }
    }
    
    public static void Mostrar_Matriz(int M[][]){
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                System.out.print("["+M[i][j]+"]");    
            }
            System.out.println("");
        }
    }

    public static void Trasponer_Matriz(int M[][],int T[][]){
        
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                T[i][j]=M[j][i];    
            }
        }
    }
    
    public static void Comprobar_Antisimetrica(int M[][],int T[][]){
        
        boolean band=false;
        
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
               if (T[i][j]  == (-1*M[i][j])){
                   band=true;
               }
               else{
                   band=false;
                   break;
               }
            }
        }
        
        if (band){
            System.out.println("Es Anti Símétrica");
            Mostrar_Matriz(M);
            System.out.println("");
            Mostrar_Matriz(T);
        }else{
            System.out.println("No es Anti Simétrica");
        }
        
    }
    
    
}
