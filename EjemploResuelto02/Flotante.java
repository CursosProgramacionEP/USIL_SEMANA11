public interface Flotante {
    // En una interfaz los atributos son siempre public static final.
    double DENSIDAD_AGUA_MAR = 1025.0;

    // Los metodos son public y abstract de forma automatica:
    // no se escriben esos modificadores.
    void mensajeSocorro();
    void alarma();
}
