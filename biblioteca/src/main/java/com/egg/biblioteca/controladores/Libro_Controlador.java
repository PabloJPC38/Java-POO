
package com.egg.biblioteca.controladores;

// @author Pablo

import com.egg.biblioteca.Excepciones.Mi_Exception;
import com.egg.biblioteca.entidades.Autor;
import com.egg.biblioteca.entidades.Editorial;
import com.egg.biblioteca.entidades.Libro;
import com.egg.biblioteca.servicios.Autor_Servicio;
import com.egg.biblioteca.servicios.Editorial_Servicio;
import com.egg.biblioteca.servicios.Libro_Servicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/libro")
public class Libro_Controlador {
    
    @Autowired
    private Libro_Servicio lib_servicio;
    @Autowired
    private Autor_Servicio autor_servicio;
    @Autowired
    private Editorial_Servicio edit_servicio;
    
    
    @GetMapping("/registrar") //localhost:8080/libro/registrar
    public String registrar(ModelMap modelo) {
        List<Autor> autores = autor_servicio.Listar_Autores();
        List<Editorial> editoriales = edit_servicio.Listar_Editoriales();

        modelo.addAttribute("autores", autores);
        modelo.addAttribute("editoriales", editoriales);

        return "libro_form.html";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam(required = false) Long isbn, @RequestParam String titulo,
            @RequestParam(required = false) Integer ejemplares, @RequestParam String idAutor,
            @RequestParam String idEditorial, ModelMap modelo) {
        try {

            lib_servicio.Crear_Libro(isbn, titulo, ejemplares, idAutor, idEditorial);

            modelo.put("exito", "El Libro fue cargado correctamente!");

        } catch (Mi_Exception ex) {
            List<Autor> autores = autor_servicio.Listar_Autores();
            List<Editorial> editoriales = edit_servicio.Listar_Editoriales();

            modelo.addAttribute("autores", autores);
            modelo.addAttribute("editoriales", editoriales);
            modelo.put("error", ex.getMessage());

            return "libro_form.html";  // volvemos a cargar el formulario.
        }
        return "index.html";
    }

    @GetMapping("/lista")
    public String listar(ModelMap modelo) {
        List<Libro> libros = lib_servicio.Listar_Libros();
        modelo.addAttribute("libros", libros);

        return "libro_list";
    }

    
    @GetMapping("/modificar/{isbn}")
    public String modificar(@PathVariable Long isbn, ModelMap modelo) {
      
        modelo.put("libro", lib_servicio.getOne(isbn));
        
        
        List<Autor> autores = autor_servicio.Listar_Autores();
        List<Editorial> editoriales = edit_servicio.Listar_Editoriales();
        
        modelo.addAttribute("autores", autores);
        modelo.addAttribute("editoriales", editoriales);
        
        return "libro_modificar.html";
    }

    @PostMapping("/modificar/{isbn}")
    public String modificar(@PathVariable Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial, ModelMap modelo) {
        try {
            List<Autor> autores = autor_servicio.Listar_Autores();
            List<Editorial> editoriales = edit_servicio.Listar_Editoriales();
            
            modelo.addAttribute("autores", autores);
            modelo.addAttribute("editoriales", editoriales);

            lib_servicio.Modificar_Libro(isbn, titulo, ejemplares, idAutor, idEditorial);
            
                        
            return "redirect:../lista";

        } catch (Mi_Exception ex) {
            List<Autor> autores = autor_servicio.Listar_Autores();
            List<Editorial> editoriales = edit_servicio.Listar_Editoriales();
            
            modelo.put("error", ex.getMessage());
            
            modelo.addAttribute("autores", autores);
            modelo.addAttribute("editoriales", editoriales);
            
            return "libro_modificar.html";
        }

    }
    

}
