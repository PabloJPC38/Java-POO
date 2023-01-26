
package Pack_Electro;

// @author Pablo
public class Televisor extends Electrodomestico{

    private float resolucion;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(float resolucion, boolean sintonizador, float precio, String color, char consumo_energ, float peso) {
        super(precio, color, consumo_energ, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public float getResolucion() {
        return resolucion;
    }

    public void setResolucion(float resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo_energ() {
        return consumo_energ;
    }

    public void setConsumo_energ(char consumo_energ) {
        this.consumo_energ = consumo_energ;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public void Precio_Final() {
        super.Comprobar_Consumo_Energetico(consumo_energ);
        super.Comprobar_Color(color);
        super.Precio_Final(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        if(resolucion>40){
            precio+=precio*0.3;
        }
        if(sintonizador){
            precio+=500;
        }
    }
    
    @Override
    public String toString() {
       String antena;
        if(sintonizador){
            antena = "si";
        }else{
           antena = "no";
        }
        return "Televisor{" + "pulgadas=" + resolucion + ", tdt=" + antena + ", color= " + color + ", precio= $" + precio + ", consumoEnergetico= " + consumo_energ + ", peso= " + peso +"kg}";
    }
    
    
    
    
    
}
