public class Main {
    public static void main(String[] args) {
        // --- Parte 1: enlace dinamico sobre UNA sola referencia ---
        Barco b;                                   // tipo estatico: Barco

        b = new Velero("Albatros", 18.5, 2);
        b.alarma();        // la JVM ejecuta Velero.alarma()

        b = new Carguero("Tramontana", 180.0, 42000);
        b.alarma();        // la MISMA linea, ahora Carguero.alarma()

        System.out.println("---");

        // --- Parte 2: el arreglo polimorfico ---
        Barco[] flota = new Barco[3];
        flota[0] = new DeVapor("Independencia", 95.0, 4);
        flota[1] = new Carguero("Tramontana", 180.0, 42000);
        flota[2] = new Velero("Albatros", 18.5, 2);

        for (Barco barco : flota) {
            barco.alarma();    // enlace dinamico en cada vuelta
        }
    }
}
