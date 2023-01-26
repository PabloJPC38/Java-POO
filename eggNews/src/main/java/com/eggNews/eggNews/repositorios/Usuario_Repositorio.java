
package com.eggNews.eggNews.repositorios;

// @author Pablo

import com.eggNews.eggNews.entidades.Periodista;
import com.eggNews.eggNews.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Usuario_Repositorio  extends JpaRepository<Usuario,String>{

    @Query("SELECT u FROM Usuario u WHERE u.email = :email" )
    public Usuario Buscar_Por_Email(String email);
    
    @Query("SELECT p FROM Periodista p WHERE p.Id = :Id" )
    public Periodista Buscar_Por_Id(String Id);
}
