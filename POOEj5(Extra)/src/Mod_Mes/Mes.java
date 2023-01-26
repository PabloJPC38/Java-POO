/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mod_Mes;

/**
 *
 * @author pablo
 */
public class Mes {
    
    
    private final String mes[]={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octube","noviembre","diciembre"};
    
    private final String mes_secreto=mes[(int)(Math.random()*(11-01)+0)];

    public String[] getMes() {
        return mes;
    }

    public String getMes_secreto() {
        return mes_secreto;
    }
    
    
    
}
