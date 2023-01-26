
package Pack_Electro;

// @author Pablo
public class Electrodomestico {
    
    protected float precio;
    protected String color;
    protected char consumo_energ;
    protected float peso;

    public Electrodomestico() {
    }

    public Electrodomestico(float precio, String color, char consumo_energ, float peso) {
        this.precio = precio;
        this.color = color;
        this.consumo_energ = consumo_energ;
        this.peso = peso;
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
    
    protected void Comprobar_Consumo_Energetico(char letra) {
        
        if (!((letra>='A')&&(letra<='F'))){
        
            consumo_energ='F';
        }
    }
    
    protected void Comprobar_Color(String colour) {
        
        if(!(colour.equalsIgnoreCase("blanco")||colour.equalsIgnoreCase("negro")||
               colour.equalsIgnoreCase("rojo")||colour.equalsIgnoreCase("azul")||
               colour.equalsIgnoreCase("gris"))){
        
            color="blanco";
        
        }
    }

    public void Precio_Final(){
        
        
        switch (consumo_energ){
            
            case 'A':
                
                precio=1000;
                break;
            
            case 'B':
                
                precio=800;
                break;
                
            case 'C':
                
                precio=600;
                break;
                  
            case 'D':
                
                precio=500;
                break;
                
            case 'E':
                
                precio=300;
                break;
                
            case 'F':
                
                precio=100;
                break;
        }
        
        if(peso>=1 && peso<=19){
            
            precio+=100;
        }
        else if(peso>=20 && peso<=49){
        
            precio+=500;
        }
        else if (peso>=50 && peso<=79){
        
            precio+=800;
        
        }
        else if(peso>=80){
            
            precio+=1000;
        }
    
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumo_energ=" + consumo_energ + ", peso=" + peso + '}';
    }
    
    
}
