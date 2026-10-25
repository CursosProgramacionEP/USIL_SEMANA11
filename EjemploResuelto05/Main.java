public class Main {
    public static void main(String[] args) {
        // Compara este Main con el de EjemploResuelto04.
        // Lo UNICO que cambia es el contenido del arreglo: el bucle es identico.
        Barco[] flota = {
            new DeVapor("Independencia", 95.0, 4),
            new Carguero("Tramontana", 180.0, 42000),
            new Velero("Albatros", 18.5, 2),
            new Remolcador("Bravo", 24.0, 3500)     // el tipo nuevo
        };

        for (Barco b : flota) {
            b.alarma();        // ni una linea tuvo que cambiar aqui
        }
    }
}
