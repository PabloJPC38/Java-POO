
package libreria.persistencia;

// @author Pablo

import java.util.ArrayList;
import libreria.entidades.Editorial;

public class DAO_Editorial extends DAO<Editorial>{
    
    @Override
    public void guardar(Editorial editorial) {
        super.guardar(editorial); 
    }
    
    public ArrayList<Editorial> Buscar_Editoriales(){
    
        conectar();
        ArrayList<Editorial> editoriales=(ArrayList<Editorial>) em.createQuery("SELECT a FROM Autor a ").getResultList();
        desconectar();
        return editoriales;
    }

}
