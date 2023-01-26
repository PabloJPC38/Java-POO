
package libreria.persistencia;

// @author Pablo

import java.util.ArrayList;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;

public class DAO_Libro extends DAO<Libro>{
    

    @Override
    public void guardar(Libro libro) {
        super.guardar(libro); 
    }

    public Libro Buscar_Libro_Por_ISBN(long isbn){
    
        conectar();
        Libro libro=(Libro) em.createQuery("SELECT l FROM Libro l WHERE l.isbn LIKE:isbn")
                .setParameter("isbn",isbn).getSingleResult();
        desconectar();
        return libro;
    }
    
    public Libro Buscar_Libro_Por_Titulo(String titulo){
    
        conectar();
        Libro libro=(Libro) em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE:titulo")
                .setParameter("titulo",titulo).getSingleResult();
        desconectar();
        return libro;
    }
    
    public ArrayList<Libro> Buscar_Libro_Por_Autor(Autor autor){
    
        conectar();
        ArrayList<Libro> libros=(ArrayList<Libro>) em.createQuery("SELECT l FROM Libro l WHERE l.autor LIKE:autor")
                .setParameter("autor",autor).getResultList();
        desconectar();
        return libros;
    }
    
    public ArrayList<Libro> Buscar_Libro_Por_Editorial(Editorial editorial){
    
        conectar();
        ArrayList<Libro> libros=(ArrayList<Libro>) em.createQuery("SELECT l FROM Libro l WHERE l.editorial LIKE:editorial")
                .setParameter("autor",editorial).getResultList();
        desconectar();
        return libros;
    }
    
    
    
    
    
    
}
