/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack_Enum;

/**
 *
 * @author pablo
 */
public enum Mascotas {
    
    Chiquito ("Beagle",1,"Pequeño") , Enano("Caniche",2,"Pequeño"), Petizo("Salchicha",4,"Pequeño"), Peludito("Chow Chow",2,"Mediano"), Pachoncito("Anika inu",1,"Mediano"), Campeon("Pastor alemán",3,"Grande"), Lulu("Chihuahua",1,"Pequeño"), Balto("Husky siberiano",3,"Grande"), Houch("Pastor persa",2,"Grande"), Bonito("Maltipoo",1,"Pequeño");
    
    private String raza;
    private int edad;
    private String tamanio;
    
    private Mascotas(String raza,Integer edad, String tamanio){
    
        this.raza=raza;
        this.edad=edad;
        this.tamanio=tamanio;
    
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public String getTamanio() {
        return tamanio;
    }
    
    
    
}
