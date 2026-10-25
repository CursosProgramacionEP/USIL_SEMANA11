public abstract class Empleado {
    protected int codigo;          // protected: las subclases tambien lo usan
    protected String nombre;
    protected String dni;

    public Empleado(int codigo, String nombre, String dni) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.dni = dni;
    }

    // Metodo abstracto: solo la cabecera, termina en punto y coma.
    // Obliga a que CADA subclase escriba su propia version.
    public abstract double calcularSueldo();

    // Metodo concreto: se hereda tal cual, ya tiene cuerpo.
    public void mostrar() {
        System.out.println("Codigo: " + codigo + " | Nombre: " + nombre + " | DNI: " + dni);
    }
}
