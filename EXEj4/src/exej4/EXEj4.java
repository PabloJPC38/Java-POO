
package exej4;
import java.util.InputMismatchException;
import java.util.Scanner;

// @author Pablo
public class EXEj4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String s;
        int num1,num2;
        
        try{
        
            System.out.println("Ingrese número 1");
            num1=leer.nextInt();
            System.out.println("Ingrese número 2");
            s=leer.next();
            num2=Integer.parseInt(s);
            System.out.println("División:"+(num1/num2));
        }
        
        catch(InputMismatchException e){
            
            System.out.println("Error, se ingresó un valor que no corresponde al tipo de dato");
        
        }
        
        catch(NumberFormatException e){
    
            System.out.println("Error, no se puede convetir la cadena a entero");
        }
        
        catch(ArithmeticException e){
        
            System.out.println("Error, no se puede hacer una división por cero");
        }
        
    }

}
