/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack_Ctrl_Sala;

import Pack_Espectador.Espectador;
import Pack_Sala.Sala;


/**
 *
 * @author pablo
 */
public class Ctrl_Sala {
    
    public void LLenar_Sala(Sala sala){
        
        String [][]s=Inicializar_Matriz();
        boolean band=true;
        int i,j;
    
        for (Espectador espectador : sala.getEspectadores()) {
            
            
            if ((sala.getPelicula().getEdad_permitida()<=espectador.getEdad()) && (espectador.getDinero()>=sala.getPrecio())){ 
                
                while (band) {
                    
                    i=(int)(Math.random()*7);
                    j=(int)(Math.random()*5);
                    if(!s[i][j].endsWith("X")) {
                        
                        s[i][j]=s[i][j].replace(' ','X');
                        System.out.println(espectador.getNombre()+" está ubicado en el asiento "+s[i][j]);
                        band=false;
                    }
                }
                band=true;
                   
            }
        }
        
        sala.setSala(s);
    }
    
    public static String [][] Inicializar_Matriz(){
        
        String [][]s=new String[8][6];

        for (int i = 0; i < 8; i++) {
            
            for (int j = 0; j < 6; j++) {
                
                s[i][j]=Letra(j)+Numero(i)+" ";
            } 
        }
        
        return s;
    }
     
    public static String Letra(int n){
        
        String letra="";
        
        switch (n) {
            case 0:
                letra="A";
                break;
            case 1:
                letra="B";
                break;
            case 2:
                letra="C";
                break;
            case 3:
                letra="D";
                break;
            case 4:
                letra="E";
                break;
            case 5:
                letra="F";
                break;
        }
        
        return letra;
    }
    
    public static String Numero(int n){
    
        String numero="";
        
        switch (n) {
            case 0:
                numero="8";
                break;
            case 1:
                numero="7";
                break;
            case 2:
                numero="6";
                break;
            case 3:
                numero="5";
                break;
            case 4:
                numero="4";
                break;
            case 5:
                numero="3";
                break;
            case 6:
                numero="2";
                break;
            case 7:
                numero="1";
                break;
        }
        
        return numero;   
    }
    
    public void Mostrar_Sala(Sala sala){
        
        for (int i = 0; i <8; i++) {
            
            for (int j = 0; j < 6; j++) {

                
                if (j>0 && j<7) {
                    
                    System.out.print("|"+sala.getSala()[i][j]);
                    
                }
                else{
                
                    System.out.print(sala.getSala()[i][j]);
                }
                
            }
            
            System.out.println("");
            
        }
    
    }
}
