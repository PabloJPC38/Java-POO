/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coej4;

import Ctrl.Ctrl_Peliculas;
import Mod_Peliculas.Pelicula;
import java.util.Collections;

/**
 *
 * @author pablo
 */
public class COEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       Ctrl_Peliculas CP=new Ctrl_Peliculas();
       CP.Crear_Pelicula();
       CP.Mostrar_Peliculas();
       CP.Mayor_A_Una_Hora();
       
       
       System.out.println("");
       System.out.println("Ordenados de mayor a menor por duración");
       Collections.sort(CP.getPelicula(),Pelicula.Comparar_Mayores);
       CP.Mostrar_Peliculas();
       
       System.out.println("");
       System.out.println("Ordenados de menor a mayor por duración");
       Collections.sort(CP.getPelicula(),Pelicula.Comparar_Menores);
       CP.Mostrar_Peliculas();
       
       System.out.println("");
       System.out.println("Ordenados alfabeticamente por título");
       Collections.sort(CP.getPelicula(),Pelicula.Comparar_Titulos);
       CP.Mostrar_Peliculas();
       
       System.out.println("");
       System.out.println("Ordenados alfabeticamente por director");
       Collections.sort(CP.getPelicula(),Pelicula.Comparar_Directores);
       CP.Mostrar_Peliculas();
       
    }
    
}
