package Computadora;

import java.util.Scanner;

public class ComputadoraPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Diagnóstico de Computadora");
        System.out.println("--------------------------");

        System.out.println("¿La computadora emite un pitido al iniciarse? (true/false):");
        boolean emitePitido = scanner.nextBoolean();

        System.out.println("¿El disco duro gira? (true/false):");
        boolean discoGira = scanner.nextBoolean();

        // Crear instancia de Computadora
        Computadora computadora = new Computadora(emitePitido, discoGira);

        // Mostrar diagnóstico
        System.out.println("\nDiagnóstico:");
        System.out.println(computadora.diagnosticar());

        scanner.close();
    }
}
