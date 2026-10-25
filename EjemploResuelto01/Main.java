public class Main {
    public static void main(String[] args) {
        // Empleado e = new Empleado(1000, "Generico", "00000000");
        // ERROR de compilacion: Empleado is abstract; cannot be instantiated.
        // Descomenta la linea de arriba para comprobarlo.

        Empleado ana  = new EmpleadoContratado(1001, "Ana Soto", "45871236", 4500);
        Empleado luis = new EmpleadoPorHoras(1002, "Luis Mena", "70125489", 80, 25.0);

        ana.mostrar();
        luis.mostrar();

        double gasto = ana.calcularSueldo() + luis.calcularSueldo();
        System.out.println("Gasto total: S/ " + gasto);
    }
}
