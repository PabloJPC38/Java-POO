/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mod_Alumnos;

import java.util.ArrayList;

/**
 *
 * @author pablo
 */

     
    public class Alumno {
    
    private String nbre;
    private ArrayList <Integer> notas;
    
    
    public Alumno(){
    
    
    }

    public Alumno(String nbre, ArrayList<Integer> notas) {
        this.nbre = nbre;
        this.notas = notas;
    }

    public String getNbre() {
        return nbre;
    }

    public void setNbre(String nbre) {
        this.nbre = nbre;
    }

    public ArrayList<Integer> getNotas() {
        return this.notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

   
}
    

