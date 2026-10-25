public class PortaAvion implements Flotante {
    private String nombre;
    private int aeronaves;

    public PortaAvion(String nombre, int aeronaves) {
        this.nombre = nombre;
        this.aeronaves = aeronaves;
    }

    @Override
    public void mensajeSocorro() {
        System.out.println("SOS en clave militar - " + nombre);
    }

    @Override
    public void alarma() {
        System.out.println(nombre + ": zafarrancho de combate, " + aeronaves + " aeronaves aseguradas");
    }
}
