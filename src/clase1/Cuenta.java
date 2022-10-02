
package clase1;
/*-Crea una clase llamada Cuenta que tendrá los siguientes atributos: 
titular y cantidad (puede tener decimales).
El titular será obligatorio y la cantidad es opcional. 
Crea dos constructores que cumpla lo anterior.
Crea sus métodos get, set y toString.
Tendrá dos métodos especiales:
ingresar(double cantidad): se ingresa una cantidad a la cuenta, 
si la cantidad introducida es negativa, no se hará nada.
retirar(double cantidad): se retira una cantidad a la cuenta, 
*/

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = 0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
    
    //ingresar(double cantidad): se ingresa una cantidad a la cuenta, 
//si la cantidad introducida es negativa, no se hará nada.
  
    public void ingresar(double cantidad){
        if(cantidad >= 0){
            this.cantidad += cantidad;
        }else{
            throw new Error("NO puedes ingresar un valor negativo");
        }
    }
    
    //retirar(double cantidad): se retira una cantidad a la cuenta, 
    ///si restando la cantidad actual a la que nos pasan es negativa, 
    //la cantidad de la cuenta pasa a ser 0.
    
    public void retirar(double cantidad){
        if((this.cantidad - cantidad) < 0){
            throw new Error("No puedes retirar mas dinero del que tienes, no seas tonto");
        }else{
            this.cantidad -= cantidad;
        }
    }
}