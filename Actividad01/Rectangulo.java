public class Rectangulo implements FigGeometrica {
    private String nombre;
    private double base;
    private double altura;
    private int x;
    private int y;

    public Rectangulo(String nombre, double base, double altura) {
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
        this.x = 0;
        this.y = 0;
    }

    // TODO 2: implementa los cuatro metodos del contrato con @Override.
    //         dibujar()  -> imprime nombre, base y altura
    //         ampliar()  -> multiplica base y altura por el factor
    //         mover()    -> cambia x e y, e imprime la nueva posicion
    //         eliminar() -> imprime que la figura se elimino

    public double area() {
        return base * altura;
    }
}
