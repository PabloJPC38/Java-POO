/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mod_Persona;

/**
 *
 * @author pablo
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private char sexo;
    private float peso;
    private float altura;
    
    
    public Persona(){
    
    }

    public Persona(String nombre, int edad, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }
    
    
    
}
