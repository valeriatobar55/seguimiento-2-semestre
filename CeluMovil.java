package Celular;

public class CeluMovil {
    String operador;
    double cargoFijo;
    double valorMinutoInternacional;
    double valorPaqueteDatos;

    // Constructor que inicializa los detalles del operador
    public CeluMovil(String operador) {
        this.operador = operador;
        if (operador.equalsIgnoreCase("Tigo")) {
            cargoFijo = 45000;
            valorMinutoInternacional = 200;
            valorPaqueteDatos = 12000;
        } else if (operador.equalsIgnoreCase("Claro")) {
            cargoFijo = 30000;
            valorMinutoInternacional = 100;
            valorPaqueteDatos = 18000;
        } else if (operador.equalsIgnoreCase("Movistar")) {
            cargoFijo = 40000;
            valorMinutoInternacional = 250;
            valorPaqueteDatos = 8000;
        }
    }

    // Método para calcular el costo total
    public double calcularCosto(int minutosInternacionales, boolean tienePaquete) {
        double costoMinutos = minutosInternacionales * valorMinutoInternacional;
        double costoPaquete = tienePaquete ? valorPaqueteDatos : 0;
        return cargoFijo + costoMinutos + costoPaquete;
    }
}
