/**
 *Mayor de tres números: Dados tres números, determinar cuál es el mayor.
 * Si son iguales, mostrar un mensaje.
 * @author Adrian Cuenca
 */
import java.util.Scanner;
public class Ejercicio3_MayorNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, num3;
        System.out.print("DAME EL PRIMER NUMERO: ");
        num1 = teclado.nextInt();
        System.out.print("DAME EL SEGUNDO NUMERO: ");
        num2 = teclado.nextInt();
        System.out.print("DAME EL TERCER NUMERO: ");
        num3 = teclado.nextInt();        
        if (num1 > num2 && num1 > num3)
                System.out.println("EL NUMERO MAYOR ES: " + num1);
                else if (num2 > num1 && num2 > num3)
                    System.out.println("EL NUMERO MAYOR ES: " + num2);
                    else if (num3 > num1 && num3 > num2)
                        System.out.println("EL NUMERO MAYOR ES: " +  num3);
                    else if (num1 == num2 && num1 == num3)
                            System.out.println("LOS NUMERO SON IGUALES");
    }
    
}
/***
 * run-single:
 * DAME EL PRIMER NUMERO: 2
 * DAME EL SEGUNDO NUMERO: 5
 * DAME EL TERCER NUMERO: 3
 * EL NUMERO MAYOR ES: 5
 * BUILD SUCCESSFUL (total time: 6 seconds)
 */