
package com.eggNews.eggNews.servicios;

// @author Pablo

import com.eggNews.eggNews.entidades.Noticia;
import com.eggNews.eggNews.entidades.Periodista;
import com.eggNews.eggNews.entidades.Usuario;
import com.eggNews.eggNews.excepciones.My_Exceptions;
import com.eggNews.eggNews.repositorios.Noticia_Repositorio;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;




@Service
public class Noticia_Servicios {
    
    @Autowired
    private Noticia_Repositorio noti_repositorio;
    private final String folder="fotos//";
            
    @Transactional
    public void Crear_Noticia(String titulo, String cuerpo, MultipartFile file,Periodista creador) throws My_Exceptions, IOException{
        
        Validar(titulo,cuerpo,file);
        Noticia noticia = new Noticia();
        
        noticia.setTitulo(titulo);
        noticia.setCuerpo(cuerpo);
        noticia.setFoto(file.getBytes());
        noticia.setCreador(creador);

        noti_repositorio.save(noticia);

    }
    
    @Transactional(readOnly = true)
    public List<Noticia> Listar_Noticias(){
        
        List<Noticia> noticias = new ArrayList();
        noticias=noti_repositorio.findAll();
        
        return noticias;
    }
    
    @Transactional
    public void Modificar_Noticia(String id,String titulo, String cuerpo,MultipartFile file) throws My_Exceptions, IOException{
        
        Validar(titulo, cuerpo,file);
        Optional<Noticia> respuesta=noti_repositorio.findById(id);
    
        if(respuesta.isPresent()){
        
            Noticia noticia=respuesta.get();
           				
            noticia.setTitulo(titulo);
            noticia.setCuerpo(cuerpo);
            noticia.setFoto(file.getBytes());
            
            noti_repositorio.save(noticia);
        }
        else{
            System.out.println("No se modificó");
        }
    }
    
    @Transactional
    public void Dar_Baja(String id){
       
        
        noti_repositorio.deleteById(id);
    
    }
    
    public Noticia getOne(String Id){
        
        return noti_repositorio.getOne(Id);
    }
    
    
    private void Validar(String titulo, String cuerpo, MultipartFile file ) throws My_Exceptions{
        
        if (titulo.isEmpty() || titulo == null) {
            throw new My_Exceptions("El título no puede ser nulo o estar vacío");
        }
        
        if (cuerpo.isEmpty() || cuerpo == null) {
            throw new My_Exceptions("El cuerpo no puede ser nulo o estar vacío");
        }
        
        if(file.isEmpty() || (file == null)){
        
            throw new My_Exceptions("La foto no puede ser nula o estar vacía");
        }
        
        
    }
}
