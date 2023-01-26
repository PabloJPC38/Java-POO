/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej11;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author pablo
 */
public class POOEj11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresar día:");
        int dia=leer.nextInt();
        System.out.println("Ingresar mes:");
        int mes=leer.nextInt();
        System.out.println("Ingresar año:");
        int anio=leer.nextInt();
        
        
        
        
        LocalDate f1=LocalDate.of(anio,mes,dia);
        LocalDate f2=LocalDate.now();
        Period period=Period.between(f1, f2);
        System.out.println("Edad:"+period.getYears());
        
    }
    
    
    
}
