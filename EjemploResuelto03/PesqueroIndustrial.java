// Una sola clase base con extends, dos contratos con implements.
// extends va primero; implements despues, separando las interfaces con coma.
public class PesqueroIndustrial extends Barco implements Flotante, Rastreable {
    private double latitud;
    private double longitud;

    public PesqueroIndustrial(String nombre, double eslora, double latitud, double longitud) {
        super(nombre, eslora);
        this.latitud = latitud;
        this.longitud = longitud;
    }

    @Override
    public void mensajeSocorro() {
        System.out.println("MAYDAY - " + nombre + " en " + posicionGPS());
    }

    @Override
    public void alarma() {
        System.out.println(nombre + ": campana de cubierta");
    }

    @Override
    public String posicionGPS() {
        return latitud + ", " + longitud;
    }
}
