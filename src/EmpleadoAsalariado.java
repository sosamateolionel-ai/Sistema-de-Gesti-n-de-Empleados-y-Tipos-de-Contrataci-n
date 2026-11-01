public class EmpleadoAsalariado extends Empleado {
    private double sueldoMensual;

    public EmpleadoAsalariado(String nombre, String dni, int legajo, double sueldoMensual) {
        super(nombre, dni, legajo);
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularSalario() {
        return sueldoMensual;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Tipo: Asalariado" +
                " | Sueldo mensual: $" + String.format("%.2f", calcularSalario());
    }
}