
package com.eggNews.eggNews.controladores;

// @author Pablo

import com.eggNews.eggNews.entidades.Noticia;
import com.eggNews.eggNews.entidades.Periodista;
import com.eggNews.eggNews.entidades.Usuario;
import com.eggNews.eggNews.excepciones.My_Exceptions;
import com.eggNews.eggNews.repositorios.Usuario_Repositorio;
import com.eggNews.eggNews.servicios.Noticia_Servicios;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;




@Controller
@RequestMapping("/admin")
public class Noticia_Controlador {
    
    @Autowired
    private Noticia_Servicios noti_service;
    
    @Autowired 
    private Usuario_Repositorio user_repost;
            
    
    @GetMapping("/")
    public String admin(){
    
        return "admin.html";
    }
    
    @GetMapping("/agregar")
    public String agregar(){
        
        return "admin_agregar.html";
        
    
    }
    
    @PostMapping("/formulario")
    public String formulario(@RequestParam String titulo,
            @RequestParam String cuerpo,@RequestParam("archivo") MultipartFile file,@RequestParam String Id, ModelMap modelo){
        
        Periodista creador=user_repost.Buscar_Por_Id(Id);    
        

        try{
            
            noti_service.Crear_Noticia(titulo,cuerpo,file,creador);
            modelo.put("Exito!","Se agregó correctamente la noticia");
            System.out.println("Se guardó!!");
        } 
        catch (My_Exceptions | IOException | IllegalStateException ex){
            System.out.println("No se guardó!!");
            modelo.put("error", ex.getMessage());
            System.out.println(ex.getMessage());
            return "admin_agregar.html";
        }
        
        return "admin.html";
    }
    

    
    
    @GetMapping("/modificar/{Id}")
    public String Modificar(@PathVariable String Id, ModelMap modelo){
        
        modelo.put("noticia",noti_service.getOne(Id));
        
        return "admin_modif.html";
    
    }
    
    @PostMapping("/modificar/{Id}")
    public String Modificar(@PathVariable String Id,String titulo,String cuerpo,@RequestParam("archivo") MultipartFile file,ModelMap modelo) throws IOException{
        
        
        try
        {
            noti_service.Modificar_Noticia(Id, titulo, cuerpo, file);
            return "redirect:../lista";
        } catch (My_Exceptions ex)
        {
            modelo.put("Error", ex.getMessage());
            return "admin_modif.html";
        }
    
         
    }
    
    @GetMapping("/eliminar/{Id}")
     public String Eliminar(@PathVariable String Id,ModelMap modelo){
        
        noti_service.Dar_Baja(Id);
        
        return "redirect:../lista";
        

     }
     

	
}
