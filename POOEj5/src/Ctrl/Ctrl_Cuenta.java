/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctrl;
import java.util.Scanner;
import Mod_Cuenta.Cuenta;

/**
 *
 * @author pablo
 */
public class Ctrl_Cuenta {
    
    public Cuenta Crear(){
        
        Scanner leer=new Scanner(System.in);
        Cuenta c=new Cuenta();
        System.out.println("Ingrese número de cuenta:");
        c.setNum_cuenta(leer.nextInt());
        System.out.println("Ingrese DNI del cliente:");
        c.setDNI(leer.nextLong());
        System.out.println("Ingrese saldo actual:");
        c.setSaldo_actual(leer.nextDouble());
        
        return c;
    }
    
    public void Ingresar(Cuenta c,double ingreso){
        
        c.setSaldo_actual(c.getSaldo_actual()+ingreso);
        
    }
    
    public void Retirar(Cuenta c,double retiro){
    
        if (c.getSaldo_actual()>retiro) {
            
            c.setSaldo_actual(c.getSaldo_actual()-Extraccion_Rapida(c,retiro));
        }
        else{
            
            c.setSaldo_actual(0);
        }
    }
    
    public static double Extraccion_Rapida(Cuenta c, double retiro){
        
        Scanner leer=new Scanner(System.in);
   
        while((c.getSaldo_actual()*0.2)<retiro) {
            System.out.println("Ingrese saldo menor o igual a $"+c.getSaldo_actual()*0.2);
            retiro=leer.nextDouble();
        }
        
        return retiro;
    
    }
    
    public  void Consultar_Saldo(Cuenta c){
        
        System.out.println("Tu saldo actual es de $"+c.getSaldo_actual());
    }
    
    
    public void Consultar_Datos(Cuenta c){
    
        System.out.println(c);
    }
    
  
    
}
