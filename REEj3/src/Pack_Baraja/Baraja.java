/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack_Baraja;

import Pack_Carta.Carta;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author pablo
 */
public class Baraja {
    
    private ArrayList <Carta> cartas_actuales;
    private ArrayList <Carta> cartas_salidas=new ArrayList();

    public Baraja() {
    }

    public ArrayList<Carta> getCartas_actuales() {
        return cartas_actuales;
    }

    public void setCartas_actuales(ArrayList<Carta> cartas_actuales) {
        
        Collections.shuffle(cartas_actuales);
        this.cartas_actuales=cartas_actuales ;
    }

    public ArrayList<Carta> getCartas_salidas() {
        return cartas_salidas;
    }

    public void setCartas_salidas(Carta carta_salida) {
        
        this.cartas_salidas.add(carta_salida);
    }
    
    
}
