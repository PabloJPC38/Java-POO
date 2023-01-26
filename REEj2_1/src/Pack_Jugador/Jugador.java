
package Pack_Jugador;

// @author Pablo
public class Jugador {
    
    private int ID;
    private String nombre;
    private boolean mojado;
    
    public Jugador (){
    
    }

    public Jugador(int ID, String nombre, boolean mojado) {
        this.ID = ID;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "ID=" + ID + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    

}
