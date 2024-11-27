
import java.util.Scanner;


/** *
 * Generar una solución que permita ingresar jugadores de fútbol;
 * por cada jugador se debe solicitar:
 * Nombre el jugador
 * Posición en el campo de juego
 * Edad
 * Estatura
 * El ciclo de ingreso de información deberá terminar cuando el usuario lo decida.
 * Se debe imprimir el siguiente reporte (usar una cadena de acumulación):
 * Listado de Jugadores
 * 1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
 * 2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
 * 3. Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
 * 4. Ángel Mena -Delantero-, edad 32, estatura 1.75
 * 5. Michael Estrada -Delantero-, edad 27, estatura 1.93
 * Promedio de edades:  26.8
 * Promedio de estaturas: 1.87
 */
import java.util.Scanner;
public class Problema4_JugadoresFut {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int contador = 0;
        double sumaEdades = 0;
        double sumaEstaturas = 0;

        System.out.println("Listado de Jugadores");
        String continuar;
        do {
            contador++;
            System.out.print("Ingrese el nombre del jugador: ");
            String nombre = tcl.nextLine();
            System.out.print("Ingrese la posicion en el campo de juego: ");
            String posicion = tcl.nextLine();
            System.out.print("Ingrese la edad del jugador: ");
            int edad = tcl.nextInt();
            System.out.print("Ingrese la estatura del jugador (en metros): ");
            double estatura = tcl.nextDouble();
            tcl.nextLine();
            System.out.printf("%d. %s -%s-, edad %d, estatura %.2f\n", contador, nombre, posicion, edad, estatura);
            sumaEdades += edad;
            sumaEstaturas += estatura;
            System.out.print("Desea ingresar otro jugador? (si/no): ");
            continuar = tcl.nextLine().toLowerCase();
        } while (continuar.equals("si"));
        double promedioEdades = sumaEdades / contador;
        double promedioEstaturas = sumaEstaturas / contador;
        System.out.printf("Promedio de edades: %.1f\n", promedioEdades);
        System.out.printf("Promedio de estaturas: %.2f\n", promedioEstaturas);
    }
}
