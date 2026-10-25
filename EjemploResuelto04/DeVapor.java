public class DeVapor extends Barco {
    private int calderas;

    public DeVapor(String nombre, double eslora, int calderas) {
        super(nombre, eslora);
        this.calderas = calderas;
    }

    @Override
    public void alarma() {
        System.out.println(nombre + ": silbato de vapor, dos pitidos");
    }
}
