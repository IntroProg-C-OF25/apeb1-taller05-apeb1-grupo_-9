
import java.util.Scanner;

/***
 * Edad para Votar: Determinar si una persona es elegible 
 * para votar en función de su edad (mayor o igual a 18 años).
 * @author Juan Jose Calva
 */
public class Ejercicio1_EdadVotar {
    public static void main(String[] args) {
        int edad;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Dame Edad: ");
        edad = tcl.nextInt();
        if (edad >= 18)
            System.out.println("Si puede votar");
        else
            System.out.println("No puede votar");
    }
}
/***
 * run:
 * Dame Edad: 20
 * Si puede votar
 */