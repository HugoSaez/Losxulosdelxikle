/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xikle;

import java.util.Random;

/**
 *
 * @author DAM
 */
public abstract class MacOs extends ClasePadre {
    
         public MacOs(String version, int ramMaxima, int bits) {
         super(version, ramMaxima, bits);
         }

    @Override
    public String copiar(String copiado) {
        return super.copiar(copiado); 
    }

    @Override
    public String pegar(String pegado) {
        return super.pegar(pegado); 
    }
    
    public String pantallazoAzul (String texto){
        Random r = new Random(5);
        if (r.nextInt()==0) return "Hay pantallazo";
        else return "No hay pantallazo";        
    }
    public String buscarVirus (String texto){
        Random r = new Random(10);
        if (r.nextInt()==0) return "Hay virus";
        else return "No hay virus";        
    }
    
}
