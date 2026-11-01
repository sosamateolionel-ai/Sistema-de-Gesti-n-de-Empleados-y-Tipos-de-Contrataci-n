public abstract class Empleado {
    protected String nombre;
    protected String dni;
    protected int legajo;

    public Empleado(String nombre, String dni, int legajo) {
        this.nombre = nombre;
        this.dni = dni;
        this.legajo = legajo;
    }

    // Cada subclase aplica sus propias reglas de retribución

    public abstract double calcularSalario();

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public int getLegajo() { return legajo; }

    @Override
    public String toString() {
        return "Legajo: " + legajo +
                " | Nombre: " + nombre +
                " | DNI: " + dni;
    }
}