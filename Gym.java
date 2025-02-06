import java.util.Scanner;

public class GymCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Definir los precios de los planes
        final int PRECIO_15_DIAS = 18000;
        final int PRECIO_30_DIAS = 35000;
        final int PRECIO_3_MESES = 86000;
        
        // Mostrar menú de opciones
        System.out.println("Bienvenido a la calculadora de costos del gimnasio");
        System.out.println("Seleccione el plan deseado:");
        System.out.println("1. Plan 15 días - $" + PRECIO_15_DIAS);
        System.out.println("2. Plan 30 días - $" + PRECIO_30_DIAS);
        System.out.println("3. Plan 3 meses - $" + PRECIO_3_MESES);
        System.out.print("Ingrese el número de la opción deseada: ");
        
        int opcion = scanner.nextInt();
        int costo = 0;
        String plan = "";
        
        // Calcular el costo según la opción seleccionada
        switch (opcion) {
            case 1:
                costo = PRECIO_15_DIAS;
                plan = "15 días";
                break;
            case 2:
                costo = PRECIO_30_DIAS;
                plan = "30 días";
                break;
            case 3:
                costo = PRECIO_3_MESES;
                plan = "3 meses";
                break;
            default:
                System.out.println("Opción no válida");
                scanner.close();
                return;
        }
        
        // Mostrar resultado
        System.out.println("\nResumen de su selección:");
        System.out.println("Plan seleccionado: " + plan);
        System.out.println("Costo total: $" + costo);
        
        scanner.close();
    }
          }
