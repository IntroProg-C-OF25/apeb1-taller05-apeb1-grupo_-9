
import java.util.Scanner;

/***
 * Sistema de reservas hoteleras: En una hosteria de la ciudad de Loja se hace
 * un descuento del 10% si el cliente se hospeda más de 5 días, del 15% si se 
 * hospeda más de 10 días y del 20% si se hospeda más de 15 días. Elaborar un 
 * solución que pida como datos de entrada el número de días y el precio diario
 * de la habitación y luego calcule e imprima el subtotal por pagar, el 
 * descuento y el total por pagar.
 * @author Juan Jose Calva
 */
public class Ejercicio13_Sistemahoteleras {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int dias;
        double preciodiario, subtotal, descuento = 0, total;
        
        System.out.print("Ingrese el numero de dias de hospedaje; ");
        dias = tcl.nextInt();
        System.out.print("Ingrese el precio diario de la habitacion: ");
        preciodiario = tcl.nextDouble();
        
        subtotal = dias * preciodiario;
        if (dias > 15) {
            descuento = subtotal * 0.2; 
        } else if (dias > 10) {
            descuento = subtotal * 0.15;
        } else if (dias > 5) {
            descuento = subtotal * 0.1;
        }
           total = subtotal - descuento;
           
            System.out.println("Subtotal por pagar: $" + subtotal);
            System.out.println("Descuento aplicado: $" + descuento);
            System.out.println("Total x pagar: $" + total);
    }
        
    }
/***
 * Ingrese el numero de dias de hospedaje; 20
 * Ingrese el precio diario de la habitacion: 100
 * Subtotal por pagar: $2000.0
 * Descuento aplicado: $400.0
 * Total x pagar: $1600.0
 */
