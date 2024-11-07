import java.util.Scanner;

/***
 * Día de la Semana: Mostrar el nombre del día de la semana en función 
 * del número ingresado (1 para lunes, 2 para martes, etc.).
 * @author Juan Jose Calva
 */
public class Ejercicio2_DíaSemana {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int numDia;
        System.out.print("DAME EL NUM. DE DIA: ");
        numDia = tcl.nextInt();
        //ESTRUCTURA DE CONTROL DE SELECCION MULTIPLE
        //EN CASO DE <=> switch
        switch (numDia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("martes");
                break;
            case 3:
                System.out.println("miercoles");
                break;
            case 4:
                System.out.println("jueves");
                break;
            default:
                System.out.println("Error en el numero");
        }
    }

}
/***
 * run:
 * DAME EL NUM. DE DIA: 3
 * miercoles
 */