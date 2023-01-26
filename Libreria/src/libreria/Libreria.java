
package libreria;

// @author Pablo

import libreria.servicios.Autor_Servicio;
import libreria.servicios.Editorial_Servicio;
import libreria.servicios.Libro_Servicio;

public class Libreria {

    public static void main(String[] args) throws Exception {
        
//        Autor_Servicio AS=new Autor_Servicio();
//        Editorial_Servicio ES=new Editorial_Servicio();
        Libro_Servicio LS=new Libro_Servicio();
//        LS.Crear_Libro(AS.Crear_Autor(),ES.Crear_Editorial());

          System.out.println(LS.Crear_Libro());
        
       
    }

}
