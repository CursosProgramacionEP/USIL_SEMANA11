public class AlumnoDistancia extends Alumno {
    private int foros;

    public AlumnoDistancia(String codigo, String nombre, int foros) {
        // TODO 4: llama al constructor de la clase base y guarda los foros.
    }

    // TODO 5: sobrescribe calcularPromedio() con @Override.
    //         Formula: examen 40% + practicas 40% + 20% por participacion en foros
    //         (usa foros >= 3 para dar el 20 completo, si no, 0).
}
