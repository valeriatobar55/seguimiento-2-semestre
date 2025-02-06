
import java.util.Scanner;

public class lavadorasprincipal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //creacion de variables valorporhora se refiere a la lavadora pequeña y valorporhoragrandeserefiere a la lavadora grande

        int valorporhoragrande;
        int valorporhora;
        int horas;
        int resultado;
        int resultado2;
        int resultadototal;
        double descuento;
        int descuentofinal;
        int finalizador;
        int resultadograndel;
        int decuentofinalgrande;

        //Dar valor a las variables

        descuento = 0.03;


        valorporhoragrande = 4000;
        valorporhora = 3000;

        // toma de daticos al cliente

        System.out.println("Digite 1 para lavadora grande y 2 para lavadora pequeña");
        int id = sc.nextInt();

        System.out.println("Digite cuantas horas la necesita");
        int hora = sc.nextInt();
        sc.nextLine();


        System.out.println("Digite cuantas lavadoras necesita");
        int lavadora = sc.nextInt();
        sc.nextLine();

        if (id == 1)
            System.out.println("usted eligio la lavadora grande");
        else if (id == 2) {
            System.out.println("Usted eligio la lavadora pequeña");
        }

        // resultados lavadora grandeeeeeeeeeeeeeeeeeeeee

        resultado = hora * valorporhoragrande;
        resultadototal = lavadora * resultado;


        if (id == 1)
            System.out.println(resultado = hora * valorporhoragrande);

        descuentofinal = (int) (resultadototal * descuento);

        if (lavadora <= 1)
            System.out.println(resultadototal = lavadora * resultado);
        else if (lavadora >= 3) {
            System.out.println(finalizador = resultadototal - descuentofinal);

        }


        //resultados de lavadora pequeñita


        resultado2 = hora * valorporhora;
        resultadototal = lavadora * resultado2;
        descuentofinal = (int) (resultadototal * descuento);

        if (lavadora <= 1)
            System.out.println(resultadototal = lavadora * resultado2);

        else if ( lavadora >= 3) {
            System.out.println(finalizador = resultadototal - descuentofinal);
        }


        resultadototal = lavadora * resultado2;
        resultado2 = hora * valorporhora;
        descuento = 0.03;

        descuentofinal = (int) (resultadototal * descuento);



        finalizador = resultadototal - descuentofinal;





        }


    }
