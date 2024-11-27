/***
 * Una empresa de comercialización de computadoras realiza el proceso de venta haciendo un descuento por tipo de cliente:
 * Si es cliente tipo 1 hay un descuento del 10%
 * Si es cliente tipo 2 hay un descuento del 20%
 * En caso que sea otro tipo de cliente, no hay descuento.
 * Generar un proceso que permita ingresar 7 ventas: por cada venta preguntar los siguiente datos:
 * - Nombre del cliente
 * - Costo de la computadora (solo se vende una computadora por transacción)
 * - Tipo de cliente
 * Presentar el siguiente reporte:
 * Cliente tipo 1, compra computadora con precio $100
 */
import java.util.Scanner;
public class Problema6_ComercialCompu {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre;
        double costo;
        int tipo;
        double descuento;
        int i = 1;
        while(i < 3){
            System.out.println("INGESA EL NOMBRE DEL CLIENTE, COSTO PC, TIPO DE CLIENTE: ");
            nombre = tcl.next();
            costo = tcl.nextFloat();
            tipo = tcl.nextInt();
            if (tipo == 1){
                descuento = costo * 0.1;
            }else if (tipo == 2){
                descuento = costo * 0.2;
            }else {
                descuento = 0;
            }
            costo = costo-descuento;
            System.out.println("CLIENTE TIPO" + tipo + "COMPRA PC CON PRECIO: $" + costo);
            i ++;
        }
    }
}
/***
 * INGESA EL NOMBRE DEL CLIENTE, COSTO PC, TIPO DE CLIENTE: 
 * A 100 1
 * CLIENTE TIPO1COMPRA PC CON PRECIO: $90.0
 */