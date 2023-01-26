/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mod_Cuenta;

/**
 *
 * @author pablo
 */
public class Cuenta {
    
    private int num_cuenta;
    private long DNI;
    private double saldo_actual;
    
    
    public Cuenta(){
    
    }

    public Cuenta(int num_cuenta, long DNI, double saldo_actual) {
        this.num_cuenta = num_cuenta;
        this.DNI = DNI;
        this.saldo_actual = saldo_actual;
    }

    public void setNum_cuenta(int num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setSaldo_actual(double saldo_actual) {
        this.saldo_actual = saldo_actual;
    }
    
    public int getNum_cuenta() {
        return num_cuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public double getSaldo_actual() {
        return saldo_actual;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "num_cuenta=" + num_cuenta + ", DNI=" + DNI + ", saldo_actual=" + saldo_actual + '}';
    }   
}
