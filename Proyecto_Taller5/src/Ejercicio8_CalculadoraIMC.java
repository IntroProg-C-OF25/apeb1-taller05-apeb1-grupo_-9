/**
 *Calculadora de IMC: Calcular el índice de masa corporal (IMC) de una persona
 * y clasificarla en función de su valor (bajo peso, peso normal, sobrepeso, etc.).
 * @author Adrian Cuenca 
 */
import java.util.Scanner;
public class Ejercicio8_CalculadoraIMC {
    public static void main(String[] args) {
        double peso, estatura, imc;
        Scanner tcl = new Scanner(System.in);
        System.out.print("INGRESE SU PESO EN KG: ");
        peso = tcl.nextDouble();
        System.out.print("INGRESE SU ESTATURA EN METROS: ");
        estatura = tcl.nextDouble();
        imc = peso / Math.pow(estatura, 2) ;
        System.out.printf("SU INDICE DE MASA CORPORAL ES DE: %.2f", imc);
        if (imc < 18.5)
            System.out.println(" USTED TIENE BAJO PESO");
            else if (imc >= 18.5 && imc <= 24.9)
                System.out.println(" SU PESO ES NORMAL");
            else if (imc >= 25 && imc <= 29.9)
                System.out.println(" USTED TIENE SOBRE PESO");
            else if (imc > 30)
                System.out.println(" USTED TIENE OBESIDAD ");
    }
}
/***
 * run-single:
 * INGRESE SU PESO EN KG: 50
 * INGRESE SU ESTATURA EN METROS: 1,60
 * SU INDICE DE MASA CORPORAL ES DE: 19,53 SU PESO ES NORMAL
 * BUILD SUCCESSFUL (total time: 15 seconds)
 */