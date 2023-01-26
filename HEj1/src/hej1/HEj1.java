
package hej1;

// @author Pablo

import Pack_Animal.Animal;
import Pack_Caballo.Caballo;
import Pack_Gato.Gato;
import Pack_Perro.Perro;

public class HEj1 {

    public static void main(String[] args) {
        
        Animal perro1= new Perro("Stich","Carne",15,"Doberman");
        perro1.Alimentarse();
        Animal perro2= new Perro("Teddy","Croquetas",10,"Chiguagua");
        perro2.Alimentarse();
        
        Animal gato= new Gato("Pelusa","Galletas",15,"Siamés");
        gato.Alimentarse();
        
        Animal caballo= new Caballo("Spark","Pasto",25,"Fino");
        caballo.Alimentarse();
        
    }

}
