package clase1.SuperHeroe;


public class main {
    public static void main(String [] args) {
        Superheroe superheroe = new Superheroe("Superman");
        Superheroe superheroe2 = new Superheroe("Batman");
        superheroe.setCapa(true);
        superheroe2.setCapa(true);
        Dimension dimension = new Dimension(30, 10, 2);
        Figura figuraSuperman = new Figura("sup1", 100.0, superheroe, dimension);
        Figura figuraBatman = new Figura("bat1", 100.0, superheroe2, dimension);

        Coleccion justiceLeague = new Coleccion("Justice League");
        justiceLeague.agregarFigura(figuraSuperman);
        justiceLeague.agregarFigura(figuraBatman);

        System.out.println("Coleccion: "+justiceLeague.toString());
        System.out.println("precio de la Coleccion: "+ justiceLeague.getValorColeccion());
    }
}
