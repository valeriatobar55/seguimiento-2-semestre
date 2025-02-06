package Automovil;

import java.util.Scanner;

public class AutomovilPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema de Verificación de Modelos 2024");
        System.out.println("--------------------------------------");

        System.out.println("Por favor, ingrese el número de modelo de su automóvil:");
        int numeroModelo = scanner.nextInt();

        // Crear instancia de Automovil
        Automovil automovil = new Automovil(numeroModelo);

        // Mostrar resultado
        System.out.println("\nResultado del diagnóstico:");
        System.out.println(automovil.obtenerMensajeEstado());

        scanner.close();
    }
}
