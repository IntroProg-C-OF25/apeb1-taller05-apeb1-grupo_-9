
import java.util.Scanner;

/***
 * Descuento en Compras: Calcular el precio final de un producto con un 
 * descuento del 10% si el precio original es mayor de $100; de lo contrario, 
 * no hay descuento.
 * @author Juan Jose Calva
 */
public class Ejercicio4_DescuentoCompras {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double preciooriginal, preciofinal;
        System.out.print("Ingrese el precio original del producto: ");
        preciooriginal = tcl.nextDouble(); 
        if (preciooriginal > 100) {
            preciofinal = preciooriginal* 0.9;
        } else {
            preciofinal = preciooriginal;
        }
        System.out.println("El precio final del producto es: " + preciofinal);
    }
}
/***
 * run:
 * Ingrese el precio original del producto: 120
 * El precio final del producto es: 108.0
 */