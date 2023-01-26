/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mod_Peliculas;

import java.util.Comparator;

/**
 *
 * @author pablo
 */
public class Pelicula {
    
    private String title;
    private String direct;
    private Integer duracion;
    
    public Pelicula(){
    
    }

    public Pelicula(String title, String direct, int duracion) {
        this.title = title;
        this.direct = direct;
        this.duracion = duracion;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirect() {
        return direct;
    }

    public void setDirect(String direct) {
        this.direct = direct;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Título:" + title + ", Director=" + direct + ", Duración=" + duracion;
    }
    
    public static Comparator<Pelicula> Comparar_Mayores= new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t1.getDuracion().compareTo(t.getDuracion());
        
        }
    }; 
        
    public static Comparator<Pelicula> Comparar_Menores= new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t.getDuracion().compareTo(t1.getDuracion());
        
        }       
    };
    
    public static Comparator<Pelicula> Comparar_Titulos= new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t.getTitle().compareTo(t1.getTitle());
        
        }       
    };
    
    public static Comparator<Pelicula> Comparar_Directores= new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            
            return t.getDirect().compareTo(t1.getDirect());
        
        }       
    };
    
    
    
    
 }
