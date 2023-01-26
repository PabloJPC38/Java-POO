
package tienda.servicios;

// @author Pablo

import java.util.*;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;
import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

public class Servicios_Producto_Fabricante {
    
    private ProductoDAO daop;
    private FabricanteDAO daof;
    private final ArrayList<String> consultas;

    public Servicios_Producto_Fabricante() {
        this.consultas = new ArrayList<>(Arrays.asList("select nombre from producto;"
                ,"select nombre,precio from producto;"
                ,"select * from producto where precio between 120 and 202;"
                ,"select * from producto where nombre like 'Portátil%';"
                ,"select nombre,precio from producto order by precio limit 1;"
                ,"select * from producto"
                ,"select * from fabricante"));
        
        this.daop = new ProductoDAO();
        this.daof = new FabricanteDAO();
    }
    
    private void Crear_Producto() throws Exception{
    
        try{
            Scanner leer=new Scanner(System.in).useDelimiter("\n");
            Producto producto=new Producto();
            System.out.println("Ingresar nombre,precio y codigo de fabricante");
            producto.setNombre(leer.next());
            producto.setPrecio(leer.nextFloat());
            producto.setCodigoFabricante(leer.nextInt());
            daop.Ingresar_Producto(producto);
        }
        catch(Exception ex){
            throw ex;
        }
    }
    
    private void Crear_Fabricante() throws Exception{
    
        try{
            Scanner leer=new Scanner(System.in).useDelimiter("\n");
            Fabricante fabricante=new Fabricante();
            System.out.println("Ingresar nombre");
            fabricante.setNombre(leer.next());
            daof.Ingresar_Fabricante(fabricante);
        }
        catch(Exception ex){
            throw ex;
        }
    }
    
    
    private void Mostrar_Consulta_Producto(String sql) throws Exception{
    
        try{
            for (String producto : daop.Consulta(sql)){
                
                System.out.println(producto);
                System.out.println("");
            }
        }
        catch(Exception ex){
            throw ex;
        }
    }
    
    private void Mostrar_Consulta_Fabricante(String sql) throws Exception{
    
        try{
            for (String fabricante : daof.Consulta(sql)){
                
                System.out.println(fabricante);
                System.out.println("");
            }
        }
        catch(Exception ex){
            throw ex;
        }
    }
    
    private Producto Modificar_Producto() throws Exception{
        
        Producto producto=new Producto();
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        
        try{
            System.out.println("Ingrese nombre del producto a modificar:");
            producto=daop.Buscar_Producto(leer.next());
            System.out.println("Ingrese nuevo precio:");
            producto.setPrecio(leer.nextFloat());
            return producto;
        }
        catch(Exception ex){
            throw ex;
        }
        
    
    }
    
    public void Menu() throws Exception{
        
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        int op;
        
        while (true){  
            
            System.out.println("1-Listar el nombre de todos los productos que hay en la tabla producto");
            System.out.println("2-Listar los nombres y los precios de todos los productos de la tabla producto");
            System.out.println("3-Listar aquellos productos que su precio esté entre 120 y 202");
            System.out.println("4-Buscar y listar todos los Portátiles de la tabla producto");
            System.out.println("5-Listar el nombre y el precio del producto más barato");
            System.out.println("6-Ingresar un producto a la base de datos");
            System.out.println("7-Ingresar un fabricante a la base de datos");
            System.out.println("8-Editar un producto con datos a elección");
            System.out.println("9-Salir");
            System.out.println("");
            System.out.println("Elegir opción");
            op=leer.nextInt();
            
            if(op==9){
                break;
            }
            
            switch (op){
                
                case 1:
                    Mostrar_Consulta_Producto(consultas.get(0));
                    
                    break;
                case 2:
                    Mostrar_Consulta_Producto(consultas.get(1));
                    
                    break;
                case 3:
                    Mostrar_Consulta_Producto(consultas.get(2));
                    
                    break;
                case 4:
                    Mostrar_Consulta_Producto(consultas.get(3));
                    
                    break;
                case 5:
                    Mostrar_Consulta_Producto(consultas.get(4));
                    
                    break;
                case 6:
                    Crear_Producto();
                    Mostrar_Consulta_Producto(consultas.get(5));
                    
                    break;
                    
                case 7:
                    Crear_Fabricante();
                    Mostrar_Consulta_Fabricante(consultas.get(6));
                    
                    break;
                    
                case 8:
                    daop.Editar_Producto(Modificar_Producto());
                    Mostrar_Consulta_Producto(consultas.get(5));
                    
                    break;
                default:
                    throw new AssertionError();
            }
 
        }
 
    }

}
