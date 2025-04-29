package getyset;

import java.util.Scanner;


public class Main {

    /**
     * Arranca la aplicacion
     */
    public static void main(String[] args) {
        double totalApagar;

        Scanner entrada = new Scanner(System.in); // Corregido: 'new' añadido

        System.out.print("Introduzca la cantidad de artículos: ");
        double cant = entrada.nextDouble(); // Corregido: variable 'cant' declarada

        System.out.print("Introduzca el precio: ");
        double price = entrada.nextDouble(); // Corregido: variable 'price' declarada

        System.out.println("cantidad: " + cant); // Corregido: 'cantida' a 'cantidad'

        Facturar miFactura = new Facturar(cant, price); // Corregido: 'new' añadido
        totalApagar = miFactura.calcularventa(); // Corregido: asignación a 'totalApagar' y nombre del método

        System.out.println("El total de la factura es: " + totalApagar);
    }
}
