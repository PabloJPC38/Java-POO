
package Pack_Ctrl_Juego;
import Pack_Ctrl_Jugador.Ctrl_Jugador;
import Pack_Juego.Juego;
import Pack_Jugador.Jugador;

// @author Pablo
public class Ctrl_Juego {
    
    public Juego Llenar_Juego(){
        
        Juego juego= new Juego();
        
        juego.setRevolver();
        juego.setJugadores();  
        
        return juego;
    }
    
    public void Ronda(Juego juego){
    
        Ctrl_Jugador CJ= new Ctrl_Jugador();
        int n=0;
        
        while(!CJ.Disparo(juego.getRevolver())){
            
            System.out.println("El jugador "+juego.getJugadores().get(n).getNombre()+" se ha salvado!!");
            n++;  
            
            if (n==juego.getJugadores().size()) {
                
                n=0;
            }
        }
        
        juego.getJugadores().get(n).setMojado(true);
        System.out.println("Se terminó el juego!!!");
        System.out.println("Datos de jugador que perdió:");
        System.out.println(juego.getJugadores().get(n));
                
    }

}
