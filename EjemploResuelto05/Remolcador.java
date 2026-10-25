// La clase NUEVA. Se agrega al proyecto sin tocar ninguna de las otras
// y sin tocar el bucle del Main: eso es extensibilidad.
public class Remolcador extends Barco {
    private int caballosFuerza;

    public Remolcador(String nombre, double eslora, int caballosFuerza) {
        super(nombre, eslora);
        this.caballosFuerza = caballosFuerza;
    }

    @Override
    public void alarma() {
        System.out.println(nombre + ": bocina grave, dos pitidos cortos");
    }
}
