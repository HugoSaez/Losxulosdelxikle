/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xikle;

import java.util.Scanner;

/**
 *
 * @author DAM
 */
public class Ejecuta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int opcion=0, estado=0;
        Linux L = null;
        MacOs M = null;
        Windows W = null;
        
        do{
            System.out.println("Introduce 1.Crear SO  2.Copiar  3.Pegar  4.BuscarVirus  5.Pantallazo  6.LimpiarVirus  7.Salir");
            opcion=s.nextInt();
            s.nextLine();
            switch(opcion){
                case 1:{
                    estado = s.nextInt();
                    System.out.println("Que SO quieres    1.Windows 2.Linux 3.MacOs");
                    if (estado==1)
                        System.out.println("Has elegido Windows");
                    else if (estado == 2)
                        System.out.println("Has elegido Linux");
                    else System.out.println("Has elegido Mac");break;             
            }
                case 2:{
                    if (opcion==1) System.out.println(W.copiar(null));
                    else if (opcion == 2) System.out.println(L.copiar(null));
                }
            }
            
        }while(opcion != 7);
        
        
    }
}
