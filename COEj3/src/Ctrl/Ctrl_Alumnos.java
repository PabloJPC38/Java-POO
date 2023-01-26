/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctrl;


import Mod_Alumnos.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ctrl_Alumnos {
    
    private Scanner leer;
    private ArrayList <Alumno> alumno;
    
    

    public Ctrl_Alumnos() {
        
        this.leer=new Scanner(System.in).useDelimiter("\n");
        this.alumno =new ArrayList() ;
    }
    
    
    
    public void Crear_Alumno(){
    
        String resp="";
      
        
        while (!resp.equalsIgnoreCase("NO")) {
            
            
            Alumno a=new Alumno();
            ArrayList <Integer>nota=new ArrayList();
            
            System.out.println("Ingrese nombre del alumno:");
            a.setNbre(leer.next());
        
            for (int i = 0; i < 3; i++) {
            
                System.out.println("Ingrese nota de "+a.getNbre());
                nota.add(leer.nextInt());    
            }
            a.setNotas(nota);
            alumno.add(a);
            
            System.out.println("Desea agregar otro alumno?");
        
            resp=leer.next();
            
        }
        
    }
    
    
    public void Nota_Final(){
    
        
        Integer nota=0;
        Iterator <Alumno> it=alumno.iterator();
        System.out.println("Ingrese nombre del alumno a buscar:");
        String nbre=leer.next();
        
        while (it.hasNext()) {
            
            Alumno a=it.next();
            
            if(a.getNbre().equalsIgnoreCase(nbre)){
                
               for (Integer n : a.getNotas()) {                    
                    
                    nota+=n;                                       
               }
               
               break;
            }                    
        }
        
        System.out.println(" La nota final de "+nbre+" es "+nota/3);
    }
    
}
