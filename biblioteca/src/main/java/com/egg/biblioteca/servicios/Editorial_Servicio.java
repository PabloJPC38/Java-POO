
package com.egg.biblioteca.servicios;

// @author Pablo

import com.egg.biblioteca.Excepciones.Mi_Exception;
import com.egg.biblioteca.entidades.Editorial;
import com.egg.biblioteca.repositorios.Editorial_Repositorio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class Editorial_Servicio {

    @Autowired
    private Editorial_Repositorio edit_repository;
    
    @Transactional
    public void Crear_Editorial(String nombre) throws Mi_Exception{
        
        Validar(nombre);
        
        Editorial editorial = new Editorial();
    
        editorial.setNombre(nombre);
        
        edit_repository.save(editorial);
    }
    
    public List<Editorial> Listar_Editoriales(){
    
        List<Editorial> editoriales = new ArrayList();
        
        editoriales=edit_repository.findAll();
        
        return editoriales;
    }
    
    public void Modificar_Autor(String Id, String nombre) throws Mi_Exception{
        
        Validar(nombre);
        
        Optional <Editorial> respuesta=edit_repository.findById(Id);
        
        if(respuesta.isPresent()){
            
            Editorial editorial=respuesta.get();
            editorial.setNombre(nombre);
            
            edit_repository.save(editorial);
            
        }
    }
    
    private void Validar(String nombre) throws Mi_Exception {
        
        if (nombre.isEmpty() || nombre == null) {
            throw new Mi_Exception("el nombre de la editorial no puede ser nulo o estar vacio");
        }
    }
}
