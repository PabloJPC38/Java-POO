/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej21;
import java.util.Scanner;
/**
 *
 * @author pablo
 */
public class Ej21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int N=10,n=3;
        int [][]P=new int[n][n];
        int [][]M=new int[N][N];
        
        Llenar_Matriz_M(M);
        Mostrar_Matriz(M);
        Llenar_Matriz_P(P);
        Mostrar_Matriz(P);
        
        
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++) {
               if (M[i][j]==P[0][0]){
                   Buscar_Matriz(M,P,i,j);
                }
            }
        }
    }
    
    public static void Llenar_Matriz_M(int Matriz[][]){
        
        for (int[] Matriz1 : Matriz) {
            for (int j = 0; j < Matriz.length; j++) {
                Matriz1[j] = (int)(Math.random()*10);
            }    
        }
    }
    
    public static void Llenar_Matriz_P(int Matriz[][]){
        Scanner leer= new Scanner(System.in);
        
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {
                System.out.println("Ingrese valor para ["+i+"]["+j+"]:");
                Matriz[i][j]= leer.nextInt();     
            }    
        }
    }
    
    public static void Mostrar_Matriz(int Matriz[][]){
        for (int[] Matriz1 : Matriz) {
            for (int j = 0; j < Matriz.length; j++) {
                System.out.print("[" + Matriz1[j] + "]");    
            }
            System.out.println("");
        }
    }
    
          
        public static void Buscar_Matriz(int M[][],int P[][],int a,int b) {
        
        boolean contiene=true;
        
        
        for (int i = 0; i < P.length; i++){
            for (int j = 0; j < P.length; j++) {
                if ((P[i][j]) != (M[i+a][j+b])) {
                    contiene=false;
                    break;
                }
            }
            if(!contiene){
                break;
            }
        }
        
        
        if (contiene==true) {
            System.out.println("La matriz está contenida a partir de fila: " + (a+1) + " columna: " + (b+1) );
            
        }
        
    }
        
        
}






