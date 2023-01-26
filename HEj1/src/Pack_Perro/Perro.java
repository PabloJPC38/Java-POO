
package Pack_Perro;

// @author Pablo

import Pack_Animal.Animal;

public class Perro extends Animal {

    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void Alimentarse() {
        
        System.out.println("Se alimenta de "+alimento);// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
}
