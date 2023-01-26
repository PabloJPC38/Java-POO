
package libreria.servicios;

// @author Pablo

import libreria.persistencia.DAO_Libro;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;

public class Libro_Servicio {
    
    private final DAO_Libro dao;
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    private Editorial_Servicio ES=new Editorial_Servicio();
    private Autor_Servicio AS=new Autor_Servicio();

    public Libro_Servicio() {
        this.dao = new DAO_Libro();
    }
    
    public Libro Crear_Libro() throws Exception{

        Libro libro = new Libro();
        int op;
        
        try {
            
            System.out.println("Ingresar título:");
            libro.setTitulo(leer.next());
            System.out.println("Ingresar año:");
            libro.setAnio(leer.nextInt());
            System.out.println("Ingresar ejemplares:");
            libro.setEjemplares(leer.nextInt());
            libro.setEjemplaresPrestados(0);
            libro.setEjemplaresRestantes(libro.getEjemplares());
            libro.setAlta(Boolean.TRUE);
            
            try{
                System.out.println("");
                AS.Listar_Autores();
                System.out.println("1-Elegir");
                System.out.println("2-Agregar");
                op=leer.nextInt();
                switch (op){
                    
                    case 1:
                        System.out.println("Ingresar id");
                        libro.setAutor(AS.Devolver_Autor(leer.nextInt()));
                        
                        break;
                    
                    case 2:
                        libro.setAutor(AS.Crear_Autor());
                        
                    default:
                        throw new AssertionError();
                }

                dao.guardar(libro);
                return libro;
            }
            catch(Exception ex){
                throw ex;
            }
        } 
        catch (Exception ex) {
            throw ex;
        }
    
    
    
    }
    
    
    
    
    
}

    


