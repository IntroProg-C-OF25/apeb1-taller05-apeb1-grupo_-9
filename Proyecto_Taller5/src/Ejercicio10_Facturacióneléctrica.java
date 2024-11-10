
import java.util.Scanner;

/***
 * Facturación eléctrica: Desarrollar una solución que permita calcular y 
 * mostrar el valor a cancelar de una planilla de luz. Se debe ingresar el 
 * valor de costo por kilovatio/hora y el número de kilovatios consumidos en el
 * mes. Si el usuario tiene edad mayor a 65 años, se debe descontar el 10% por 
 * pertenecer a la tercera edad.
 * @author Juan Jose Calva
 */
public class Ejercicio10_Facturacióneléctrica {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costoxkilovatio, kiloconsumido, valortotal;
        int edad;
        System.out.print("Ingrese el costo de kilovatio/hora:  ");
        costoxkilovatio = tcl.nextDouble();
        System.out.print("Ingrese el numero de kilovatios consumidos en el mes: ");
        kiloconsumido = tcl.nextDouble(); 
        System.out.print("Ingrese su edad: ");
        edad = tcl.nextInt();
        valortotal = costoxkilovatio * kiloconsumido;
        if (edad > 65) {
            valortotal *=0.9;
        }
        System.out.println("El valor de la planilla es: $" + valortotal);
        }
    }
/***
 * Ingrese el costo de kilovatio/hora:  10
 * Ingrese el numero de kilovatios consumidos en el mes: 20
 * Ingrese su edad: 66
 * El valor de la planilla es: $180.0
 */
