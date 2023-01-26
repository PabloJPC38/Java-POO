
package Pack_Electro;

// @author Pablo
public class Lavadora extends Electrodomestico {

    private float carga;

    public Lavadora() {
    }

    public Lavadora(float carga, float precio, String color, char consumo_energ, float peso) {
        super(precio, color, consumo_energ, peso);
        this.carga = carga;
    }

    public float getCarga() {
        return carga;
    }

    public void setCarga(float carga) {
        this.carga = carga;
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
        
        if(carga>30){
        
            precio+=500;
        }
    }

    @Override
    public String toString() {
        return "Lavadora{" + "capacidad de carga= " + carga + "kg, color= " + color + ", precio= $" + precio + ", consumoEnergetico= " + consumo_energ + ", peso= " + peso +"kg}";

    }


    
    
    
    
    
    
}
