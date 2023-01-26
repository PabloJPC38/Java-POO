
package com.egg.biblioteca.servicios;

// @author Pablo

import com.egg.biblioteca.Excepciones.Mi_Exception;
import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.entidades.Editorial;
import com.egg.biblioteca.entidades.Libro;
import com.egg.biblioteca.repositorios.Autor_Repositorio;
import com.egg.biblioteca.repositorios.Editorial_Repositorio;
import com.egg.biblioteca.repositorios.Libro_Repositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Libro_Servicio {
    
    @Autowired
    private Libro_Repositorio lib_repository;
    @Autowired
    private Autor_Repositorio autor_repository;
    @Autowired
    private Editorial_Repositorio edit_repository;
 
    @Transactional
    public void Crear_Libro(Long isbn, String titulo, Integer ejemplares, String Id_Autor, String Id_Editorial) throws Mi_Exception{
        
        Validar(isbn, titulo, ejemplares, Id_Autor, Id_Editorial);
        
        Autor autor = autor_repository.findById(Id_Autor).get();
        Editorial editorial = edit_repository.findById(Id_Editorial).get();
        
        Libro libro = new Libro();
    
        libro.setIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setEjemplar(ejemplares);
        libro.setAlta(new Date());
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        
        lib_repository.save(libro);
    }

    public List<Libro> Listar_Libros(){
    
        List<Libro> libros = new ArrayList();
        
        libros=lib_repository.findAll();
        
        return libros;
    }
    
    public void Modificar_Libro(Long isbn, String titulo,Integer ejemplares, String Id_Autor, String Id_Editorial) throws Mi_Exception{
    
        Validar(isbn, titulo, ejemplares, Id_Autor, Id_Editorial);
        
        Optional<Libro> respuesta = lib_repository.findById(isbn);
        Optional<Autor> respuesta_autor = autor_repository.findById(Id_Autor);
        Optional<Editorial> respuesta_editorial = edit_repository.findById(Id_Editorial);
        
        
        Autor autor = new Autor();
        Editorial editorial = new Editorial();
        
        if(respuesta_autor.isPresent()){
            autor=respuesta_autor.get();
        }
        
        if(respuesta_editorial.isPresent()){
            editorial=respuesta_editorial.get();
        }
        
        if(respuesta.isPresent()){
            
            Libro libro = respuesta.get();
            libro.setTitulo(titulo);
            libro.setEjemplar(ejemplares);
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            
            lib_repository.save(libro);
        }
    }
    
    private void Validar(Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial) throws Mi_Exception {

        if (isbn == null) {
            throw new Mi_Exception("el isbn no puede ser nulo");
        }
        if (titulo.isEmpty() || titulo == null) {
            throw new Mi_Exception("el titulo no puede ser nulo o estar vacio");
        }
        if (ejemplares == null) {
            throw new Mi_Exception("ejemplares no puede ser nulo");
        }
        if (idAutor.isEmpty() || idAutor == null) {
            throw new Mi_Exception("el Autor no puede ser nulo o estar vacio");
        }

        if (idEditorial.isEmpty() || idEditorial == null) {
            throw new Mi_Exception("La Editorial no puede ser nula o estar vacia");
        }
    }
}
