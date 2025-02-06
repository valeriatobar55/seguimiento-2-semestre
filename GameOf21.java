package Game;

import java.util.concurrent.ThreadLocalRandom;

public class GameOf21 {
    private int jugadorTotal, maquinaTotal, cartaOculta;

    public GameOf21() {
        jugadorTotal = obtenerCarta() + obtenerCarta();
        maquinaTotal = obtenerCarta() + obtenerCarta();
        cartaOculta = obtenerCarta();
    }

    private int obtenerCarta() {
        return ThreadLocalRandom.current().nextInt(1, 11);
    }

    public void revelarCarta() {
        jugadorTotal += cartaOculta;
    }

    public String determinarGanador() {
        return (jugadorTotal > 21) ? "La máquina gana" : (maquinaTotal > 21 || jugadorTotal >= maquinaTotal) ? "El jugador gana" : "La máquina gana";
    }

    public int getJugadorTotal() { return jugadorTotal; }
    public int getCartaOculta() { return cartaOculta; }
}

