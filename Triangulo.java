package Triangulo;

public class Triangulo {
    private int angulo1;
    private int angulo2;
    private int angulo3;


    public Triangulo(int angulo1, int angulo2, int angulo3) {
        this.angulo1 = angulo1;
        this.angulo2 = angulo2;
        this.angulo3 = angulo3;
    }

    // Getters y setters
    public int getAngulo1() {
        return angulo1;
    }

    public void setAngulo1(int angulo1) {
        this.angulo1 = angulo1;
    }

    public int getAngulo2() {
        return angulo2;
    }

    public void setAngulo2(int angulo2) {
        this.angulo2 = angulo2;
    }

    public int getAngulo3() {
        return angulo3;
    }

    public void setAngulo3(int angulo3) {
        this.angulo3 = angulo3;
    }


    public boolean esValido() {
        return (angulo1 + angulo2 + angulo3) == 180;
    }
}

