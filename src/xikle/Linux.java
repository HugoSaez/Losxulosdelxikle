/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xikle;

import java.util.Random;

/**
 *
 * @author OFI
 */
public abstract class Linux extends ClasePadre{
    
    public Linux (String version,int ramMaxima, int bits,String copiar,String pegar){
        super(version, ramMaxima, bits, copiar, pegar);
    }

    @Override
    public String copiar(String copiado) {
        return super.copiar(copiado);
    }

    @Override
    public String pegar(String pegado) {
        return super.pegar(pegado);
    }
    public String buscarVirus(String texto){
        Random r = new Random(4);
        if (r.nextInt()==0) return "Virus encontrado";
        else return "Virus no encontrado";
    }
    public String pantallazoAzul (String texto){
        Random r = new Random(2);
        if (r.nextInt()==0) return "Ha habido un pantallazo azul";
        else return "No ha habido ningun pantallazo azul";
    }
}
