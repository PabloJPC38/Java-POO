
package hej4;
import Pack_Formas.Circulo;
import Pack_Formas.Rectangulo;
import java.util.Scanner;

// @author Pablo
public class HEj4 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese base y altura:");
        Rectangulo rectangulo = new Rectangulo(leer.nextDouble(),leer.nextDouble());
        rectangulo.Calcular_Perimetro();
        rectangulo.Calcular_Area();
        System.out.println("Ingrese radio");
        Circulo circulo = new Circulo(leer.nextDouble());
        circulo.Calcular_Perimetro();
        circulo.Calcular_Area();
       
    }

}
