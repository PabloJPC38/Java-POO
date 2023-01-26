/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack_Ctrl_Baraja;

import Pack_Baraja.Baraja;
import Pack_Carta.Carta;
import java.util.Iterator;

/**
 *
 * @author pablo
 */
public class Ctrl_Baraja {
    
    public Carta Siguiente_Carta(Baraja baraja){
    
        Iterator <Carta> it=baraja.getCartas_actuales().iterator();
        Carta carta = new Carta();
        
            while (it.hasNext()) {
             
                
                carta=it.next();
                baraja.setCartas_salidas(carta);
                it.remove();
                break;
            }
        
        return carta;           
    }
    
    public void Dar_Cartas(int n,Baraja baraja){
       
        int i=1;
        
        if(n<=baraja.getCartas_actuales().size()){
        
            Iterator <Carta> it=baraja.getCartas_actuales().iterator();
            
            while (i<=n) {
                
                Carta carta = new Carta();            
                carta=it.next();
                System.out.println(carta);
                baraja.setCartas_salidas(carta);
                it.remove();
                i++;   
            }
        }
        else{
            System.out.println("No hay suficientes cartas para devolver...");
        }   
    }
    
    public void Cartas_A_Monton(Baraja baraja){
        
        if (baraja.getCartas_salidas().size()==0) {
            
            System.out.println("No han salido cartas aún...");
        }
        else{
            
            if (baraja.getCartas_salidas().size()==1) {
                
                System.out.println("Ha salido 1 carta");
                for (Carta carta_salida : baraja.getCartas_salidas()) {
                    
                    System.out.println(carta_salida);
                }
            }
            else{
                
                System.out.println("Han salido "+baraja.getCartas_salidas().size()+" cartas");
                for (Carta carta_salida : baraja.getCartas_salidas()) {
                    
                    System.out.println(carta_salida);
                }
            }
        }
    }
    
    public void Mostrar_Baraja(Baraja baraja){
    
        for (Carta carta : baraja.getCartas_actuales()) {
            
            System.out.println(carta);
        }
    }
    
    
}
