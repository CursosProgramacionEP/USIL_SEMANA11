public class Triangulo implements FigGeometrica {
    private String nombre;
    private double base;
    private double altura;
    private int x;
    private int y;

    public Triangulo(String nombre, double base, double altura) {
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
        this.x = 0;
        this.y = 0;
    }

    // TODO 3: implementa los cuatro metodos del contrato con @Override.
    //         Son los mismos nombres que en Rectangulo, pero el mensaje cambia.

    public double area() {
        return (base * altura) / 2;
    }
}
