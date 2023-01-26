/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej20;
import java.util.Scanner;
/**
 *
 * @author pablo
 */
public class Ej20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N=3,suma;
        int [][]M=new int[N][N];
        int [] s1=new int [N];
        int [] s2=new int [N];
        
        
        Llenar_Matriz(M);
        Mostrar_Matriz(M);
        suma=Suma_Diagonal_Principal(M);
        
        if(suma==Suma_Diagonal_Secundaria(M)){
            if(Suma_Columnas(M,s1)){
                if(s1[0]==suma){
                    if(Suma_Filas(M,s2)){
                        if(s2[0]==suma){
                        System.out.println("Es un cuadrado mágico!!!");
                        }
                        else{
                            System.out.println("No es un cuadrado mágico");
                        }
                    }
                    else{
                        System.out.println("No es un cuadrado mágico");
                    }
                }    
                else{
                    System.out.println("No es un cuadrado mágico");
                }
            }
            else{
                System.out.println("No es un cuadrado mágico");
            }
        }
        else{
            System.out.println("No es un cuadrado mágico");
        }
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
        for (int[] M1 : M) {
            for (int j = 0; j < M.length; j++) {
                System.out.print("[" + M1[j] + "]");    
            }
            System.out.println("");
        }
    }
    
    
    public static int Suma_Diagonal_Principal(int M[][]){
        int suma=0;
        
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                
                if (i==j){
                    suma+=M[i][j];
                }
            }
        }
        
        return suma;
    }
    
    public static int Suma_Diagonal_Secundaria(int M[][]){
        int suma=0;
        
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                
                if ((i+j+2)==((M.length)+1)){
                    suma+=M[i][j];
                }
            }
        }
        return suma;
    }
    
     public static boolean Suma_Columnas(int M[][],int s1[]){
        
        
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                
                switch (i) {
                    case 0:
                        s1[i]+=M[i][j];
                        break;
                    case 1:
                        s1[i]+=M[i][j];
                        break;
                    default:
                        s1[i]+=M[i][j];
                        break;
                }
                }
           if(i==2){
                if(s1[0]!=s1[1]){
                    return false;
                }
            }
            }
        return s1[0] == s1[2];
        } 
         
     public static boolean Suma_Filas(int M[][],int s2[]){
        
        
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                
                switch (j) {
                    case 0:
                        s2[i]+=M[i][j];
                        break;
                    case 1:
                        s2[i]+=M[i][j];
                        break;
                    default:
                        s2[i]+=M[i][j];
                        break;
                }
                }
            
            if(i==2){
                if(s2[0]!=s2[1]){
                    return false;
                    
                }
            }
            }
            return s2[0] == s2[2];
        
        }    
    } 
    




    
    

