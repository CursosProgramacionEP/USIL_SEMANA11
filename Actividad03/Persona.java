public class Persona {
    protected String nombre;
    protected String direccion;
    protected String fechaNacimiento;
    protected char sexo;

    public Persona(String nombre, String direccion, String fechaNacimiento, char sexo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return nombre + " | " + direccion + " | " + fechaNacimiento + " | " + sexo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Persona)) return false;
        Persona otra = (Persona) obj;
        return nombre.equals(otra.nombre) && fechaNacimiento.equals(otra.fechaNacimiento);
    }

    public void imprimir() {
        System.out.println("Persona: " + toString());
    }
}
