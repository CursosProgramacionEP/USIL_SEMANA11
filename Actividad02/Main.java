public class Main {
    public static void main(String[] args) {
        // Alumno a = new Alumno("A001", "Prueba");
        // ERROR: Alumno es abstracta. Descomenta para comprobarlo.

        Asignatura poo = new Asignatura("Programacion Orientada a Objetos I");

        AlumnoPresencial ana = new AlumnoPresencial("A001", "Ana Soto", 14);
        ana.registrarNotas(16, 14);

        AlumnoDistancia luis = new AlumnoDistancia("A002", "Luis Mena", 4);
        luis.registrarNotas(12, 15);

        poo.matricular(ana);
        poo.matricular(luis);

        // TODO 8: muestra el listado y el porcentaje de aprobados.
    }
}
