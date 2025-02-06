package Celular;
import java.util.Scanner;

public class CeluMovilPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar el operador
        System.out.println("Ingrese su operador (Tigo, Claro, Movistar): ");
        String operador = sc.nextLine();

        // Crear un objeto CeluMovil con el operador elegido
        CeluMovil celuMovil = new CeluMovil(operador);

        // Solicitar los minutos internacionales
        System.out.println("Ingrese los minutos internacionales consumidos: ");
        int minutos = sc.nextInt();

        // Preguntar si tiene paquete de datos
        System.out.println("¿Tiene paquete de datos? (si/no): ");
        sc.nextLine(); // Limpiar el buffer
        String respuesta = sc.nextLine();

        boolean tienePaquete = respuesta.equalsIgnoreCase("si");

        // Calcular el costo total
        double total = celuMovil.calcularCosto(minutos, tienePaquete);

        // Mostrar el resultado
        System.out.println("El costo total es: $" + total);
    }
}
