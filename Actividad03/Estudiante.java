public class Estudiante extends Persona {
    private String universidad;
    private int ciclo;

    public Estudiante(String nombre, String direccion, String fechaNacimiento, char sexo,
                      String universidad, int ciclo) {
        // TODO 1: super(...) y guarda universidad y ciclo.
    }

    // TODO 2: sobrescribe toString() con @Override.
    //         Reutiliza super.toString() y agrega universidad y ciclo.

    // TODO 3: sobrescribe equals() con @Override.
    //         Dos estudiantes son iguales si lo son como Persona Y van a la misma universidad.

    // TODO 4: sobrescribe imprimir() con @Override para que diga "Estudiante: ...".
}
