public class Carguero extends Barco {
    private double toneladas;

    public Carguero(String nombre, double eslora, double toneladas) {
        super(nombre, eslora);
        this.toneladas = toneladas;
    }

    @Override
    public void alarma() {
        System.out.println(nombre + ": sirena de carga, un pitido continuo");
    }
}
