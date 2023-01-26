/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reej3;

import Pack_Baraja.Baraja;
import Pack_Ctrl_Baraja.Ctrl_Baraja;
import Pack_Ctrl_Carta.Ctrl_Carta;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class REEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu();
    }
    
    public static void Menu(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Baraja baraja=new Baraja();
        Ctrl_Baraja CB=new Ctrl_Baraja();
        Ctrl_Carta CC=new Ctrl_Carta();
        char op=' ';
        
        while (op!='7') {
            
            System.out.println("1 - Barajar");
            System.out.println("2 - Siguiente Carta");
            System.out.println("3 - Cartas Disponibles");
            System.out.println("4 - Dar Cartas");
            System.out.println("5 - Cartas Monton");
            System.out.println("6 - Mostrar Baraja");
            System.out.println("7 - Salir");
            
            System.out.println("");
            System.out.println("Ingresar opción:");
            op=leer.next().charAt(0);
            
            switch (op) {
                case '1':
                    baraja.setCartas_actuales(CC.Crear_Maso());
                    break;
                
                case '2':    
                    CB.Siguiente_Carta(baraja);
                    break;
                    
                case '3':
                    System.out.println("Hay disponibles "+baraja.getCartas_actuales().size()+" cartas");
                    break;
                    
                case '4':
                    System.out.println("Ingrese números de cartas a dar:");
                    CB.Dar_Cartas(leer.nextInt(), baraja);
                    break;
                
                case '5':
                    CB.Cartas_A_Monton(baraja);
                    break;
                
                case '6':
                    CB.Mostrar_Baraja(baraja);
                    break;
            }
        }
        
    }
    
}
