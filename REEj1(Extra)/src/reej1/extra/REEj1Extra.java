/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reej1.extra;

import Pack_Perro.Perro;
import Pack_Persona.Persona;
import java.util.ArrayList;
import java.util.Scanner;
import Pack_Enum.Mascotas;

/**
 *
 * @author pablo
 */
public class REEj1Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for (Persona p :Crear_Persona()){
            
            System.out.println(p);
            
        }
        
    }
    
    public  static ArrayList<Persona> Crear_Persona(){
    
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        ArrayList <Persona> pers= new ArrayList(); 
        ArrayList<Perro> perros=Perros();
        
        while (true){
            
            Persona persona=new Persona();
            System.out.println("Ingrese Nombre");
            persona.setNombre(leer.next());
            System.out.println("Ingrese Apellido");
            persona.setApellido(leer.next());
            System.out.println("Ingrese Edad");
            persona.setEdad(leer.nextInt());
            System.out.println("Ingrese DNI");
            persona.setDNI(leer.nextInt());
            System.out.println("Lista de Perros");
            System.out.println("");
            /*****************************************/
            for (Mascotas mascota : Mascotas.values()){
                
                System.out.println(mascota.name());
            }
            System.out.println("");
            /****************************************/
            String perro;
            boolean band=true;
            System.out.println("Qué perro elije?");
            perro=leer.next();
            while (band) {

                for (Perro p :perros){

                    if(p.getNombre().equalsIgnoreCase(perro)){
                
                        persona.setPerro(p);
                        perros.remove(p);
                        band=false;
                        break;
                    }
                    else{
                        
                        band=true;
                    }
                 
                }
                
                if (band) {
                    
                        System.out.println("Ese perro ya tiene dueño");
                        System.out.println("Ingrese otro nombre");
                        perro=leer.next();
                    
                }

            }
            pers.add(persona);
            System.out.println("Desea agregar otra persona?(s//n)");
            
            if (leer.next().equalsIgnoreCase("n")){
            
                break;
            }
            
        }
        
        System.out.println("");
        return pers;
        
    }
    
    public static ArrayList <Perro> Perros(){
    
        ArrayList <Perro> p=new ArrayList();
        
        for (Mascotas mascota : Mascotas.values()){
            
            Perro perro=new Perro();
            perro.setNombre(mascota.name());
            perro.setRaza(mascota.getRaza());
            perro.setEdad(mascota.getEdad());
            perro.setTamanio(mascota.getTamanio());
            p.add(perro);
        }
        
        
        return p;
    }
 }
    

