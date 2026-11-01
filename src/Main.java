//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Empleado e1 = new EmpleadoAsalariado("Laura Gómez", "30123456", 101, 850000);
    Empleado e2 = new EmpleadoPorHora("Carlos Pérez", "35987654", 202, 4500, 175);

    Empleado[] empleados = { e1, e2 };

    System.out.println("=== LIQUIDACIÓN DE SUELDOS ===");
    double total = 0;
    for (Empleado e : empleados) {
        System.out.println(e);
        total += e.calcularSalario();
    }
    System.out.println("------------------------------");
    System.out.printf("Total a pagar: $%.2f%n", total);

}
