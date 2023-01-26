
package com.egg.biblioteca.repositorios;

// @author Pablo

import com.egg.biblioteca.entidades.Libro;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Libro_Repositorio extends JpaRepository<Libro,Long>{
    
    @Query("SELECT l FROM Libro l WHERE l.titulo = :titulo")
    public Libro Buscar_Por_Titulo(@Param("titulo") String titulo);
    
    @Query("SELECT l FROM Libro l WHERE l.autor.nombre = :nombre")
    public List<Libro> Buscar_Por_Autor (@Param("nombre") String nombre);

}
