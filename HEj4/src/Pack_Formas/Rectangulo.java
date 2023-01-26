
package Pack_Formas;

// @author Pablo

import interfaz.Calculos_Formas;

public class Rectangulo implements Calculos_Formas{
    
    private double base; 
    private double altura;

    public Rectangulo() {
        
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }
    

    @Override
    public void Calcular_Perimetro() {
        System.out.println("Perimetro de rectángulo:"+((base+altura)*2));
    }

    @Override
    public void Calcular_Area() {
        System.out.println("Area del rectángulo:"+(base*altura));
    }

    
}
