/**
 * Pedidos online: Desarrollar una solución que imprima 
 * el costo de un pedido de un artículo del cual se tiene la descripción,
 * la cantidad que se requiere y el precio unitario. Si la cantidad pedida
 * excede de 50 unidades, se hace un descuento de 15%.
 * @author Adrian Cuenca
 */
import java.util.Scanner;
public class Ejercicio11_Pedidosonline {
    public static void main(String[] args) {
        String descripcion, precioFormat, pagarFormat;
        int cantRqda;
        double precUnitario, pagar;
        boolean descuento;
        Scanner tcl = new Scanner(System.in);
        System.out.print("INGRESE DESCRIPCION DEL PRODUCTO: ");
        descripcion = tcl.nextLine();
        System.out.print("INGRESE LA CANTIDAD REQUEIRDA: ");
        cantRqda = tcl.nextInt();
        System.out.print("INGRESE EL PRECIO POR UNIDAD: ");
        precUnitario = tcl.nextDouble();
        pagar = precUnitario * cantRqda;
        
        //APLICAMOS DESCUENTO EN CASO DE SER NECESARIO
        descuento = (cantRqda > 50);
        if (descuento)
            pagar *= 0.85;
        
        //DAMOS UN FORMATO AL PRECIO UNITARIO Y A EL COSTO TOTAL
        if (precUnitario < 1)   //MOSTRAR EL PRECIO EN CTV SI ES MENOR DE $1
            precioFormat = String.format("%.0f centavos", precUnitario * 100);
        else //MOSTRAR EL PRECIO UNITARIO EN DOLARES SI ES MAYOR O IGUAL A $1
            precioFormat = String.format("%.2f", precUnitario);
        
        //DANOS UN FORMATO AL COSTO TOTAL PARA QUE SE PRESENTE EN DOLARES
        pagarFormat = String.format("$%.2f", pagar);
        
        //SE MUESTRA EL RESUMEN
        System.out.println("RESUMEN DE SU PEDIDO");
        System.out.println("DESCRIPCION DEL PRODUCTO: " + descripcion);
        System.out.println("CANTIDAD PEDIDA: " + cantRqda);
        System.out.println("PRECIO POR UNIDAD: $" + precUnitario);
        
        //MOSTRAR SI CUENTA CON DESCUENTO
        if (descuento)
                System.out.println("SE APLICA DESCUENTO DEL 15%");
        
        System.out.println("TOTAL A PAGAR: " + pagarFormat);
    }
}
/***
 *run-single:
 * INGRESE DESCRIPCION DEL PRODUCTO: TV PLASMA
 * INGRESE LA CANTIDAD REQUEIRDA: 55
 * INGRESE EL PRECIO POR UNIDAD: 200
 * RESUMEN DE SU PEDIDO
 * DESCRIPCION DEL PRODUCTO: TV PLASMA
 * CANTIDAD PEDIDA: 55
 * PRECIO POR UNIDAD: $200.0
 * SE APLICA DESCUENTO DEL 15%
 * TOTAL A PAGAR: $9350,00
 * BUILD SUCCESSFUL (total time: 13 seconds)
 */