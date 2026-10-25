public class EmpleadoContratado extends Empleado {
    private double sueldoMensual;

    public EmpleadoContratado(int codigo, String nombre, String dni, double sueldoMensual) {
        super(codigo, nombre, dni);
        this.sueldoMensual = sueldoMensual;
    }

    @Override                       // obligatorio: calcularSueldo() era abstracto
    public double calcularSueldo() {
        return sueldoMensual;
    }

    @Override
    public void mostrar() {
        super.mostrar();            // reutiliza lo que ya imprime Empleado
        System.out.println("  Contratado - Sueldo: S/ " + calcularSueldo());
    }
}
