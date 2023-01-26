/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctrl;

import Mod_Peliculas.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ctrl_Peliculas {
    
    private Scanner leer;
    private ArrayList <Pelicula> pelicula;

    public Ctrl_Peliculas() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.pelicula =new ArrayList();
    }

    public ArrayList<Pelicula> getPelicula() {
        return pelicula;
    }
    
    
    
    public void Crear_Pelicula(){
        
        String resp="";
        
        while (!resp.equalsIgnoreCase("si")) {
            
            Pelicula p=new Pelicula();
            
            System.out.println("Ingrese título de la película:");
            p.setTitle(leer.next());
            System.out.println("Ingrese nombre del director:");
            p.setDirect(leer.next());
            System.out.println("Ingrese duracion de la película:");
            p.setDuracion(leer.nextInt());
            pelicula.add(p);
            System.out.println("");          
        
            System.out.println("Desea finalizar?");
            resp=leer.next();
            
        }
        
    }
    
    public void Mostrar_Peliculas(){
        
        System.out.println("");
        System.out.println("Listado de peliculas:");
        System.out.println("");
    
        for (Pelicula p : pelicula) {
            
            System.out.println(p);
        }
    }
    
    public void Mayor_A_Una_Hora(){
        
        System.out.println("");
        System.out.println("Peliculas de duracion mayor a una hora:");
        System.out.println("");
    
        for (Pelicula p : pelicula) {
            
            if (p.getDuracion()>1) {
                
                System.out.println(p);                
            }
        }
        
        
    }    
    
}
