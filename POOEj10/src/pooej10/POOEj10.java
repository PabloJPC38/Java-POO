/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej10;
import java.util.Random;
import java.util.Arrays;
/**
 *
 * @author pablo
 */
public class POOEj10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Random rnd=new Random();
        float []A=new float [50];
        float []B=new float [20];
        
        for (int i = 0; i < A.length; i++) {
                A[i]=rnd.nextFloat()*(100-0)+0;
            
        }
        
        
        System.out.println("Arreglo A:");
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
            
        }
        
        System.out.println("");
        Arrays.sort(A);
        System.arraycopy(A, 0, B, 0, 10);
        Arrays.fill(B, 11, B.length, 0);
        System.out.println("Areglo A ordenado:");
        System.out.println("");
        
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
            
        }
        
        System.out.println("Arreglo B:");
        
        
        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
            
        }
        
        
        
        
        
        
        
    }
    
}
