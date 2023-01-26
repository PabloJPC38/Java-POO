
package Pack_Gato;

// @author Pablo

import Pack_Animal.Animal;

public class Gato extends Animal{

    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void Alimentarse() {
        
        System.out.println("Se alimenta de "+alimento);// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
}
