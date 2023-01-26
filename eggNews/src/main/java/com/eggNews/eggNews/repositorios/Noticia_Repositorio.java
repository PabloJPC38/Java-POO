
package com.eggNews.eggNews.repositorios;

// @author Pablo

import com.eggNews.eggNews.entidades.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Noticia_Repositorio extends JpaRepository<Noticia,String>{

  

}
