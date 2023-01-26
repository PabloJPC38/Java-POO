/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reej2.extra;

import Pack_Ctrl_Sala.Ctrl_Sala;
import Pack_Sala.Sala;
import Pack_Enum.Cartelera;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class REEj2Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        Sala sala=new Sala();
        Ctrl_Sala CS=new Ctrl_Sala();
        sala.setPelicula();
        sala.setEspectadores();
        System.out.println("Ingrese precio de la pelicula:");
        sala.setPrecio(leer.nextFloat());
        System.out.println("Titulo de la Pelicula: "+sala.getPelicula().getTitulo());
        CS.LLenar_Sala(sala);
        CS.Mostrar_Sala(sala);
  
    }
    
}
