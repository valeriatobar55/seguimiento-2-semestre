import java.util.Scanner;

public class numerosprincipall {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;

        System.out.println("Ingrese el primer numero: ");
        numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numero2 = sc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        numero3 = sc.nextInt();

        if(numero1 > numero2 && numero1 > numero3){
        System.out.println("El primer numero es el mayor");}
        else if(numero2 > numero1 && numero2 > numero3){
        System.out.println("El segundo numero es el mayor");
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("El tercer numero es el mayor");


        } else if (numero2 == numero1 && numero2 == numero3) {
            System.out.println("los numeros son todos iguales");

        }
    }
    }
