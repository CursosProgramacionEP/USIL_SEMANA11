public class BarcoPasaje implements Flotante {
    private String nombre;
    private int pasajeros;

    public BarcoPasaje(String nombre, int pasajeros) {
        this.nombre = nombre;
        this.pasajeros = pasajeros;
    }

    @Override
    public void mensajeSocorro() {
        System.out.println("MAYDAY - " + nombre + " con " + pasajeros + " pasajeros a bordo");
    }

    @Override
    public void alarma() {
        System.out.println(nombre + ": sirena continua y luces de emergencia");
    }
}
