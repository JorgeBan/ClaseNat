
package clase1;


public class Gato {
   
    private String nombre; 
    private  int edad;
    private  String color;
    private char sexo;
    
   public Gato(String nombre, int edad, String color, char sexo){
       this.nombre = nombre;
       this.edad = edad;
       this.color = color;
       this.sexo = sexo;
   }
    
   public String getNombre(){
       return this.nombre;
   }
   public void comer(String comida){
        System.out.println("Estoy comiendo "+comida);
    }

    public void maullar(){
        System.out.println("Miauuuuu");
    }

    public void dormir(){
        System.out.println("zzzzzzzzz");
    }    
}
