
package hej2;

// @author Pablo

import Pack_Ctrl.Ctrl_Electro;
import Pack_Electro.Lavadora;
import Pack_Electro.Televisor;
import Pack_Electro.Electrodomestico;
import java.util.ArrayList;
import java.util.Scanner;




public class HEj2 {

    public static void main(String[] args) {
        
        float lav=0,tel=0;
        Ctrl_Electro CE = new Ctrl_Electro();
        ArrayList <Electrodomestico> Electros=new ArrayList();
       
        
       for (Electrodomestico electro :Crear_Electrodomestico()){
            
            electro.Precio_Final();
            System.out.println(electro);
            if (electro instanceof Lavadora){
                
                lav+=electro.getPrecio();
               
            }
            
            if(electro instanceof Televisor){
                tel+=electro.getPrecio();
                
            }
            
        }
        
        System.out.println("Precio total de lavadoras:$"+lav);
        System.out.println("Precio total de televisores:$"+tel);
        System.out.println("Precio total de electrodomesticos:$"+(lav+tel));
      
    }
    
    public static ArrayList <Electrodomestico> Crear_Electrodomestico(){
    
        char op=' ';
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Ctrl_Electro CE = new Ctrl_Electro();
        ArrayList <Electrodomestico> Electros=new ArrayList();
        
        
        while(true){
            
            System.out.println("Que electrodomestico deseas crear?");
            System.out.println("1-(Lavadora), 2-(Televisor), 3-(Salir)");
            op=leer.next().charAt(0);
            
            switch (op){
                
                case '1':
                    Lavadora lavadora = CE.Crear_Lavadora();
                    Electros.add(lavadora);

                    break;
                
                case '2':
                    Televisor televisor = CE.Crear_Televisor();
                    Electros.add(televisor);
                    System.out.println(televisor);
                    break;
            }
            
            
            if(op=='3'){
            
                break;
            }
   
        }
        
        return Electros;
        
    }
    
    
    
}
