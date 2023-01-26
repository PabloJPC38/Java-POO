/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej8;
import Ctrl.Ctrl_Cadena;
import Mod_Cadena.Cadena;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class POOEj8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        Ctrl_Cadena CC=new Ctrl_Cadena();
        Cadena s=new Cadena();
        
        
        System.out.println("Ingrese frase:");
        s.setFrase(leer.next());
        s.setLongitud(s.getFrase().length());
        
        CC.Mostrar_Vocales(s);
        CC.Invertir_Frase(s);
        
        System.out.println("Ingrese un carater:");
        CC.Veces_Respetidos(s, leer.next().charAt(0));
        
        System.out.println("Ingrese frase a comparar:");
        CC.Comparar_Longitud(s,leer.next());
        
        System.out.println("Ingrese frase a unir");
        CC.Unir_Frases(s,leer.next());
        
        System.out.println("Ingrese un caracter para reemplazar a todas las 'a' de la frase:");
        CC.Reemplazar(s,leer.next().charAt(0));
        
        System.out.println("Ingresar caracter a buscar:");
        CC.Contiene(s,leer.next().charAt(0));
        
        
        
    }
    
}
