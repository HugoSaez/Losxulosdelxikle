
package xikle;


public abstract class ClasePadre {
    private String version,copiar,pegar;
    private int ramMaxima,bits;
    public ClasePadre(String version,int ramMaxima, int bits,String copiar,String pegar) {
        this.version=version;
        this.ramMaxima=ramMaxima;
        this.bits=bits;
        this.copiar=copiar;
        this.pegar=pegar;
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
    public abstract String buscarVirus (String texto);
    public abstract String pantallazoAzul (String texto);
 
}
