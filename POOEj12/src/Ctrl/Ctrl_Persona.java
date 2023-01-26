/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctrl;
import java.util.Scanner;
import Mod_Persona.Persona;
import java.util.Date;
import java.time.LocalDate;
import java.time.Period;


/**
 *
 * @author pablo
 */
public class Ctrl_Persona {
    
    public Persona Crear_Persona(){
        
        Scanner leer=new Scanner(System.in);
        Persona p=new Persona();
        
        int dia,mes,anio;
        
        System.out.println("Ingresar nombre:");
        p.setNbre(leer.next());
        System.out.println("Ingresar fecha de nacimiento:");
        dia=leer.nextInt();
        mes=leer.nextInt();
        anio=leer.nextInt();
        Date fecha=new Date(anio-1900,mes-1,dia);
        p.setFecha_nac(fecha);
        
        return p;
    
    }
    
    
    public void Calcular_Edad(Persona p){
        
        LocalDate f1=LocalDate.of(p.getFecha_nac().getYear()+1900,p.getFecha_nac().getMonth()+1,p.getFecha_nac().getDate());
        LocalDate f2=LocalDate.now();
        Period period=Period.between(f1, f2);
        System.out.println("Edad:"+period.getYears());
        
   
    }
    
    public boolean Menor_Que(Persona p,int edad){
    
        LocalDate f1=LocalDate.of(p.getFecha_nac().getYear()+1900,p.getFecha_nac().getMonth()+1,p.getFecha_nac().getDate());
        LocalDate f2=LocalDate.now();
        Period period=Period.between(f1, f2);
        
        return period.getYears()<edad;
        
    }
    
    public void Mostrar_Persona(Persona p){
    
        System.out.println(p);
    
    }
    
    
    
}
