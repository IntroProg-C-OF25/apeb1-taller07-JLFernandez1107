/***
 * Problema 5
 * Generar un programa Java que permita ingresar 4 estudiantes; por cada uno de ellos ingresar el nombre del estudiante,
 *  el promedio de ciclo. Presentar el siguiente reporte
 * | Estudiante 1 | 10  |   Aprobado  |
 * | Estudiante 2 | 6.9 |   Reprobado |
 * | Estudiante 3 | 7   |   Aprobado  |
 * | Estudiante 4 | 5   |   Reprobado |
 * Atención; con base al valor del promedio, usted debe asignar en cada registro el tipo Aprobado o Reprobado.
 */
import java.util.Scanner;
public class Problema5_PromediosEstudiantes {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre, estado;
        double promedio;
        int contador = 1;
        while(contador <= 4){
            System.out.println("DAME NOMBRES Y PROMEDIO DEL EST_" + contador + ": ");
            nombre = tcl.next();
            promedio = tcl.nextDouble();
            if (promedio < 7)
                estado = "Reprobado";
            else
                estado = "aprobado";
            System.out.printf("| %s\t| %s | %s\t|\n", "NOMBRE", "PROMEDIO", "ESTADO");
            System.out.printf("| %s\t| %.2f\t   | %s\t|\n", nombre, promedio, estado);
            contador++;
        }
    }
}
/***
 * 
 */