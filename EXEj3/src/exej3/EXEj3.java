
package exej3;

// @author Pablo

import Div_Num.Division_Numero;
import java.util.Scanner;

public class EXEj3 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Division_Numero div_num = new Division_Numero();
        System.out.println("Ingrese numeros:");
        div_num.Conversion_Y_Division(leer.next(),leer.next());
       
        
    }

}
