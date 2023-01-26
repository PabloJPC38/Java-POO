
package Pack_Ctrl_Revolver;

import Pack_Revolver.Revolver;


// @author Pablo
public class Ctrl_Revolver {
    
    public Revolver Llenar_Revolver(){ 
        
        Revolver revolver=new Revolver();
        revolver.setPosicion_actual((int)(Math.random()*6));
        revolver.setPosicion_agua((int)(Math.random()*6));
        
        return revolver;
        
    }
    
    public boolean Mojar(Revolver revolver){
        
        return revolver.getPosicion_actual()==revolver.getPosicion_agua();
    }

    public void Siguiente_Chorro(Revolver revolver){
        
        if (revolver.getPosicion_actual()==6) {
            
            revolver.setPosicion_actual(0);
        }
        else{
            
        revolver.setPosicion_actual(revolver.getPosicion_actual()+1);
        }
    }

}
