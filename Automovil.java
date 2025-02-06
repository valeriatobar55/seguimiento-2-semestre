package Automovil;

public class Automovil {
    private int numeroModelo;

    // Constructor
    public Automovil(int numeroModelo) {
        this.numeroModelo = numeroModelo;
    }

    // Método para verificar si el modelo está defectuoso
    public boolean esDefectuoso() {
        // Verificar modelos específicos
        if (numeroModelo == 119 || numeroModelo == 179 ||
                numeroModelo == 221 || numeroModelo == 780) {
            return true;
        }
        // Verificar rango de modelos del 189 al 195
        if (numeroModelo >= 189 && numeroModelo <= 195) {
            return true;
        }
        return false;
    }

    // Método para obtener el mensaje de estado
    public String obtenerMensajeEstado() {
        if (esDefectuoso()) {
            return "El automóvil está defectuoso, llevar a garantía";
        } else {
            return "Su automóvil no está defectuoso";
        }
    }

    // Getter y Setter
    public int getNumeroModelo() {
        return numeroModelo;
    }

    public void setNumeroModelo(int numeroModelo) {
        this.numeroModelo = numeroModelo;
    }
}