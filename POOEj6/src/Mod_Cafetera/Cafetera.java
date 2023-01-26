/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mod_Cafetera;

/**
 *
 * @author pablo
 */
public class Cafetera {
    
    private int Cantidad_Actual;
    private int Capacidad_Maxima;
         
   
    public Cafetera(){
    
    }

    public Cafetera(int Cantidad_Actual, int Capacidad_Maxima) {
        this.Cantidad_Actual = Cantidad_Actual;
        this.Capacidad_Maxima = Capacidad_Maxima;
    }

    public void setCantidad_Actual(int Cantidad_Actual) {
        this.Cantidad_Actual = Cantidad_Actual;
    }

    public void setCapacidad_Maxima(int Capacidad_Maxima) {
        this.Capacidad_Maxima = Capacidad_Maxima;
    }

    public int getCantidad_Actual() {
        return Cantidad_Actual;
    }

    public int getCapacidad_Maxima() {
        return Capacidad_Maxima;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "Cantidad_Actual=" + Cantidad_Actual + ", Capacidad_Maxima=" + Capacidad_Maxima + '}';
    }
    
    
}
