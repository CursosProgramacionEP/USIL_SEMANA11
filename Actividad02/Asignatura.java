import java.util.ArrayList;

public class Asignatura {
    private String nombre;
    private ArrayList<Alumno> alumnos = new ArrayList<>();

    public Asignatura(String nombre) {
        this.nombre = nombre;
    }

    public void matricular(Alumno a) {
        alumnos.add(a);
    }

    // TODO 6: recorre la lista y llama a mostrar() sobre cada alumno.
    //         El tipo de la lista es Alumno, pero cada objeto respondera el suyo.
    public void listado() {
    }

    // TODO 7: devuelve el porcentaje de aprobados de la asignatura.
    public double porcentajeAprobados() {
        return 0;
    }
}
