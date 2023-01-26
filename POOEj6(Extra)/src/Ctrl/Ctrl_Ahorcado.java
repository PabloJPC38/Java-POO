/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctrl;
import java.util.Scanner;
import Mod_Ahorcado.Ahorcado;

/**
 *
 * @author pablo
 */
public class Ctrl_Ahorcado {
    
    public Ahorcado Crear_Juego(){
    
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        Ahorcado A=new Ahorcado();
        System.out.println("Ingrese palabra:");
        String p=leer.next();
        char palabra[]=new char[p.length()];
        
        for (int i = 0; i < p.length(); i++) {
         
            palabra[i]=p.charAt(i);
        }
        
        A.setPalabra(palabra);
        
        System.out.println("Ingrese cantidad máxima de jugadas:");
        A.setJugadas_maximas(leer.nextInt());
        A.setCant_encontradas(0);
        
        return A;
    }
    
    public static boolean Buscar(Ahorcado A,char letra){
    
            for (int i = 0; i < A.getPalabra().length; i++) {
            
                if (A.getPalabra()[i]==letra) {
                    
                    A.setCant_encontradas(A.getCant_encontradas()+1);
                    A.setJugadas_maximas(A.getJugadas_maximas()-1);
                    return true;
                }
                
            }
            
            A.setJugadas_maximas(A.getJugadas_maximas()-1);
            return false;
        
    }
    
    public void Juego(Ahorcado A){
        
        Scanner leer=new Scanner(System.in);
        
        while (A.getJugadas_maximas()!=0) {
            
            
                System.out.println("Ingrese una letra:");
        
                if (Buscar(A,leer.next().charAt(0))) {
        
                    System.out.println("La letra pertenece a la palabra");
                    System.out.println("Número de letras (encontradas, faltantes):("
                    +A.getCant_encontradas()+","+(A.getPalabra().length-A.getCant_encontradas()));
                    System.out.println("Número de oportunidades restantes:"+A.getJugadas_maximas());
                }
                else{
            
                    System.out.println("La letra no pertenece a la palabra");
                    System.out.println("Número de letras (encontradas, faltantes):("
                    +A.getCant_encontradas()+","+(A.getPalabra().length-A.getCant_encontradas()));
                    System.out.println("Número de oportunidades restantes:"+A.getJugadas_maximas());
                }
            
        }
        
        if (A.getPalabra().length==A.getCant_encontradas()) {
            
            System.out.println("Has ganado!!!");
            
        }
        else{
        
            System.out.println("Has perdido!!!");
        }
        
    }
}
