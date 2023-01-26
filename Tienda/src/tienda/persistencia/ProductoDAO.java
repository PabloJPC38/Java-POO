
package tienda.persistencia;
import java.util.ArrayList;
import tienda.entidades.Producto;

// @author Pablo
public final class ProductoDAO extends DAO{
    
    public void Ingresar_Producto(Producto producto) throws Exception{
        
        try{
            if(producto==null){
                
                throw new Exception("Debe indicar el producto");
            }   
        
        String sql = "INSERT INTO producto (nombre,precio,codigo_fabricante)"
               + "VALUES ('"+producto.getNombre() 
                + "',"+producto.getPrecio()+","+producto.getCodigoFabricante()+");";
        
            System.out.println("SQL:"+sql);
            
        Insert_Modific_Elim(sql);
        }
        catch(Exception ex){
                
               throw ex;
        }
        finally{
            Desconectar_Base();
        }
    }
    
    public Producto Buscar_Producto(String nombre) throws Exception{
    
        try{

            String sql="select * from producto where nombre='"+nombre+"';";
            Hacer_Consulta(sql);
            Producto producto=null;
            
            while(resultado.next()){
                producto=new Producto();
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getFloat(3));
            }
            Desconectar_Base();
            return producto;
        }
        catch(Exception ex){
        
            Desconectar_Base();
            throw ex;
        }
    }
    
    public void Editar_Producto(Producto producto)throws Exception{
    
        try{
            if(producto==null){
                throw new Exception("Debe indicar el producto a modificar");
            }
            
            String sql = "UPDATE producto SET "
                    +"precio ="+producto.getPrecio()+" WHERE nombre = '"+producto.getNombre()+"'";

            Insert_Modific_Elim(sql);
        }
        catch(Exception ex){
            throw ex;
        }
    
    }
   
    
    
    public ArrayList<String> Consulta(String sql) throws Exception{
        
        try{
        
            Hacer_Consulta(sql);
            ArrayList<String> productos=new ArrayList();
            
            while (resultado.next()){ 
                String producto;
                
                if (sql.contains("*")){
                    
                    producto="codigo: "+resultado.getInt(1)+" nombre:"+resultado.getString(2)
                            +" precio:"+resultado.getFloat(3)+" codigo_fabricante:"
                            +resultado.getInt(4);
                    productos.add(producto);
                }
                else if (sql.contains("nombre ")){
                
                    producto="nombre:"+resultado.getString(1);
                    productos.add(producto);
                }
                else if (sql.contains("nombre,precio")){
                    producto="nombre:"+resultado.getString(1)+" precio:"+resultado.getFloat(2);
                    productos.add(producto);
                }
            }
            Desconectar_Base();
            return productos;
        }
        catch(Exception ex){

            throw ex;
        }

    }

}
