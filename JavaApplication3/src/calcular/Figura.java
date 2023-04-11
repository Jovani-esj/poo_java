package calcular;

// Definición de la clase padre
class Figura {
    protected double area;
    protected double perimetro;

    public void calcularArea() {
        // Implementación por defecto que será sobreescrita por las clases hijas
    }

    public void calcularPerimetro() {
        // Implementación por defecto que será sobreescrita por las clases hijas
    }

    public void imprimirResultados() {
        System.out.println("El area es: " + area);
        System.out.println("El perimetro es: " + perimetro);
    }
}