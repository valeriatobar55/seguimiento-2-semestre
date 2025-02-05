import java.util.Scanner;

public class Clasificadorprincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero porfis: ");
        int numero = sc.nextInt();

        if (numero < 0)
            System.out.println("El numero es negativo");
        else if (numero > 0)
            System.out.println("El numero es positivo");

    }

}
