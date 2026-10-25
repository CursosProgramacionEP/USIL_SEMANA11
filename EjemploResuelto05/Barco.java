public abstract class Barco {
    protected String nombre;
    protected double eslora;

    public Barco(String nombre, double eslora) {
        this.nombre = nombre;
        this.eslora = eslora;
    }

    // Cada barco suena distinto: la clase base no puede decidirlo.
    public abstract void alarma();

    public void mostrar() {
        System.out.println(nombre + " (" + eslora + " m)");
    }
}
