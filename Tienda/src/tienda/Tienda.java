
package tienda;

// @author Pablo

import tienda.servicios.Servicios_Producto_Fabricante;

public class Tienda {

    public static void main(String[] args) throws Exception{
        
        try{
            Servicios_Producto_Fabricante SP=new Servicios_Producto_Fabricante();
            SP.Menu();
        }
        catch(Exception ex){
            throw ex;
        }
       
    }

}
