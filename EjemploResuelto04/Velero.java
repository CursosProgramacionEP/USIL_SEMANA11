public class Velero extends Barco {
    private int mastiles;

    public Velero(String nombre, double eslora, int mastiles) {
        super(nombre, eslora);
        this.mastiles = mastiles;
    }

    @Override
    public void alarma() {
        System.out.println(nombre + ": bocina de aire, tres pitidos largos");
    }
}
