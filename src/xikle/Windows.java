/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xikle;

/**
 *
 * @author DAM
 */
public class abstract Windows extends ClasePadre  {

    public Windows(String version, int ramMaxima, int bits) {
        super (version,ramMaxima,bits);
    }

    @Override
    public String copiar(String copiado) {
        return super.Copiar(copiado);
    }

    @Override
    public String pegar(String pegado) {
        return super.Pegar(pegado);
    }
    
    
    
    

    
}
