/***
 * Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
	5/10
	10/12
	15/14
	20/16
	25/18
	30/20
 */
import java.util.Scanner;
public class Problema2_Serie {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Ingrese el valor inicial del numerador: ");
        int numerador = tcl.nextInt();
        System.out.print("Ingrese el valor inicial del denominador: ");
        int denominador = tcl.nextInt();
        System.out.print("Ingrese el valor final del numerador: ");
        int limite = tcl.nextInt();
        while (numerador <= limite) {
            System.out.println(numerador + "/" + denominador);
            numerador += 5;
            denominador += 2;
        }
    }
}

/***
 * run:
 * Ingrese el valor inicial del numerador: 5
 * Ingrese el valor inicial del denominador: 10
 * Ingrese el valor final del numerador: 30
 * 5/10
 * 10/12
 * 15/14
 * 20/16
 * 25/18
 * 30/20
 */