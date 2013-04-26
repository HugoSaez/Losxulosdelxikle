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
public abstract class Windows extends ClasePadre  {
    Random r = new Random();
    

    public Windows(String version, int ramMaxima, int bits) {
        super (version,ramMaxima,bits);
    }

    @Override
    public String copiar(String copiado) {
        return super.copiar(copiado);
    }

    @Override
    public String pegar(String pegado) {
        return super.pegar(pegado);
    }
    @Override
    public String pantallazoAzul (String texto){
        int num = r.nextInt(6);
        if (num>=0 && num<=4)
            return "Pantallazo azul";
        else
            return "El oredenador no a sufrido ningun pantallazo";     
    }
    @Override
    public String buscarVirus (String texto){
        int ram = r.nextInt(10)+1;
        if (ram>=1 && ram<=7)
            return "Virus encontrado";
        else
            return "Virus no encontrado";
    }
    public String limpiar(){
        int ram = r.nextInt(2);
        if (ram==0)
            return "Virus limpiado";
        else
            return "Virus no limpiado";
    }
}
