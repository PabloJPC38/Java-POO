
package reej2_1;

import Pack_Ctrl_Juego.Ctrl_Juego;
import Pack_Juego.Juego;
// @author Pablo
public class REEj2_1 {

    public static void main(String[] args) {
        
        
        Ctrl_Juego CJ= new Ctrl_Juego();
        Juego juego=CJ.Llenar_Juego();
       
        CJ.Ronda(juego); 
       
    }

}
