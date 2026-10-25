public class Main {
    public static void main(String[] args) {
        PesqueroIndustrial p = new PesqueroIndustrial("Dona Rosa", 32.5, -12.05, -77.15);

        p.zarpar();          // heredado de Barco (extends)
        p.alarma();          // del contrato Flotante (implements)
        p.mensajeSocorro();  // del contrato Flotante (implements)

        // La MISMA instancia se puede ver con tres tipos distintos:
        Barco      comoBarco      = p;
        Flotante   comoFlotante   = p;
        Rastreable comoRastreable = p;

        comoBarco.zarpar();
        comoFlotante.alarma();
        System.out.println("Posicion: " + comoRastreable.posicionGPS());
    }
}
