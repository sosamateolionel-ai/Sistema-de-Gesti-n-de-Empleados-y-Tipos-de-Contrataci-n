# Sistema de Gestión de Empleados y Tipos de Contratación

## Descripción

Este proyecto implementa un sistema de gestión de empleados utilizando herencia y polimorfismo en Java. Permite representar diferentes tipos de contratación, como empleados asalariados y empleados por hora, reutilizando los atributos y comportamientos comunes de una clase base abstracta.

Cada tipo de empleado calcula su salario aplicando reglas específicas según su modalidad de contratación.

## Funcionamiento

El programa realiza las siguientes operaciones:

1. Crea un empleado asalariado llamado `Laura Gómez`, con un sueldo mensual de $850.000.
2. Crea un empleado por hora llamado `Carlos Pérez`, con una tarifa de $4.500 y 175 horas trabajadas.
3. Almacena ambos empleados en un arreglo de tipo `Empleado`.
4. Recorre el arreglo utilizando un ciclo `for`.
5. Muestra los datos de cada empleado y el salario calculado.
6. Acumula los salarios individuales y muestra el total a pagar por la empresa.

Para los empleados por hora, las primeras 160 horas se pagan con la tarifa normal y las horas adicionales se remuneran con un recargo del 50%.

## Clases principales

### Clase abstracta `Empleado`

Es la clase base de la jerarquía. Contiene los atributos y comportamientos comunes a todos los empleados.

**Atributos:**
- `nombre`: nombre completo del empleado.
- `dni`: documento nacional de identidad.
- `legajo`: número identificador del empleado.

**Métodos principales:**
- `Empleado(String nombre, String dni, int legajo)`: constructor que inicializa los datos generales.
- `calcularSalario()`: método abstracto que obliga a las clases hijas a implementar su propia fórmula de cálculo.
- `getNombre()`, `getDni()` y `getLegajo()`: permiten consultar los datos del empleado.
- `toString()`: devuelve una representación textual de la información del empleado.

### Clase `EmpleadoAsalariado`

Hereda de `Empleado` y representa a los trabajadores que reciben un sueldo mensual fijo.

**Atributo:**
- `sueldoMensual`: remuneración mensual del empleado.

**Métodos principales:**
- `EmpleadoAsalariado(...)`: inicializa los datos heredados mediante `super()` y establece el sueldo mensual.
- `calcularSalario()`: devuelve el sueldo mensual establecido.
- `toString()`: sobrescribe el método para mostrar los datos generales, el tipo de contratación y el sueldo.

### Clase `EmpleadoPorHora`

Hereda de `Empleado` y representa a los trabajadores cuya remuneración depende de las horas trabajadas.

**Atributos:**
- `HORAS_NORMALES`: constante que establece el límite de 160 horas normales mensuales.
- `RECARGO_EXTRA`: constante que establece un recargo del 50% para las horas adicionales.
- `tarifaPorHora`: valor que se paga por cada hora normal.
- `horasTrabajadas`: cantidad de horas trabajadas durante el mes.

**Métodos principales:**
- `EmpleadoPorHora(...)`: inicializa los datos generales y específicos del empleado.
- `calcularSalario()`: calcula el sueldo según las horas normales y las horas extra.
- `toString()`: sobrescribe el método para mostrar los datos del empleado, su tarifa, las horas trabajadas y el salario calculado.

### Clase `Main`

Contiene el método `main()` y permite crear los empleados, almacenarlos en un arreglo, calcular sus salarios y mostrar la liquidación total.

## Conceptos de programación utilizados

- **Herencia:** las clases `EmpleadoAsalariado` y `EmpleadoPorHora` heredan los atributos y métodos de `Empleado`.
- **Abstracción:** `Empleado` es una clase abstracta que define una estructura común sin implementar el cálculo específico del salario.
- **Polimorfismo:** se utiliza un arreglo de tipo `Empleado` para almacenar objetos de diferentes subclases.
- **Sobrescritura (`@Override`):** cada clase hija implementa su propia versión de `calcularSalario()` y `toString()`.
- **Constructores y `super()`:** permiten reutilizar el constructor de la clase base.
- **Constantes (`static final`):** definen las horas normales y el recargo por horas extra.
- **Arreglos y ciclos:** permiten recorrer los empleados y procesar sus salarios.
- **Acumuladores:** se utiliza una variable para calcular el total de salarios que debe pagar la empresa.

## Tecnologías utilizadas

- Java.
- IntelliJ IDEA.
- Programación orientada a objetos (POO).

## Ejecución

<img width="1009" height="166" alt="Captura de pantalla de 2026-11-01 01-16-35" src="https://github.com/user-attachments/assets/b519424b-2916-4a06-a0e6-61332e97b150" />

## Resultado esperado

El empleado asalariado recibe un sueldo de $850.000.

El empleado por hora trabaja 175 horas:
- 160 horas normales: $720.000.
- 15 horas extra al 150%: $101.250.
- Salario total: $821.250.

El resultado final de la liquidación es:

```text
=== LIQUIDACIÓN DE SUELDOS ===
Legajo: 101 | Nombre: Laura Gómez | DNI: 30123456 | Tipo: Asalariado | Sueldo mensual: $850000,00
Legajo: 202 | Nombre: Carlos Pérez | DNI: 35987654 | Tipo: Por hora | Tarifa: $4500,00 | Horas: 175 | Sueldo: $821250,00
------------------------------
Total a pagar: $1671250.00
```

*Nota: el separador decimal puede variar según la configuración regional de Java.*

## Objetivo del ejercicio

Aplicar herencia, abstracción y polimorfismo para desarrollar un sistema de empleados que permita reutilizar atributos comunes y especializar el cálculo de salarios según el tipo de contratación.

## Estructura del proyecto

```text
SistemaEmpleados/
├── src/
│   ├── Empleado.java
│   ├── EmpleadoAsalariado.java
│   ├── EmpleadoPorHora.java
│   └── Main.java
└── README.md
```

