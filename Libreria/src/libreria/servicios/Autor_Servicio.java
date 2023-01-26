
package libreria.servicios;

// @author Pablo

import java.util.ArrayList;
import libreria.persistencia.DAO_Autor;
import java.util.Scanner;
import libreria.entidades.Autor;

public class Autor_Servicio {
    
    private final DAO_Autor dao;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Autor_Servicio() {
        this.dao = new DAO_Autor();
    }
    
    /*Crear Autor*/
    public Autor Crear_Autor() {

        Autor autor = new Autor();
        
        try {
            
            System.out.println("Ingresar nombre de autor:");
            autor.setNombre(leer.next());
            autor.setAlta(Boolean.TRUE);
            dao.guardar(autor);
            return autor;
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    /*Listar Autor*/
    
    public void Listar_Autores(){
        
        try{
            for (Autor autor : dao.Buscar_Autores()){
            
                System.out.println(autor);
            
            }
        }
        catch(Exception ex){
            
            
        
            
        }
 
    }
    
    public Autor Devolver_Autor(Integer id){
    
        return dao.Buscar_Autor(id);
        
    }

}
