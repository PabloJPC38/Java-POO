/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej5;

import Ctrl.Ctrl_Cuenta;
import Mod_Cuenta.Cuenta;

/**
 *
 * @author pablo
 */
public class POOEj5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Ctrl_Cuenta CC=new Ctrl_Cuenta();
        Cuenta c=new Cuenta();
        
        c=CC.Crear();
        
        CC.Ingresar(c, 3500);
        CC.Consultar_Saldo(c);
        CC.Retirar(c, 1000);
        CC.Consultar_Saldo(c);
        
        CC.Consultar_Datos(c);
    }
    
}
