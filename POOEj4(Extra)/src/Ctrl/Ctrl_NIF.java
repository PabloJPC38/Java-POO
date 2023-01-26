/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctrl;

import Mod_NIF.NIF;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ctrl_NIF {
    
    public NIF Crear_NIF(){
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        NIF nif=new NIF();
        
        System.out.println("Ingrese DNI:");
        nif.setDNI(leer.nextLong());
        
        nif.setLetra(Calcular_Letra(nif.getDNI()));
        
        return nif;
       
    }
    
    public static char Calcular_Letra(long DNI){
        
        char L[]={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int i;
        
        for (i = 0; DNI%23!=i; i++){
        
        }
        
        return L[i];
    
    }
    
    public void Mostrar(NIF nif){
    
        System.out.println(nif.getDNI()+"-"+nif.getLetra());
        
    }
}
