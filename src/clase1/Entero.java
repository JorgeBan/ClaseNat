package clase1;


public class Entero {
    private int numero;
    public Entero(int n){
        this.numero = n;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    //ObtenerCantidadDeDigitos(): 
    //int →Obtiene la cantidad de dígitos de un número entero ⇒ n = 45512 →5
    
    public int obtenerCantidadDeDigitos(){
        String numeroString = this.numero + "";
        return numeroString.length();
    }
    
    //VerificarOrdenDeDigitos(): boolean → Verifica si los dígitos de un 
    //numero estan ordenados de manera ascendente
    //de derecha a izquierda ⇒ n= 85221→ true
    public boolean VerificarOrdenDeDigitos(){
        int n = this.numero;
        int primerDigito = n % 10;
        n = n / 10;
        while(n > 0){
            int digito = n % 10;
            if(primerDigito > digito)
                return false;
            n = n / 10;
        }   
        return true;
    }
    ///ObtenerDigito(int posicion): int →Obtiene el dígito de un número de 
    //una determinada posición de 
    //derecha a izquierda ⇒ n = 52369, posicion = 2 → 6

    public int ObtenerDigito(int posicion){
        int n = this.numero;
        int i = 1;
        int digito = 0;
        while(i <= posicion){
            digito = n % 10;
            n = n /10;
            i++;
        }
        
        return digito;
    }
    
    //UnirDosNumeros(NEntero n2): NEntero →Unirá dos números
    //enteros ⇒ n1 = 123, n2 = 456→ 123456
    public int UnirDosNumeros(Entero numero2){
        int n1 = this.numero;
        int n2 = numero2.getNumero();
        String n3 = n1+""+n2+"";
        return Integer.parseInt(n3);
    }
    
    
    //EliminarLosDigitos(int digito): int →Elimina todos los
    //dígitos que sean iguales al dígito ingresado 
    //como parámetro ⇒ n = 5223652, dígito = 2  → 5365
    public int EliminarLosDigitos(int digito){
        int n = this.numero;
        int nuevoNumero = 0;
        int potencia = 0;
        while(n > 0){
            int digito2 = n % 10;
            if(digito2 != digito){
                nuevoNumero += digito2*Math.pow(10, potencia);
                potencia++;
            }
            n = n / 10;
        }
        return nuevoNumero;
    }
    
}
