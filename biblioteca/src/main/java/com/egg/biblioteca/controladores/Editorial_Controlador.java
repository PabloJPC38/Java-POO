
package com.egg.biblioteca.controladores;

// @author Pablo

import com.egg.biblioteca.Excepciones.Mi_Exception;
import com.egg.biblioteca.servicios.Editorial_Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/editorial")
public class Editorial_Controlador {
    @Autowired
    private Editorial_Servicio editorialServicio;
    
    @GetMapping("/registrar") //localhost:8080/autor/registrar
    public String registrar(){
        return "editorial_form.html";
    }
    
    
    @PostMapping("/registro")
    public String registro(@RequestParam String nombre, ModelMap modelo){
        
        try {
            editorialServicio.Crear_Editorial(nombre);
            
            modelo.put("exito", "La Editorial fue registrada correctamente!");
        } catch (Mi_Exception ex) {
                       
            modelo.put("error", ex.getMessage());
            return "editorial_form.html";
        }
        
        return "index.html";        
    }
    
}
