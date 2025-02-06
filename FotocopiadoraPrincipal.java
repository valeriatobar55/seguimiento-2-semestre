package Impresion;
import java.util.Scanner;
public class FotocopiadoraPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de copias que desea imprimir:");
        int cantidadCopias = scanner.nextInt();

        // Crear instancia de Fotocopiadora
        Fotocopiadora fotocopiadora = new Fotocopiadora(cantidadCopias);

        // Mostrar resultados
        System.out.println("\nResumen de su pedido:");
        System.out.println("Cantidad de copias: " + fotocopiadora.getCantidadCopias());
        System.out.println("Precio por copia: $" + fotocopiadora.getPrecioPorCopia());
        System.out.println("Precio total: $" + fotocopiadora.getPrecioTotal());

        scanner.close();
    }
}
