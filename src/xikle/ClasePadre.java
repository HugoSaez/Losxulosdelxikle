
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
        public String Copiar(String copiado){
            return copiado;
        }
        public String Pegar(String pegado){
            return pegado;
        }
    
 
}
