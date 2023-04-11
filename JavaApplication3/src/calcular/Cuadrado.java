package calcular;


// Definición de la clase hija Cuadrado
class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        area = lado * lado;
    }

    @Override
    public void calcularPerimetro() {
        perimetro = lado * 4;
    }
}