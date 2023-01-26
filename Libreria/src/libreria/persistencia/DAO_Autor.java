
package libreria.persistencia;

// @author Pablo

import java.util.ArrayList;
import libreria.entidades.Autor;
import libreria.entidades.Libro;

public class DAO_Autor extends DAO<Autor>{
    
    
    @Override
    public void guardar(Autor autor) {
        super.guardar(autor); 
    }
    
    public ArrayList<Autor> Buscar_Autores(){
    
        conectar();
        ArrayList<Autor> autores=(ArrayList<Autor>) em.createQuery("SELECT a FROM Autor a ").getResultList();
        desconectar();
        return autores;
    }

    public Autor Buscar_Autor(Integer id){
        conectar();
        return em.find(Autor.class,id);
    }
    

}
