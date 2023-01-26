/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coej5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author pablo
 */
public class COEj5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        HashSet <String> paises=new HashSet();
        
        Agregar_Paises(paises);
        System.out.println("");
        Mostrar_Paises2(paises);
        System.out.println("");
        
        /////////////ORDENADO CON LISTA/////////////////
        System.out.println("Ordenado con Listas:");
        ArrayList p=new ArrayList(paises);
        Collections.sort(p);
        Mostrar_Paises(p);
        ////////////ORDENADO CON TREESET///////////////
        /*System.out.println("Ordenado con TreSet:");
        TreeSet p=new TreeSet(paises);
        Mostrar_Paises2(p);*/
        ////////////ORDENADO CON STREAM////////////////
        /*System.out.println("Ordenado con Stream:");
        paises.stream().sorted().forEach(System.out::println);*/
        /////////////////////////////////////////////////////
        
        
        Eliminar_Pais(p);
        Mostrar_Paises(p);
        
    }
    
    
    
    public static void Agregar_Paises(HashSet<String>paises){
    
    
        String resp="";
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        
        
        while (!resp.equalsIgnoreCase("NO")) {
            
            System.out.println("Ingrese un país:");
            paises.add(leer.next());
            
            System.out.println("Desea agregar otro?");
            resp=leer.next();
            
        }
        
    }
    
    public static void Mostrar_Paises(ArrayList<String>paises){
    
        for (String pais : paises) {
            
            System.out.println(pais);
        }    
    }
    
    public static void Mostrar_Paises2(Set<String>paises){
    
        for (String pais : paises) {
            
            System.out.println(pais);
        }    
    }
    
    public static void Eliminar_Pais(ArrayList<String>paises){
        
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        Iterator<String> it=paises.iterator();
        String pais;
        System.out.println("Ingrese pais a eliminar:");
        pais=leer.next();
        boolean ubicado=false;
        
        while (it.hasNext()) {
            
            if (it.next().equalsIgnoreCase(pais)) {
                
                it.remove();
                ubicado=true;
                break;
            }
        }
        
        if (!ubicado) {
            
            System.out.println("No se encuentra");
        }       
    }
    
    public static void Eliminar_Pais2(Set<String>paises){
        
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        Iterator<String> it=paises.iterator();
        String pais;
        System.out.println("Ingrese pais a eliminar:");
        pais=leer.next();
        boolean ubicado=false;
        
        while (it.hasNext()) {
            
            if (it.next().equalsIgnoreCase(pais)) {
                
                it.remove();
                ubicado=true;
                break;
            }
        }
        
        if (!ubicado) {
            
            System.out.println("No se encuentra");
        }       
    }
    
    
    
}
