/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej1.extra;

import Mod_Cancion.Cancion;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class POOEj1Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer=new Scanner(System.in);
        Cancion cancion=new Cancion(leer.next(),leer.next());
        System.out.println(cancion);
    }
    
}
