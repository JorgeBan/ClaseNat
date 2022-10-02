
package clase1;


public class Cadena {

    public String getCadena() {
        return cadena;
    }
    private String cadena;

    public Cadena(String cadena) {
        this.cadena = cadena;
    }
    
    //Dada una frase (cadena) ingresada por teclado, elabore un algoritmo 
    //que elimine los espacios en blanco de la cadena.
    public String EliminarEspaciosEnBlanco(){
        String nuevaCadena = "";
        int c = this.cadena.length();
        for(int i = 0; i < c ;i++){
            char letra = this.cadena.charAt(i);
            if(letra != ' '){
                nuevaCadena += letra;
            }
        }
        return nuevaCadena;
    }
}
