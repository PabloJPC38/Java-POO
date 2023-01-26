
package Pack_Formas;

// @author Pablo

import interfaz.Calculos_Formas;

public class Circulo implements Calculos_Formas{
    
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    

    public void setRadio(double radio) {
        this.radio = radio;
    }
    

    @Override
    public void Calcular_Perimetro() {
        System.out.println("Perimetro del círculo:"+(2*PI*radio));
   }

    @Override
    public void Calcular_Area() {
        System.out.println("Area del círculo:"+(PI*Math.pow(radio,2)));
    }

}
