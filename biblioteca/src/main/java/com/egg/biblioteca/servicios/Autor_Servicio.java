
package com.egg.biblioteca.servicios;

// @author Pablo

import com.egg.biblioteca.Excepciones.Mi_Exception;
import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.repositorios.Autor_Repositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Autor_Servicio {

    @Autowired
    private Autor_Repositorio autor_repository;
    
    @Transactional
    public void Crear_Autor(String nombre) throws Mi_Exception{
        
        Validar(nombre);
        
        Autor autor = new Autor();
        
        autor.setNombre(nombre);
        
        autor_repository.save(autor);
    
    }
    
    
    public List<Autor> Listar_Autores(){
    
        List<Autor> autores = new ArrayList();
        
        autores=autor_repository.findAll();
        
        return autores;
    }
    
    public void Modificar_Autor(String Id, String nombre) throws Mi_Exception{
        
        Validar(nombre);
        
        Optional <Autor> respuesta=autor_repository.findById(Id);
        
        if(respuesta.isPresent()){
            
            Autor autor=respuesta.get();
            autor.setNombre(nombre);
            
            autor_repository.save(autor);
            
        }
    
    }
    
    private void Validar(String nombre) throws Mi_Exception {
        
        if (nombre.isEmpty() || nombre == null) {
            throw new Mi_Exception("el nombre no puede ser nulo o estar vacio");
        }
    }
}
