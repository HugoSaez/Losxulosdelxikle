
package xikle;


public class ClasePadre {
    private String version ;
    private int ramMaxima,bits;
    public ClasePadre(String version,int ramMaxima, int bits) {
        this.version=version;
        this.ramMaxima=ramMaxima;
        this.bits=bits;
    }     
    public String getVersion() {
        return version;
    }
    public int getRamMaxima() {
        return ramMaxima;
    }
    public int getBits() {
        return bits;
    }
    public String copiar(String copiado){
        return copiado;
    }
    public String pegar(String pegado){
        return pegado;
    }
    public abstract String publicar (String texto);
    public abstract String publiconFoto (String texto,String foto);
 
}
