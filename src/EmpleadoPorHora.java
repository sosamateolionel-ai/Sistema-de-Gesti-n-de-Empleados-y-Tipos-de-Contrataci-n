public class EmpleadoPorHora extends Empleado {
    private static final int HORAS_NORMALES = 160;   // tope mensual sin recargo
    private static final double RECARGO_EXTRA = 1.5; // horas extra pagadas al 150%

    private double tarifaPorHora;
    private int horasTrabajadas;

    public EmpleadoPorHora(String nombre, String dni, int legajo,
                           double tarifaPorHora, int horasTrabajadas) {
        super(nombre, dni, legajo);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        if (horasTrabajadas <= HORAS_NORMALES) {
            return tarifaPorHora * horasTrabajadas;
        }
        int horasExtra = horasTrabajadas - HORAS_NORMALES;
        return (tarifaPorHora * HORAS_NORMALES)
                + (tarifaPorHora * RECARGO_EXTRA * horasExtra);
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Tipo: Por hora" +
                " | Tarifa: $" + String.format("%.2f", tarifaPorHora) +
                " | Horas: " + horasTrabajadas +
                " | Sueldo: $" + String.format("%.2f", calcularSalario());
    }
}