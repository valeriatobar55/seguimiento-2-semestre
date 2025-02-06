package Game;

import java.util.Scanner;

public class GameOf21Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameOf21 juego = new GameOf21();

        System.out.println("Tus cartas suman: " + juego.getJugadorTotal());
        System.out.print("Presiona 'A' para revelar tu carta oculta: ");
        scanner.next();

        juego.revelarCarta();
        System.out.println("Tu carta oculta es: " + juego.getCartaOculta());
        System.out.println("Total final: " + juego.getJugadorTotal());
        System.out.println(juego.determinarGanador());

        scanner.close();
    }
    }
