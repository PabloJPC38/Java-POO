/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack_Sala;

import Pack_Ctrl_Espectador.Ctrl_Espectador;
import Pack_Espectador.Espectador;
import Pack_Pelicula.Pelicula;
import java.util.ArrayList;
import Pack_Enum.Cartelera;

/**
 *
 * @author pablo
 */
public class Sala {
    
    private String [][] sala=new String [8][6];
    private Pelicula pelicula;
    private ArrayList<Espectador> espectadores;
    private float precio;

    public Sala() {
    }

    public String[][] getSala() {
        return sala;
    }

    public void setSala(String[][] sala) {
        this.sala = sala;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula() {
        this.pelicula=Cartelera.Get_Pelicula();
    }

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores() {
        Ctrl_Espectador CE=new Ctrl_Espectador();
        this.espectadores =CE.LLenar_Espectadores();
    }

    @Override
    public String toString() {
        return "Sala{" + "sala=" + sala + ", pelicula=" + pelicula + ", espectadores=" + espectadores + '}';
    }
    
    
}
