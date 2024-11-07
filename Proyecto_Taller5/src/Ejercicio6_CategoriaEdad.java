
import java.util.Scanner;

/***
 * Categoría de Edad: Clasificar a una persona en una categoría de edad 
 * (niño, adolescente, adulto) en función de su edad.
 * @author Juan Jose Calva
 */
public class Ejercicio6_CategoriaEdad {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int edad;
        String categoria; 
        System.out.print("Ingresa tu edad: ");
        edad = tcl.nextInt();
        if (edad <=12) {
            categoria = "Niño";
        } else if (edad >= 13 && edad <= 17) {
            categoria = "Adolecente";
        } else { 
            categoria = "Adulto";
        }
        System.out.println("La categoria de edad es: " + categoria);
        }
    }
/***
 * run:
 * Ingresa tu edad: 17
 * La categoria de edad es: Adolecente
 */
