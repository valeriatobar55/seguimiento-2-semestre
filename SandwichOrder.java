package Sandwich;

public class SandwichOrder {
    private String tamaño;
    private boolean tocineta, jalapeño, pavo, queso;

    public SandwichOrder(String tamaño, boolean tocineta, boolean jalapeño, boolean pavo, boolean queso) {
        this.tamaño = tamaño;
        this.tocineta = tocineta;
        this.jalapeño = jalapeño;
        this.pavo = pavo;
        this.queso = queso;
    }

    public int calcularPrecio() {
        int precioBase = tamaño.equalsIgnoreCase("grande") ? 12000 : 6000;
        int costoIngredientes = (tocineta ? 3000 : 0) + (pavo ? 3000 : 0) + (queso ? 2500 : 0);
        return precioBase + costoIngredientes;
    }
}
