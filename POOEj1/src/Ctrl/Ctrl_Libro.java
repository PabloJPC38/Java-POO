/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctrl;
import java.util.Scanner;
import Mod_Libro.Libro;
/**
 *
 * @author pablo
 */
public class Ctrl_Libro {
    
    
    public Libro Crear_Libro(){
        
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        Libro L=new Libro();
        
        System.out.println("Ingrese ISBN:");
        L.setISBN(leer.nextInt());
        System.out.println("Ingrse Titulo:");
        L.setTitulo(leer.next());
        System.out.println("Ingrese Autor:");
        L.setAutor(leer.next());
        System.out.println("Ingrese número de páginas:");
        L.setNum_pag(leer.nextInt());
        
        return L;
    }
    
}
