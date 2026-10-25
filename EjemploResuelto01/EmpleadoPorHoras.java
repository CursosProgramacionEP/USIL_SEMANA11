public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double tarifaHora;

    public EmpleadoPorHoras(int codigo, String nombre, String dni,
                            int horasTrabajadas, double tarifaHora) {
        super(codigo, nombre, dni);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * tarifaHora;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("  Por horas - Sueldo: S/ " + calcularSueldo());
    }
}
