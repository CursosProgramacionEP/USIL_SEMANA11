public class Main {
    public static void main(String[] args) {
        // El arreglo es del tipo de la INTERFAZ: lo unico que se sabe de cada
        // elemento es que sabe hacer mensajeSocorro() y alarma().
        Flotante[] flota = {
            new BarcoPasaje("Estrella del Sur", 320),
            new PortaAvion("Almirante Grau", 24),
            new Pesquero("Dona Rosa", 18.5)
        };

        for (Flotante f : flota) {
            f.alarma();
            f.mensajeSocorro();
        }

        System.out.println("Densidad de referencia: " + Flotante.DENSIDAD_AGUA_MAR + " kg/m3");
    }
}
