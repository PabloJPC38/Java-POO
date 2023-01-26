
package com.egg.biblioteca.controladores;

// @author Pablo

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Portal_Controlador {
    
    @GetMapping("/")
    public String index(){
        
        return "index.html";
    }

}
