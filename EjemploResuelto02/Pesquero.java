public class Pesquero implements Flotante {
    private String nombre;
    private double toneladas;

    public Pesquero(String nombre, double toneladas) {
        this.nombre = nombre;
        this.toneladas = toneladas;
    }

    @Override
    public void mensajeSocorro() {
        System.out.println("MAYDAY - " + nombre + " con " + toneladas + " t de captura");
    }

    @Override
    public void alarma() {
        System.out.println(nombre + ": campana de cubierta y recogida de redes");
    }
}
