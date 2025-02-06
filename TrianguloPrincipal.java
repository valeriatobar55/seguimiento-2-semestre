package Triangulo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer ángulo:");
        int angulo1 = scanner.nextInt();

        System.out.println("Ingrese el segundo ángulo:");
        int angulo2 = scanner.nextInt();

        System.out.println("Ingrese el tercer ángulo:");
        int angulo3 = scanner.nextInt();

        // Crear instancia de Triangulo
        Triangulo triangulo = new Triangulo(angulo1, angulo2, angulo3);

        // Verificar si es válido
        if (triangulo.esValido()) {
            System.out.println("El triángulo es válido.");
        } else {
            System.out.println("El triángulo no es válido.");
        }

        scanner.close();
    }
}