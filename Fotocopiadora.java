package Impresion;

public class Fotocopiadora {
    private int cantidadCopias;
    private double precioPorCopia;
    private double precioTotal;


    public Fotocopiadora(int cantidadCopias) {
        this.cantidadCopias = cantidadCopias;
        calcularPrecioPorCopia();
        calcularPrecioTotal();
    }

    // Método para calcular el precio por copia
    private void calcularPrecioPorCopia() {
        if (cantidadCopias < 500) {
            precioPorCopia = 120;
        } else if (cantidadCopias < 750) {
            precioPorCopia = 100;
        } else if (cantidadCopias < 1000) {
            precioPorCopia = 80;
        } else {
            precioPorCopia = 50;
        }
    }

    // Método para calcular el precio total
    private void calcularPrecioTotal() {
        precioTotal = cantidadCopias * precioPorCopia;
    }

    // Getters
    public double getPrecioPorCopia() {
        return precioPorCopia;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public int getCantidadCopias() {
        return cantidadCopias;
    }
}
