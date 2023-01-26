/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coej6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class COEj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Menu();
        
    }
    
    public static void Agregar_Producto(HashMap<String,Float>producto){
    
        String resp="",nbre;
        float precio;
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        
        
        while (!resp.equalsIgnoreCase("NO")) {
            
            System.out.println("Ingrese producto:");
            nbre=leer.next();
            System.out.println("Ingrese precio de "+nbre+":");
            precio=leer.nextFloat();
            producto.put(nbre, precio);
            
            System.out.println("Desea agregar otro producto?");
            resp=leer.next();              
        }
    }
    
    public static void Modificar_Precio(HashMap<String,Float>producto){
    
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese producto:");
        String prod=leer.next();
        System.out.println("Ingresar nuevo precio:");
        float prec=leer.nextFloat();
        
        for (Map.Entry<String,Float> entry:producto.entrySet()) {
            
            if (entry.getKey().equalsIgnoreCase(prod)){
                
                entry.setValue(prec);
                System.out.println("Precio actualizado !!");
                break;
            }
        }   
    }
    
    public static void Eliminar_Producto(HashMap<String,Float>producto){
        
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese producto:");
        String prod=leer.next();
        
        if (producto.containsKey(prod)){
            
            producto.remove(prod);
            System.out.println("Producto eliminado!!!");    
        }
        else{
            
            System.out.println("Producto no encontrado");
        }
        
    }
    
    public static void Mostrar_Productos(HashMap<String,Float>producto){
        
        System.out.println("Productos:");
        
        for (Map.Entry<String,Float> entry:producto.entrySet()) {
            
            System.out.println(entry.getKey()+" precio:$"+entry.getValue());
        }
    }
    
    public static void Menu(){
    
        HashMap <String,Float>producto=new HashMap();
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        char op=' ';
        
        while (op!='5') {
            
            System.out.println("");
            
            System.out.println("1-Agregar_Producto");
            System.out.println("2-Modificar_Precio");
            System.out.println("3-Eliminar_Producto");
            System.out.println("4-Mostrar_Productos");
            System.out.println("5-Salir");
            
            System.out.println("Ingrese opción:");
            op=leer.next().charAt(0);
        
            switch (op) {
            
                case '1': 
                    Agregar_Producto(producto);
                    break;
                
                case '2': 
                    Modificar_Precio(producto);
                    break;
                
                case '3': 
                    Eliminar_Producto(producto);
                    break;
                
                case '4': 
                    Mostrar_Productos(producto);
                    break;
  
                default:
                    break;
            }   
        }
    }
}
    
    

    

