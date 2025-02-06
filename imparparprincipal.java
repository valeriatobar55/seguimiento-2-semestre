import java.util.Scanner;

public class imparparprincipal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Digite un numero: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Holaa :) " + nombre);
        System.out.println("su numero es: " + numero);

        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else
            System.out.println("El numero es impar");
    }

}
