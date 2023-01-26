/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej18;

/**
 *
 * @author pablo
 */
public class Ej18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N=4;
        int [][]M=new int[N][N];
        Llenar_Matriz(M);
        Mostrar_Matriz(M);
        System.out.println("");
        Trasponer_Matriz(M);
        
        
    }
    public static void Llenar_Matriz(int M[][]){
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                M[i][j]= (int)(Math.random()*10);     
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
    
    
    public static void Trasponer_Matriz(int M[][]){
        System.out.println("Matriz Traspuesta:");
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                System.out.print("["+M[j][i]+"]");    
            }
            System.out.println("");
        }
    }
    
}
