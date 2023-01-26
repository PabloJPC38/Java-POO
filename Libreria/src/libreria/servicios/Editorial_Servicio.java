
package libreria.servicios;

// @author Pablo

import java.util.Scanner;
import libreria.entidades.Editorial;
import libreria.persistencia.DAO_Editorial;

public class Editorial_Servicio {
    
    private final DAO_Editorial dao;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Editorial_Servicio() {
        this.dao = new DAO_Editorial();
    }
    
    public Editorial Crear_Editorial() {

        Editorial editorial = new Editorial();
        
        try {
            
            System.out.println("Ingresar nombre de la editorial:");
            editorial.setNombre(leer.next());
            editorial.setAlta(Boolean.TRUE);
            dao.guardar(editorial);
            return editorial;
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public void Listar_Editoriales(){
        
        for (Editorial editorial : dao.Buscar_Editoriales()){
            
            System.out.println(editorial);
            
        }
 
    }
    
    

}
