/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctrl;

import Mod_Cadena.Cadena;

/**
 *
 * @author pablo
 */
public class Ctrl_Cadena {
    
    public void Mostrar_Vocales(Cadena s){
        
        int cont=0;
        
        for (int i = 0; i < s.getLongitud(); i++) {
            
            if (s.getFrase().substring(i,i+1).equalsIgnoreCase("A") || s.getFrase().substring(i,i+1).equalsIgnoreCase("E")
                    
                || s.getFrase().substring(i,i+1).equalsIgnoreCase("I")|| s.getFrase().substring(i,i+1).equalsIgnoreCase("O")
                || s.getFrase().substring(i,i+1).equalsIgnoreCase("U")) {
                
                cont++;
            }
        }
        
        System.out.println("Hay "+cont+" vocales");
    }
    
    public void Invertir_Frase(Cadena s){
    
        String aux="";
        
        for (int i = s.getLongitud()-1; i >= 0; i--) {
            
                aux+=String.valueOf((s.getFrase().charAt(i)));    
        }
        
        System.out.println("Frase invertidad:"+aux);
    }
    
    
    public void Veces_Respetidos(Cadena s,char c){
        
        int cont=0;
        
        for (int i = 0; i < s.getLongitud(); i++) {
            
            if (s.getFrase().charAt(i) == c) {
                
                cont++;
            }
            
        }
        
        System.out.println("El caracter "+c+" se repite "+cont+" veces");
 
    }
    
    
    public void Comparar_Longitud(Cadena s,String frase){
    
        if (s.getLongitud()<frase.length()) {
            
            System.out.println("La frase ingresada es de mayor longitud que la cadena");
        }
        else if(s.getLongitud()>frase.length()) {
            
            System.out.println("La frase ingresada es de menor longitud que la cadena");
        }
        else{
            
            System.out.println("Tienen la misma longitud");
        }
    }
    
    
    public void Unir_Frases(Cadena s,String frase){
    
        String aux=s.getFrase().concat(frase);
        
        System.out.println("Frase unidad:"+aux);
        
        
    }
    
    public void Reemplazar(Cadena s,char c){
    
        String aux=s.getFrase();
        
        aux=aux.replace('a', c);
        aux=aux.replace('A', c);
        
        System.out.println("Frase reemplazada:"+aux);
     
    }
    
    public void Contiene(Cadena s,char c){
        
        if (s.getFrase().contains(String.valueOf(c))) {
            
            System.out.println("Está contenido");
            
        }
        else{
            System.out.println("No está contenido");
        }
        
        
        
        
    
    }
}
