
package tienda.persistencia;

// @author Pablo

import java.util.ArrayList;
import tienda.entidades.Fabricante;

public final class FabricanteDAO extends DAO{
    
    public void Ingresar_Fabricante(Fabricante fabricante) throws Exception{
        
        try{
            if(fabricante==null){
                
                throw new Exception("Debe indicar el fabricante");
            }   
        
        String sql = "INSERT INTO fabricante (nombre)"
               + "VALUES ('"+fabricante.getNombre()+"');";
        
        Insert_Modific_Elim(sql);
        }
        catch(Exception ex){
                
               throw ex;
        }
        finally{
            Desconectar_Base();
        }
    }

    
    public ArrayList<String> Consulta(String sql) throws Exception{
        
        try{
        
            Hacer_Consulta(sql);
            ArrayList<String> fabricantes=new ArrayList();
            
            while (resultado.next()){ 
                String fabricante;
                
                if (sql.contains("*")){
                    
                    fabricante="codigo: "+resultado.getInt(1)+" nombre:"+resultado.getString(2);
                    fabricantes.add(fabricante);
                }
            }
            Desconectar_Base();
            return fabricantes;
        }
        catch(Exception ex){

            throw ex;
        }

    }
}
