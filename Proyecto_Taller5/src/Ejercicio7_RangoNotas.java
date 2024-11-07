
import java.util.Scanner;

/***
 * Rango de Notas: Asignar una letra (A, B, C, D) a una calificación en 
 * función de su rango (A para 90-100, B para 80-89, etc.).
 * @author Juan Jose Calva
 */
public class Ejercicio7_RangoNotas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int calificacion;
        char letra;
        System.out.println(" Ingrese la claficacion: ");
        calificacion = tcl.nextInt();
        if (calificacion >= 90 && calificacion <= 100) {
            letra = 'A';
        } else if (calificacion >= 80 && calificacion < 89) {
            letra = 'B';
        } else if (calificacion >= 70 && calificacion <79) {
            letra = 'C';
        } else if (calificacion >= 60 && calificacion <69) {
            letra = 'D';
        } else {
            letra = 'F';
        }
        System.out.println("La calificacion en letra es: " + letra);
    }
 
}
/***
 * run:
 * Ingrese la claficacion: 
 * 90
 * La calificacion en letra es: A
 */