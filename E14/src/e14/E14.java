/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e14;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class E14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cant;
        String moneda;
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese tipo de moneda a convertir:");
        moneda=leer.nextLine();
        System.out.println("Ingrese cantidad:");
        cant=leer.nextInt();
        Conversion(cant,moneda);
       
    }
    
    
    public static void Conversion(int cant,String moneda){
        
        switch (moneda) {
            case "dolar":
                    System.out.println("Equivale a "+(float)(cant*1.28611) +" dólares");
                break;
            
            case "libra":
                    System.out.println("Equivale a "+(float)(cant*0.86)+" libras");
                break;
                
            case "yen":
                    System.out.println("Equivale a "+(float)(cant*129.852)+" yenes");
                break;
                
            default:
                throw new AssertionError();
        }

}
    
}


