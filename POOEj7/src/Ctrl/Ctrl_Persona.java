/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctrl;
import java.util.Scanner;
import Mod_Persona.Persona;

/**
 *
 * @author pablo
 */
public class Ctrl_Persona {
    
    public Persona Crear_Persona(){
        
        Scanner leer=new Scanner(System.in);
        Persona pers=new Persona();
        
        System.out.println("Ingresar nombre:");
        pers.setNombre(leer.next());
        System.out.println("Ingresar edad:");
        pers.setEdad(leer.nextInt());
        System.out.println("Ingresar sexo:");
        char sexo=leer.next().charAt(0);
        
        while (sexo!='H'&& sexo!='M'&& sexo!='O') {
            
            System.out.println("Ingresar sexo válido:");
            sexo=leer.next().charAt(0);
        }
        pers.setSexo(sexo);
        System.out.println("Ingresar peso:");
        pers.setPeso(leer.nextFloat());
        System.out.println("Ingresar altura:");
        pers.setAltura(leer.nextFloat());
        
        return pers;
    }
    
    public int Calcular_IMC(Persona pers){
        float formula=pers.getPeso()/(float)(Math.pow(pers.getAltura(), 2));
        
        int IMC=2;
        
        if (formula<20) {
            
            IMC=-1;    
        }
        
        else if (formula>=20 && formula<=25) {
            
            IMC=0;
        }
        else if (formula>25) {
            
            IMC=1;
        }
        
        return IMC;
    }
    
    public boolean Es_Mayor_De_Edad(Persona pers){
        
        return pers.getEdad()>=18;
    }
    
    
}
