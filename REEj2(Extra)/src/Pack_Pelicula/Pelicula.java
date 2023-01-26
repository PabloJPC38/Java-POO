/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack_Pelicula;


/**
 *
 * @author pablo
 */
public class Pelicula {
    
    private String titulo;
    private String director;
    private int duracion;
    private int edad_permitida;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int duracion, int edad_permitida) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.edad_permitida = edad_permitida;
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdad_permitida() {
        return edad_permitida;
    }

    public void setEdad_permitida(int edad_permitida) {
        this.edad_permitida = edad_permitida;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + ", edad_permitida=" + edad_permitida + '}';
    }
    
    
}
