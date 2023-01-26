/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctrl;

import Mod_Puntos.Puntos;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ctrl_Puntos {
    
    public Puntos Crear(){
        
        Scanner leer=new Scanner(System.in);
        Puntos puntos=new Puntos();
        
        System.out.println("Ingrese coordena X1:");
        puntos.setX1(leer.nextInt());
        System.out.println("Ingrese coordena Y1:");
        puntos.setY1(leer.nextInt());
        System.out.println("Ingrese coordena X2:");
        puntos.setX2(leer.nextInt());
        System.out.println("Ingrese coordena Y2:");
        puntos.setY2(leer.nextInt());
        
        return puntos;
        
    }
    
    public double Calcular_Distancia(Puntos puntos){
        
        return (Math.sqrt((Math.pow(puntos.getX2()-puntos.getX1(),2))+(Math.pow(puntos.getY2()-puntos.getY1(), 2))));
    }
}
