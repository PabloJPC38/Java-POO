/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack_Ctrl_Espectador;

import Pack_Espectador.Espectador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ctrl_Espectador {
    
    public ArrayList<Espectador> LLenar_Espectadores(){
    
        ArrayList<Espectador> espectadores=new ArrayList();
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        
        while (true) {
            
            Espectador espectador=new Espectador();
            System.out.println("Ingrese nombre");
            espectador.setNombre(leer.next());
            System.out.println("Ingrese edad");
            espectador.setEdad(leer.nextInt());
            System.out.println("Ingrese dinero");
            espectador.setDinero(leer.nextFloat());
            espectadores.add(espectador);
            
            System.out.println("Desea agregar otro espectador? (s/n)");
            if (leer.next().charAt(0)=='n') {
                
                break;
                
            }
        }
        
        return espectadores;
    }
    
}
