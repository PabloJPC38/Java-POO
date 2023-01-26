
package Pack_Juego;

import Pack_Ctrl_Revolver.Ctrl_Revolver;
import Pack_Jugador.Jugador;
import Pack_Ctrl_Jugador.Ctrl_Jugador;
import Pack_Revolver.Revolver;
import java.util.ArrayList;




// @author Pablo
public class Juego {
    
    private ArrayList <Jugador> Jugadores;
    private Revolver revolver;
    

    public void setJugadores() {
        Ctrl_Jugador CJ= new Ctrl_Jugador();
        this.Jugadores=CJ.Crear_Jugadores();
    }

    public void setRevolver() {
        Ctrl_Revolver CR= new Ctrl_Revolver();
        this.revolver=CR.Llenar_Revolver();
    }

    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

}
