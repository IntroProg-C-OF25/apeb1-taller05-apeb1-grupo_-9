/**
 * Año Bisiesto: Comprobar si un año ingresado es bisiesto o no.
 * Si es bisiesto, mostrar un mensaje especial.
 * @author Adrian Cuenca
 */
import java.util.Scanner;
public class Ejercicio5_AñoBisiesto {
    public static void main(String[] args) {
        int año;
        Scanner tcl = new Scanner(System.in);
        System.out.print("INGRESE UN AÑO: ");
        año = tcl.nextInt();
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0))
                System.out.println("!EL AÑO INGRESADO ES BICIESTO!");
                else System.out.println("EL AÑO NO ES BICIESTO");                       
    }
    
}
/***
 * run-single:
 * INGRESE UN A�O: 2024
 * !EL A�O INGRESADO ES BICIESTO!
 * BUILD SUCCESSFUL (total time: 4 seconds)
 */