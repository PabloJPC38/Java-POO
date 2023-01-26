/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej12.extra;
/**
 *
 * @author pablo
 */
public class Ej12Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // Contador();
       
       
        int i, unidad, decena, centena;
        String numeroCadena;
        
        
        for (i=0;i<=999;i++){
            
            centena=i/100;
            decena=(i-centena*100)/10;
            unidad=i%10;
            
            numeroCadena = (((Integer.toString(centena).concat("-")).concat(Integer.toString(decena))).concat("-")).concat(Integer.toString(unidad));
                 
            numeroCadena = numeroCadena.replace("3", "E");
            
            System.out.println(numeroCadena);        
            
            
        }   
    }
    
    public static void Contador(){
        String Si,Sj,Sk;
        
        for (int i = 0; i < 9; i++) {
            
            for (int j = 0; j < 9; j++) {
                
                for (int k = 0; k < 9; k++) {
                    
                    if(("3".equals(Sk=String.valueOf(k)))){
                        Sk="E";
                        System.out.println(i+"-"+j+"-Sk");
                    }
                    else if(("3".equals(Sj=String.valueOf(j)))&&("3".equals(Sk=String.valueOf(i)))){
                        Sj="E";Sk="E";
                        
                    }
                    
                    if(("3".equals(Si=String.valueOf(i)))&&("3".equals(Sj=String.valueOf(j)))&&("3".equals(Sk=String.valueOf(i)))){
                        
                        Si="E";Sj="E";Sk="E";
                        System.out.println("Si-Sj-Sk");
                    }
                    
                }
                
            }
            
        }
        
        
    }
    
}
