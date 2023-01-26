/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mod_Persona;
import java.util.Date;

/**
 *
 * @author pablo
 */
public class Persona {
    
    private String nbre;
    private Date fecha_nac;
    
    
    public Persona(){
    
    }

    public Persona(String nbre, Date fecha_nac) {
        this.nbre = nbre;
        this.fecha_nac = fecha_nac;
    }

    public void setNbre(String nbre) {
        this.nbre = nbre;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getNbre() {
        return nbre;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    @Override
    public String toString() {
        return "Persona{" + "nbre=" + nbre + ", fecha_nac=" + fecha_nac + '}';
    }

    
    
}
