/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack_Ctrl_Carta;

import Pack_Carta.Carta;
import java.util.ArrayList;

/**
 *
 * @author pablo
 */
public class Ctrl_Carta {
    
    public ArrayList<Carta> Crear_Maso(){
    
        
        ArrayList <Carta> baraja=new ArrayList();
        int j=1,n=1;
        
        for (int i = 0; i < 40; i++) {
                  
            Carta carta=new Carta();
            
            switch (j) {
                case 10-2:
                    carta.setNumero(j+2);
                    carta.setPalo(Palo(n));
                    break;
                case 10-1:
                    carta.setNumero(j+2);
                    carta.setPalo(Palo(n));
                    break;
                case 10:
                    carta.setNumero(j+2);
                    carta.setPalo(Palo(n));
                    break;
                default:
                    carta.setNumero(j);
                    carta.setPalo(Palo(n));
                    break;
            } 
            j++;
            
            if(j>10){
                j=0;
                n++;
                carta.setNumero(j);
                carta.setPalo(Palo(n));
                j++;
            }
            
            baraja.add(carta);
        }
        
        return baraja;
    }
    
    public static String Palo(int n){
        
        String palo="";
            
        switch (n) {
            case 1:
                palo="espadas";
                break;
            case 2:
                palo="bastos";
                break;
            case 3:
                palo="oros";
                break;
            case 4:
                palo="copas";
                break;
        }
        return palo;
    }
  
}
