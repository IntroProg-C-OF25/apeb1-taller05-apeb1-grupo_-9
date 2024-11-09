/**
 *Calculo de impuestos: Desarrollar una solución que permita leer
 * los datos de un automóvil (marca, origen y costo) imprima
 * el impuesto por pagar y el precio de venta (incluido el impuesto).
 * Si el origen es Alemania el impuesto es 20%, si es de Japón el impuesto
 * es 30%, si es de Italia, 15%, y si es de USA, 8%
 * @author Adrian Cuenca
 */
import java.util.Scanner;
public class Ejercicio12_Calculoimpuestos {
    public static void main(String[] args) {
        String marca, origen;
        double precioVenta, costo, ivaPagar; 
        Scanner tcl = new Scanner(System.in);
        System.out.print("INGRESE LA MARCA DEL VEHICULO: ");
        marca = tcl.nextLine();
        System.out.print("INGRESE EL PAIS DE ORIGEN DEL VEHICULO: ");
        origen = tcl.nextLine();
        System.out.print("INGRESE EL COSTO DE SU VEHICULO: ");
        costo = tcl.nextDouble();
        ivaPagar = 0; //INICIALIZADA CON 0
        
        //ESTRUCTURA DE CONTROL DE SELECCION MULTIPLE
        //CALCULAMOS EL IMPUESTO SEGUN EL PAIS DE ORIGEN
        switch (origen) {
            case "Alemania" -> ivaPagar = costo *0.20;
            case "Japon" -> ivaPagar = costo * 0.30;
            case "Italia" -> ivaPagar = costo * 0.15;
            case "Estados Unidos", "USA" -> ivaPagar = costo * 0.08;
            default -> System.out.println("ERROR EN EL PAIS DE ORIGEN");
        }
                
        //CALCULAMOS EL PRECIO DE VENTA
        precioVenta = costo + ivaPagar;
                
        //IMPRIMIMOS LOS RESULTADOS
        System.out.println("LA MARCA DEL VEHICULO ES: " + marca);
        System.out.println("EL IMPUESTO A PAGAR ES: $" + String.format("%.2f", costo));
        System.out.println("EL PRECIO DE VENTA (INCLUIDO IMPUESTO) ES: " + String.format("%.2f", precioVenta));
                   
    }
}
/***
 * run-single:
 * INGRESE LA MARCA DEL VEHICULO: Mazda
 * INGRESE EL PAIS DE ORIGEN DEL VEHICULO: USA
 * INGRESE EL COSTO DE SU VEHICULO: 15000
 * LA MARCA DEL VEHICULO ES: Mazda
 * EL IMPUESTO A PAGAR ES: $15000,00
 * EL PRECIO DE VENTA (INCLUIDO IMPUESTO) ES: 16200,00
 * BUILD SUCCESSFUL (total time: 10 seconds)
 */
