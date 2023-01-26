/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mod_Ahorcado;

/**
 *
 * @author pablo
 */
public class Ahorcado {
    
    private char palabra[];
    private int cant_encontradas;
    private int jugadas_maximas;
    
    public Ahorcado(){
    
    }

    public Ahorcado(char[] palabra, int cant_encontradas, int jugadas_maximas) {
        this.palabra = palabra;
        this.cant_encontradas = cant_encontradas;
        this.jugadas_maximas = jugadas_maximas;
    }

    public char[] getPalabra() {
        return palabra;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public int getCant_encontradas() {
        return cant_encontradas;
    }

    public void setCant_encontradas(int cant_encontradas) {
        this.cant_encontradas = cant_encontradas;
    }

    public int getJugadas_maximas() {
        return jugadas_maximas;
    }

    public void setJugadas_maximas(int jugadas_maximas) {
        this.jugadas_maximas = jugadas_maximas;
    }
    
    
    
}
