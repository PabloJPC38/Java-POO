/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej18.extra;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author pablo
 */
public class Ej18Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        int N=20;
        int []filas= new int [N];
        String [][]S=new String [N][N];
        
        
        Inicializar_filas(filas);
        Inicializar_Sopa(S);
        
        for (int i = 0; i < N; i++) {
            
            Llenar_Sopa(S,filas);
        }
        
        Mostrar_Sopa_De_Letras(S);
        
        
        
    }
    
    public static void Llenar_Sopa(String [][]S,int filas[]){
       
        Scanner leer=new Scanner(System.in);
        String aux;
        int i,j;
        
        System.out.println("Ingrese palabra:");
        aux=leer.next();
        
        
        ////////////////////////////////////////
        
        while(aux.length()<3 || aux.length()>5){
            
            System.out.println("Ingrese palabra de tamaño válido:");
            aux=leer.next();
        }
        
        ///////////////////////////////////////
        i=(int)(Math.random()*19+1);
        while(Fila_Ocupada(filas,i)){
            i=(int)(Math.random()*19+1);
        }
        
        ///////////////////////////////////////
        j=(int)(Math.random()*19+1);
        while(Fila_Espacio_Ocupado(S[i],j,aux)){
            j=(int)(Math.random()*19+1);
        }
        
        ///////////////////////////////////////
        
        S[i][j]=S[i][j].concat(aux);
        
        //////////////////////////////////////
        
        Rellenar_Espacios_Vacios(S[i],j);
        
        /////////////////////////////////////
        
        filas[i]=i;
        System.out.println("palabra:"+Arrays.toString(S[i]));
         
    }
    
    public static boolean Fila_Ocupada(int filas[],int f){
        
        for (int i = 0; i < filas.length; i++) {
            
            if(f==filas[i]){
                return true;
            }
        }
        
        return false;
    }
    
    public static boolean Fila_Espacio_Ocupado(String[]S,int c,String aux){
        
        int cont=0;
        
        
        
        for (int i = c; i < S.length; i++) {
            
            if(!"".equals(S[i])){
                return true;
            }
            cont++;
        }
        
        if (cont<aux.length()) {
           
            return true;
        }
        
        return false;
    }
    
    public static void Rellenar_Espacios_Vacios(String []S,int c){
    
        int cont=0;
        
        for (int i = 0; i < c; i++) {
            
            S[i]+=String.valueOf((int)(Math.random()*10));
            
        }
        
        for (int i =c; !"".equals(S[i]); i++) {
            
            cont++;
        }
        
        for (int i =cont+1; i <S.length ; i++) {
            
            S[i]+=String.valueOf((int)(Math.random()*10));           
        }
    }
    
    
    public static void Mostrar_Sopa_De_Letras(String [][]S){
    
        for (String[] S1 : S) {
            for (int j = 0; j < S.length; j++) {
                System.out.print("[" + S1[j] + "]");
            }
            System.out.println("");
        }
    }
    
    public static void Inicializar_filas(int filas[]){
        
        for (int i = 0; i < filas.length; i++) {
            
                filas[i]=-1;
        }
    }
    
    public static void Inicializar_Sopa(String [][]S){
        
        for (int i = 0; i < S.length; i++) {
            
            for (int j = 0; j < S.length; j++) {
                
                 S[i][j]="";
                
            }
            
        }
    }
    
    
}
