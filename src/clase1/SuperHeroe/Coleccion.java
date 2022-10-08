package clase1.SuperHeroe;

import java.util.ArrayList;

public class Coleccion {
    private String nombre;
    private ArrayList<Figura> figuras;

    public Coleccion(String nombre) {
        this.nombre = nombre;
        this.figuras = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Figura> getFiguras() {
        return figuras;
    }

    public void agregarFigura(Figura figura){
        this.figuras.add(figura);
    }

    public void subirPrecio(double precio, String id){
        for(int i = 0; i < this.figuras.size(); i++){
            Figura f = this.figuras.get(i);
            if(f.getCodigo().equals(id)){
                f.subirPrecio(precio);
                return;
            }
        }
    }

    public Figura masValioso(){
        Figura masValioso = this.figuras.get(0);
        for (int i = 1; i < this.figuras.size() ; i++){
            Figura f = this.figuras.get(i);
            if(masValioso.getPrecio() < f.getPrecio()){
                masValioso = f;
            }
        }
        return masValioso;
    }

    public  ArrayList<Figura> conCapa(){
        ArrayList<Figura> figurasConCapa = new ArrayList<>();
        for (int i = 0; i < this.figuras.size() ; i++){
            Figura f = this.figuras.get(i);
            if(f.getSuperheroe().isCapa()){
                figurasConCapa.add(f);
            }
        }
        return figurasConCapa;
    }

    public double getVolumenColecion(){
        double volumenTotal = 0;
        for (int i = 0; i < this.figuras.size() ; i++){
           Figura f = this.figuras.get(i);
           volumenTotal += f.getDimension().getVolument();
        }
        return volumenTotal + 200;
    }

    public double getValorColeccion(){
        double valorColeccion = 0;
        for (int i = 0; i < this.figuras.size() ; i++){
            Figura f = this.figuras.get(i);
            valorColeccion += f.getPrecio();
        }
        return valorColeccion;
    }
    @Override
    public String toString() {
        return "Coleccion{" +
                "nombre='" + nombre + '\'' +
                ", figuras=" + figuras +
                '}';
    }
}
