package clase1;
public class Empleado {
    private String nombre;
    private static int antiguedad = 10;
    static final int salarioBasico = 2500;
    public static int getAntiguedad() {
        return antiguedad;
    }

    public Empleado(String nombre, int antiguedad) {
        this.nombre = nombre;
        this.antiguedad = antiguedad;
    }
    

}
