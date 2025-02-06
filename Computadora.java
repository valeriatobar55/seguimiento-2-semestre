package Computadora;

public class Computadora {
    private boolean emitePitido;
    private boolean discoGira;

    // Constructor
    public Computadora(boolean emitePitido, boolean discoGira) {
        this.emitePitido = emitePitido;
        this.discoGira = discoGira;
    }

    // Método para diagnosticar el problema
    public String diagnosticar() {
        if (emitePitido && discoGira) {
            return "Póngase en contacto con el técnico de apoyo";
        } else if (emitePitido && !discoGira) {
            return "Verificar contactos de la unidad";
        } else if (!emitePitido && !discoGira) {
            return "Traiga la computadora para repararla en la central";
        } else { // !emitePitido && discoGira
            return "Compruebe las conexiones de altavoces";
        }
    }
}
