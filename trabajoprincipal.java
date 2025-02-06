import java.util.Scanner;

public class trabajoprincipal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horas1;
        int horas2;
        int pago1;
        int pago2;

        horas1 = 30000;
        horas2 = 33000;

        System.out.println("Ingresa tu nombre");
        String nombre = sc.nextLine();

        System.out.println("Ingresa tus horas trabajadas");
        int horasTrabajadas = sc.nextInt();
        sc.nextLine();

        pago1 = horasTrabajadas * horas1;
        pago2 = horasTrabajadas * horas2;

        String mensaje1 = "señora, " + nombre + " el numero de horas es " + horasTrabajadas + " tu salario es " + pago1;
        String mensaje2 = "señora, " + nombre + " el numero de horas es " + horasTrabajadas + " tu salario es " + pago2;

        pago1 = horasTrabajadas * horas1;


        if (horasTrabajadas <= 10){
            System.out.println(mensaje1);


    }    else if (horasTrabajadas > 10 ){
        System.out.println(mensaje2);}
    }

    }




