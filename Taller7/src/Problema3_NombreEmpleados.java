
/** *
 * Realizar un programa Java que permita pedir por teclado el nombre de 5 empleados.
 * Por cada empleado se debe solicitar el nombre, numero de días trabajados y costo del día trabajo.
 * Calcular el valor a cancelar por la empresa para cada empleado.
 **Presentar un reporte como el siguiente:**
|  | | | |
| --- | --- | ----- | --- |
| Nombre 1 | 10 |   $2.5 | $25 |
| Nombre 2 | 11 |   $2 | $22 |
| Nombre 3 |  9  |  $3  | $27 |
| Nombre 4 |  5  |   $4 | $20 |
| Nombre 5 | 12 |   $2 | $24 |
 */
import java.util.Scanner;
public class Problema3_NombreEmpleados {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int contador = 1;
        int totalEmpleados = 5;
        System.out.println("| Nombre   | Dias Trabajados | Costo por Dia | Total a Pagar |");
        while (contador <= totalEmpleados) {
            System.out.print("Ingrese el nombre del empleado " + contador + ": ");
            String nombre = tcl.next();
            System.out.print("Ingrese el numero de dias trabajados por " + nombre + ": ");
            int diasTrabajados = tcl.nextInt();
            System.out.print("Ingrese el costo por dia trabajado para " + nombre + ": ");
            double costoDia = tcl.nextDouble();
            double totalPagar = diasTrabajados * costoDia;
            System.out.printf("| %-8s | %15d | %14.2f | %13.2f |", nombre, diasTrabajados, costoDia, totalPagar);
            contador++;
        }
    }
}
/***
 * run:
 * | Nombre   | Dias Trabajados | Costo por Dia | Total a Pagar |
 * Ingrese el nombre del empleado 1: waza
 * Ingrese el numero de dias trabajados por waza: 10
 * Ingrese el costo por dia trabajado para waza: 15
 * | waza     |              10 |          15,00 |        150,00 |Ingrese el nombre del empleado 2: asd
 * Ingrese el numero de dias trabajados por asd: 5
 * Ingrese el costo por dia trabajado para asd: 15
 * | asd      |               5 |          15,00 |         75,00 |Ingrese el nombre del empleado 3: qwe
 * Ingrese el numero de dias trabajados por qwe: 6
 * Ingrese el costo por dia trabajado para qwe: 15
 * | qwe      |               6 |          15,00 |         90,00 |Ingrese el nombre del empleado 4: rty
 * Ingrese el numero de dias trabajados por rty: 3
 * Ingrese el costo por dia trabajado para rty: 15
 * | rty      |               3 |          15,00 |         45,00 |Ingrese el nombre del empleado 5: ujm
 * Ingrese el numero de dias trabajados por ujm: 2
 * Ingrese el costo por dia trabajado para ujm: 15
 * | ujm      |               2 |          15,00 |         30,00
 */