
package exej2;

// @author Pablo
public class EXEj2 {

    public static void main(String[] args) {
        
        int arreglo[]=new int[2];
        
        try{
        
            for (int i = 0; i <= arreglo.length; i++){
                
                arreglo[i]=i;    
            }
        }
        
        catch(ArrayIndexOutOfBoundsException e){
    
            System.out.println(e.fillInStackTrace());
            System.out.println("Se superó la dimensión del arreglo, no existe la posición "+e.getMessage());
        }
       
    }

}
