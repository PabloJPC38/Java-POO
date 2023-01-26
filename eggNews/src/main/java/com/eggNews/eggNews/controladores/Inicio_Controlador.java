
package com.eggNews.eggNews.controladores;

// @author Pablo

import com.eggNews.eggNews.entidades.Noticia;
import com.eggNews.eggNews.entidades.Periodista;
import com.eggNews.eggNews.entidades.Usuario;
import com.eggNews.eggNews.excepciones.My_Exceptions;
import com.eggNews.eggNews.servicios.Noticia_Servicios;
import com.eggNews.eggNews.servicios.Usuario_Servicios;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/")
public class Inicio_Controlador {
    
    @Autowired
    private Noticia_Servicios noti_service;
    @Autowired
    private Usuario_Servicios user_service;

    @GetMapping("/")
    public String index(ModelMap modelo){
        List <Noticia> noticias = noti_service.Listar_Noticias();
        modelo.addAttribute("noticias",noticias);
        return "index.html";
    }
    
    @GetMapping("/registrar")
    public String registrar(){

        return "registrar.html";
    }
    
    @PostMapping("/registro")
    public String registro(@RequestParam String user_name,@RequestParam String email,
            @RequestParam String password, @RequestParam String password2,
            ModelMap modelo){
    
        try
        {
            user_service.Registrar_Usuario(user_name, email, password, password2);
            modelo.put("exito","Usuario registrado correctamente");
            return "index.html";
            
        } 
        catch (My_Exceptions ex)
        {
            modelo.put("error", ex.getMessage());
            modelo.put("user_name",user_name);
            modelo.put("email", email);
            return "registrar.html";
            
        }
        
    }
    
    @GetMapping("/admin/registrar_periodista")
    public String registrar_periodista(){

        return "registrar_periodista.html";
    }
    
    @PostMapping("/admin/registro_periodista")
    public String registro_periodista(@RequestParam String user_name,@RequestParam String email,
            @RequestParam String password, @RequestParam String password2,
            ModelMap modelo){
    
        try
        {
            user_service.Registrar_Periodista(user_name, email, password, password2);
            modelo.put("exito","Usuario registrado correctamente");
            return "admin.html";
            
        } 
        catch (My_Exceptions ex)
        {
            modelo.put("error", ex.getMessage());
            modelo.put("user_name",user_name);
            modelo.put("email", email);
            return "registrar_periodista.html";
            
        }
        
    }
    
    @GetMapping("/login")
    public String login(@RequestParam(required = false)String error, ModelMap modelo){
        if(error!=null){
        
            modelo.put("error","Usuario o Contraseña invalidos");
        }
        return "login.html";
    }
    
    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN', 'ROLE_PERIOD')")
    @GetMapping("/inicio")
    public String inicio(HttpSession session){
        
        Usuario user_logueado = (Usuario) session.getAttribute("usuariosession");
        
        if(user_logueado.getRol().toString().equals("ADMIN")|| 
           user_logueado.getRol().toString().equals("PERIOD")){
            
            return "admin.html";
        
        }
        return"inicio.html";
    }
    
    
    /*@GetMapping("/inicio/noticias")
    public String Lista_Noticias(ModelMap modelo){
        
        List <Noticia> noticias = noti_service.Listar_Noticias();
        modelo.addAttribute("noticias",noticias);
        return "noticias.html";
    
    }*/
    
    
    @GetMapping("/noticia/{id}")
    public ResponseEntity<byte[]> imagenUsuario (@PathVariable String id){
        Noticia noticia = noti_service.getOne(id);
        
       byte[] imagen= noticia.getFoto();
       
       HttpHeaders headers = new HttpHeaders();
       
       headers.setContentType(MediaType.IMAGE_JPEG);
       
        
        
       return new ResponseEntity<>(imagen,headers, HttpStatus.OK); 
    }
    
    /*******************************************************/
    
    @GetMapping("/admin/lista_periodista")
    public String Lista(ModelMap modelo){
        
        List <Periodista> periodistas = user_service.Listar_Periodistas();
        modelo.addAttribute("periodistas",periodistas);
        return "admin_periodistas.html";
    
    }
    
    @GetMapping("admin/baja_periodista/{Id}")
    public String Dar_Baja(@PathVariable String Id){
        
        user_service.Dar_Baja(Id);
        return "redirect:../lista_periodista";
    
    }
    
    @GetMapping("admin/alta_periodista/{Id}")
    public String Dar_Alta(@PathVariable String Id){
        
        user_service.Dar_Alta(Id);
        return "redirect:../lista_periodista";
    
    }
    
    
    @GetMapping("admin/eliminar_periodista/{Id}")
     public String Eliminar(@PathVariable String Id){
        
        user_service.Eliminar_Periodista(Id);
        
        return "redirect:../lista_periodista";

    }
     
    @PostMapping("/admin/lista_periodista")
    public String Agregar_Sueldo(@RequestParam String Id,@RequestParam Integer sueldo, ModelMap modelo){
        
        user_service.Agregar_Sueldo(Id, sueldo);
        List <Periodista> periodistas = user_service.Listar_Periodistas();
        modelo.addAttribute("periodistas",periodistas);

       return "redirect:lista_periodista";
    }
     
}
