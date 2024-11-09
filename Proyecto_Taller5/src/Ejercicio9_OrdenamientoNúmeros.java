/**
 *Ordenamiento de Tres Números: Dados tres números,
 * ordenarlos en orden ascendente.
 * @author Adrian Cuenca
 */
import java.util.Scanner;
public class Ejercicio9_OrdenamientoNúmeros {
    public static void main(String[] args) {
                int num1, num2, num3, mayor, medio, menor;
        Scanner tcl = new Scanner(System.in);
        System.out.print("INGRESE EL PRIMER NUMERO: ");
        num1 = tcl.nextInt();
        System.out.print("INGRESE EL SEGUNDO NUMERO: ");
        num2 = tcl.nextInt();
        System.out.print("INGRESE EL TERCER NUMERO: ");
        num3 = tcl.nextInt();
        if (num1 <= num2 && num1 <= num3) {
            menor = num1;
            if (num2 <= num3) {
                medio = num2;
                mayor = num3;
            } else {
                medio = num3;
                mayor = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {
            menor = num2;
            if (num1 <= num3) {
                medio = num1;
                mayor = num3;
            } else {
                medio = num3;
                mayor = num1;
            }            
        } else {
            menor = num3;
            if (num1 <= num2) {
                medio = num1;
                mayor = num2;
            } else {
                medio = num2;
                mayor = num1;
            }
        }
        System.out.println("NUMEROS ORDENADOS: " + menor + ", " + medio + ", " + mayor);
    }
}
/***
 * run-single:
 * INGRESE EL PRIMER NUMERO: 7
 * INGRESE EL SEGUNDO NUMERO: 9
 * INGRESE EL TERCER NUMERO: 5
 * NUMEROS ORDENADOS: 5, 7, 9
 * BUILD SUCCESSFUL (total time: 6 seconds)
 */