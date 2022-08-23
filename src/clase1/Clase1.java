/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase1;

import java.util.Scanner;


public class Clase1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introducir numero: ");
        int n = input.nextInt();
        
        seriePotenciaDeDos(n);
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
}
