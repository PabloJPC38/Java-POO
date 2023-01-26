/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mod_Puntos;

/**
 *
 * @author pablo
 */
public class Puntos {
    
    private int X1;
    private int Y1;
    private int X2;
    private int Y2;
    
    public Puntos(){
    
    
    }

    public Puntos(int X1, int Y1, int X2, int Y2) {
        this.X1 = X1;
        this.Y1 = Y1;
        this.X2 = X2;
        this.Y2 = Y2;
    }

    public void setX1(int X1) {
        this.X1 = X1;
    }

    public void setY1(int Y1) {
        this.Y1 = Y1;
    }

    public void setX2(int X2) {
        this.X2 = X2;
    }

    public void setY2(int Y2) {
        this.Y2 = Y2;
    }

    public int getX1() {
        return X1;
    }

    public int getY1() {
        return Y1;
    }

    public int getX2() {
        return X2;
    }

    public int getY2() {
        return Y2;
    }
    
    
}
