/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack_Enum;

import Pack_Pelicula.Pelicula;
import java.util.Random;


/**
 *
 * @author pablo
 */
public enum Cartelera {
    
    Primera ("Avengers","Russo Brothers",183,12) , Segunda ("Jurassic World","Colin Trevorrow",164,18), Tercera ("Mission Impossible","John Woo",150,15); 
    
    private String titulo;
    private String director;
    private int duracion;
    private int edad_permitada;
    
    private Cartelera(String titulo,String director,int duracion,int edad_permitida){
    
        this.titulo=titulo;
        this.director=director;
        this.duracion=duracion;
        this.edad_permitada=edad_permitida;
    }
    

    public String getNombre() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getEdad_permitada() {
        return edad_permitada;
    }

    public  static Pelicula Get_Pelicula(){
        
        
        Random random = new Random();
        Pelicula pelicula=new Pelicula(values()[random.nextInt(values().length)].getNombre(),
        values()[random.nextInt(values().length)].getDirector(),
        values()[random.nextInt(values().length)].getDuracion(),
        values()[random.nextInt(values().length)].getEdad_permitada());
        
        
        return pelicula;
        
    
    }
    
    
    
}
