
package clase1;

import java.util.Scanner;


public class PruebaClases {
     public static void main(String[] args) {
         Cuenta cuenta1 = new Cuenta("Jorge Banegas");
         Cuenta cuenta2 = new Cuenta("Nataly Cordero", 1000);
         
         System.out.println(cuenta1.toString());
         System.out.println(cuenta2.toString());
         cuenta1.ingresar(100);
         cuenta2.ingresar(10);
         
         System.out.println(cuenta1.toString());
         System.out.println(cuenta2.toString());
         
         cuenta1.retirar(50);
         cuenta2.retirar(200);
         
         System.out.println(cuenta1.toString());
         System.out.println(cuenta2.toString());
    }

    
}
