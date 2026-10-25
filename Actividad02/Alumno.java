public abstract class Alumno {
    protected String codigo;
    protected String nombre;
    protected double notaExamen;
    protected double notaPracticas;

    public Alumno(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public void registrarNotas(double notaExamen, double notaPracticas) {
        this.notaExamen = notaExamen;
        this.notaPracticas = notaPracticas;
    }

    // TODO 1: declara calcularPromedio() como metodo ABSTRACTO.
    //         Cada modalidad pondera distinto, asi que aqui no hay formula posible.
    //         Pista: public abstract double calcularPromedio();

    public boolean aprobo() {
        return calcularPromedio() >= 13;
    }

    public void mostrar() {
        System.out.println(codigo + " - " + nombre
                + " | Promedio: " + calcularPromedio()
                + " | " + (aprobo() ? "APROBADO" : "DESAPROBADO"));
    }
}
