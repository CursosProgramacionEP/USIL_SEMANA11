public abstract class Barco {
    protected String nombre;
    protected double eslora;

    public Barco(String nombre, double eslora) {
        this.nombre = nombre;
        this.eslora = eslora;
    }

    public void zarpar() {
        System.out.println(nombre + " zarpa del puerto (" + eslora + " m de eslora)");
    }
}
