
package Pack_Ctrl_Jugador;

import Pack_Ctrl_Revolver.Ctrl_Revolver;
import Pack_Jugador.Jugador;
import Pack_Revolver.Revolver;
import java.util.ArrayList;
import java.util.Scanner;
// @author Pablo
public class Ctrl_Jugador {
    
    public  ArrayList <Jugador> Crear_Jugadores(){
    
        ArrayList <Jugador> Jugadores= new ArrayList();
        Scanner leer= new Scanner(System.in).useDelimiter("\n");
        int n;
        System.out.println("Ingrese número de jugadores:");
        n=leer.nextInt();
        
        
        
        while(n<1 && n>6){
            
            System.out.println("Ingrese número de jugadores válido (1 a 6)");
            n=leer.nextInt();
        }
        
        while(n!=0){
        
            Jugador jugador=new Jugador();
            
            System.out.println("Ingrese ID:");
            jugador.setID(leer.nextInt());
            System.out.println("Ingrese su nombre");
            jugador.setNombre(leer.next()+jugador.getID());
            jugador.setMojado(false);
            
            Jugadores.add(jugador);
            n--;
        
        }
        
        return Jugadores;
    }
    
    public boolean Disparo(Revolver revolver){
        
        Ctrl_Revolver CR=new Ctrl_Revolver();
        
        if (CR.Mojar(revolver)){
            
            return true;   
        }
            
        CR.Siguiente_Chorro(revolver);
        return false;   
    }

}
