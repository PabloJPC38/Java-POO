
package Pack_Revolver;

// @author Pablo
public class Revolver {

    private int posicion_actual;
    private int posicion_agua;
    
    public Revolver(){
    
    }

    public Revolver(int posicion_actual, int posicion_agua) {
        this.posicion_actual = posicion_actual;
        this.posicion_agua = posicion_agua;
    }

    public int getPosicion_actual() {
        return posicion_actual;
    }

    public void setPosicion_actual(int posicion_actual) {
        this.posicion_actual = posicion_actual;
    }

    public int getPosicion_agua() {
        return posicion_agua;
    }

    public void setPosicion_agua(int posicion_agua) {
        this.posicion_agua = posicion_agua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicion_actual=" + posicion_actual + ", posicion_agua=" + posicion_agua + '}';
    }
}
