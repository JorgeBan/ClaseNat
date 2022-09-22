
package clase1;

import java.util.Scanner;


public class PruebaClases {
     public static void main(String[] args) {
         Entero n = new Entero(5223652);
         Entero n2 = new Entero(456);
         System.out.println("La cantidad de digitos es: "+ n.obtenerCantidadDeDigitos());
         System.out.println("El numero esta ordenado?: "+n.VerificarOrdenDeDigitos());
         System.out.println("El digito en la posicion "+2 + ": "+n.ObtenerDigito(2));
         //System.out.println("numero: "+n.UnirDosNumeros(n2));
         System.out.println("El nuevo numero es:  "+n.EliminarLosDigitos(2));
    }

    
}
