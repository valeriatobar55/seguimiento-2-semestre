package Sandwich;

import java.util.Scanner;

public class SandwichOrderPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del sándwich (pequeño/grande): ");
        String tamaño = scanner.nextLine();

        System.out.print("¿Desea tocineta? (true/false): ");
        boolean tocineta = scanner.nextBoolean();

        System.out.print("¿Desea jalapeño? (true/false): ");
        boolean jalapeño = scanner.nextBoolean();

        System.out.print("¿Desea pavo? (true/false): ");
        boolean pavo = scanner.nextBoolean();

        System.out.print("¿Desea queso? (true/false): ");
        boolean queso = scanner.nextBoolean();

        scanner.close();

        SandwichOrder pedido = new SandwichOrder(tamaño, tocineta, jalapeño, pavo, queso);
        System.out.println("El precio total de su pedido es: $" + pedido.calcularPrecio());
    }
}

