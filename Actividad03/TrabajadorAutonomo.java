public class TrabajadorAutonomo extends Trabajador {
    private String ruc;

    public TrabajadorAutonomo(String nombre, String direccion, String fechaNacimiento, char sexo,
                              double sueldo, String ruc) {
        // TODO 7: el autonomo no tiene empresa: pasa "Independiente" como empresa.
    }

    // TODO 8: sobrescribe toString() e imprimir(). Fijate que aqui heredas
    //         de Trabajador, no de Persona: super.toString() ya trae empresa y sueldo.
}
