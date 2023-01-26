/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej7;

import Ctrl.Ctrl_Persona;
import Mod_Persona.Persona;

/**
 *
 * @author pablo
 */
public class POOEj7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Ctrl_Persona CP=new Ctrl_Persona();
        Persona pers1=new Persona();
        Persona pers2=new Persona();
        Persona pers3=new Persona();
        Persona pers4=new Persona();
    
        pers1=CP.Crear_Persona();
        pers2=CP.Crear_Persona();
        pers3=CP.Crear_Persona();
        pers4=CP.Crear_Persona();
        
        int []c1=new int [3];
        
        Contar_IMC(CP.Calcular_IMC(pers1),c1);
        Contar_IMC(CP.Calcular_IMC(pers2),c1);
        Contar_IMC(CP.Calcular_IMC(pers3),c1);
        Contar_IMC(CP.Calcular_IMC(pers4),c1);
        
        int []c2=new int [2];
        
        Contar_Edad(CP.Es_Mayor_De_Edad(pers1),c2);
        Contar_Edad(CP.Es_Mayor_De_Edad(pers2),c2);
        Contar_Edad(CP.Es_Mayor_De_Edad(pers3),c2);
        Contar_Edad(CP.Es_Mayor_De_Edad(pers4),c2);
        
        System.out.println("Por debajo:"+((c1[0]*100)/4)+"% Ideal:"+((c1[1]*100)/4)+"% Por encima:"+((c1[2]*100)/4)+"%");
        System.out.println("Mayores de edad:"+((c2[0]*100)/4)+"% Menores de edad:"+((c2[1]*100)/4)+"%");
        
    }
    
    public static void Contar_IMC(int IMC,int cont[]){
    
        switch (IMC) {
            case -1:
                cont[0]+=1;
                break;
            case 0:
                cont[1]+=1;
                break;
            case 1:
                cont[2]+=1;
                break;
            default:
                break;
        }
    }
    
    public static void Contar_Edad(boolean edad,int cont[]){
    
        if (edad) {
            
            cont[0]+=1;
            
        }
        else{
        
            cont[1]+=1;
        }
    }
    
    
}
