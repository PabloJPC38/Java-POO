
package Pack_Ctrl;

// @author Pablo

import Pack_Electro.Electrodomestico;
import Pack_Electro.Lavadora;
import Pack_Electro.Televisor;
import java.util.Scanner;
public class Ctrl_Electro {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void Crear_Electrodomestico(Electrodomestico E){
      
        
        
        System.out.println("Ingrese precio:");
        E.setPrecio(leer.nextFloat());
        System.out.println("Ingrese color:");
        E.setColor(leer.next());
        System.out.println("Ingrese consumo energético:");
        E.setConsumo_energ(leer.next().charAt(0));
        System.out.println("Ingrese peso:");
        E.setPeso(leer.nextFloat());
    }
    
    
    public Lavadora Crear_Lavadora() {

        Lavadora lavadora = new Lavadora();
        Crear_Electrodomestico(lavadora);
        System.out.println("Ingrese carga");
        lavadora.setCarga(leer.nextFloat());
        return lavadora;
        
    }
    
    public Televisor Crear_Televisor(){
        
        Televisor televisor = new Televisor();
        Crear_Electrodomestico(televisor);
        System.out.println("Ingrese resolución");
        televisor.setResolucion(leer.nextFloat());
        System.out.println("Tiene sintonizador? (si/no)");
        if (leer.next().equalsIgnoreCase("si")){
        
            televisor.setSintonizador(true);
        }
        else{
            
            televisor.setSintonizador(false);
        }
        
        return televisor;
    }
        
}
