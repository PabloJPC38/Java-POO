/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctrl;
import java.util.Scanner;
import Op.Operacion;

/**
 *
 * @author pablo
 */
public class Ctrl_Operacion {
    
    public Operacion Crear(){
        
        Scanner leer=new Scanner(System.in);
        
        Operacion num=new Operacion();
        System.out.println("Ingrese primer número:");
        num.setNum1(leer.nextInt());
        System.out.println("Ingrese segundo número:");
        num.setNum2(leer.nextInt());
        
        return num;        
    }
    
    public int Sumar(Operacion num){
    
        return num.getNum1()+num.getNum2();
    }
    
    
    public int Restar(Operacion num){
    
        return num.getNum1()-num.getNum2();
    }
    
    public int Multiplicar(Operacion num){
    
        if(num.getNum1()==0 || num.getNum1()==0){
            
            return 0;
        }
        else{
            return num.getNum1()*num.getNum2();
        }
    }
    
    
    public float Dividir(Operacion num){
    
        if(num.getNum1()==0 || num.getNum1()==0){
            
            return 0;
        }
        else{
            return (float)(num.getNum1())/(float)(num.getNum2());
        }
    }
    
    
    
    
    
}
