/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase1;

import java.util.Scanner;


public class Clase1 {

    public static void main(String[] args) {
       Gato gato = new Gato("Mishu", 3, "atigrado", 'H');
 
        System.out.println("Mi gato se llama "+gato.getNombre());
        System.out.println("Mi gato es color ");
       gato.comer("croquetas");

       gato.maullar();
       gato.maullar();
       gato.maullar();
       gato.dormir();
    }

    
    public void diaDeLaSemanaConSwitch(){
         Scanner input = new Scanner(System.in);
        System.out.println("Introducir numero del 1 al 7: ");
        int numero1 = input.nextInt();
        
        switch (numero1) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Introducir numero entre 1 y 7");
        }
    }
    
    public void diaDeLaSemanaConArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("Introducir numero del 1 al 7: ");
        int numero1 = input.nextInt();
        String Semana[] = new String[]{"D","L","Ma","Mi","J","V","S"};

        
        System.out.println("el dia de la semana es: " + Semana[numero1-1]);
        
       
    }
    
    public static int verificarMayusculaOMinuscula(char letra){
    
        return (letra >= 'A' && letra <= 'Z') ? 1: (letra >= 'a' && letra <= 'z') ? 0: -1;
    }
    
/*    
    Escriba un algoritmo que genere todas las potencias de 2, desde la 0-ésima hasta la ingresada por el usuario:
    Ejemplo: 
    Ingrese num: 10
    1 2 4 8 16 32 64 128 256 512 1024
*/
    public static void seriePotenciaDeDos(int n){
     
        for(int i = 0; i <= n; i++){
            System.out.println(Math.pow(2, i));
        }
    }
    
    
    /*
        Escriba un programa que muestre los n primeros números primos, donde n es ingresado por el usuario:
       Cuantos primos: 10
       2
       3
       5
       7
       11
       13
       17
       19
       23
       29
    */
    
    
    public static void seriePrimos(int n){
        /*for(int i = 0; i < n ; i++){
            
        }*/
       int c = 1;
       int i = 1;
       while(i <= n){
           if(esPrimo(c)){
               System.out.println(c);
               i++;
           }
           c++;
       }
    }
    
    private static boolean esPrimo(int n) {
        if(n == 1) return false;
        for(int i = 2 ; i <= n/2 ; i++){
            if(n % i  == 0){
                return false;
            }
        }
        return true;
    }
 
    /*
        Palabra Más corta y más larga
Desarrolle un algoritmo que tenga la siguiente entrada:
    • primero, el usuario ingresa un número entero n, que indica cuántas palabras ingresará a continuación;
    • después el usuario ingresa n palabras.
La salida del programa debe mostrar la palabra más larga y la más corta que fueron ingresadas por el usuario.
La ejecución del programa debe verse así:
Cantidad de palabras: 5
Palabra 1: negro
Palabra 2: amarillo
Palabra 3: naranjo
Palabra 4: azul
Palabra 5: blanco
La palabra mas larga es amarillo
La palabra mas corta es azul

    */
    
    public static void palabraMasCortaYMasLarga(int n){
        
        String palabras[] = new String[20];
        for(int i = 0; i < n; i++){
            Scanner input = new Scanner(System.in);
            System.out.println("Palabra "+(i+1)+": ");
            String palabra = input.nextLine();
            palabras [i] = palabra;
        }
        
        String palabraMasCorta = palabras[0];
        String palabraMasLarga = palabras[0];
        System.out.println("corta: "+ palabraMasCorta);
        for(int j = 1 ; j < n; j++){
          if(palabraMasCorta.length() > palabras[j].length()){
              palabraMasCorta =  palabras[j];
          }
          if(palabras[j].length() > palabraMasLarga.length()){
              palabraMasLarga =  palabras[j];
          }
        }
        System.out.println("La palabra mas larga es: "+ palabraMasLarga);
        System.out.println("La palabra mas corta es " + palabraMasCorta);
    }
    
    /*
        Tiempo de viaje
Un viajero desea saber cuánto tiempo tomó un viaje que realizó. Él tiene la duración en minutos de cada uno de los tramos del viaje.
Desarrolle un programa que permita ingresar los tiempos de viaje de los tramos y entregue como resultado el tiempo total de viaje en formato horas:minutos.
El programa deja de pedir tiempos de viaje cuando se ingresa un 0.
Duracion tramo: 15
Duracion tramo: 30
Duracion tramo: 87
Duracion tramo: 0
Tiempo total de viaje: 2:12 horas
Duracion tramo: 51
Duracion tramo: 17
Duracion tramo: 0
Tiempo total de viaje: 1:08 horas

    */


    public static void tiempoDeViaje(){
        int n;
        int sumaDelTiempo = 0;
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("Duracion tramo: ");
            n = input.nextInt();
            sumaDelTiempo += n;
        }while(n != 0);
        
        int tiempoEnHoras = 0;
        while(sumaDelTiempo > 60){
            sumaDelTiempo -= 60;
            tiempoEnHoras +=1;
        }
        System.out.println("Tiempo total de viaje: "+ tiempoEnHoras + ":"+sumaDelTiempo);
    }
}
